package sec2;

public class Example6 {

	public static void main(String[] args) {
		//10진수를 n진수로 변환
		int i =127; // Decimal
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(i));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(i));
		System.out.println("16진수로 변환 : "+Integer.toHexString(i));
		//n진수를 10진수로
		int a = 0b1111101101; //2진수 binary
		int b = 01755; //8진수 Octal , oct
		int c =0x3ED; // 16진수 Hex
		System.out.println("a를 10진수 : "+a);
		System.out.println("b를 10진수 : " +b);
		System.out.println("c를 10진수 : " +c);
		//10진수는 Decimal 이라 함
	}

}
