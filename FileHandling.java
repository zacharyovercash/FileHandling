package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FileHandling {

	
	
	
	
		public static void main(String[] args) throws IOException {
			ArrayList<Songs> al = new ArrayList<Songs>();
			try {
				File file = new File("songs.txt");
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while((line=br.readLine())!=null){
					String[] tokens = line.split("/");
					Songs song = new Songs(tokens[0],tokens[1],tokens[2],tokens[3]);
					al.add(song);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(Object s : al){
				System.out.println(s);
			}
			
			
			
			
			
		}
}
