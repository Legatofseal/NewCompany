package com.company;

import java.util.ArrayList;

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

        }
        employeesArray=newArr;
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
    public boolean removeFirstEmpByPattern (Employee employee){
        boolean check = false;
        for (int i=0; i<currentSize; i++){
            if (employeesArray[i].equals(employee)){
                removeEmpByIndex(i);
                check=true;
                break;
            }
        }
        return check;
    }

    public boolean removeAllElementsButFirstByPattern(Employee employee){
        int index =-1;
        for (int i=0; i<currentSize; i++){
            if (employeesArray[i].equals(employee)){
                index=i;
                break;
            }
        }
        for (int i=index+1; i<currentSize; i++){
            if (i!=index){
                removeEmpByIndex(i);
            }


        }
        return  false;
    }

    static void displayLetters(String string){
        char[] chars = string.toCharArray();
        for (int i = 0; i<chars.length; i++){
            System.out.println(chars[i]);
        }
    }
    public int removeAllByPattern (Employee employee){
        return -1;
    }

    public int makeFood (){
        return -1;
    }

    static int countLetter(String string, char letter){
        int number = -1;
        char[] chars = string.toCharArray();
        for (int i=0; i<chars.length; i++){
            if(Character.toLowerCase(letter)==Character.toLowerCase(chars[i])){
                number=i;
                break;
            }
        }
        return number;
    }
    static int countLetterCaseInsentive(String string, char letter){
        int number = -1;
        char[] chars = string.toCharArray();
        for (int i=0; i<chars.length; i++){
            if(letter==chars[i]){
                number=i;
                break;
            }
        }
        return number;
    }
    static String removeLetter(String string, char letter){
        char[] chars = string.toCharArray();
        ArrayList <Character> temp = new ArrayList<Character>();
        for (int i=0; i<chars.length; i++){
            if (chars[i]!=letter){
                temp.add(chars[i]);
            }
        }
        char [] result = new char[temp.size()];
        for (int i=0; i<temp.size(); i++){
            result[i]=temp.get(i);
        }
        String out = new String(result);
        return  out;


       //      String out = new StringBuilder(temp.toArray()).toString();
       //     return out;


    }
    static String removeLetterConcat(String string, char letter){
        String out = new String("");
        char[] chars = string.toCharArray();
        ArrayList <Character> temp = new ArrayList<Character>();
        for (int i=0; i<chars.length; i++){
            if (chars[i]!=letter){
                out+=chars[i];
            }
        }

        return  out;
      //      String out = new StringBuilder(temp.toArray()).toString();
        //     return out;


    }



}
