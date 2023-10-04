package com.techelevator;

import javax.print.attribute.standard.Destination;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("What is the search Word?");
        String searchWord = userInput.nextLine();
        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        System.out.println("What is the source file?");
        String sourceFile = userInput.nextLine();
        File oldFile = new File(sourceFile);
        System.out.println("What is the Destination File?");
        String destinationFile = userInput.nextLine();
        File newFile = new File(destinationFile);
        try (Scanner dataInput = new Scanner(oldFile); PrintWriter dataOutput = new PrintWriter(newFile)) {
            while (dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                dataOutput.println(lineOfInput.replace(searchWord,replacementWord));
            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot open the source File.");
        }


    }

}
