import javax.swing.*;
import java.text.DecimalFormat;

public class Un1Payroll {
    public static void main(String[] args) {
        // Constants
        final double FED_WITHHOLDING_RATE = .14;
        final double STATE_WITHHOLDING_RATE = .041;
        final double SOCIAL_SECURITY_WITHHOLDING_RATE = .062;
        final double MEDICARE_WITHHOLDING_RATE = .0145;
        final double HEALTHCARE_DEDUCTION = 54.12;
        final double SAVINGS_PERCENTAGE = .10;

        // Input variables
        String firstName;
        String lastName;
        double hoursWorked;
        double hourlyRate;

        // Output variables
        double grossPay;
        double federalWithholdingAmt;
        double stateWithholdingAmt;
        double socSecWithholdingAmt;
        double medWithholdingAmt;
        double netPay;
        double suggestedSavings;

        DecimalFormat df = new DecimalFormat("#.00");

        //Get input values
        firstName = JOptionPane.showInputDialog("Please enter your first name: ");
        lastName = JOptionPane.showInputDialog("Please enter your last name: ");
        hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Please enter the number of hours worked this week: "));
        hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter your hourly rate: "));

        //Calculate withholding amounts, gross pay, net pay, and suggested savings
        grossPay = hourlyRate * hoursWorked;
        federalWithholdingAmt = grossPay * FED_WITHHOLDING_RATE;
        stateWithholdingAmt = grossPay * STATE_WITHHOLDING_RATE;
        socSecWithholdingAmt = grossPay * SOCIAL_SECURITY_WITHHOLDING_RATE;
        medWithholdingAmt = grossPay * MEDICARE_WITHHOLDING_RATE;
        netPay = grossPay - federalWithholdingAmt - stateWithholdingAmt - socSecWithholdingAmt - medWithholdingAmt;
        suggestedSavings = grossPay * SAVINGS_PERCENTAGE;

        //Output gross pay, net pay, deductions, and suggested savings
        System.out.println("\n\nWEEKLY PAYROLL DATA FOR: " + lastName.toUpperCase() + ", " + firstName.toUpperCase());
        System.out.println("\nGross Pay: $" + df.format(grossPay) + " (" + hoursWorked + "hours @ $" + hourlyRate + "/hour)");
        System.out.println("\nFederal Withholding: $" + df.format(federalWithholdingAmt));
        System.out.println("Social Security Withholding: $" + df.format(socSecWithholdingAmt));
        System.out.println("Medicare Withholding: $" + df.format(medWithholdingAmt));
        System.out.println("Health Care Deduction: $" + HEALTHCARE_DEDUCTION);
        System.out.println("\n Net Pay: $" + df.format(netPay));
        System.out.println("\nSuggested Minimum Savings: $" + df.format(suggestedSavings));
    } //End main method
} //End class Un1Payroll
