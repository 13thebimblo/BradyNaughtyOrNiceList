// Import Scanner
import java.util.Scanner;



// Class
public class App {
   
   

   // Main method
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
        


        // Variables and input string
        String confirmation = "Placeholder";
        String input[] = {"","","","",""};
        
        

        // Initial formatting and printing
        formatArray(list);
        printArray(list);
        printSpace(3);
        

        
        // Initial prompt to add info
        System.out.println(Colors.ANSI_RESET + "Would you like to add information? (Yes/No)");
        confirmation = in.nextLine().toUpperCase();
        


        // Adding info, asking if you want to add more, and cycling until unable to add more or you opt out
        do {
            
            
            
            // Checking prompt to see what you want to do
            if (confirmation.equals("YES")) {
                printSpace(3);
                
                
                
                // Loop to make sure correct input is given
                do {
                   
                   
                   
                    // Prompt
                    System.out.println(Colors.ANSI_RESET + "List information as [FIRST NAME,LAST NAME,NAUGHTY/NICE,ADDRESS,GIFT] separated by commas.");
                    


                    // Take in input
                    input = in.nextLine().toUpperCase().split(",");
                    


                    // Check to make sure input is valid
                    if (input.length != 5) {
                        printSpace(1);
                        System.out.println(Colors.ANSI_RED + "Information needs 5 inputs!" + Colors.ANSI_RESET);
                    }
                    else {
                        printSpace(1);
                        updateList(list, input);
                        formatArray(list);
                        printArray(list);
                    }
                    
                    printSpace(3);

                } while (input.length < 5);


            }
            else if (confirmation.equals("NO")) {
                printSpace(3);
                
                
                
                // Opting out ends the code
                System.out.println(Colors.ANSI_RESET + "See you next year! >;)");
                break;
            }
            else {
                printSpace(1);
                
                
                
                // Putting invalid inputs confuses the code
                System.out.println(Colors.ANSI_RESET + "...What?");
                printSpace(3);
            }



            // Check to make sure you are still able to add to the list
            if (list[19][0] == "") {
                
                
                
                // Prompt
                System.out.println(Colors.ANSI_RESET + "Would you like to add more information? (Yes/No)");
                
                
                
                // Take in input
                confirmation = in.nextLine().toUpperCase();
                
                
                
                // Break if they opt out
                if (confirmation.equals("NO")) {
                    printSpace(3);
                    System.out.println(Colors.ANSI_RESET + "See you next year! >;)");
                    break;
                }
            }
            else {
                
                
                
                // If you are unable to add to the list: ends code and breaks
                printSpace(1);
                System.out.println(Colors.ANSI_RESET + "You've filled out the entire list!");
                printSpace(1);
                System.out.println(Colors.ANSI_RESET + "See you next year! >;)");
                break;
            }


        
        } while(!confirmation.equals("NO"));
    }





    
    // 2D String array printing method
    public static String[][] printArray(String[][] array) {
        
        
        
        // Repeat for every row
        for (int row = 0; row < array.length; row++) {



            // Repeat for every column
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



            // Prints return character to reset the row
            System.out.println();



        }



        // Returns array
        return array;



    }



    // 2D String array formatting method
    public static String[][] formatArray(String[][] array) {
        
        
        
        // Repeat for every row
        for (int row = 0; row < array.length; row ++) {


            // Repeat for every column
            for (int column = 0; column < array[0].length; column++) {
                
                
                
                // Set current position to upper case
                array[row][column] = array[row][column].toUpperCase();
                


                // Changes naughty kids' gifts to coal
                if (array[row][2].equals("NAUGHTY")) {
                    array[row][4] = "COAL";
                }



            }



        }



        // Returns array
        return array;
    }



    // List updating method
    public static String[][] updateList(String[][] list, String[] input) {
        
        
        
        // Repeat for every row in the list
        for (int listRow = 0; listRow < list.length; listRow++) {  


            
            // Locates the empty row
            if (list[listRow][0] == "") {
                
                
                
                // Updates each spot in the current row based on the input
                for (int inputColumn = 0; inputColumn < list[0].length; inputColumn++) {
                    list[listRow][inputColumn] = input[inputColumn];
                } 
                break;  
                
                

            }   
            
            

        }



        // Returns the list
        return list;



    }




    // Space printing method
    public static void printSpace(int times) {
        
        
        
        // Repeat the amount of desired times
        do {
            System.out.println();
            times--;
        } while (times > 0);



    }



}
