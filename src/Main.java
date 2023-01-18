import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        while (true) {  // ho aggiunto while, per creare un ciclo infinito di domanda, nella consegna diceva ''continua a chiedere''.
            System.out.println("Inserisci il numero da dividere: ");
            int divisor = s.nextInt();
            System.out.println("Inserisci il numero per cui vuoi dividere: ");
            int dividend = s.nextInt();

            try {
                if (divisor == 0) {
                    throw new ArithmeticException("Non posso dividere per 0!");
                }
                float tot = (float) divisor / dividend;
                System.out.println("Il risultato è :" + tot);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}