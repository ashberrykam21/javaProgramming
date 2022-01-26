package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

    String[] classMates ={"Dmytro Lishcheniuk", "Aniqa Siddiqi",
       "Hakan Karatas", "Hazreta Tianekeohlu", "Maxim Cherepanov",
       "Sueda Islak", "Wail Bichiba", "Daniil Bendatii","Adrian Rezk",
       "Frewoinie Gebremariam"};

    for(String each : classMates){

        String reversed = "";

        for (int i = each.length()-1; i >=0 ; i--) {
            reversed += each.charAt(i);
        }
        System.out.println(reversed);
        }

    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */