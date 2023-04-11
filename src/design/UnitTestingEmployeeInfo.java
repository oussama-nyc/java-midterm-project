package design;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        //********************* Test The method calculateEmployeePension(); ****************************//
        double calculateEmployeePension= EmployeeInfo.calculateEmployeePension(1200.5);
        System.out.println("EmployeePension is = " + calculateEmployeePension);

        //********************* Test The Rest of  methods ****************************
        EmployeeInfo employee = new EmployeeInfo( 'M', "Bronx New York",  "123-4567=89",  "achour_nyc@hotmail.fr",  "01/01/1985",  9,  5500.9,  6,  "QA",  "Oussama", 123456);
        employee.employeeAllowance();
        employee.benefitLayout();
        employee.displayAllDetails();
        employee.displayEarning();
        employee.calculateSalary();
        employee.holidayBonus();
        employee.assignDepartment();
  }

     //**************Test the method: calculateEmployeeBonus(); *****************************
    @Test
    public void testcalculateEmployeeBonus() {
        int expectedResult = 1052;
        int actualResult = EmployeeInfo.calculateEmployeeBonus(1200, 7);
        Assert.assertEquals("Test faild",expectedResult,actualResult);
    }

}
