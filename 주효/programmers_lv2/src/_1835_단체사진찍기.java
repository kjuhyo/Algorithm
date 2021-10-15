
public class _1835_단체사진찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {"N~F=0", "R~T>2"};
		System.out.println(solution(2, data));
	}
	
	static char[] p= {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
	static boolean[] check;
	static char[] isSelected;
	static String[] d;
	static int cnt;
	
	public static int solution(int n, String[] data) {
        check=new boolean[8];
        d=data;
        isSelected=new char[8];
        cnt=0; 
        
        perm(0);
        return cnt;
    }

	private static void perm(int idx) {
		if(idx==8) {
			boolean flag=false;
            flag=isPossible(isSelected);
			if(flag) cnt++;
			return;
		}
		
		for(int i=0; i<8; i++) {
			if(!check[i]) {
				check[i]=true;
				isSelected[idx]=p[i];
				perm(idx+1);
				check[i]=false;
			}
		}return;
	}

	private static boolean isPossible(char[] isSelected) {
		char from=' ';
		char to=' ';
		int distance=0;
		int start=0;
		int end=0;
		int want=0;
		
		for(int i=0; i<d.length; i++) {
			String s=d[i];
			
			from=s.charAt(0);
			to=s.charAt(2);
			want=s.charAt(4)-'0';
			
			for(int j=0; j<isSelected.length; j++) {
				if(isSelected[j]==from) start=j;
				if(isSelected[j]==to) end=j;
			}
			distance=Math.abs(start-end)-1;
			
			if(s.charAt(3)=='=') {
				if(distance != want) {
					return false;
				}
			}else if(s.charAt(3)=='>') {
				if(distance <= want) {
					return false;
				}
			}else if(s.charAt(3)=='<') {
				if(distance>=want) {
					return false;
				}
			}
		}
		
		return true;
	}

}
