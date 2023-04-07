package Package_3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student ss1 = new Student();
		ss1.sname = "홍길동";
		ss1.sgrade = 3;
		ss1.saddress = "인천";
		ss1.StudentInfo();
		System.out.println();
		
		Student ss2 = new Student();
		ss2.sname = "이순신";
		ss2.sgrade = 4;
		ss2.saddress = "서울";
		ss2.StudentInfo();
		

	}

}
