package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {
    String[] classMates ={"Dmytro Lishcheniuk", "Aniqa Siddiqi",
         "Hakan Karatas", "Hazreta Tianekeohlu", "Maxim Cherepanov",
         "Sueda Islak", "Wail Bichiba", "Daniil Bendatii","Adrian Rezk",
         "Frewoinie Gebremariam"};

        for (String each : classMates) {
            String initials = each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }



    }
}
/*

 */