import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        double bill;
        double tipPercent;
        int people;
        double tip;
        double tipPerPerson;
        double total;
        double totalPerPerson;

        System.out.println("Please input the total.");
        bill = myScanner.nextDouble();
        System.out.println("Please input the desired tip %");
        tipPercent = myScanner.nextDouble()*0.01;
        System.out.println("Please input the amount of people paying");
        people = myScanner.nextInt();
        System.out.println("====================================");
        tip = bill * tipPercent;
        tipPerPerson = tip / (double)people;
        total = bill + tip;
        totalPerPerson = total / (double)people;
        System.out.println("Tip per Person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total per Person: $" + String.format("%.2f", totalPerPerson));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
