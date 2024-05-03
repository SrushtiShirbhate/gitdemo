package UI_Testing;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "username1+password1-username2+password2-username3+password3-----usernamen+passwordn";
		List<String> usernames = new ArrayList<>();
		List<String> passwords = new ArrayList<>();
		UsernamesAndPasswords(str, usernames, passwords);
		// Print usernames and passwords
		for (int i = 0; i < usernames.size(); i++) {
			System.out.println("Username: " + usernames.get(i) + ", Password: " + passwords.get(i));
		}
	}

	public static void UsernamesAndPasswords(String str, List<String> usernames, List<String> passwords) {
		String[] pairs = str.split("-");
		for (String pair : pairs) {
			String[] parts = pair.split("\\+");
			if (parts.length == 2) {
				usernames.add(parts[0]);
				passwords.add(parts[1]);
			}
		}
	}
}