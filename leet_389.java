public class leet_389 {
    public static void main(String[] args) {
        String s = "", t = "y";
        System.out.println(findTheDifference(s,t));
    }
    static char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
    
        for (char c : sChars) {
            sumS += c;
        }
    
        for (char c : tChars) {
            sumT += c;
        }
    
        // The difference in ASCII values represents the extra character
        return (char) (sumT - sumS);
    }
    
}
