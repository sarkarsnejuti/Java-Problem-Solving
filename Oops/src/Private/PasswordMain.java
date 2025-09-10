package Private;

public class PasswordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password pass = new Password();
		pass.setPassword("Sne@733145");
		System.out.println("Input password is: " + pass.getPassword());
		System.out.println(pass.isValid(pass.getPassword()));
	}
	}

