import java.util.*;
import java.util.Map.Entry;

public class _72411_메뉴리뉴얼 {
	static Character isSelected[];
	static ArrayList<Character> list;
	static String[] order;
	static HashMap<String, Integer> map;
	static ArrayList<String> result;
	
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = { 2, 3, 4 };
		String[] arr = solution(orders, course);
		for (String s : arr) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[] orders, int[] course) {
		list = new ArrayList<>();
		for (int i = 0; i < orders.length; i++) {
			String s = orders[i];
			for (int j = 0; j < s.length(); j++) {
				if (list.indexOf(s.charAt(j)) < 0) {
					list.add(s.charAt(j));
				}
			}
		}
		Collections.sort(list);
		
		isSelected = new Character[list.size()];
		order = orders;
		map = new HashMap<>();
		result = new ArrayList<>();
		
		for (int i = 0; i < course.length; i++) {
			comb(0, 0, course[i]);
			
			map.values().removeAll(Collections.singleton(1));
			if(!map.isEmpty()) {
			Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
				@Override
				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
					return e1.getValue().compareTo(e2.getValue());
				}
			};

			Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
			for(Entry<String, Integer> e:map.entrySet()) { 
				if(e.getValue()==maxEntry.getValue()) {
				  	result.add(e.getKey()); 
				  } 
			}
			}
			map.clear();
		}
		String answer[] = new String[result.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]=result.get(i);
		}
		Arrays.sort(answer);

		return answer;
	}

	private static void comb(int idx, int s_idx, int n) {
		if (s_idx == n) {
			String str = "";
			for (int i = 0; i < n; i++) {
				str += Character.toString(isSelected[i]);
			}
			for (int i = 0; i < order.length; i++) {
				boolean flag = true;
				String ss = order[i];
				
				for (int j = 0; j < str.length(); j++) {
					if (!ss.contains(Character.toString(str.charAt(j)))) {
						flag = false;
						break;
					}
					
				}
				if (flag) {
					if (!map.containsKey(str)) {
						map.put(str, 1);
					} else {
						int count = map.get(str);
						map.put(str, count + 1);
					}

				}
			}
			return;
		}
		if (idx == list.size()) {
			return;
		}

		isSelected[s_idx] = list.get(idx);
		comb(idx + 1, s_idx + 1, n);
		comb(idx + 1, s_idx, n);
	}

}
