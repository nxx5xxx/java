package sec3;

public class var1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);//31 y는 출력 후 계산되므로

	}

}
