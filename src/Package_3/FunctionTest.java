package Package_3;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;								  //지역변수
		int num2 = 30;
		int sum = addNum(num1, num2);				  //매개변수 (인수)
		System.out.println("sum = " + sum);
	}
	public static int addNum(int num1, int num2) {    //매개변수(가인구)
		int result;									  //지역변수
		result = num1 + num2;
		return result;
	}

}
