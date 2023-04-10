package design;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

import static algorithm.Numbers.printValue;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {


		//*************************( Employee 1 )***************************//
		System.out.println("//*************************( Employee 1 )***************************//");

		EmployeeInfo employee1 = new EmployeeInfo( 'M', "Bronx New York",  "123-4567=89",  "achour_nyc@hotmail.fr",  "01/01/1985",  9,  5500.9,  6,  "QA",  "Oussama", 123456);

		// calculate Employee Bonus
		int Employee1Bonus = EmployeeInfo.calculateEmployeeBonus(employee1.getEmployeeSalary(), employee1.getEmployeePerformance());
		System.out.println("Employee 1 Yearly Bonus is: " + Employee1Bonus);
		System.out.println("Employee 1 Monthly Bonus is: " + Employee1Bonus/12);

		//calculate Employee Pension
		// note : this method works fine , it  has scanner in it remove the comment to try it .
		//double Employee1Pension = EmployeeInfo.calculateEmployeePension(employee1.getEmployeeSalary());
		//System.out.println("Employee 1 Pension is = " + Employee1Pension);

		employee1.employeeAllowance();
		employee1.benefitLayout();
		employee1.displayAllDetails();
		employee1.displayEarning();
		employee1.calculateSalary();
		employee1.holidayBonus();
		employee1.assignDepartment();


		//*************************( Employee 2 )***************************//

		EmployeeInfo employee2 = new EmployeeInfo();
		employee2.setGender('F');
		employee2.setEmployeeAddress("Manhattan New york");
		employee2.setSsn("098-7654-43");
		employee2.setEmail("maryam@gmai.com");
		employee2.setDate_of_birth("12-12-2000");
		employee2.setEmployeePerformance(8);
		employee2.setEmployeeSalary(4550.5);
		employee2.setNumberOfYearsWithCompany(5);
		employee2.setEmployeeDepartment("DEV");
		employee2.setEmployeeName("maryam");
		employee2.setEmployeeId(345);

		// calculate Employee Bonus
		int Employee2Bonus = EmployeeInfo.calculateEmployeeBonus(employee2.getEmployeeSalary(), employee2.getEmployeePerformance());
		System.out.println("Employee 2 Yearly Bonus is: " + Employee2Bonus);
		System.out.println("Employee 2 Monthly Bonus is: " + Employee2Bonus/12);

		//calculate Employee Pension
		// note : this method works fine , it  has scanner in it remove the comment to try it .
		//double Employee2Pension = EmployeeInfo.calculateEmployeePension(employee2.getEmployeeSalary());
		//System.out.println("Employee 2 Pension is = " + Employee2Pension);

		employee2.employeeAllowance();
		employee2.benefitLayout();
		employee2.displayAllDetails();
		employee2.displayEarning();
		employee2.calculateSalary();
		employee2.holidayBonus();
		employee2.assignDepartment();


		//*************************( Employee 3 )***************************//
		System.out.println("//*************************( Employee 3 )***************************//");

		EmployeeInfo employee3 = new EmployeeInfo( 'M',  "Brooklyn New York",  "543-5678-65", "yahya@gmail.com",  "11-11-2001", 7 ,3569.5, 4 , "HR" , "Yahya" , 34 );

		// calculate Employee Bonus
		int Employee3Bonus = EmployeeInfo.calculateEmployeeBonus(employee3.getEmployeeSalary(), employee3.getEmployeePerformance());
		System.out.println("Employee 3 Yearly Bonus is: " + Employee3Bonus);
		System.out.println("Employee 3 Monthly Bonus is: " + Employee3Bonus/12);

		//calculate Employee Pension
		// note : this method works fine , it  has scanner in it remove the comment to try it .
		//double Employee3Pension = EmployeeInfo.calculateEmployeePension(employee3.getEmployeeSalary());
		//System.out.println("Employee 3 Pension is = " + Employee3Pension);

		employee3.employeeAllowance();
		employee3.benefitLayout();
		employee3.displayAllDetails();
		employee3.displayEarning();
		employee3.calculateSalary();
		employee3.holidayBonus();
		employee3.assignDepartment();



		//**************** Create an ArrayList to store employees *********************************
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		System.out.println("******* ( Employees List ) ********");
		for (int i=0; i<employees.size();i++){
			System.out.println(employees.get(i));
		}


        //*************************( Adding emplist to the database   )***************************//
		// Create an instance of the ConnectToSqlDB class
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		// Loop through the employees and insert each employee into the MySQL table
		for (Employee employee : employees) {
			String separatedString = employee.toString().replace("[", "").replace("]", "");
			connectToSqlDB.insertDataFromStringToSqlTable(separatedString, "tbl_employee", "SortingNumbers");
		}

		// Read the data from the MySQL table using the readDataBase() method
		List<String> employeeRead = connectToSqlDB.readDataBase("tbl_employee", "SortingNumbers");

		// Print the data read from the MySQL table
		for (String employee : employeeRead) {
			System.out.println(employee);
		}


	}

}
