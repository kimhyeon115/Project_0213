package Package_3;

public class SungJuk {
	String name;
	int eng;
	int kor;
	int mat;
	int total;
	int avg;
	
	void SungJukinfo() {
		total = eng + kor + mat;
		avg = total / 3;
		System.out.println("이름:"+name);
		System.out.println("영어:"+eng);
		System.out.println("국어:"+kor);
		System.out.println("수학:"+mat);
		System.out.println("합계:"+total);
		System.out.println("평균:"+avg);
	}

}
