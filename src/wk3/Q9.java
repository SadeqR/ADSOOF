import java.util.ArrayList;

public class Q9 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> intB = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> int1 = new ArrayList<>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		ArrayList<Integer> int2 = new ArrayList<>();
		int2.add(7);
		int2.add(5);
		ArrayList<Integer> int3 = new ArrayList<>();
		int3.add(4);
		int3.add(4);
		int3.add(2);
		ArrayList<Integer> int4 = new ArrayList<>();
		int4.add(8);
		int4.add(12);
		int4.add(3);
		
		intB.add(int1);
		intB.add(int2);
		intB.add(int3);
		intB.add(int4);
		
		ArrayList<ArrayList<Integer>> intC = Checker(intB, 2);
		for (int i = 0; i<intC.size();i++) {
			for(int z=0; z<intC.get(i).size(); z++) {
				System.out.println(intC.get(i).get(z));
			}
		}
		
	}
	public static ArrayList<ArrayList<Integer>> Checker(ArrayList<ArrayList<Integer>> intB, int n1) {
		ArrayList<ArrayList<Integer>> intC = new ArrayList<ArrayList<Integer>>();
		
		for(int z = 0; z < intB.size(); z++) {
			intC.add(intB.get(z));
		}
		
		for(int i = 0; i < intC.size(); i++) {
			for(int z=0; z<intC.get(i).size(); z++) {
				if (intC.get(i).get(z)==n1) {
					intC.remove(i);
				}
			}
		}
		return intC;
	}
}
