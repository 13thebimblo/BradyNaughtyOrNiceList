// Import Scanner
import java.util.Scanner;



public class App {
   
   
   
    public static void main(String[] args) throws Exception {



        // New Scanner
        Scanner in = new Scanner(System.in);
        


        // Naughty and Nice list
        String list[][] = { {"LoGaN","may","Naughty","7730 Whitemarsh Court","deOdeRant"},
                            {"Cecilia","bOYer","Nice","8686 Elm St.","PUddle"},
                            {"lorElAi","moRsE","Naughty","8529 Birchpond St.","TOMAto"},
                            {"rory","black","Naughty","39 Fairfield Ave.","lamp ShaDe"},
                            {"Denzel","SancHez","","961 Hanover Ave.","shOEs"},
                            {"maNUEL","Lambert","Nice","698 Arrowhead Rd.","chArgEr"},
                            {"Trinity","FISHER","Nice","49","Arlington Avenue","winDow"},
                            {"maTthiAs","hayEs","Nice","23 Woodside Ave.","LOTION"},
                            {"Sophia","SToUT","Naughty","7640 Andover Dr.","teddY beAr"},
                            {"keNNedy","Dunlap","","63 Cypress Rd.","pAnts"},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""},
                            {"","","","",""}};
        


        // Variables
        String confirmation = "Placeholder";
        String input[] = {"","","","",""};
        
        
        // Initial formatting and printing
        formatArray(list);
        printArray(list);
        printSpace(3);
        

        
        do {
            System.out.println(Colors.ANSI_RESET + "Would you like to add information? (Yes/No)");
            confirmation = in.nextLine().toUpperCase();
            if (confirmation.equals("YES")) {
                do {
                    printSpace(3);
                    System.out.println("List information as [FIRST NAME,LAST NAME,NAUGHTY/NICE,ADDRESS,GIFT] separated by commas.");
                    input[0] = in.nextLine().split(",");
                }
            }
            else if (confirmation.equals("NO")) {
                break;
            }
        
        } while();
    }



    // 2D String array printing method
    public static String[][] printArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
               
                // Set color based on status
                if (array[row][2].equals("NICE")) {
                    System.out.print(Colors.ANSI_GREEN);
                }
                else if (array[row][2].equals("NAUGHTY")) {
                    System.out.print(Colors.ANSI_RED);
                }
                else {
                    System.out.print(Colors.ANSI_YELLOW);
                }

                // Print 
                System.out.print(array[row][column]);
                if (array[0].length - column != 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        return array;
    }



    // 2D String array formatting method
    public static String[][] formatArray(String[][] array) {
        for (int row = 0; row < array.length; row ++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = array[row][column].toUpperCase();
                
                if (array[row][2].equals("NAUGHTY")) {
                    array[row][4] = "COAL";
                }
            }
        }
        return array;
    }



    // Space printing method
    public static void printSpace(int times) {
        do {
            System.out.println();
            times--;
        } while (times > 0);
    }



}
