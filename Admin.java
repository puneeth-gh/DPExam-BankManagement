import java.util.*;
public class Admin {
	
	private static Admin admin = null;
	
	Scanner in=new Scanner(System.in);
	
	private List<User> user = new ArrayList<>();
	
	
	private Admin(){}
		
	public static Admin getInstance() {
		
			        if(admin == null){
			        	admin=new Admin();
			        }
			        	return admin;
	}	
			             
	
	
	public void createUser(){
		User u =new User();
		System.out.print("Enter the username : ");
		String name=in.next();
		String password="password";
		System.out.println("Password generated to "+name+" is password");
		u.uname=name;
		u.pwd=password;
		user.add(u);
		System.out.println("Customer created");
		
		
	}
	
	public void deleteUser(String name, String password){
		
		System.out.println("\n\n");
		for(int i=0;i<user.size();i++){
			
			if(user.get(i).uname.equals(name) && user.get(i).pwd.equals(password))
			{
				user.remove(i);
				System.out.println("Customer deleted");
			}
			
		}
	}
	
	public void display(){
		System.out.println("\nCustomers present in the bank are");
		for(int i=0;i<user.size();i++){
		System.out.println(user.get(i).uname);
		}
		System.out.println(" ");
	}
	
	public List getArray(){
		return user;
	}
	
}
