package Package_3;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		Scanner scn = new Scanner(System.in);
		System.out.println("이름 입력:");
		sj.name = scn.nextLine();
		System.out.println("영어 점수:");
		sj.eng = scn.nextInt();
		System.out.println("국어 점수:");
		sj.kor = scn.nextInt();
		System.out.println("수학 점수:");
		sj.mat = scn.nextInt();
		sj.SungJukinfo();
	}

}
