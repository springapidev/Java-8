/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corech6;

import java.util.Scanner;

/**
 *
 * @author J2EE-27
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int []data=new int[10];
        for(int i=0; i<10; i++){
            System.out.print((i+1)+"no data:");
            data[i]=input.nextInt();
        }
            //int data from keybord
            for (int d:data){
                System.out.println(d);
            }
            
            //max value....
            int max=data[0];
             for (int d:data){
                 if(max<d)
                     max=d;}
                System.out.println("Max value is "+max);
                
        //min value        
        int min=data[0];
             for (int d:data){
                 if(min>d)
                     min=d;}
                System.out.println("min value is "+min);
                
                
        int sum=0;
        for (int d:data){
        sum+=d;
        }
        System.out.println("Sum"+sum);
        
        int avg=sum/10;
        System.out.println("avg"+avg);
        
        System.out.println(avg+"Below avg...");
        for (int d:data){
        if (avg>d){
            System.out.println(d);
        }
        }
    }
    
}
