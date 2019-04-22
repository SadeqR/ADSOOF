
public class Question4 {
	
	public static void main(String[] args) {
		LispList<Integer> l1 = LispList.empty();
		l1 = parseIntLispList("[2,3,4,12,5,12,2,5]");
		l1 = multiply(l1, 5);
		System.out.println(l1);
	}
	
	public static LispList<Integer> multiply(LispList<Integer> l1, int x) {
		LispList<Integer> l1Empty = LispList.empty();
		if(l1.isEmpty()) {
			return l1Empty;
		}
		return multiply(l1.tail(),x).cons(l1.head()*x);
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
