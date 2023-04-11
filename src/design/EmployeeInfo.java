package design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	public static final String COMPANY_NAME = "IBM Corporation";
	public static final int MAX_EMPLOYEES = 1000000;
	private int employeePerformance;
	private double employeeSalary;
	private int numberOfYearsWithCompany;
	private String employeeDepartment;
	private String employeeName;
	private int employeeId;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	//********* ( constructor ) ***********
	public EmployeeInfo() {
	}
	public EmployeeInfo(char gender, String employeeAddress, String ssn, String email, String date_of_birth, int employeePerformance, double employeeSalary, int numberOfYearsWithCompany, String employeeDepartment, String employeeName, int employeeId) {
		super(gender, employeeAddress, ssn, email, date_of_birth);
		this.employeePerformance = employeePerformance;
		this.employeeSalary = employeeSalary;
		this.numberOfYearsWithCompany = numberOfYearsWithCompany;
		this.employeeDepartment = employeeDepartment;
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	//*********** ( Setter and Getter ) *********
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeePerformance() {
		return employeePerformance;
	}
	public void setEmployeePerformance(int employeePerformance) {
		this.employeePerformance = employeePerformance;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getNumberOfYearsWithCompany() {
		return numberOfYearsWithCompany;
	}
	public void setNumberOfYearsWithCompany(int numberOfYearsWithCompany) {
		this.numberOfYearsWithCompany = numberOfYearsWithCompany;
	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(double employeeSalary, int employeePerformance) {
		double bonusPercentage;
		if (employeePerformance >= 9) {
			bonusPercentage = 0.10;
		} else if (employeePerformance >= 7) {
			bonusPercentage = 0.08;
		} else if (employeePerformance >= 5) {
			bonusPercentage = 0.05;
		} else {
			bonusPercentage = 0.0;
		}
		int bonus = (int) Math.round(employeeSalary * bonusPercentage);
		int yearlyBonus = bonus*12;
		return yearlyBonus;
	}
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(double employeeSalary) {
		int EmployeePension = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		// Calculate the number of years from the above two dates
		int years = calculateYears(convertedJoiningDate, convertedTodaysDate);

		// Calculate pension
		double pension = 0.0;
		if (years == 1) {
			pension = employeeSalary * 0.05;
		} else if (years == 2) {
			pension = employeeSalary * 0.10;
		} else if (years == 3) {
			pension = employeeSalary * 0.15;
		} else if (years >= 4) {
			pension = employeeSalary * 0.20;
		}

		EmployeePension = (int) Math.round(pension);

		return EmployeePension;
	}

		// halp of calculater method
		private static int calculateYears(String joiningDate, String todaysDate) {
			int years = 0;
			SimpleDateFormat format = new SimpleDateFormat("MM/yyyy");
			try {
				Date d1 = format.parse(joiningDate);
				Date d2 = format.parse(todaysDate);
				long diff = d2.getTime() - d1.getTime();
				long diffYears = diff / (1000L * 60 * 60 * 24 * 365);
				years = (int) diffYears;
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return years;
		}

	@Override
	public void holidayBonus() {
		double bonusAmount = 150.0;
	    System.out.println("Holiday bonus of $" + bonusAmount + " for each employee.");
	}

	@Override
	public void employeeAllowance() {
		double allowanceAmount = 150.0;
		System.out.println("Employee allowance of $" + allowanceAmount + " for expenses such as travel, gas, and food.");
	}

	@Override
	public void employeeRetirement() {
		int yearsOfService = 20;
		System.out.println("The employee can apply for retirement after " + (yearsOfService + 5.0) + " years of service.");
	}

	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return employeeName;
	}

	@Override
	public void assignDepartment() {
		System.out.println("DEV");
	}

	@Override
	public int calculateSalary() {

		int yearlySalary = (int) Math.round(employeeSalary*12);
		return yearlySalary;
	}

	@Override
	public void benefitLayout() {
		System.out.println("Full Time Employee receive medical insurance, retirement plans...");
	}

	@Override
	public String toString() {
		return  "\n * Employee Performance =" + employeePerformance +
				"\n * Employee Salary =" + employeeSalary +
				"\n * Number Of Years With Company =" + numberOfYearsWithCompany +
				"\n * Employee Department ='" + employeeDepartment + '\'' +
				"\n * Employee Name ='" + employeeName + '\'' +
				"\n * Employee Id =" + employeeId ;
	}

	@Override
	public void displayAllDetails() {
		System.out.println(super.toString() + toString());
	}

	@Override
	public void displayEarning() {
		System.out.println("Earnings=" + employeeSalary + "+ Bonus" );
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;
		}
	}
}
