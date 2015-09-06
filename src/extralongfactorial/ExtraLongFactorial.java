/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extralongfactorial;
import java.math.BigInteger; 
import java.util.Scanner; 

/**
 *
 * @author sim
 */
public class ExtraLongFactorial {

    public static String fact(int x) {
        BigInteger b = new BigInteger("1");
        for (int i = 1; i <= x; i++) {
            b = b.multiply(new BigInteger(i + ""));
        }
        return b.toString();
    }
    
    public static void main(String args[]) { 
	int n=0; 
	Scanner sc=new Scanner(System.in); //System.out.println("enter no"); 
        n=sc.nextInt(); 
	String s=fact(n); 
	System.out.println(""+s); 
    } 

	 
}

    
