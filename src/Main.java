import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        String ongeldig = "Ongeldige invoer";



        while (play) {
            Scanner scanner = new Scanner(System.in);

            Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

            System.out.println("typ x om te stoppen of typ v om te spelen");

            String input = scanner.nextLine().toLowerCase();

            if (input.equals("x")) {
                break;
            } else if(input.equals("v"))  {
                {
                    System.out.println("Voer een nummer van 0 tot 9 in.");
                    int inputScanner = scanner.nextInt();
                    System.out.println();
                    Translator vertaler = new Translator(numeric, alphabetic);
                    String antwoord = vertaler.translate(inputScanner);
                    System.out.println(antwoord);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}