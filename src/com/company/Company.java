package com.company;

import java.util.Iterator;

/**
 * Created by Legat on 11.05.2016.
 */
public class Company {
    private String companyName;
    private Employee[] employeesArray;

    public int getCurrentSize() {
        return currentSize;
    }

    private int currentSize=0;

    public Employee[] getEmployeesArray() {
        return employeesArray;
    }

    private int startSize = 10;
    private int resizeArraay (){
        return -1;
    }

    public Company(String companyName,  int startSize) {
        this.companyName = companyName;
        employeesArray = new Employee[startSize];
        this.startSize = startSize;
    }

    public int addEmployee (Employee employee){
        return -1;
    }
    public int removeEmpByIndex (int index){
        return -1;
    }
    public int removeEmpByPattern (Employee employee){
        return -1;
    }
    public int removeAllByPattern (Employee employee){
        return -1;
    }

    public int makeFood (){
        return -1;
    }




}
