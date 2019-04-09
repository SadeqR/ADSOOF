
public class Question2 {

	public static void main(String[] args) {
		Cell<Integer> list1;
		list1 = parseIntLinkedList("[1,3,7,4,3,7,2]");
		int numInList1 = 7;
		System.out.println("The list you entered is: ");
		System.out.println(linkedListToString(list1));
		deleteItrDest(list1, numInList1);
		System.out.println("New list via Iterative Destructive: ");
		System.out.println(linkedListToString(list1));

		list1 = parseIntLinkedList("[1,3,7,4,3,7,2]");
		System.out.println("The list you entered is: ");
		System.out.println(linkedListToString(list1));
		Cell<Integer> temp4 = deleteItrCon(list1, numInList1);
		System.out.println("New list via Iterative Constructive: ");
		System.out.println(linkedListToString(temp4));
	}

	private static Cell<Integer> deleteItrCon(Cell<Integer> listCopy, Integer numInList1) {
	//	System.out.println("------TEST 01" +linkedListToString(listCopy));
		Cell<Integer> list111 = copy(listCopy);
	//	System.out.println("------TEST 02" +linkedListToString(list111));
		if (list111 != null) {
			if (numInList1.equals(list111.first)) {
				//list111.first = list111.next.first;
				list111.next = list111.next.next;
			} else {
				Cell<Integer> ptr = list111;
				for (; ptr.next != null && !numInList1.equals(ptr.next.first); ptr = ptr.next) {
				}
				if (ptr.next != null)
					ptr.next = ptr.next.next;
			}
		}
	//	System.out.println("------TEST 06" +linkedListToString(list111));
		return list111;
	}

	private static Cell<Integer> copy(Cell<Integer> listCopy) {
	//	System.out.println("------TEST 03" +linkedListToString(listCopy));
	//	Cell<Integer> temp1=null;
		Cell<Integer> temp2=null;
		Cell<Integer> temp3=null;
		while(listCopy!=null) {
	//		temp1 = new Cell<>(listCopy.first, temp1);
			temp2 = new Cell<>(listCopy.first, temp2);
			listCopy = listCopy.next;
		}
	//	System.out.println("------TEST 04" +linkedListToString(temp2));
		while(temp2!=null) {
	//		listCopy = new Cell<>(temp1.first, listCopy);
	//		temp1 = temp1.next;
			temp3 = new Cell<>(temp2.first, temp3);
			temp2 = temp2.next;
		}
		return temp3;
	}

	private static void deleteItrDest(Cell<Integer> list1, Integer numInList1) {
		if (list1 != null) {
			if (numInList1.equals(list1.first)) {
				list1.first = list1.next.first;
				list1.next = list1.next.next;
			} else {
				Cell<Integer> ptr = list1;
				for (; ptr.next != null && !numInList1.equals(ptr.next.first); ptr = ptr.next) {
				}
				if (ptr.next != null)
					ptr.next = ptr.next.next;
			}
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
