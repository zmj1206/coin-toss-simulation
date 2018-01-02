// Name:Minjie Zhao
// USC NetID:7550095433
// USC loginID: minjiezh@usc.edu
// CS 455 PA1
// Spring 2017

import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {
    //private CoinSimComponent component;
    public static void main(String[] args) {

        System.out.print("Please enter the number of trials: ") ;
        Scanner in = new Scanner(System.in);
        int numTrials = in.nextInt();
        CoinSimComponent component = new CoinSimComponent(numTrials);

        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setTitle("CoinSim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(component);
        frame.setVisible(true);
    }
}