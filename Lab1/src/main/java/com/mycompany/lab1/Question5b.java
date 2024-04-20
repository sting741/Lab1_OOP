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
public class Question5b {
    
    private ArrayList<Integer> al = new ArrayList<>();

    public Question5b() {
    }
    
    public Question5b(ArrayList<Integer> al) {
        this.al = al;
    }
    
    public ArrayList Insert(int index, int number) {
        al.add(index, number);
        al.remove(al.size() - 1);
        return al;
    }
}
