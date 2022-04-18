package practice1.thirdTask;

import java.io.*;

public class IOProgram {
    private String source;
    private String destination;

    public IOProgram() {
    }

    public IOProgram(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void processFiles() throws FileNotFoundException {
        File source = new File(this.source);
        File destination = new File(this.destination);
        if(!source.exists())
            throw new FileNotFoundException("Given file " + source.getName() + " does not exist");
        StringModifier modifier = new StringModifier();
        try(BufferedReader reader = new BufferedReader(new FileReader(source));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
            String line;
            while((line = reader.readLine()) != null){
                modifier.setText(line);
                line = modifier.addSpaces(generateRandomIndexes(line.length()));
                modifier.setText(line);
                line = modifier.deleteDuplicateValues();
                modifier.setText(line);
                line = modifier.reverseEachWordInReverseOrderInString();
                modifier.setText(line);
                line = modifier.sortByAlphabeticalOrder();
                writer.write(line);
                writer.write("\n");
            }

        }
        catch (IOException e){
            e.getStackTrace();
        }
    }

    private int[] generateRandomIndexes(int length){
        int[] indexes = new int[3];
        for(int i = 0; i < 3; i++){
            int index = (int)(Math.random() * length);
            indexes[i] = index;
        }
        return indexes;
    }

    public static void main(String[] args) {
        IOProgram program = new IOProgram();
        String source = "test.txt";
        String destination = "result.txt";
        program.setSource(source);
        program.setDestination(destination);
        try {
            program.processFiles();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
