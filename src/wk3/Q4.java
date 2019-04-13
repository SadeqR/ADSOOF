import java.util.ArrayList;

public class Q4 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("tomato");
		words.add("cheese");
		words.add("chips");
		words.add("fruit");
		words.add("pie");
		words.add("butter");
		words.add("tea");
		words.add("buns");
		
		shorten(words, 4);
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
	public static void shorten(ArrayList<String> list, int n) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).length()<n) {
				list.remove(i);
			}
		}
	}
}
