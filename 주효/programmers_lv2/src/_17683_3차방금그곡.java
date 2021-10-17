import java.util.HashMap;

public class _17683_3차방금그곡 {

	public static String solution(String m, String[] musicinfos) {
		m=changeSharp(m);
		String ans="(None)";
		int ptime=0;
		for (int tc = 0; tc < musicinfos.length; tc++) {
			String s = musicinfos[tc];
			String[] song = s.split(",");

			String[] stime = song[0].split(":");
			String[] etime = song[1].split(":");

			int start = Integer.valueOf(stime[0]) * 60 + Integer.valueOf(stime[1]);
			int end = Integer.valueOf(etime[0]) * 60 + Integer.valueOf(etime[1]);
			int playing = end - start;

			String music=changeSharp(song[3]);
			StringBuilder sb = new StringBuilder(music);
			if (sb.length() < playing) {
				int size = playing - sb.length();
				for (int i = 0; i < size; i++) {
					sb.append(sb.charAt(i));
				}
			} else if (sb.length() > playing) {
				int size = sb.length() - playing;
				sb.delete(sb.length() - size, sb.length());
			}

			if (sb.toString().contains(m)) {
				if(!ans.equals("(None)")) {
					if(ptime<playing) {
						ptime=playing;
						ans=song[2];
					}
				}else {
					ptime=playing;
					ans=song[2];
				}
			}
		}
		return ans;
	}

	private static String changeSharp(String m) {
		m = m.replaceAll("C#", "H");
		m = m.replaceAll("D#", "I");
		m = m.replaceAll("F#", "J");
		m = m.replaceAll("G#", "K");
		m = m.replaceAll("A#", "L");
		return m;
	}

}
