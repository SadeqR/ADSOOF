
public class Question1 {

	public static void main(String[] args) {
		Cell<Integer> list1;
		list1 = parseIntLinkedList("[1,4,2,5]");
		int numInList1 = 4;
		System.out.println("The list you entered is: ");
		System.out.println(linkedListToString(list1));
		System.out.println("Is the number " + numInList1 + " in the list? " + containsItr(list1, numInList1));
		System.out.println("Is the number " + numInList1 + " in the list? " + containsRec(list1, numInList1));
	}

	private static boolean containsItr(Cell<Integer> list1, int numInList1) {
		boolean contained = false;
		for (Cell<Integer> ptr = list1; ptr != null; ptr = ptr.next)
			if (ptr.first.equals(numInList1))
				contained = true;
		return contained;
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
