package practice1.thirdTask;

import java.util.Arrays;

public class StringModifier {
    private String text;

    public StringModifier() {
    }

    public StringModifier(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String deleteDuplicateValues(){
        String stringToBeModified = this.text;
        boolean[] arr = new boolean[128];
        for(int i = 0; i < stringToBeModified.length(); i++){
            char c = stringToBeModified.charAt(i);
            arr[c] = true;
        }

        StringBuilder uniqueSymbols = new StringBuilder();
        for(int i = 0; i < stringToBeModified.length(); i++){
            char c = stringToBeModified.charAt(i);
            if(arr[c]){
                uniqueSymbols.append(c);
                arr[c] = false;
            }
        }
        return uniqueSymbols.toString();
    }

    public String reverseEachWordInReverseOrderInString(){
        String[] tokens = this.text.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String token : tokens) {
            StringBuilder sb = new StringBuilder(token);
            reversedString.append(sb.reverse()).append(" ");
        }
        return reversedString.toString();
    }

    public String addSpaces(int[] indexes){
        StringBuilder sb = new StringBuilder(this.text);
        for(int i: indexes){
            sb.insert(i, " ");
        }
        return sb.toString();
    }
    public String sortByAlphabeticalOrder(){
        String[] tokens = this.text.split(" ");
        Arrays.sort(tokens);
        StringBuilder sortedText = new StringBuilder();
        for(String string: tokens)
            sortedText.append(string);
        return sortedText.toString();
    }
}
