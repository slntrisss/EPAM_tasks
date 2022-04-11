package practice1.secondTask;

public class SubstringSearch {
    public static void main(String[] args) {
        String str = "abxabcabcabyababcadabcabyabyabcabuabcaby";
        String substr = "abcaby";
        numberOfOccurrencesOfSubstring(str, substr);
    }
    public static void numberOfOccurrencesOfSubstring(String str, String substr){
        int i = 0;
        int j = 0;
        int wordCount = 0;
        int[] wordPrefix = getPrefixes(substr);
        char[] text = str.toCharArray();
        char[] pattern = substr.toCharArray();
        while(i < text.length){
            if(j >= pattern.length){
                wordCount++;
                j = 0;
            }

            if(text[i] == pattern[j]){
                i++;
                j++;
            }
            else{
                if(j > 0)
                    j = wordPrefix[j-1];
                else
                    i++;
            }
        }
        if(j >= pattern.length)
            wordCount++;
        System.out.println(wordCount);
    }
    private static int[] getPrefixes(String str){
        int[] dp = new int[str.length()];
        for(int i = 0, j = 1; j < str.length();){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(left == right){
                dp[j] = i + 1;
                j++;
                i++;
            }
            else if(left != right && i > 0){
                i = dp[i-1];
            }
            else
                j++;
        }
        return dp;
    }
}
