package java_arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

	public static void main(String argv[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<UserInfo> userInfoList = new ArrayList<UserInfo>();

		String name;
		int age;
		
		while (true) {
			System.out.print("user Name('q' will quit) : ");
			name = scanner.next();
			
			if (name.equals("q")) {
				break;
			}
			
			try {
				System.out.print("user Age : ");
				age = Integer.parseInt(scanner.next());
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException");
				continue;
			}
			
			UserInfo userInfo = new UserInfo(name, age);
			userInfoList.add(userInfo);
		}
		scanner.close();
		
		System.out.println("\n==========UserInfo List==========\nUserInfo Size : " + userInfoList.size() + "\n" );
	
		for (UserInfo user : userInfoList) {
			System.out.println(user.getUserName() + ", " + user.getUserAge());
		}
	}

}
