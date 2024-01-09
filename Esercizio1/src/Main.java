//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio1");

        System.out.println(stringaPariDispari("pagliaccio"));
        System.out.println(annoBisestile(2024));

    }
    public static boolean stringaPariDispari(String esempio) {
//        if (esempio.length() % 2 == 0) {
//            return true;
//        }else {
//            return false;
//        }
        return esempio.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
        if(anno%4==0||anno%100==0 && anno%400==0){
            return true;
        }else{
            return false;
        }

    }
}