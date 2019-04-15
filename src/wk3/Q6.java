import java.util.ArrayList;

public class Q6 {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(5);
		ints.add(12);
		ints.add(4);
		ints.add(16);
		ints.add(4);
		ints.add(2);
		ints.add(2);
		ArrayList<Integer> intsD = new ArrayList<>();
		intsD.add(5);
		intsD.add(12);
		intsD.add(4);
		intsD.add(16);
		intsD.add(4);
		intsD.add(2);
		intsD.add(2);
		Swap(intsD, 4 , 7);
		System.out.println("DESCTRUCTIVE:-------------------------");
		for(int i = 0; i < intsD.size(); i++) {
			System.out.println(intsD.get(i));
		}
		
		System.out.println("ORIGINAL:-------------------------");
		for(int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));
		}
		
		
		
		System.out.println("CONSTRUCTIVE:-------------------------");
		ArrayList<Integer> intsC = SwapC(ints, 4 , 7);
		
		for(int i = 0; i < intsC.size(); i++) {
			System.out.println(intsC.get(i));
		}
		
	}
	
	public static <T> void Swap(ArrayList<T> ints1, T n1, T n2) {
		boolean condition = true;
		for(int i = 0; i < ints1.size()&&condition; i++) {
			if(ints1.get(i)==n1) {
				ints1.set(i, n2);
				condition = false;
			}
		}
		
	}
	
	public static <T> ArrayList<T> SwapC(ArrayList<T> ints1, T n1, T n2) {
		boolean condition = true;
		ArrayList<T> intsNew = new ArrayList<>();
		for(int i = 0; i < ints1.size(); i++) {
			intsNew.add(ints1.get(i));
		}
		
		
		for(int i = 0; i < intsNew.size()&&condition; i++) {
			if(intsNew.get(i)==n1) {
				intsNew.set(i, n2);
				condition = false;
			}
		}
		
		return intsNew;
	}
}
