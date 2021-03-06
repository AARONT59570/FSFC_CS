package AreaCalc;

public class AreaCalc {
	private Shape curShape;
	private String[] inputStringSplit;
	public enum Shape {
		TRIANGLE, SQUARE, CIRCLE
	}
	public double InputString(String input) {
		inputStringSplit = input.split(" ", 3);
		this.MakeShape(inputStringSplit[0]);
		float[] dim = {Float.parseFloat(inputStringSplit[1]), Float.parseFloat(inputStringSplit[2])};
		return this.GetArea(dim);
	}
	public void MakeShape(String shapeName) {
		switch(shapeName.toLowerCase()) {
		case "triangle" :
			curShape = Shape.TRIANGLE;
			break;
		case "circle" :
			curShape = Shape.CIRCLE;
			break;
		case "square" :
			curShape = Shape.SQUARE;
			break;
		default :
			System.out.println("Invalid Shape");
		}
	}
	public double GetArea(float[] dim) {
		switch(curShape) {
		case TRIANGLE :
			return (dim[0] * dim[1]) / 2f;
		case CIRCLE :
			return (Math.pow(dim[0], 2) * Math.PI);
		case SQUARE :
			return (dim[0] * dim[1]);
		default :
			return 0;
		}
	}
	

}
