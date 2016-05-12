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
    private Employee employee;
    private int index;

    @Before
    public void createEmp() {
        company = new Company("IBM", 10);
        employee = new Employee(25, "John", 200, "Smith");
        this.index = 10;
    }


    @Test
    public void addEmployee() throws Exception {
        company.addEmployee(employee);
        assertEquals(company.getEmployeesArray()[company.getCurrentSize() - 1], employee);
    }

    @Test
    public void removeEmpByIndex() throws Exception {
        company.removeEmpByIndex(index);
        assertNotSame(employee, company.getEmployeesArray()[index]);
    }
    @Test (expected = Exception.class)
    public void testExeption (){
        company.removeEmpByIndex(-1);
    }
    @Test
    public void removeEmpByPattern() throws Exception {

    }

    @Test
    public void removeAllByPattern() throws Exception {

    }

}