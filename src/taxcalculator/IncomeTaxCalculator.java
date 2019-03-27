package taxcalculator;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {

		final double Tax_Rate1 = 0.10; // Tax Rate
		final double Tax_Rate2 = 0.12;
		final double Tax_Rate3 = 0.22;
		final double Tax_Rate4 = 0.24;
		final double Tax_Rate5 = 0.32;
		final double Tax_Rate6 = 0.35;
		final double Tax_Rate7 = 0.37;

		final double S1 = 9700; // Tax brackets for single
		final double S2 = 39475.0;
		final double S3 = 84200.0;
		final double S4 = 160725.0;
		final double S5 = 204100.0;
		final double S6 = 510300.0;
		final double S7 = 510301.0;

		final double M1 = 19400.0; // Tax brackets for married
		final double M2 = 78950.0;
		final double M3 = 168400.0;
		final double M4 = 321450.0;
		final double M5 = 408200.0;
		final double M6 = 612350.0;
		final double M7 = 612351.0;

		final double H1 = 13850.0; // Tax bracket for Head of Household
		final double H2 = 52850.0;
		final double H3 = 84200.0;
		final double H4 = 160700.0;
		final double H5 = 204100.0;
		final double H6 = 510300.0;
		final double H7 = 510301.0;

		Scanner person = new Scanner(System.in); // constructed scanner object

		System.out.println("*****2019 Annual Tax Calculator Application*****\n");
		System.out.println("1 = Single\n2 = Married\n3 = Head of Household\n");
		System.out.print("Please enter your filing status: ");
		int FilingStatus = person.nextInt();

		System.out.println("\nPlease enter your total taxable income: $");
		double income = person.nextDouble();

		double tax = 0;
		if (FilingStatus == 1) { // Compute tax for single filers
			if (income <= S1)
				tax = income * Tax_Rate1;
			else if (income <= S2)
				tax = S1 * Tax_Rate1 + (income - S1) * Tax_Rate2;
			else if (income <= S3)
				tax = S1 * Tax_Rate1 + (S2 - S1) * Tax_Rate2 + (income - S2) * Tax_Rate3;
			else if (income <= S4)
				tax = S1 * Tax_Rate1 + (S2 - S1) * Tax_Rate2 + (S3 - S2) * Tax_Rate3 + (income - S3) * Tax_Rate4;
			else if (income <= S5)
				tax = S1 * Tax_Rate1 + (S2 - S1) * Tax_Rate2 + (S3 - S2) * Tax_Rate3 + (S4 - S3) * Tax_Rate4
						+ (income - S4) * Tax_Rate5;
			else if (income <= S6)
				tax = S1 * Tax_Rate1 + (S2 - S1) * Tax_Rate2 + (S3 - S2) * Tax_Rate3 + (S4 - S3) * Tax_Rate4
						+ (S5 - S4) * Tax_Rate5 + (income - S5) * Tax_Rate6;
			else
				tax = S1 * Tax_Rate1 + (S2 - S1) * Tax_Rate2 + (S3 - S2) * Tax_Rate3 + (S4 - S3) * Tax_Rate4
						+ (S5 - S4) * Tax_Rate5 + (S6 - S5) * Tax_Rate6 + (income - S6) * Tax_Rate7;
		}

		else if (FilingStatus == 2) { // Compute tax for Married filers
			if (income <= M1)
				tax = income * Tax_Rate1;
			else if (income <= M2)
				tax = M1 * Tax_Rate1 + (income - M1) * Tax_Rate2;
			else if (income <= M3)
				tax = M1 * Tax_Rate1 + (M2 - M1) * Tax_Rate2 + (income - M2) * Tax_Rate3;
			else if (income <= M4)
				tax = M1 * Tax_Rate1 + (M2 - M1) * Tax_Rate2 + (M3 - M2) * Tax_Rate3 + (income - M3) * Tax_Rate4;
			else if (income <= M5)
				tax = M1 * Tax_Rate1 + (M2 - M1) * Tax_Rate2 + (M3 - M2) * Tax_Rate3 + (M4 - M3) * Tax_Rate4
						+ (income - M4) * Tax_Rate5;
			else if (income <= M6)
				tax = M1 * Tax_Rate1 + (M2 - M1) * Tax_Rate2 + (M3 - M2) * Tax_Rate3 + (M4 - M3) * Tax_Rate4
						+ (M5 - M4) * Tax_Rate5 + (income - M5) * Tax_Rate6;
			else
				tax = M1 * Tax_Rate1 + (M2 - M1) * Tax_Rate2 + (M3 - M2) * Tax_Rate3 + (M4 - M3) * Tax_Rate4
						+ (M5 - M4) * Tax_Rate5 + (M6 - M5) * Tax_Rate6 + (income - M6) * Tax_Rate7;
		}

		else if (FilingStatus == 3) { // Compute tax for Married filers
			if (income <= H1)
				tax = income * Tax_Rate1;
			else if (income <= H2)
				tax = H1 * Tax_Rate1 + (income - H1) * Tax_Rate2;
			else if (income <= H3)
				tax = H1 * Tax_Rate1 + (H2 - H1) * Tax_Rate2 + (income - H2) * Tax_Rate3;
			else if (income <= H4)
				tax = H1 * Tax_Rate1 + (H2 - H1) * Tax_Rate2 + (H3 - H2) * Tax_Rate3 + (income - H3) * Tax_Rate4;
			else if (income <= H5)
				tax = H1 * Tax_Rate1 + (H2 - H1) * Tax_Rate2 + (H3 - H2) * Tax_Rate3 + (H4 - H3) * Tax_Rate4
						+ (income - H4) * Tax_Rate5;
			else if (income <= H6)
				tax = H1 * Tax_Rate1 + (H2 - H1) * Tax_Rate2 + (H3 - H2) * Tax_Rate3 + (H4 - H3) * Tax_Rate4
						+ (H5 - H4) * Tax_Rate5 + (income - H5) * Tax_Rate6;
			else
				tax = H1 * Tax_Rate1 + (H2 - H1) * Tax_Rate2 + (H3 - H2) * Tax_Rate3 + (H4 - H3) * Tax_Rate4
						+ (H5 - H4) * Tax_Rate5 + (H6 - H5) * Tax_Rate6 + (income - H6) * Tax_Rate7;
		}else 
		{
			System.out.println("Error: invalid status");
		}

		System.out.println("Tax is " + (int) (tax * 100) / 100.0); // Display the result
	}
}
