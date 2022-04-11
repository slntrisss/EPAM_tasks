package practice1.secondTask;

public class StringAndChars {
    public static void main(String[] args) {
        String str = "Every day is a new opportunity to become a better version of yourself";
        String test = "alabama";
        freqOfSymbolsInString(test, 'a');
    }
    public static void evenOddChars(String str){
        char[] arr = str.toCharArray();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0)
                even.append(arr[i]);
            else
                odd.append(arr[i]);
        }
        System.out.println("Even: " + even.toString());
        System.out.println("Odd: " + odd.toString());
    }
    public static void countNumbersInString(String str){
        char[] arr = str.toCharArray();
        int count = 0;
        for(char e: arr){
            if(Character.isDigit(e))
                count++;
        }
        System.out.println("Quantity of numbers in str: " + count);
    }
    public static void constructStringOfNumbers(String str){
        StringBuilder stringOfNumbers = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c))
                stringOfNumbers.append(c);
        }
        System.out.println("String of numbers: " + stringOfNumbers.toString());
    }
    public static void deleteDuplicateValues(String str){
        boolean[] arr = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            arr[c] = true;
        }

        StringBuilder uniqueSymbols = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(arr[c]){
                uniqueSymbols.append(c);
                arr[c] = false;
            }
        }
        System.out.println("Unique symbols: " + uniqueSymbols.toString());
    }
    public static void freqOfSymbolsInString(String str, char c){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(c == ch)
                count++;
        }
        System.out.println("Frequency of char \"" + c + "\" is " + count);
    }
}
