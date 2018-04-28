package week5.Practicum_0;

public class Main {
    public static void main(String[] args) {
        Utils Utils = new Utils();
        
        //Print statements
        System.out.println(Utils.bedrag(3.11314));
        System.out.println(Utils.bedrag(3.11314, 1));
        System.out.print("Aantal keer gebruikt: " + Utils.getRequestCount());
    }
}
