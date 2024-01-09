import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esempio4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero");
        int input = scanner.nextInt();
        rovescia(input);


    }
    public static void rovescia(int num){
    for (int i = 0; i <= num; i++) {

        System.out.println(num-i);


    }

    }
}