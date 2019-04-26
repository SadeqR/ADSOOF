
public class Question8 {
	
	public static void main(String[] args) {
		LispList<Integer> l1 = LispList.empty();
		LispList<Integer> l2 = LispList.empty();
		l1 = parseIntLispList(" [5,6,4,8,2,3,1]");
		l2 = parseIntLispList(" [4,8,2]");
//		l1 = parseIntLispList(" [5,6,1,2,3,1,2,3,1,4,7,8]");
//		l2 = parseIntLispList(" [1,2,3,1,4]");
		boolean checkSubList = sublist(l1, l2);
		System.out.println(checkSubList);
	}


	public static boolean sublist(LispList<Integer> l1, LispList<Integer> l2) {
		if(l2.isEmpty()) {
			return false;
		}
		if(l1.isEmpty()) {
			return false;
		}
		if(l1.head().equals(l2.head())) {
			return sublistHelperMethod(l1.tail(), l2.tail());
		}
		return sublist(l1.tail(),l2);
	}

	public static boolean sublistHelperMethod(LispList<Integer> l1, LispList<Integer> l2) {
		if(l2.isEmpty()) {
			return true;
		}
		if(l1.head().equals(l2.head())) {
			return sublistHelperMethod(l1.tail(), l2.tail());
		} else {
			return false;
		}
	}


	public static LispList<Integer> parseIntLispList(String str) {
		String line = str.trim();
		String contents = line.substring(1, line.length() - 1).trim();
		if (contents.length() == 0 || line.charAt(0) != '[' || line.charAt(line.length() - 1) != ']')
			return LispList.empty();
		String[] nums = contents.split(",");
		LispList<Integer> list = LispList.empty();
		for (int i = nums.length - 1; i >= 0; i--) {
			String num = nums[i].trim();
			list = list.cons(Integer.parseInt(num));
		}
		return list;
	}
}
