
public class Question2 {

	public static void main(String[] args) {
		LispList<Integer> l1 = LispList.empty();
		l1 = parseIntLispList("[7,3,8,12,9,14, 1, 1, 1, 1]");
		int recLength = recLength(l1);
		int iterLength = iterLength(l1);
		System.out.println(recLength);
		System.out.println(iterLength);

		LispList<Integer> l2 = LispList.empty();
		l2 = parseIntLispList("[2,3,4,2,5,12,2,5]");
		int recCount = recCount(l2, 2);
		int iterCount = iterCount(l2, 2);
		System.out.println(recCount);
		System.out.println(iterCount);

		LispList<Integer> l3 = LispList.empty();
		l3 = parseIntLispList("[3,7,8,9,12,14]");
		boolean recOrdered = recOrdered(l3);
		boolean iterOrdered = iterOrdered(l3);
		System.out.println(recOrdered);
		System.out.println(iterOrdered);
	}

	public static boolean iterOrdered(LispList<Integer> l2) {
		boolean ordered = false;
		boolean cond = true;
		if (l2.isEmpty()) {
			ordered = true;
		}
		while (!l2.isEmpty() && cond) {
			if (l2.tail().tail().isEmpty()) {
				ordered = true;
				cond = false;
			}
			if (l2.head() < l2.tail().head()) {
				ordered = true;
			} else {
				cond = false;
				ordered = false;
			}
			l2 = l2.tail();
		}
		return ordered;
	}

	public static boolean recOrdered(LispList<Integer> l2) {
		if(l2.isEmpty() || l2.tail().tail().isEmpty()) {
		return true;
		}
		else if(l2.head() < l2.tail().head()) {
			return recOrdered(l2.tail());
		}
		return false;
	}

	public static int iterCount(LispList<Integer> l2, int x) {
		int counter = 0;
		while (!l2.isEmpty()) {
			if (l2.head().equals(x)) {
				counter++;
			}
			l2 = l2.tail();
		}
		return counter;
	}

	public static int recCount(LispList<Integer> l2, int x) {
		if (l2.isEmpty()) {
			return 0;
		}
		if (l2.head().equals(x)) {
			return recCount(l2.tail(), x) + 1;
		} else {
			return recCount(l2.tail(), x);
		}
	}

	public static int iterLength(LispList<Integer> l1) {
		int counter = 0;
		while (!l1.isEmpty()) {
			counter++;
			l1 = l1.tail();
		}
		return counter;
	}

	public static int recLength(LispList<Integer> l1) {
		if (l1.isEmpty()) {
			return 0;
		}
		//l1 = l1.tail();
		return recLength(l1.tail()) + 1;
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
