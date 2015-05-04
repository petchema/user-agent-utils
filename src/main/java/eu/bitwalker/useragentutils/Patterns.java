package eu.bitwalker.useragentutils;

public class Patterns {

	public static String[] toLowerCase(String[] strArr) {
	    if (strArr == null) return null;
	    String[] res = new String[strArr.length];
	    for (int i=0; i<strArr.length; i++) {
	      res[i] = strArr[i].toLowerCase();
	    }
	    return res;
	  }

	public static boolean containsAny(String string, String[] patterns) {
		for (String pattern : patterns) {
			if (string.contains(pattern))
				return true;
		}
		return false;
	}

}
