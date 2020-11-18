package first_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardDrive {
	
	public String solution(String S) {
		
		List<String> filesList = new ArrayList<String>(Arrays.asList(S.split("b\\s")));
		System.out.println(filesList);
		
		int music = 0;
		int image = 0;
		int movie = 0;
		int other = 0;
		
		for (String string : filesList) {
			// music
			if( string.matches(".*mp3 \\d*$") || string.matches(".*aac \\d*$") || string.matches(".*flac \\d*$")) {
				string = string.replaceAll("(.*mp3 )?(\\D+)?","");
				int memory = Integer.parseInt(string);
				music = music + memory;
				
			// image
			} else if( string.matches(".*jpg \\d*$") || string.matches(".*bmp \\d*$") || string.matches(".*gif \\d*$") ) {
				string = string.replaceAll("\\D+","");
				int memory = Integer.parseInt(string);
				image = image + memory;
				
			// movie
			} else if( string.matches(".*mp4 \\d*$") || string.matches(".*avi \\d*$") || string.matches(".*mkv \\d*$")) {
				string = string.replaceAll("(.*mp4 )?(\\D+)?","");
				int memory = Integer.parseInt(string);
				movie = movie + memory;
				
			// other
			} else if(string.matches(".* \\d*$") ) {
				string = string.replaceAll(".*\\D+.*\\s","");
				int memory = Integer.parseInt(string);
				other = other + memory;
				
			}
			
			
		}
		System.out.println("music" + ": " + music);
		System.out.println("image" + ": " + image);
		System.out.println("movie" + ": " + movie);
		System.out.println("other" + ": " + other);
		
		
		return S;
	};
	
	
	public static void main(String[] args) {
		
		String S = "my.song.bmp 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 10000b";
		
		HardDrive list = new HardDrive();
		list.solution(S);
		
	}

}
