package Day3;

public class TestException {

	public static void main(String[] args) {
		// ListOfUsers lu = new ListOfUsers();
		try {
			ListOfUsers.searchUser(7);
		} catch (UserNotFound e) {
			System.out.println("User is not Existing");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block executed");
		}
		System.out.println("Exception Handled");
	}

}
