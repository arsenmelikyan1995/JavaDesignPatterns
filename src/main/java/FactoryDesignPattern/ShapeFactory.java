package FactoryDesignPattern;

import FactoryDesignPattern.shapes.Circle;
import FactoryDesignPattern.shapes.Rectangle;
import FactoryDesignPattern.shapes.Square;

public class ShapeFactory {

	public Shape getShape(ShapeTypes shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
	
			case RECTANGLE:
				return new Rectangle();
			
			case SQUARE:
				return new Square();

			default:
				return null;
		}

	}
}
