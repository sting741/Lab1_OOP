/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question3 {
    private int number;

    public Question3(int number) {
        this.number = number;
    }
    
    public void HailstoneSequence(){
        int temp;
        while (number!=1) {
                temp = number;            
            if (number%2==0) {
                number/=2;
                System.out.println(temp + " is even, so we take n/2: " + number);
            } else {
                number = number*3+1;
                System.out.println(temp + " is odd, so we take n*3+1: " + number);
            }
        }
    }
}
