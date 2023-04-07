package Package_3;

public class MaxTest {

	public static void main(String[] args) {		//main method
		int a = 40;									//작업장소
		int b = 60;
		int sum = maxNum(a,b);
		System.out.println("큰값은:" + sum);
	}
	public static int maxNum(int a, int b) {		//일반 method
		int ss = a > b ? a : b;						//참조
		return ss;
	}

}
