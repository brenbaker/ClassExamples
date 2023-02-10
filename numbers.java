import java.util.*;
import java.io.*;
public class numbers {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        //use scanner to read inputFile1
        //read each line and send it to the output file, preceded by line numbers
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();

        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        int count = 1;

        while(in.hasNextLine()) {
            String value = in.nextLine();
            out.printf("/* " + count + " */" + " " + value + "\n");
            count ++;
        }

        in.close();
        out.close();
    }
}
