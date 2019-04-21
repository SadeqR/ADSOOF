
public class Question3 {

	public static void main(String[] args) {
		LispList<Integer> l1 = LispList.empty();
		LispList<Integer> l2 = LispList.empty();
		l1 = parseIntLispList("[17,11,20,34,5,10,8,19,55,11,13]");
		l2 = parseIntLispList("[17,11,20,34,5,10,8,19,55,11,13]");
		l1 = recFilter(l1, 12);
		l2 = iterFilter(l2, 12);
		System.out.println(l1);
		System.out.println(l2);
	}

	public static LispList<Integer> iterFilter(LispList<Integer> l2, int x) {
		LispList<Integer> l2Empty = LispList.empty();
		while (!l2.isEmpty()) {
			if (l2.head().compareTo(x) > 0) {
				l2Empty = l2Empty.cons(l2.head());
			}
			l2 = l2.tail();
		}
		
		for(; !l2Empty.isEmpty(); l2Empty=l2Empty.tail()) {
			l2 = l2.cons(l2Empty.head());
		}
		return l2;
	}

	public static LispList<Integer> recFilter(LispList<Integer> l1, int x) {
		if (l1.isEmpty()) {
			LispList<Integer> l1Empty = LispList.empty();
			return l1Empty;
		}
		if (l1.head().compareTo(x) > 0) {
			return recFilter(l1.tail(), x).cons(l1.head());
		}
		return recFilter(l1.tail(), x);
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
