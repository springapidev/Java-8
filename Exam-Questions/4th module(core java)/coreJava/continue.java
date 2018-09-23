/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

/**
 *
 * @author J2EE-27
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        for(i=0;i<=10;i++)
            {
            if(i%2==1)
                continue;
                System.out.println("i="+i);
                
            }
    }
    
}
