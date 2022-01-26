package day17_WhileDoWhileLoops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result ="";//expected result: "ABC"
        for (int i = 0; i < str.length(); i++) {
           String ch = "" +str.charAt(i);//converting char to String cuz contain method only takes String
           if(result.contains(ch)){//if the result already contains the character
               continue;//skipping the repeated characters
           }
           result +=ch;
        }
        System.out.println(result);
    }
}
