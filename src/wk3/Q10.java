import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		readFile("src/wk3/Read.txt");
		
	}
	public static ArrayList<ArrayList<String>> readFile(String filePath){
		ArrayList<ArrayList<String>> Files = new ArrayList<ArrayList<String>>();
		
		Scanner splitter = null;
		try {
	           splitter = new Scanner(new File(filePath));
	       }
	    catch(FileNotFoundException e)
	    {
	    	System.out.println("No file of that name found");
	    }
		int i = 0;
		while(splitter.hasNextLine()) {
			
			String line = splitter.nextLine(); 
			System.out.println(line);
			ArrayList<String> temp = new ArrayList<>();
			String[] aLine = line.split(" ");
			for (int z = 0; z< aLine.length; z++) {
				temp.add(aLine[z]);
			}
		    
		    Files.add(temp);
		      
		 }
		System.out.println("-----------------------");
		
		for (int q = 0; q<Files.size();q++) {
			for(int z=0; z<Files.get(q).size(); z++) {
				System.out.println(Files.get(q).get(z));
			}
			System.out.println("-----------------------");
		}
		return Files;
		
	}
}
