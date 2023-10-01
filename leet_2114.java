public class leet_2114 {
    public static void main(String[] args) {
        String[] sentences = { "please wait", "continue to fight", "continue to win" };
        int a = mostWordsFound(sentences);
        System.out.println(a);
    }

    static int mostWordsFound(String[] sentences) {
        int maxLen = 0;

        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;

    }
}
