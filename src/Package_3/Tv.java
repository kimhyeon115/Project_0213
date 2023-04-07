package Package_3;

public class Tv {
	String color;
	int chanel;
	boolean power;
	void chanelUp() {
		++chanel;
		System.out.println("현재 채널:" + chanel);
	}
	void chanelDown() {
		--chanel;
		System.out.println("현재 채널:" + chanel);
	}
	void colorchange() {
		System.out.println("색상 : " + color);
	}

}
