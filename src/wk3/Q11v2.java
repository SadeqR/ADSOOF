import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11v2 {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> Files = new ArrayList<ArrayList<String>>();
		Files = readFile("src/wk3/Read.txt");
		for (int i = 0; i<Files.size();i++) {
			for(int z=0; z<Files.get(i).size(); z++) {
				System.out.println(Files.get(i).get(z));
			}
		}
		
		ArrayList<ArrayList<String>> cFiles = new ArrayList<ArrayList<String>>();
		cFiles = argRemove(Files,"2");
		System.out.println("-----------------------");
		
		for (int i = 0; i<cFiles.size();i++) {
			for(int z=0; z<cFiles.get(i).size(); z++) {
				System.out.println(cFiles.get(i).get(z));
			}
		}
		
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
		System.out.println("-----------------------");
		return Files;
		
	}
	
	public static <T> ArrayList<ArrayList<T>> argRemove(ArrayList<ArrayList<T>> intB, T n1) {
		ArrayList<ArrayList<T>> intC = new ArrayList<ArrayList<T>>();
		
		for(int z = 0; z < intB.size(); z++) {
			intC.add(intB.get(z));
		}
		
		for(int i = 0; i < intC.size(); i++) {
			for(int z=0; z<intC.get(i).size(); z++) {
				if (intC.get(i).get(z).equals(n1)) {
					intC.remove(i);
				}
			}
		}
		System.out.println(intC);
		return intC;
	}
}
