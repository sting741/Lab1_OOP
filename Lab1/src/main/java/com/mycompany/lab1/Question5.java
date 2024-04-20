/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Question5 {
    private int number;
    private ArrayList<Integer> al = new ArrayList<>();

    public Question5() {
    }
    
    public Question5(int number,ArrayList<Integer> al){
        this.number = number;
        this.al = al;
    }
    
    public boolean Delete(){
        boolean flag = al.contains(number);
        if (flag) {
        al.remove(number);
        return true;
        } else {
        return false;
        }
    }
   
    
    }

