
package calcolatrice;

import static calcolatrice.utilities.LeggiStringa.leggiStringa;
import static calcolatrice.utilities.LeggiFloat.leggiFloat;


public class Calcolatrice {


    public static void main(String[] args) {

        System.out.println("""
                Questo programma esegue calcoli.
                Segui le istruzioni seguenti, per ogni operazione
                corrisponde un tasto, premilo per eseguire l' operazione\s
                descritta a fianco al simbolo:""".indent(1));

        // variabili
        do {
            try {
                float numero1;
                float numero2;
                float risultato = 0;
                String scelta;


                procedure.Menu.menuCalcolatrice();

                numero1 = leggiFloat("Inserisci un numero : ", null, (float) 1000);
                scelta = leggiStringa("Inserisci la tua scelta : ", "cCxX+-*/", 1, 1);
                if (scelta.equals("c") || scelta.equals("C")) {
                    System.out.println("Devi fare almeno un operazione!!!");
                    scelta = leggiStringa("Inserisci la tua scelta : ", "cCxX+-*/", 1, 1);
                }
                if (scelta.equals("x") || scelta.equals("X")) {
                    System.out.println("Arrivederci");
                    System.exit(0);
                } else {
                    boolean verifica = true;
                    while (verifica) {

                        numero2 = leggiFloat("Inserisci il secondo numero :", null, (float) 1000);
                        if (scelta.equals("+")) {
                            risultato = numero1 + numero2;
                            numero1 = risultato;
                        }
                        if (scelta.equals("-")) {
                            risultato = numero1 - numero2;
                            numero1 = risultato;
                        }
                        if (scelta.equals("*")) {
                            risultato = numero1 * numero2;
                            numero1 = risultato;
                        }
                        if (scelta.equals("/")) {
                            risultato = numero1 / numero2;
                            numero1 = risultato;
                        }

                        System.out.println("Il risultato è : " + risultato);

                        scelta = leggiStringa("Inserisci la tua scelta : ", "cCxX+-*/", 1, 1);
                        if (scelta.equals("x") || scelta.equals("X")) {
                            System.out.println("Arrivederci");
                            System.exit(0);
                        }
                        if (scelta.equals("c") || scelta.equals("C")) {
                            verifica = false;

                        }
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);

    }
}
