// SET PATH=C:\Program Files\Java\jdk-10.0.1\bin

import java.util.*;

public class Question_1 {

    public static void main(String[] args) {

        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        System.out.println("Printing out args list using JDK 8 Streams :");
        argList.stream().forEach(element->System.out.format("%s ",element));

        System.out.println();

        // Print out the elements using for-each
        System.out.println("Printing out args list using traditional enhanced for statement :");
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}