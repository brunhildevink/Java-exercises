package week5.Practicum_3;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pricelist input filename:");
            String inputPriceListFile = scanner.nextLine();

            System.out.print("Pricelist output filename:");
            String outputPriceListFile = scanner.nextLine();

            System.out.println("Currency value:");
            Double currencyValue = Double.parseDouble(scanner.nextLine());

            scanner.close();

            generatePriceList(inputPriceListFile, outputPriceListFile, currencyValue);

        } catch (Exception e) {
            System.out.print("Something went wrong: " + e);
        }
    }

    public static void generatePriceList(String inputPriceListFile, String outputPriceListFile, Double currencyValue) throws IOException {
        try {
            FileReader file = new FileReader("/Users/brunhildevink/School/Huiswerk/Java/Opdrachten" + inputPriceListFile);
            BufferedReader br = new BufferedReader(file);
            String regel = br.readLine();

            FileWriter fw = new FileWriter("/Users/brunhildevink/School/Huiswerk/Java/Opdrachten" + outputPriceListFile);
            PrintWriter pw = new PrintWriter(fw);

            while (regel != null) {
                String productDetails[] = regel.split(" : ");
                String naam = productDetails[0];
                Double prijs = Double.parseDouble(productDetails[1]);
                pw.println(naam + " : " + prijs * currencyValue);
                regel = br.readLine();
            }
            br.close();
            pw.close();
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
