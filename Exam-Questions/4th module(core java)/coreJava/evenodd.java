/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corech6;

/**
 *
 * @author J2EE-27
 */
public class CoreCh6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[]={45,67,30,78,56,43};
        for(int i=0; i<data.length; i++)
            System.out.println(data[i]);
        
        System.out.println("Even number ....");
        for(int i=0; i<data.length; i++)
        {
        if(data[i]%2==0)
            System.out.println(data[i]);
        }
        
        
        System.out.println("Odd number ....");
        for(int i=0; i<data.length; i++)
        {
        if(data[i]%2!=0)
            System.out.println(data[i]);
        }
        
        System.out.println("Even/Odd:");
        for(int i=0; i<data.length; i++)
        {
        if(data[i]%2==0)
            System.out.println(data[i]+" is Even");
        else
                System.out.println(data[i]+" is Odd");
        }
        
    }
    
}
