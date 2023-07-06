package creational.factorymethod;

public class Shapefactory {
		public Shape getShape(String shapeType){
			if(shapeType == null){
				return null;
			}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
				return new Rectangle();
			}else if(shapeType.equalsIgnoreCase("CIRCLE")){
				return new Circle();
			}else if(shapeType.equalsIgnoreCase("SQUARE")){
				return new Square();
			}
			return null;
		}
}
