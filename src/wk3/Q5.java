import java.util.ArrayList;

public class Q5 {
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
		ArrayList<String> wordsC = new ArrayList<>();
		
		wordsC = shorten(words, 4);
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println("---------------------");
		for(int i = 0; i < wordsC.size(); i++) {
			System.out.println(wordsC.get(i));
		}
	}
	public static ArrayList<String> shorten(ArrayList<String> list, int n) {
		ArrayList<String> wordsC = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			wordsC.add((list.get(i)));
		}
		
		for(int i = 0; i < wordsC.size(); i++) {
			if (wordsC.get(i).length()<n) {
				wordsC.remove(i);
			}
		}
		return wordsC;
	}
}
