package com.company;
interface Summation{ //abstraction
    int sum(int a, int b);
    void printSum(int sum);
}
public class InterfaceCreation implements Summation { //class
    public int sum(int a, int b){
        int ans = a+b;
        return ans;

    }
    public void printSum(int sum){
        System.out.println("Sum of the two numbers is: "+sum);
    }
    public static void main(String args[]){
        InterfaceCreation ob = new InterfaceCreation(); //object creation
        ob.printSum(ob.sum(1,2));
    }
}
