
package calcolatrice.utilities;

import java.util.Scanner;
public class LeggiStringa {
     public static String leggiStringa(String richiesta, String caratteriAmmessi,Integer numMin, Integer numMax) {
        Scanner utente = new Scanner(System.in);

        do {
            System.out.println(richiesta);
            String stringa = utente.nextLine();
            try {
                if(numMin==null){
                    numMin=Integer.MIN_VALUE;
                }
                if(numMax==null){
                    numMax=Integer.MAX_VALUE;
                }

                if(stringa.length()<numMin||stringa.length()>numMax){
                     System.out.println("Hai inserito un numero di caratteri non corretto, riprova..");
                     throw new Exception();
                }
                if (caratteriAmmessi != null) {

                    for (int i = 0; i < stringa.length(); i++) {
                        char carattere = stringa.charAt(i);
                        boolean trovato = false;

                        for (int j = 0; j < caratteriAmmessi.length(); j++) {

                            char carattereLista = caratteriAmmessi.charAt(j);
                            if (carattere == carattereLista) {
                                trovato = true;
                                break;
                            }
                        }
                        if (!trovato) {
                            throw new Exception();
                        }
                    }
                }
                return stringa;
            } catch (Exception ex) {
                System.out.println("Errore dei caratteri!\n" +
                        "devono essere più di "+numMin+" e meno di "+numMax+". Quelli ammessi sono i seguenti : \n" + caratteriAmmessi);
            }
        } while (true);
    }
}
