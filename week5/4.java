/*4. Create a class Account with an instance variable balance (double). It shouldcontain a
constructor that initializes the balance, ensure that the initial balance is
greater than 0.0.
Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance.
The Credit adds the amount (passed as parameter) to balance and does not return any
data. Debit method withdraws money from an Account. GetBalance displays the
amount.
Ensure that the debit amount does not exceed the Account’s balance. In that case the
balance should be left unchanged and the method should print a message indicating
“Debit amount exceeded account balance”.*/
import java.util.*;
class Account{
       String Acct_Name;
       int Acct_acctno;
       double Acct_Bal;
       String Acct_Address;
       Account(String acctName,int acctNo,double initialBal,String acctAddress){
          if(initialBal>0.0){
          Acct_Name=acctName;
          Acct_acctno=acctNo;
          Acct_Bal=initialBal;
          Acct_Address=acctAddress;
          }
          else{
          System.out.println("initial balance must be greater than 0.0");
          }
          }
          void credit(double amount){
          Acct_Bal+=amount;
          }
          void debit(double amount){
          if(amount>Acct_Bal){
            System.out.println("Debit amount exceeded account balance");
            }
            else{
            Acct_Bal-=amount;
            }
            }
            double getBalance(){
            return Acct_Bal;
            }
            public static void main(String...siri){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the Account name:");
            String Name=sc.nextLine();
            System.out.print("enter the Account number:");
            int No=sc.nextInt();
            System.out.print("enter the initial amount:");
            double Bal=sc.nextDouble();
            sc.nextLine();
            System.out.print("enter the account address:");
            String Address=sc.nextLine();
            Account a=new Account(Name,No,Bal,Address);
            System.out.println("initial ammount:"+a.getBalance());
            
            System.out.print("enter the credit ammount:");
            double creditAmount=sc.nextDouble();
            a.credit(creditAmount);
            System.out.println("ammount after credited:"+a.getBalance());
            
            System.out.print("enter the debit ammount:");
            double debitAmount=sc.nextDouble();
            a.debit(debitAmount);
            System.out.println("ammount after debited:"+a.getBalance());
            }
            }
            
            
            
            
            
            
            
            
            
            
          

