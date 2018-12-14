import java.util.Random;

public class Main {

    public static void main(String[] args) {
scenario1();
System.out.println();
scenario2();
System.out.println();
scenario3();
System.out.println();
scenario4();
System.out.println();
scenario5();
    }
        public static void scenario1() {
            Random rand = new Random();
            System.out.println("Scenario 1: Expected result is 50%");
            int numTrue = 0;
            int numFalse = 0;
            int count = 100000;
            for (int i = 0; i < count; i++) {
                int num = rand.nextInt(6) + 1;
                if (num % 2 == 0) {
                    numTrue++;
                } else {
                    numFalse++;
                }
            }
            System.out.println("Count of True: " + numTrue);
            System.out.println("Count of False: " + numFalse);
            System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        }
            public static void scenario2() {
            Random rand = new Random();
            System.out.println("Scenario 2: Expected result is 70%");
            int numTrue = 0;
            int numFalse = 0;
            int count = 100000;
            for (int i = 0; i < count; i++) {
                int num = rand.nextInt(10) + 1;
                if ((num > 5) || (num % 2 == 0)) {
                    numTrue++;
                } else {
                    numFalse++;
                }
            }
                System.out.println("Count of True: " + numTrue);
                System.out.println("Count of False: " + numFalse);
                System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        }
       public static void scenario3() {
           Random rand = new Random();
           System.out.println("Scenario 3: Expected result is 25%");
           int numTrue = 0;
           int numFalse = 0;
           int count = 100000;
           for (int i = 0; i < count; i++) {
               int roll1 = rand.nextInt(6) + 1;
               int roll2 = rand.nextInt(6) + 1;
               if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                   numTrue++;
               } else {
                   numFalse++;
               }
           }
           System.out.println("Count of True: " + numTrue);
           System.out.println("Count of False: " + numFalse);
           System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
       }
        public static void scenario4() {
            Random rand = new Random();
            System.out.println("Scenario 4: Expected result is 5.6%");
            int numTrue = 0;
            int numFalse = 0;
            int count = 100000;
            for (int i = 0; i < count; i++) {
                int roll1 = rand.nextInt(6) + 1;
                int roll2 = rand.nextInt(6) + 1;
                int roll3 = rand.nextInt(6) + 1;
                if ((roll1 > 3) && (roll2 > 2 && roll2 < 5) && (roll3 > 4)) {
                    numTrue++;
                } else {
                    numFalse++;
                }
            }
            System.out.println("Count of True: " + numTrue);
            System.out.println("Count of False: " + numFalse);
            System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        }
        public static void scenario5() {
        Random rand = new Random();
        System.out.println("Scenario 5: Expected result is 27.8%");
        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;

            if ((roll1 != roll2 && roll1 != roll3 && roll1 != roll4) && (roll2 != roll3 && roll2 != roll4) && (roll3 != roll4)) {
                numTrue++;
            }
            else {
                numFalse++;
            }
        }
            System.out.println("Count of True: " + numTrue);
            System.out.println("Count of False: " + numFalse);
            System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
}
