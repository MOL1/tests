/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysim2017;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MOL1
 */
public class Seed {
     
    public static int main(String[] args) {
            
            Scanner s = new Scanner(System.in);
            System.out.println("Please input a seed:");
            int seed = s.nextInt();
            Random rnm = new Random(seed);
            int number = rnm.nextInt(4);
            return number;
            
    } 
       
}
