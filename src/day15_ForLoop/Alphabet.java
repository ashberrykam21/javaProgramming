package day15_ForLoop;



public class Alphabet {

    public static void main(String[] args) {
        //A ~ Z
        for(int i = 65; i<=90; i++){//i: 65, 66, 67...90
            System.out.print((char)i + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        for(char i = 'A'; i<= 'Z'; i++){// i: A, B, C, ...Z
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //a~z
        for(char i = 'a'; i<= 'z'; i++){// i: A, B, C, ...Z
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------");


        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("----------------------");
        //z~a
        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i +" ");
        }

        System.out.println();

        System.out.println("---------------------------");

        for(char i =1; i<= 40000; i++){
            System.out.print(i +" ");
        }
       // char ch = 'ਲ'

    }
}
 /*
        A~Z
        a~z
        Z~A
        z~a
         */