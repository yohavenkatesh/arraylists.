/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class employee
{
    String name;
    double salary; 
    public employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString()
    {
        return name+"<->"+salary+" ";
    }
    
}

    class sortbyname implements Comparator<employee>
    {
      
        public int compare(employee a,employee b)
        {
            return a.name.compareTo(b.name);
        }
    
}
public class Arraylist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner obj=new Scanner(System.in);
        ArrayList<employee> emp=new ArrayList<employee>();
        String s;
        double sa;
        for(int i=0;i<3;i++)
        {
            System.out.println("enter name of employee"+(i+1));
            s=obj.next();
            System.out.println("enter salary of employee"+(i+1));
            sa=obj.nextDouble();
            emp.add(new employee(s,sa));
           
        }
        System.out.println("[........THE EMPLOYEE NAME BEFORE SORTED......]");
        System.out.println(emp);
        
        Collections.sort(emp,new sortbyname());
        System.out.println("[..........EMPLOYEES NAME IN ASCENDING ORDER..........]");
        
        System.out.println(emp);
        
    }
    
}
