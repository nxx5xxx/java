package sec2;

public class Foodex2 {

	public static void main(String[] args) {
		Food2 f0 = new Food2(); //백반 등 넣어줬던 값이 있기때문에 그 값으로 출력
		Food2 f1 = new Food2("소고기덮밥");
		Food2 f2 = new Food2("소고기덮밥", 300);
		Food2 f3 = new Food2("소고기덮밥", 300, 9000);
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

	}

}
