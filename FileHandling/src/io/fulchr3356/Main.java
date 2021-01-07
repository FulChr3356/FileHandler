package io.fulchr3356;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String input;
    Document file = new Document("Default");
    System.out.println("New File created called Default");



        label:
        while(true) {
            System.out.println("Enter 0 to exit program\nEnter 1 to read file contents\nEnter 2 to append to file\nEnter 3 to overwrite file contents\nEnter 4 to create a new file");
            input = scanner.nextLine();
            switch (input) {
                case "0":
                    break label;
                case "1":
                    System.out.println(file.read());
                    break;
                case "2":
                    System.out.println("Enter text to append to file:");
                    file.write(scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Enter text to overwrite file with **WARNING** this will overwrite file contents");
                    file.overWrite(scanner.nextLine());
                    break;
                case "4":
                    System.out.println("Enter new File name:");
                    file = new Document(scanner.nextLine());
                    System.out.println("File " + file.getFile().getName() + " created");
                    break;
                default:
                    break;
            }
        }
    }
}
