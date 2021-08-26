import java.util.ArrayList;
import java.util.HashMap;

public class _42888_오픈채팅방 {

	public static void main(String[] args) {
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] ans=solution(record);
		for(String w:ans){
            System.out.println(w);
        }

	}
	
	public static String[] solution(String[] record) {
		
        HashMap<String, String> map=new HashMap<>();
        for(int i=0; i<record.length; i++){
            String s=record[i];
            String[] word=s.split(" ");
            
            if(!word[0].equals("Leave")){ //나간사람 remove하면 안됨. 나갔다고 찍어줘야하는데 나가고 다시 안들어오면 닉네임 값을 알수가 없음.
                map.put(word[1], word[2]);
            }else{
                continue;
            }
        }
        
        ArrayList<String> list=new ArrayList<>();
        for(int i=0; i<record.length; i++){
            String str=record[i];
            String[] arr=str.split(" ");
            
            String nickname=map.get(arr[1]); //키값(arr[1])으로 닉네임(arr[2]) 찾기
            if(arr[0].equals("Enter")){
               list.add(nickname+"님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){
            	list.add(nickname+"님이 나갔습니다.");
            }else if(arr[0].equals("Change")){
            	continue;
            }
        }
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }

}
