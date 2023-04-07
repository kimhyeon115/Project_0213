package Package_3;

public class MyMathMain {

	public static void main(String[] args) {//void 데이터 돌려줄수 없음
		MyMach mm = new MyMach();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);		//L > long
//		long result3 = mm.multiply(5L, 3L);
//		double result4 = mm.divide(5L, 3L);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
//		System.out.println("multiply(5L, 3L) = " + result3);
//		System.out.println("divide(5L, 3L) = " + result4);

	}

}
