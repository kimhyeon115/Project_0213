package Package_1;

public class Tv {
	String color;
	int channel;
	boolean power;
	void power() {
		power = !power;
	}
	void channelUP() {
		++channel;
	}
	void channelDown() {
		--channel;
	}

}
