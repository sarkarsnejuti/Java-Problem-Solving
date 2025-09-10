package Private;

public class Password {
	private String password;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private boolean minLength(String password) {
		return password.length() >= 8;
	}
	private boolean hasDigit(String password) {
		return password.matches(".*\\d.*");//matches(".*\\d.*")
	}
	public boolean isValid(String password) {
		return minLength(password) && hasDigit(password);
	}
}
