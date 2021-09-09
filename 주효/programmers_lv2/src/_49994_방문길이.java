import java.util.ArrayList;

public class _49994_방문길이 {

	public static void main(String[] args) {
		System.out.println(solution("ULURRDLLU"));//7
		System.out.println("========");
		System.out.println(solution("LRLRL")); //1
		System.out.println("========");
		System.out.println(solution("UDU"));//1
	}

	public static int solution(String dirs) {
		int answer = 0;
        int x=0, y=0, cnt=0;
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0; i<dirs.length(); i++){
            char direct=dirs.charAt(i);
            int nx=x;
            int ny=y;
            switch(direct){
                case 'L': nx=x;
                    ny=y-1;
                    break;
                case 'U': nx=x-1;
                    ny=y;
                    break;
                case 'R': nx=x;
                    ny=y+1;
                    break;
                case 'D': nx=x+1;
                    ny=y;
                    break; 
            }
            
            if(nx<-5 || ny<-5 || nx>5 || ny>5){
                nx=x; ny=y; //범위 벗어나면 되돌림
            }else{
                String s="";
                s+=Integer.toString(nx);
                s+=Integer.toString(ny);
                s+=Integer.toString(x);
                s+=Integer.toString(y);
                
                String st="";//역방향
                st+=Integer.toString(x);
                st+=Integer.toString(y);
                st+=Integer.toString(nx);
                st+=Integer.toString(ny);
                if(list.indexOf(s)>=0 || list.indexOf(st)>=0){
                    cnt++;
                }
                list.add(s); list.add(st);
                x=nx; y=ny;
            }
        }
        
        answer=list.size()/2-cnt;
        return answer;
    }
}
