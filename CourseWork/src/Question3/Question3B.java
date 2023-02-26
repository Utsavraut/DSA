//you are provided certain string and pattern, return true if pattern entirely matches the string otherwise return false.
//        Note: if pattern contains char @ it matches entire sequence of characters and # matches any single character within
//        string.
//        Input: String a=“tt”, pattern =”@”
//        Output: true
//        Input: String a=“ta”, pattern =”t”
//        Output: false
//        Input: String a=“ta”, pattern =”t#”
//        Output: true
package Question3;


public class Question3B {
    public static boolean Matching(String str, String pat) {
        int sIn = 0, pIn = 0;
        int strLen = str.length(), patLen = pat.length();
        while (sIn < strLen && pIn < patLen) {
            if (pat.charAt(pIn) == '@') {
                return true;
            } else if (pat.charAt(pIn) == '#') {
                pIn++;
                sIn++;
            } else if (str.charAt(sIn) == pat.charAt(pIn)) {
                sIn++;
                pIn++;
            } else {
                return false;
            }
        }
        return sIn == strLen && pIn == patLen;
    }

    public static void main(String[] args) {
        String a1 = "tt", pat1 = "@";
        String a2 = "ta", pat2 = "t";
        String a3 = "ta", pat3 = "t#";
        System.out.println(Matching(a1, pat1));
        System.out.println(Matching(a2, pat2));
        System.out.println(Matching(a3, pat3));
    }
}
