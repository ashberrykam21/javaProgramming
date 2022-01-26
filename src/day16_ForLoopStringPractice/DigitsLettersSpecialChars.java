package day16_ForLoopStringPractice;

import java.security.spec.RSAOtherPrimeInfo;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {
        String str = "ABCDEF!@#$%(^ &)563000";

        String digits = "";//12345
        String letters = "";//CydeoWoodenSpoon
        String specialChars = "";//!@#$%

        for (int i = 0; i < str.length(); i++) {//index numbers of str (0 ~ last index)

            char ch = str.charAt(i);//ch: every single characters we have in str

            if (ch >= '0' && ch <= '9') {//if the character is between '0'~'9'
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {//if the character is between 'A' ~ 'Z'
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {//if the character is between 'a' ~ 'z'
                letters += ch;
            }else{// if the character neither digit nor letter, then its special character
                if(ch!=' ') {// used to remove space from characters
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}