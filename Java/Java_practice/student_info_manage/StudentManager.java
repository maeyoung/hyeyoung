package student_info_manage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class StudentManager {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();
	
	String name;
	int age;
	String number;
	int id; {

	
	while (true) {
		System.out.print("------------------------------------------------------------------------------\n");
		System.out.print("1) sign up 2) modify 3) delete 4) list 5) name search 6) ID search 7) Quit ==> ");
		int choice_num = scanner.nextInt();
		System.out.print("------------------------------------------------------------------------------\n");
	
		if (choice_num == 7) {
			System.out.print("Program Finished");
			break;
		}
		
		if (choice_num == 1) {		//sign up
			System.out.print("Input name : ");
			name = scanner.next();
			
			try {
				System.out.print("Input Age : ");
				age = Integer.parseInt(scanner.next());
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException");
				continue;
			}
			
			
			try {
				System.out.print("Input ID : ");
				id = Integer.parseInt(scanner.next());
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException");
				continue;
			}
			
			System.out.print("Input Number : ");
			number = scanner.next();
			
			StudentInfo studentInfo = new StudentInfo(name, age, number, id);
			studentInfoList.add(studentInfo);
		}
		
		if (choice_num ==2) {		//modify
			
			int k = 1;
			System.out.format("%-7s%-7s%-7s%-15s%-15s\n","NO.",	"Name","Age","Student ID","Phone Number");
			for (StudentInfo student : studentInfoList) {
				System.out.format("%-7d%-7s%-7d%-15d%-15s\n",k,student.getUserName(),student.getUserAge(),student.getUserID(),student.getUserNumber());
				k += 1;
			}
			
			System.out.printf("==> Input modify No. : ");
			int mnum = scanner.nextInt();
			studentInfoList.remove(mnum-1);
			
			System.out.print("Input name : ");
			name = scanner.next();
			
			try {
				System.out.print("Input Age : ");
				age = Integer.parseInt(scanner.next());
				System.out.print("Input ID : ");
				id = Integer.parseInt(scanner.next());
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException");
				continue;
			}

			System.out.print("Input Number : ");
			number = scanner.next();
			
			StudentInfo studentInfo = new StudentInfo(name, age, number, id);
			studentInfoList.add(mnum-1,studentInfo);
			
		}
		
		if (choice_num == 3) { //delete
			int k = 1;
			System.out.format("%-7s%-7s%-7s%-15s%-15s\n","NO.",	"Name","Age","Student ID","Phone Number");
			for (StudentInfo student : studentInfoList) {
				System.out.format("%-7d%-7s%-7d%-15d%-15s\n",k,student.getUserName(),student.getUserAge(),student.getUserID(),student.getUserNumber());
				k += 1;
			}
			System.out.printf("==> Input delete No. : ");
			int dnum = scanner.nextInt();
			System.out.printf("Really Delete?(Y/N) ");
			String del = scanner.next();
			if (del.equals("Y") || del.equals("y")) {
				studentInfoList.remove(dnum-1);
				System.out.print("Delete Finished\n");
			}
		}
		
		if (choice_num == 4) {	//list
			System.out.format("%-7s%-7s%-15s%-15s\n","Name","Age","Student ID","Phone Number");
			for (StudentInfo student : studentInfoList) {
				System.out.format("%-7s%-7d%-15d%-15s\n",student.getUserName(),student.getUserAge(),student.getUserID(),student.getUserNumber());
			}
		}
		
		if (choice_num == 5) {	//name search
			
			System.out.printf("Input Search Name : ");
			String sname = scanner.next();
			int snum = studentInfoList.indexOf(sname);
			System.out.format("%-7s%-7s%-7s%-15s%-15s\n","NO.",	"Name","Age","Student ID","Phone Number");
			for (StudentInfo student : studentInfoList) {
				System.out.format("%-7d%-7s%-7d%-15d%-15s\n",snum,student.getUserName(),student.getUserAge(),student.getUserID(),student.getUserNumber());
			}
			System.out.format("%d\n",snum);
		}
		
		if (choice_num == 6) {	//name search

			System.out.printf("Input Search ID : ");
			int sID = scanner.nextInt();
			int snum = studentInfoList.indexOf(sID);
			System.out.format("%-7s%-7s%-7s%-15s%-15s\n","NO.",	"Name","Age","Student ID","Phone Number");
//			System.out.format("%-7d%-7s%-7d%-15d%-15s\n",snum,student.getUserName(snum),student.getUserAge(snum),student.getUserID(snum),student.getUserNumber(snum));
			System.out.format("%d\n",snum);
		}
			
/* snum = 저장되있는 곳의 위치번호를 받고 싶은데 찾지 못하고 계속 -1이 뜸 
 	studentInfoList에 snum번 위치에 있는 값들을 받아와서 출력하고 싶은데 어떻게 해야 될지 모르겠*/
		
		
		
		
	}scanner.close();	
	
} }
	

	
		

