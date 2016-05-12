package com.company;

/**
 * Created by Legat on 11.05.2016.
 */
public class Company {
    private String companyName;
    private Employee[] employeesArray;
    private int maxSize;

    public int getCurrentSize() {
        return currentSize;
    }

    private int currentSize=0;

    public Employee[] getEmployeesArray() {
        return employeesArray;
    }




    public Company(String companyName,  int maxSize) {
        this.companyName = companyName;
        employeesArray = new Employee[maxSize];
        this.maxSize = maxSize;
    }

    private void resizeArray (){
        Employee[] newArr = new Employee[maxSize *2];
        for (int i = 0; i< maxSize; i++){
            newArr[i]=employeesArray[i];
            employeesArray=newArr;
        }
        maxSize=maxSize*2;
    }
    public void addEmployee (Employee employee){
        if (currentSize== maxSize){
            resizeArray();
        }
        employeesArray[currentSize]=employee;
        currentSize++;

    }
    public void removeEmpByIndex (int index){
        if (index<0||index>currentSize-1){
            throw new ArrayIndexOutOfBoundsException("What the hell");
        }
        else {
            for (int i=index; i<currentSize-1; i++){
                employeesArray[i]=employeesArray[i+1];
            }
            employeesArray[currentSize-1]=null;
            currentSize++;
        }

    }
    public void removeFirstEmpByPattern (Employee employee){
        for (int i=0; i<currentSize; i++){
            if (employeesArray[i].equals(employee)){
                removeEmpByIndex(i);
                break;
            }
        }
    }
    public int removeAllByPattern (Employee employee){
        return -1;
    }

    public int makeFood (){
        return -1;
    }




}
