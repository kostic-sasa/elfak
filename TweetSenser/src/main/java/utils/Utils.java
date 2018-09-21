package utils;

public class Utils {
	
	private static boolean isNullOrEmpty(String s) {
		if (s == null)
			return true;
		else if (s.isEmpty())
			return true;
		
		return false;
	}
	
	public static boolean isNullOrEmpty(String... array) {
		for (String s : array) {
			boolean res = isNullOrEmpty(s);
			if (res == true)
				return true;
		}
		
		return false;
	}

}
