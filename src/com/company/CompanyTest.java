package com.company;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Legat on 11.05.2016.
 */
public class CompanyTest {
    private Company company;
    private Employee employee ,employee1,employee2,employee3;
    private int index;

    @Before
    public void createEmp() {
        company = new Company("IBM", 2);
        employee = new Employee(25, "John", 200, "Smith");
        employee1 = new Employee(25, "John1", 200, "Smith1");
        employee2 = new Employee(25, "John2", 200, "Smith2");
        employee3 = new Employee(25, "John3", 200, "Smith3");

        this.index = 10;
    }


    @Test
    public void addEmployee() throws Exception {
        company.addEmployee(employee);
        assertEquals(company.getEmployeesArray()[company.getCurrentSize() - 1], employee);
    }
    @Test
    public void addEmployeeWithResize() throws Exception {
        company.addEmployee(employee);
        company.addEmployee(employee);
        company.addEmployee(employee);
        company.addEmployee(employee);
        company.addEmployee(employee);
        company.addEmployee(employee);
        assertEquals(company.getEmployeesArray()[company.getCurrentSize() - 1], employee);
    }




    @Test
    public void removeEmpByIndexSimple() throws Exception {
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.removeEmpByIndex(1);
        assertEquals(company.getEmployeesArray()[1],employee2);
        assertEquals(company.getEmployeesArray()[3],null);

    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void removeEmpByIndexOutOfArraysBoundLessThanZero (){
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.removeEmpByIndex(-1);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void removeEmpByIndexOutOfArraysBoundMoreThanSize (){
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.removeEmpByIndex(100);
    }


    @Test
    public void removeFirstEmpByPatternCorrectRemove() throws Exception {
        company.addEmployee(employee);
        company.addEmployee(employee2);
        company.addEmployee(employee1);
        company.addEmployee(employee3);
        assertTrue(company.removeFirstEmpByPattern(employee1));
        assertEquals(company.getEmployeesArray()[2],employee3);
        assertEquals(company.getEmployeesArray()[3],null);

    }
    @Test
    public void removeFirstEmpByPatternElementNotInArray() throws Exception {
        company.addEmployee(employee);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        assertFalse(company.removeFirstEmpByPattern(employee1));
    }
    @Test
    public void removeFirstEmpByPatternRemoveOnlyFirstElement() throws Exception {
        company.addEmployee(employee);
        company.addEmployee(employee2);
        company.addEmployee(employee1);
        company.addEmployee(employee1);
        company.addEmployee(employee3);
        assertEquals(company.getEmployeesArray()[2],employee1);
    }

    @Test
    public void removeAllByPattern() throws Exception {

    }

}