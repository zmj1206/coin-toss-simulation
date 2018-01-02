// Name:Minjie Zhao
// USC NetID:7550095433
// USC loginID: minjiezh@usc.edu
// CS 455 PA1
// Spring 2017

public class CoinTossSimulatorTester {
    final static  int FirstInput = 1;
    final static  int SecondInput = 10;
    final static  int ThirdsInput = 100;
    final static  int ForthInput = 300;
    final static  int FifthInput = 1000;
    final static  int SixthInput = 888;


    public static void main(String[] args) {
        int num=0;
        CoinTossSimulator simulator = new CoinTossSimulator(num);
        System.out.println("After constructor:");
        simulator.printResult(0);
        System.out.println("After run("+FirstInput+"):");
        simulator.printResult(FirstInput);
        System.out.println("After run("+SecondInput+"):");
        simulator.printResult(SecondInput);
        System.out.println("After run("+ThirdsInput+"):");
        simulator.printResult(ThirdsInput);
        System.out.println("After run("+ForthInput+"):");
        simulator.printResult(ForthInput);
        System.out.println("After reset:");
        simulator.reset();
        simulator.printResult(0);
        System.out.println("After run("+FifthInput+"):");
        simulator.printResult(FifthInput);
        System.out.println("After run("+SixthInput+"):");
        simulator.printResult(SixthInput);










//  // write your code here
//        int num;
//        String flag;
//        System.out.print("After constructor:");
//        Scanner in = new Scanner(System.in);
//        Scanner in2 = new Scanner(System.in);
//        num = in.nextInt();
//        CoinTossSimulator simulator = new CoinTossSimulator(num);
//        System.out.println("The nunber of Trials is " + simulator.getNumTrials());
//        System.out.println("The nunber of two heads is " + simulator.getTwoHeads());
//        System.out.println("The nunber of two tails is " + simulator.getTwoTails());
//        System.out.println("The nunber of headtail is " + simulator.getHeadTails());
//
//        while (true) {
//            System.out.println("Do you want to add more trials? Y/N");
//            flag = in2.next();
//            if ("Y".equals(flag)) {
//                System.out.print("Please enter the number of trials: ");
//                num = in.nextInt();
//                simulator.run(num);
//                System.out.println("The nunber of Trials is " + simulator.getNumTrials());
//                System.out.println("The nunber of two heads is " + simulator.getTwoHeads());
//                System.out.println("The nunber of two tails is " + simulator.getTwoTails());
//                System.out.println("The nunber of headtail is " + simulator.getHeadTails());
//            }else {
//                System.out.println("Do you want to reset? Y/N ");
//                flag = in2.next();
//                if ("Y".equals(flag)) {
//                    simulator.reset();
//                } else{
//                    return;
//                }
//            }
//        }
    }
}
