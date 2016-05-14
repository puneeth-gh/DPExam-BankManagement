import java.util.*;
public class Customer implements UserFactory {
	Admin admin=Admin.getInstance();
	
	private double Amount=5000;
	
	List<User> user = new ArrayList<>();
	Scanner in=new Scanner(System.in);
	
	public Customer(){
	}
	
	@Override
	public void DepositAmount(double amount,String name,String pwd) {
		user=admin.getArray();
		int temp=1;
		for(int i=0;i<user.size();i++){
			
			if(user.get(i).uname.equals(name) && user.get(i).pwd.equals(pwd))
			{
				user.get(i).amt = user.get(i).amt + amount;
			}
			else
				temp=0;
		}
		if(temp==0)
			System.out.println("The customer doesnt present or the information entered is invalid");
	}

	@Override
	public void WithdrawAmount(double amount,String name, String pwd) {
		user=admin.getArray();
		int temp=1;
		for(int i=0;i<user.size();i++){
			
			if(user.get(i).uname.equals(name) && user.get(i).pwd.equals(pwd))
			{
				if(user.get(i).amt<5000)
					System.out.println("The total balance is less than $5000");
				else
					user.get(i).amt = user.get(i).amt - amount;
			}	
			else
				temp=0;
		}
		if(temp==0)
			System.out.println("The customer doesnt present or the information entered is invalid");
		
		
	}

	@Override
	public void ViewBalane(String name,String pwd) {
		user=admin.getArray();
		int temp=1;
		for(int i=0;i<user.size();i++){
			
			if(user.get(i).uname.equals(name) && user.get(i).pwd.equals(pwd))
			{
				System.out.println("Available balance is $"+user.get(i).amt); 
			}			
			else
				temp=0;
		}
		if(temp==0)
			System.out.println("The customer doesnt present or the information entered is invalid");
	}

	@Override
	public void ResetPasswordRequest() {
		// TODO Auto-generated method stub
		
	}

}
