
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class VendorMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        double grand_total = 0;
        double change = 0;
        int numberOfItems = 0;
        
        Products[] pr = new Products[]{
            new Products("Coke B",10.00,3),
            new Products("Bar One",11.99,2),
            new Products("Peanuts",22.98,1),
            new Products("Tex",11.99,2),
            new Products("Doritos",12.00,1)
};
        
        
        System.out.println("ITEM\tPRICE\tQTY\tTOTAL");
        
        
        for(int i =0;  i < pr.length; i++){
          pr[i].printItems();
          grand_total += pr[i].getTotal(); //calculate grand total
          numberOfItems += pr[i].getQuantity();
          
          if(i == pr.length -1){
            //space
            System.out.println("");
            

            grand_total = Math.round(grand_total * 100.0) / 100.0;
            
            System.out.println("Grand Total: R" + grand_total); // displaying grand total
            
            System.out.println("Enter Cash: ");
            double payment = sc.nextDouble();
            
            while(payment <= grand_total){
                System.out.println("Please insert More Coins: ");
                payment = sc.nextDouble();
                payment+=payment;
            }
            change = Math.round(Math.abs(payment - grand_total)*100.0)/100.0;
            
            System.out.println("Dispensed " + numberOfItems + " items. R " + change +" change" );
            
           
          }
        }
        
        
        //barOne.printItems();

        
    }
    
}
