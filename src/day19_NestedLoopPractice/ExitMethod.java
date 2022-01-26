package day19_NestedLoopPractice;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i ==3){
                //break; terminates the loop, but can print other statements outside the loop
                //continue; skips the current iteration of the loop
                System.exit(0);//terminates the program once the req reached, will not print after that anuthing even statements out of loop
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }
}
