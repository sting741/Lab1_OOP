/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Lab1 {

    public static void main(String[] args) {
//        Question1 q1 = new Question1(123450);
//        System.out.println(q1.SumFirstAndLastDigit());
        
//        Question2 q2 = new Question2(42, 25, 69);
//        System.out.println(q2.FindMin());
       
//        Question3 q3 = new Question3(15);
//        q3.HailstoneSequence();
        
//        int[]arr={4, 1, 6, 8 ,2};
//        Question4 q4 = new Question4(5, arr);
//        System.out.println(q4.SumEvenArray());
          
          ArrayList<Integer> al = new ArrayList<>();
          al.add(3);
          al.add(4);
          al.add(48);
          al.add(13);
          al.add(6);
//        Question5 q5a = new Question5(22, al);
//        System.out.println(q5a.Delete());

          Question5b q5b = new Question5b(al);
          ArrayList<Integer> ans = q5b.Insert(2, 5);
          for (int i = 0; i < ans.size(); i++) {
              System.out.println(ans.get(i));
        }
          
    }
}
