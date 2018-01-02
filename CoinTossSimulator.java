// Name:Minjie Zhao
// USC NetID:7550095433
// USC loginID: minjiezh@usc.edu
// CS 455 PA1
// Spring 2017



import java.util.Random;
import java.util.Scanner;


/**
 * class CoinTossSimulator
 *
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 *
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants,
 * and private methods to the class.  You will also be completing the
 * implementation of the methods given.
 *
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 *
 */
public class CoinTossSimulator {
   int numTrials = 0;
   int twoHeadCount = 0;
   int twoTailCount = 0;
   int totalTrials = 0;
   int num= 0;



   /**
    Creates a coin toss simulator with no trials done yet.
    */
   public CoinTossSimulator(int numTrials) {
      //check number, it can not be negative

      //run(numTrials);
   }
    public  void printResult(int numTrials){
      
      num+= numTrials;
      run(numTrials);
      System.out.println("Number of trials [exp:"+ num+"]: "+num);
      System.out.println("Two-head tosses: " + getTwoHeads());
      System.out.println("Two-tail tosses: " + getTwoTails());
      System.out.println("One-head one-tail tosses: " + getHeadTails());
      System.out.print("Tosses add up correctly? ");
      if(getHeadTails()+getTwoHeads()+getTwoTails()==totalTrials){
         System.out.println("true");
      }else{
         System.out.println("false");
      }
      System.out.println();
   }

   /**
    Runs the simulation for numTrials more trials. Multiple calls to this
    without a reset() between them add these trials to the simulation
    already completed.

    @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
      Scanner in = new Scanner(System.in);
      while (numTrials < 0) {
         System.out.println("ERROR: number of trials must be non-negative");
         System.out.print("Please enter the number of trials: ");
         numTrials = in.nextInt();
      }
      this.numTrials=numTrials;
      //System.out.println("Now I will toss the coin " + numTrials + " times.");

      int sum = 0;
      for (int i = 0; i < numTrials; i++) {
         Random rand = new Random();
         int value = rand.nextInt(2);
         sum = sum + value;
         value = rand.nextInt(2);
         sum = sum + value;

         if (sum == 2) {
            twoHeadCount++;
         }else if (sum == 0){
            twoTailCount++;
         }sum = 0;   //rest sum to 0
      }totalTrials = totalTrials + numTrials;
   }


   /**
    Get number of trials performed since last reset.
    */
   public int getNumTrials() {
      return totalTrials; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
    Get number of trials that came up two heads since last reset.
    */
   public int getTwoHeads() {
      return twoHeadCount;
      //return totalTwoHeadCount = totalTwoHeadCount + twoHeadCount; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
    Get number of trials that came up two tails since last reset.
    */
   public int getTwoTails() {
      return twoTailCount;
      //return totalTwoTailCount = totalTwoTailCount + twoTailCount; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
    Get number of trials that came up one head and one tail since last reset.
    */
   public int getHeadTails() {
      return totalTrials-twoHeadCount-twoTailCount;
      //return totalTrials-totalTwoHeadCount-totalTwoTailCount; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
    Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      numTrials = 0;
      twoHeadCount = 0;
      twoTailCount = 0;
      totalTrials = 0;
      num= 0;
   }

}