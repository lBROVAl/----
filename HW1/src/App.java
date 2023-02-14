
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        while (true) {
        System.out.println("Ti Pidor? Y/N");
            Scanner input = new Scanner (System.in);

             String msg;
    
            msg = input.nextLine();
                switch (msg) {
                case "Y","y":
                     System.out.println("istinu glagolish");
                break;
                case "N","n":
                    System.out.println("Pizdite, sudar");
                break;
                case "nahui":
                System.out.println("Ponal, prinal, vidvigaus");
                    System.exit(0);
                break;
                default:
                    System.out.println("tut pishet, chto tobi ban");
        }
        }
    }
}
