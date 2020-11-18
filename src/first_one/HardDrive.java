package first_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardDrive {
	
	public String solution(String S) {
		
		
		
		
		return S;
	};
	
	
	public static void main(String[] args) {
		
		String s = "my.song.mp3 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 10000b";
		
		List<String> filesList = new ArrayList<String>(Arrays.asList(s.split("b")));
		System.out.println(filesList);
		
		
		
		for (String string : filesList) {
			System.out.println(string.matches("\\.mp4 \\d*(,* )?"));
			
//			for(int i = 0; i < string.length(); i++) {
//			   char c = string.charAt(i);
//			   if( c == ' ') {
//				   System.out.println(c);
//			   }
//			}
			
		}
		
		
	}

}
