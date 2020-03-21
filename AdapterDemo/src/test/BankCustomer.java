package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//This is the adapter class  
public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		// TODO Auto-generated method stub
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter bank name");	
			String bankName =br.readLine();
			
			System.out.println("Enter accountholder name");
			br = new BufferedReader(new InputStreamReader(System.in));
			String accHolderName =br.readLine();
			
			System.out.println("Enter accountholder number");
			br = new BufferedReader(new InputStreamReader(System.in));
			long accNumber = Long.parseLong(br.readLine());
			
			setAccHolderName(accHolderName);
			setBankName(bankName);
			setAccNumber(accNumber);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public String getCreditCard() {
		// TODO Auto-generated method stub
		long accno=getAccNumber();  
		   String accholdername=getAccHolderName();  
		   String bname=getBankName();  
		          
		   return ("The Account number "+accno+" of "+  accholdername+ " in "+bname +
				   "bank is valid and authenticated for issuing the credit card. ");
	}

}
