
public class Question7 {

	public static void main(String[] args) {
		LispList<Integer> l1 = LispList.empty();
		l1 = parseIntLispList("[7,3,8,12,9,14]");
		l1 = removePos(l1, 2);
		System.out.println(l1);
	}

	public static LispList<Integer> removePos(LispList<Integer> l1, int x) {
		int indexCount = 0;
		return removePosHelperMethod(l1, x, indexCount);
	}

	public static LispList<Integer> removePosHelperMethod(LispList<Integer> l1, int x, int indexCount) {
		if (l1.isEmpty()) {
			LispList<Integer> l1Empty = LispList.empty();
			return l1Empty;
		} else if (indexCount == x) {
			return removePosHelperMethod(l1.tail(), x, indexCount + 1);
		}
		return removePosHelperMethod(l1.tail(), x, indexCount + 1).cons(l1.head());
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
