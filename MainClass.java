import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
      int atmnumber=1234;
      int atmpin=123;
      try (Scanner in = new Scanner(System.in)) {
        System.out.println("Welcome to Atm Machine !!!");
          System.out.print("Enter Atm number: ");
          int atmNumber=in.nextInt();
          System.out.println("Enter pin: ");
          int pin=in.nextInt();
          if((atmnumber==atmNumber)&&(atmpin==pin)){
           while(true){
            System.out.println("1.view Available Balance\n2.withdraw Amount\n3.Deposit Amount\n4.view Ministatement\n5.Exit");
            System.out.println("Enter choice: ");
            int ch=in.nextInt();
            if(ch==1){
                op.viewBalance();
            }
            else if(ch==2){
                System.out.println("Enter  amount to withdraw ");
                double WithdrawAmount=in.nextDouble();
                op.withdrawAmount(WithdrawAmount);

            }
            else if(ch==3){
                System.out.println("Enter Amount to Deposit :");
                double depositAmount=in.nextDouble();
                op.depositAmount(depositAmount);
            }
            else if(ch==4){
              op.viewMiniStatement();  

            }
            else if(ch==5){
                System.out.println("Collect your Atm card\n Thank you for using Atm Machine");
                System.exit(0);

            }
            else{
                System.out.println("Please enter correct choice");

            }
        }
             
          } 
          else{
            System.out.println("Incorrect Atm Number or pin.");
            System.exit(0);
          }
    }
    }
    
}
