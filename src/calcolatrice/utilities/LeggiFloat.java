
package calcolatrice.utilities;

import java.util.Scanner;
public class LeggiFloat {
     public static float leggiFloat(String richiesta, Float minimo, Float massimo) {
        float numero = 0;
        Scanner utente = new Scanner(System.in);
        boolean verifica = false;
        do {
            try {
                System.out.println(richiesta);
                numero = Float.parseFloat(utente.nextLine());
                if (minimo == null) {
                    minimo = Float.MIN_VALUE;
                }
                if (massimo == null) {
                    massimo = Float.MAX_VALUE;
                }
                if (numero < minimo) {
                    System.out.println("Errore! Non devi inserire un valore intero inferiore a " + minimo);
                    verifica = true;
                } else if (numero > massimo) {
                    System.out.println("Errore !! non devi inserire un valore inero superiore a" + massimo);
                    verifica = true;
                } else {
                    verifica = false;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Errore!!!hai inserito un numero non valido : "+ex.getMessage());
                verifica=true;
            }
        } while (verifica);

        return numero;
    }
    
}
