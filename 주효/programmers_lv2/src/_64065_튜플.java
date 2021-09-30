import java.util.ArrayList;
import java.util.Arrays;

public class _64065_튜플 {

	public static void main(String[] args) {
		int arr[] = solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		// 3,2,4,1
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static int[] solution(String s) {
		s = s.replace("{", "");
		String[] arr = s.split("},");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replace("}", "");
		}
		Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
	/*	class Sorting implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}

		} */ //(a, b)->{return a.length() - b.length();}와 같은 코드임.
		
		String num = "";
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j=0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == ',') {
					if (!num.equals("")) {
						int n = Integer.parseInt(num);
						if (list.indexOf(n) < 0) {
							list.add(n);
						}
						num = "";
					}
				} else {
					num+=arr[i].charAt(j);
				}
				if(j==arr[i].length()-1) {
					if (!num.equals("")) {
						int n = Integer.parseInt(num);
						if (list.indexOf(n) < 0) {
							list.add(n);
						}
						num = "";
					}
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
