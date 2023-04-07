package Package_1;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk ss = new SungJuk();
		Scanner scn = new Scanner(System.in);
		System.out.println("이름입력:");
		ss.name = scn.nextLine();
		System.out.println("국어?");
		ss.kor = scn.nextInt();
		System.out.println("수학?");
		ss.mat = scn.nextInt();
		ss.SungjukInfo();

	}

}
