/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Actual price:");
       double a=obj.nextDouble();
       System.out.println("Enter the percentage of discount:");
       double b=obj.nextDouble();
       System.out.println("Original amount:"+(a-(a*(b/100))));
      
    }
    
}
