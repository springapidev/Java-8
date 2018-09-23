/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author J2EE-27
 */
public class Overloading {
    public void sum(int x, int y){
    int c=x+y;
        System.out.println(x+"+"+y+"="+c);
    }
    
    public void sum(int x, int y, int c){
    int z=x+y+c;
        System.out.println(x+"+"+y+"+"+c+"="+z);
    }
    
    public void sum(int... x){
    int z=0;
    for(int c:x)
        z+=c;
        System.out.println("Sum="+z);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overloading loading=new Overloading();
        loading.sum();
        loading.sum(10,20);
        loading.sum(10,20,30);
        loading.sum(10,20,30,40,50);
        
        
        
        
    }


}
