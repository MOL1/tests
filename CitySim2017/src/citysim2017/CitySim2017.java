/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysim2017;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author MOL1
 */
public class CitySim2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            
            Iteration iteration = new Iteration();
            
            iteration.AkinaCount();
            iteration.AkinaEdges();
            iteration.dashes();
        }
    }

    

    public static class Iteration {
        

        
        public int pseudorandomNumberGenrater(){
            Scanner s = new Scanner(System.in);
            System.out.println("Please input a seed:");
            int seed = s.nextInt();
            Random rnm = new Random(seed);
            int number = rnm.nextInt(4);
            return number;
            
            //random number 0-3
           // Random rnm = new Random();
          // int number = rnm.nextInt(4);
            //return number;
            
        }
        
        public Iteration() {
            
        }
        public void startLoc(int number){
            
            if(number == 0){
            
        
            
                Location location;
            }

        }

        public void AkinaCount() {
            
         
        }

        private void AkinaEdges() {
         
        }

        private void dashes() {
         
        }
    }

    private static class Location {
        String name = "";
        int pointerLeft = 0;
        int pointerRight = 0;

        public List Location(String name, int left, int right) {
            this.name = name;
            this.pointerLeft = left;
            this.pointerRight = right;
            
            
        }
    }
    
}
