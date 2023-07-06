package sec3;

//import java.util.Scanner;

public class Shapeex1 {

	public static void main(String[] args) {
		int gak,length,height;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("각이 몇개인지 입력하세요 : ");
//		gak = sc.nextInt();
		Shape f1=new Shape();
//		f1.setShapeType(gak);
		double res1 = f1.calcArea(5);
		System.out.println("반지름이 5인 원의 넓이"+res1);
		f1.setShapeType(3);
		res1= f1.calcArea(5, 10);
		System.out.println("한변이 5고 높이가 10인 삼각형의 넓이"+res1);
		f1.setShapeType(4);
		res1=f1.calcArea(5,4);
		System.out.println("밑변이 5고 높이가 4인 사각형의 넓이"+res1);

	}

}
