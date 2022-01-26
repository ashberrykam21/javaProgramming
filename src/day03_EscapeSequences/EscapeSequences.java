package day03_EscapeSequences;
/*
escape seuences: Must be giving with double quote
   \n: starts a new line
   \t: gives paragraph space
   \\: prints single back slash
   \": double quote as a symbol need to be witten with backward slash in front
    */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("--------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("-------------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("------------------------------------------------");

        System.out.println("/ \\"); //In order to print one backward slash u need to print two

        System.out.println("------------------------------------------------");
        System.out.println("My favorite show is \"Game of Throne\"");// In order to double quate u need to put backward slash in front of double quote

    }


}
