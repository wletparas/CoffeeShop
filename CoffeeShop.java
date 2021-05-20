/*Wilbert Paras & 
Mark Angelo Paguio
    BSIT-2C */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;


public class CoffeeShop{

    int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0; 
    double cofprice;
    double paymentamount;
    double change;
    double subtotal;
    double total;
    //keni la mamili nung nanu ing gawan na ning program.
void menu(){
         try{
                Scanner input = new Scanner(System.in);
                System.out.println("\n-----------------------------------------------------");
                System.out.println("--------WELCOME TO Mark & Wilbert COFFEE SHOP!-------");
                System.out.println("-----------------------------------------------------");
                System.out.println("Press 1 to check Coffee products & prices, 2 to Exit. \n"
                + "\n\t1. Coffee Menu" + "\n\t2. Exit");
                byte choice = input.nextByte();

                if(choice == 1)
                    pro();
                else if(choice == 2)
                System.exit(0);  
                else if(choice <= 0 || choice > 2)
                {
                    System.out.println("Invalid Input. :)");
                    menu();
                }

            }
         catch (Exception e)
              {
                System.out.println("Invalid Input. :)");
                menu();
              }
}
//wapin deni reng products available.
void pro(){
         try{
                Scanner input = new Scanner(System.in);
                System.out.println("------------------------------------------");
                System.out.println("Enter the Number of the Coffee you want. \n"
                + "\n\t1. Black Coffee:.......50.00php" + "\n\t2. Latte:..............80.00php" 
                + "\n\t3. Cappuccino:........100.00php " + "\n\t4. Americano:.........130.00php" 
                + "\n\t5. Espresso:..........150.00php" + "\n\t6. Cancel");
                byte coffee = input.nextByte();

                if(coffee == 1)
                 {
                    Scanner blk1 = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("How many Black Coffee do you want? ");
                    a = blk1.nextInt();

                    Scanner blk = new Scanner(System.in); 
                    System.out.println("------------------------------------------");
                    System.out.println("Do you want to continue this order? (y/n) ");
                    String bc1 = blk.nextLine();

                    char bc2 = bc1.charAt(0);
                        if(bc2 == 'y' || bc2 == 'Y')
                        {
                            submenu();
                        }
                        else if(bc2 == 'n' || bc2 == 'N')
                        {
                            pro();
                        }
                        else
                        {
                            System.out.println("Invalid Input. :)");
                            pro();
                        }

                 }   
                else if(coffee == 2)
                {
                    Scanner lte1 = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("How many Latte do you want? ");
                    b = lte1.nextInt();

                    Scanner lte = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("Do you want to continue this order? (y/n) ");
                    String lt1 = lte.nextLine();

                    char lt2 = lt1.charAt(0);
                        if(lt2 == 'y' || lt2 == 'Y')
                        {
                            submenu();
                        }
                        else if(lt2 == 'n' || lt2 == 'N')
                        {
                            pro();
                        }
                        else
                        {
                            System.out.println("Invalid Input. :)");
                            pro();
                        }

                }
                 if(coffee == 3)
                 {
                    Scanner cpo1 = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("How many Cappuccino do you want? ");
                    c = cpo1.nextInt();

                    Scanner cpo = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("Do you want to continue this order? (y/n) ");
                    String cp1 = cpo.nextLine();

                    char cp2 = cp1.charAt(0);
                        if(cp2 == 'y' || cp2 == 'Y')
                        {
                            submenu();
                        }
                        else if(cp2 == 'n' || cp2 == 'N')
                        {
                            pro();
                        }
                        else
                        {
                            System.out.println("Invalid Input. :)");
                            pro();
                        }

                 }   
                  if(coffee == 4)
                 {
                    Scanner amo1 = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("How many Americano do you want? ");
                    d = amo1.nextInt();

                    Scanner amo = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("Do you want to continue this order? (y/n) ");
                    String ac1 = amo.nextLine();

                    char ac2 = ac1.charAt(0);
                        if(ac2 == 'y' || ac2 == 'Y')
                        {
                            submenu();
                        }
                        else if(ac2 == 'n' || ac2 == 'N')
                        {
                            pro();
                        }
                        else
                        {
                            System.out.println("Invalid Input. :)");
                            pro();
                        }

                 }   
                  if(coffee == 5)
                 {
                    Scanner epo1 = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("How many Espresso do you want? ");
                    e = epo1.nextInt();

                    Scanner epo = new Scanner(System.in);
                    System.out.println("------------------------------------------");
                    System.out.println("Do you want to continue this order? (y/n) ");
                    String ep1 = epo.nextLine();

                    char ep2 = ep1.charAt(0);
                        if(ep2 == 'y' || ep2 == 'Y')
                        {
                            submenu();
                        }
                        else if(ep2 == 'n' || ep2 == 'N')
                        {
                            menu();
                        }
                        else
                        {
                            System.out.println("Invalid Input. :)");
                            pro();
                        }

                 }   
                else if(coffee == 6)
                menu(); 
                else if(coffee <= 0 || coffee > 6)
                {
                    System.out.println("Invalid Input. :)");
                    pro();
                }

            }
         catch (Exception e)
              {
                System.out.println("Invalid Input. :)");
                pro();
              }
 
            
          }
//lege keyni para pag mamayad pay ya ing mumuna.
void submenu(){
                try{
                Scanner input = new Scanner(System.in);
                System.out.println("-----------------------------------------------------");
                System.out.println("Press 1 to Pay, 2 to order more, 3 to Check order(s)\n"
                + "\n\t1. Pay" + "\n\t2. Additional Order(s)" + "\n\t3. Check Order(s)" +"\n\t4. Exit");
                byte ch = input.nextByte();

                if(ch == 1)
                    check();
                else if(ch == 2)
                    pro();
                else if(ch == 3)
                    checkorder();
                else if(ch == 4)
                System.exit(0);  
                else if(ch <= 0 || ch > 4)
                {
                    System.out.println("Invalid Input. :)");
                    submenu();
                }

            }
         catch (Exception e)
              {
                System.out.println("Invalid Input. :)");
                submenu();
              }
}
 void checkorder(){
            System.out.println("-----------------------------------------------------");
            System.out.println("Your Order(s) are: \n");
            if(a > 0)
            {
                System.out.println("  Black Coffee....."  + a );
            }

            else 
            {

            }

            if(b > 0)
            {
                System.out.println("  Latte............" + b  );
            }
            else
            {

            } 
            if(c > 0)
            {
                System.out.println("  Cappuccino......." + c );
            }
            
            else
            {

            } 
            if(d > 0)
            {
                System.out.println("  Americano........" + d );
            }
            else
            {

            } 
            if(e > 0)
            {
                System.out.println("  Espresso........." + e );
            }
             submenu();

 }
//keni ya mag total.
void check(){
           
                if(a > 0 || b > 0 || c > 0 || d > 0 || e > 0)
                {
                    DecimalFormat f = new DecimalFormat("#,##0.00php");
                    a *= 50.00; b *= 80.00; c *= 100.00; d *= 130.00; e *= 150.00;
                    subtotal = a + b + c + d + e;
                    total = cofprice + subtotal;
                    System.out.println("----------------------------------------------------------");
                    System.out.println("\tYour total is " + f.format(total));
                    payment();
                }
} 
void payment(){
            try{
                  Scanner  pera = new Scanner(System.in);
                  System.out.println("----------------------------------------------------------"); 
                  System.out.print("Enter the Payment Amount: " );
                        paymentamount = pera.nextInt();
                          System.out.print("\n");
                        change = paymentamount - total;
                        if(total < paymentamount || paymentamount == total)
                        {
                         System.out.println("----------------------------------------------------------");
                         System.out.println("Thank You for Buying @ Mark & Wilbert Coffee Shop.\n ");
                         System.out.println("\tYour Change is: " + change  ); 
                         System.out.println("----------------------------------------------------------");  
                        }
                       else
                       {
                           System.out.println("Your Payment Amount is not Enough.");
                            payment();
                       } 
                 }
              catch (Exception e)
              {
                System.out.println("Your Payment Amount is not Invalid.");
                payment();
              }
            
              
}
//wapin ni ing main method.
public static void main(String[] args) 
    {
        CoffeeShop cf = new CoffeeShop();
        cf.menu();
    }





}