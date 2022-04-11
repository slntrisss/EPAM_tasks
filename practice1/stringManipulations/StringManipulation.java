package practice1.secondTask;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "The random string generator creates a " +
                "series of numbers and letters that have no " +
                "pattern. These can be helpful for creating " +
                "security codes. With this utility you generate " +
                "a 16 character output based on your input of " +
                "numbers and upper and lower case letters. " +
                "Random strings can be unique.";

        distanceBetweenTwoSubstr(str, "helpful", "case");
        String test = "JavaScriptScriptScript";
        replaceStringWithSubstring(test, "Script", "");
        addSpaces("template", new int[]{3,5,7});
    }
    public static void findMinLengthString(String str){
        String[] tokens = str.split("\\W+");
        int index = 0;
        int size = Integer.MAX_VALUE;
        for(int i = 0; i < tokens.length; i++){
            if(size > tokens[i].length()){
                size = tokens[i].length();
                index = i;
            }
        }
        System.out.println("String with min length: " + tokens[index]);
    }
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse of string \"" + str + "\" is " + sb.reverse().toString());
    }
    public static void sortByAlphabeticalOrder(String[] strings){
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
    public static void reverseEachWordInReverseOrderInString(String text){
        String[] tokens = text.split(" ");
        StringBuilder res = new StringBuilder();
        for (String token : tokens) {
            StringBuilder sb = new StringBuilder(token);
            res.append(sb.reverse()).append(" ");
        }
        System.out.println("Reversed string: " + res.toString());
    }
    public static void countNumberOfWordsInString(String text){
        String[] tokens = text.split("\\W+");
        System.out.println("Number of words: " + tokens.length);
    }
    public static void isGivenStringPalindrome(String text){
        StringBuilder reversed = new StringBuilder(text);
        System.out.println("Is given string palindrome? " + text.equals(reversed.reverse().toString()));
    }

    public static void replaceStringWithSubstring(String str, String oldSubstr, String newSubstr){

        //Returns a new string that replaces all matching characters in this
        //string with the new character
        String s1 = str.replace(oldSubstr, newSubstr);
        System.out.println(s1 + "\n");

        //Returns a new string that replaces the rst matching substring in
        //this string with the new substring.
        String s2 = str.replaceFirst(oldSubstr, newSubstr);
        System.out.println(s2 + "\n");

        //Returns a new string that replaces all matching substrings in this
        //string with the new substring
        String s3 = str.replaceAll(oldSubstr, newSubstr);
        System.out.println(s3);
    }


    public static void distanceBetweenTwoSubstr(String str, String firstSubstr, String secondSubstr){
        int firstIndex = str.indexOf(firstSubstr);
        int secondIndex = str.indexOf(secondSubstr);
        System.out.println("Distance between \"" + firstSubstr
                + "\" and \"" + secondSubstr + "\" : " + (secondIndex - firstIndex));
    }

    public static void addSpaces(String text, int[] indexes){
        StringBuilder sb = new StringBuilder(text);
        for(int i: indexes){
            sb.insert(i, " ");
        }
        System.out.println("Result: " + sb.toString());
    }
}
