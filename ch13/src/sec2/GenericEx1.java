package sec2;

public class GenericEx1 {

	public static void main(String[] args) {
		Generic<Car> gcar =new Generic<>();
		Car car = new Car();
		gcar.setProduct(car);
		gcar.getProduct().run();
		gcar.testrun();
		
		Generic<Tv> gtv= new Generic<>();
		Tv tv = new Tv();
		gtv.setProduct(tv);
		gtv.getProduct().on();

	}

}
