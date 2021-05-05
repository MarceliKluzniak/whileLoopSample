package pl.mkluzniak;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in); //line to create scanner to input sth
        String name = ""; //string becouse input is name
        do { //operator that doing sth that id in block
            System.out.println("Enter your name: "); //program is askind to input name from user
            name = scanner.nextLine(); //its printing name on next line
        } while (name.isBlank()); //end of doing block
        System.out.println("Hello " + name); //printing "Hello" and name that user put in
    }
}
