import java.util.ArrayList;

public class Q12 {
	public static void main(String[] args){
		ArrayList<String> Food = new ArrayList<String>();
		Food.add("tomato");
		Food.add("cheese");
		Food.add("chips");
		Food.add("fruit");
		Food.add("pie");
		Food.add("butter");
		Food.add("tea");
		Food.add("buns");
		
		ArrayList<String> newFood = new ArrayList<String>();      
		newFood = shortRev(Food,"chips","buns");
		System.out.println(newFood);
	}
	
	public static <T> ArrayList<T> shortRev(ArrayList<T> items, T i1, T i2){
		int firstIndex = 0;
		int secondIndex = 0;
		ArrayList<T> newItems = new ArrayList<T>();
		ArrayList<T> revItems = new ArrayList<T>();
		boolean condition = true;
		for (int i = 0; i<items.size()&&condition; i++){
			if (items.get(i).equals(i1)){
				firstIndex = i;
				condition = false;
			}
		}
		condition = true;
		for (int i = firstIndex; i<items.size()&&condition; i++){
			if (items.get(i).equals(i2)){
				secondIndex = i;
				condition = false;
			}
		}
		for (int z = firstIndex; z<=secondIndex;z++){
			newItems.add(items.get(z));
		}
		
		
		for (int z = newItems.size()-1; z>=0;z--){
			revItems.add(newItems.get(z));
		}
		return revItems;
		
	}
}
