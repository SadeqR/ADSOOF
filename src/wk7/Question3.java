
public class Question3 {

	public static void main(String[] args) {
		Cell<Integer> list1;
		list1 = parseIntLinkedList("[1,3,7,4,3,7,2]");
		int numInList1 = 7;
		System.out.println("The list you entered is: ");
		System.out.println(linkedListToString(list1));
		Cell<Integer> temp4 = deleteRecDest(list1, numInList1);
		System.out.println("New list via Iterative Destructive: ");
		System.out.println(linkedListToString(temp4));
	}

	private static Cell<Integer> deleteRecDest(Cell<Integer> list1, Integer numInList1) {
		if (list1 == null)
			return null;
		if (list1.first.equals(numInList1)) {
			return deleteRecDest(list1.next, numInList1);
		} else {
			list1.next =  deleteRecDest(list1.next, numInList1);
			return list1;
		}

	}

	private static Cell<Integer> parseIntLinkedList(String str) {
		Cell<Integer> list = null;
		String line = str.trim();
		String contents = line.substring(1, line.length() - 1).trim();
		if (contents.length() == 0)
			return null;
		String[] nums = contents.split(",");
		for (int i = nums.length - 1; i >= 0; i--) {
			String num = nums[i].trim();
			list = new Cell<Integer>(new Integer(num), list);
		}
		return list;
	}

	private static <T> String linkedListToString(Cell<T> list) {
		String str = "[";
		if (list != null) {
			str += list.first;
			for (Cell<T> ptr = list.next; ptr != null; ptr = ptr.next)
				str += "," + ptr.first;
		}
		return str + "]";
	}

	private static class Cell<T> {
		T first;
		Cell<T> next;

		Cell(T f, Cell<T> n) {
			first = f;
			next = n;
		}
	}

}
