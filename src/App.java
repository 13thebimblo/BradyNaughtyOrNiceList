public class App {
   
   
   
    public static void main(String[] args) throws Exception {
        
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
        
        printArray(list);

    }

    // 2D String array printing method
    public static String[][] printArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(array[row][column] + ", ");
            }
            System.out.println();
        }
        return array;
    }



}
