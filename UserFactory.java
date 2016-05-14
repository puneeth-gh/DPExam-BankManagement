
public interface UserFactory {

	public void DepositAmount(double amount,String name, String pwd);
	public void WithdrawAmount(double amount,String name, String pwd);
	public void ViewBalane(String name,String pwd);
	public void ResetPasswordRequest();

}
