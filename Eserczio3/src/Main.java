import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esempio3");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break;
            }

            String result = addComma(input);
            System.out.println("Risultato: " + result);
        }

        scanner.close();
    }


    public static  String addComma(String esempio){
            int i =0 ;
            char[] charArray= esempio.toCharArray();
            StringBuilder newString = new StringBuilder();

            while (  i < esempio.length()){
                    newString.append(charArray[i]);
                    if( i < esempio.length()-1){
                        newString.append(",");
                    }

                i++;
            }
            return newString.toString();


    }
}