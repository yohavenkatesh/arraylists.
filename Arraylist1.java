/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

import java.util.Scanner;
public class Arraylist1 {

    
    void intersect(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
      
      list1.retainAll(list2);
      System.out.println(list1);
      
        
    }
    public static void main(String[] args) {
       
        ArrayList<Integer> list1=new ArrayList();
        int n,a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of list1:");
        n=obj.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the number"+(i+1));
            a=obj.nextInt();
            list1.add(a); 
        }
        System.out.println(list1);
        
        ArrayList<Integer> list2=new ArrayList();
        int m,b;
        
        System.out.println("enter the size of list2:");
        m=obj.nextInt();
        
        for(int i=0;i<m;i++)
        {
            System.out.println("enter the number"+(i+1));
            b=obj.nextInt();
            list2.add(b); 
        }
        System.out.println(list2);
        Arraylist1 obj1=new Arraylist1();
        
        obj1.intersect(list1,list2);
    }
}

    
    

