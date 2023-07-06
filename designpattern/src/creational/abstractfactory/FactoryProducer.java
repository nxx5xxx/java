package creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded){//모서리 둥금의 유무
		if(rounded){
			return new RoundedShapeFactory();
		}else{
			return new ShapeFactory();
		}
	}
}
