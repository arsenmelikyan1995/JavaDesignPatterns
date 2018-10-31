package SingletonDesignPattern;

public class SingletonTest {

	public static void main(String[] args) {
		User user1 = User.getInstance();
		user1.setUsername("user1");
		user1.setEmail("user1@gmail.com");
		user1.setAge(20);
		user1.setPassword("password1");

		User user2 = User.getInstance();
		user2.setUsername("user2");
		user2.setEmail("user2@gmail.com");
		user2.setAge(30);
		user2.setPassword("password2");

		User user3 = User.getInstance();
		user3.setUsername("user3");
		user3.setEmail("user3@gmail.com");
		user3.setAge(40);
		user3.setPassword("password3");

		user1.printInfo();
		user2.printInfo();
		user3.printInfo();
	}

}
