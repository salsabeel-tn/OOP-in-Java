import java.util.Scanner;
public class invest {
    public static void main(String[] args) {
        double futureInvestmentValue, investmentAmount, annualRate, monthlyRate, years;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Investment amount:");
        investmentAmount = input.nextDouble();
        System.out.print("Enter annual rate:");
        annualRate = input.nextDouble();
        System.out.print("Enter number of years:");
        years= input.nextDouble();
        futureInvestmentValue = investmentAmount * Math.pow((1+(annualRate/1200)),(years*12));
        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }

    
}