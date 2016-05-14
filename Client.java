import java.util.*;
public class Client {

	public static void main(String[] args) {
		boolean firstWhile=true;
		boolean secondWhile=true;
		boolean thirdWhile=true;
		Admin admin=Admin.getInstance();
		Customer cus=new Customer();
		Scanner in=new Scanner(System.in);
		
		while(firstWhile==true){
		secondWhile=true;
		thirdWhile=true;
		System.out.println("Press 1 for Admin login \nPress 2 for Customer login\nPress 3 to End");
		
		int choice=in.nextInt();
		switch(choice){
		case 1 :
		{
			System.out.println("Enter the Admin name : ");
			System.out.println("Admin name is puneeth");
			String name=in.next();
			if(name.equals("puneeth")){
				while(secondWhile==true){
				System.out.println("\n1. Create User \n2. Delete User\n3. Display all customers\n4. Logout");
				int ch=in.nextInt();
				switch(ch)
				{
				case 1 :
					admin.createUser();
					break;
				
				case 2 :
				{
					System.out.println("Enter the name and password");
					String name1=in.next();
					String password1=in.next();
					admin.deleteUser(name1, password1);
				}
					break;
				
				case 3 :
					admin.display();
					break;
				
				case 4 :
						secondWhile=false;
						break;
					
				}
				//System.out.println(b);
			}
			}
		}
		break;
		
		case 2 :
		{
			System.out.println("Enter the Customer name and password : ");
			String name=in.next();
			String pwd=in.next();
			while(thirdWhile==true){
				System.out.println("\n1. Desposit Amount \n2. Withdraw Amount\n3. View Balance\n4. Logout");
				int ch=in.nextInt();
				switch(ch)
				{
				case 1 :
				{
					System.out.println("Enter the amount to be deposited");
					double amount=in.nextDouble();
					cus.DepositAmount(amount, name, pwd);
				}
				break;
				
				case 2 :
				{
					System.out.println("Enter the amount to be withdrawn");
					double amount=in.nextDouble();
					cus.WithdrawAmount(amount, name, pwd);
				}
				break;
				
				case 3 :
					cus.ViewBalane(name, pwd);
					break;
					
				case 4 :
					thirdWhile=false;
					break;
				}
			}
		}
		break;
		
		case 3:
			firstWhile=false;
			break;
			
		}

		}
	}	

}
