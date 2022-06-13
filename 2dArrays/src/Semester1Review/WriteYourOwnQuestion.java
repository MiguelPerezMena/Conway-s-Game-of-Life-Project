/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semester1Review;

/**
 *
 * @author MIGUEL
 */
public class WriteYourOwnQuestion 
{
    public static void main(String[] args) 
    {
        //Question 3
        String st1 = "burlesque";
        String st2 = "garish";
        String st3 = st1.substring(0,3)+st2.substring(0,1)+st1.charAt(4)+st2.substring(2,3);
        System.out.println(st3);
        
        //Question 4
//        int x =5;
//        for (int i = 0; i < 5 ; i++) 
//            for (int j = 0; j < 5; j++) 
//            {
//                x=x*j;
//                x=x/i;
//                x++;
//            }
//        System.out.println(x);
        
        
        //question 5
        int x=5;
        int i=0;
        boolean isCool=false;
        for ( i = 0; i < 100; i++) 
            {
                if(x*i==100)
                {
                    System.out.println(i);
                    isCool=true;
                }         
            }
        
        
        //Question 1
//        int e=1000;
//        while(e+3/2!=10)
//        {
//            e--;
//        }
//        System.out.println(e);
        
        

    
    }
    
}
