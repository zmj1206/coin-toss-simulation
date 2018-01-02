// Name:Minjie Zhao
// USC NetID:7550095433
// USC loginID: minjiezh@usc.edu
// CS 455 PA1
// Spring 2017


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by zhaominjie on 1/25/17.
 */

public class CoinSimComponent extends JComponent {

private CoinTossSimulator simulator;
//private Bar bar;

    public CoinSimComponent(int numTrials){

        simulator = new CoinTossSimulator(numTrials);
        simulator.run(numTrials);


//        int num;
//        String flag;
//        //Scanner in = new Scanner(System.in);
////        Scanner in2 = new Scanner(System.in);
////        while (true) {
////            System.out.println("Do you want to add more trials? Y/N");
////            flag = in2.next();
////            if ("Y".equals(flag)) {
////                System.out.print("Please enter the number of trials: ");
////                num = in.nextInt();
////                simulator.run(num);
//////                System.out.println("The nunber of Trials is " + simulator.getNumTrials());
//////                System.out.println("The nunber of two heads is " + simulator.getTwoHeads());
//////                System.out.println("The nunber of two tails is " + simulator.getTwoTails());
//////                System.out.println("The nunber of headtail is " + simulator.getHeadTails());
////            }else {
////                System.out.println("Do you want to reset? Y/N ");
////                flag = in2.next();
////                if ("Y".equals(flag)) {
////                    simulator.reset();
////                } else{
////                    break;//????????????
////                }
////            }
////        }


    }




    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        int tall = getHeight();
        int width = getWidth();
        final int VB = 40;//distance to the top and botton
        final int BW = 50;//bar's width
        double scale =(double) (tall - 2 * VB) / simulator.getNumTrials();

        Bar bar1 = new Bar(tall - VB,
                (width - 3 * BW) / 4,
                BW,
                (int)(simulator.getTwoHeads() * scale),
                scale,
                Color.RED,
                "Two Heads: " + simulator.getTwoHeads() + "(" + Math.round((double)100*simulator.getTwoHeads() / simulator.getNumTrials())+ "%)");
        Bar bar2 = new Bar(tall - VB,
                (width - 3 * BW) / 2 + BW,
                BW,
                (int)(simulator.getHeadTails() * scale),
                scale,
                Color.GREEN,
                "A Head and A Tail: " + simulator.getHeadTails() + "(" + Math.round((double)100*simulator.getHeadTails()) / simulator.getNumTrials() + "%)");
        Bar bar3 = new Bar(tall - VB,
                (width - 3 * BW) / 4 * 3 + 2 * BW,
                BW,
                (int)(simulator.getTwoTails() * scale),
                scale,
                Color.BLUE,
                "Two Tails: " + simulator.getTwoTails() + "(" +  Math.round((double)100*simulator.getTwoTails() / simulator.getNumTrials()) + "%)");
        bar1.draw(g2);
        bar2.draw(g2);
        bar3.draw(g2);

    }


}

