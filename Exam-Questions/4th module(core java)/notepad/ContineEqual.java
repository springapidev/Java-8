/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contine.equal;

/**
 *
 * @author J2EE-27
 */
public class ContineEqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int j=0;
        for(j=0; j<=3; j++){
        for(i=0; i<=3; i++)
        {
        if(i==j)
            continue;
            System.out.println(j+","+i);
        }
        
        }
    }
    
}
