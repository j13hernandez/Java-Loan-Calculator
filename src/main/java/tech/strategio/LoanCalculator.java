package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * This method will take in an amount as a param and 
     * calculate how much you have remaining if you pay back 
     * 10% each month
     * 
     * @param amount of loan
     * @return remainder after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // This is the output 
        int remainder = amount;
        for (int i = 0; i < 3; i++) {
            remainder = remainder - (remainder / 10);
        }
        return remainder;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
