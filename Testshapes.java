package Day.wise.assignments;


	import java.util.Random;

	// Abstract base class Shape
	abstract class Shape {
	    protected int x, y; 

	    // Constructor to initialize the position
	    public Shape(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Method to move the shape
	    public void move(int newX, int newY) {
	        x = newX;
	        y = newY;
	    }

	    // Abstract method to output a shape
	    public abstract void show();

	    // Abstract method to represent the shape as a string
	    public abstract String toString();
	}

	// Line class
	class Line extends Shape {
	    private int x2, y2; // End point of the line

	    public Line(int x, int y, int x2, int y2) {
	        super(x, y);
	        this.x2 = x2;
	        this.y2 = y2;
	    }

	    @Override
	    public void show() {
	        System.out.println(toString());
	    }

	    @Override
	    public String toString() {
	        return "Line from (" + x + ", " + y + ") to (" + x2 + ", " + y2 + ")";
	    }
	}

	// Circle class
	class Circle extends Shape {
	    private int radius; // Radius of the circle

	    public Circle(int x, int y, int radius) {
	        super(x, y);
	        this.radius = radius;
	    }

	    @Override
	    public void show() {
	        System.out.println(toString());
	    }

	    @Override
	    public String toString() {
	        return "Circle with center at (" + x + ", " + y + ") and radius " + radius;
	    }
	}

	// Rectangle class
	class Rectangle extends Shape {
	    private int x2, y2; // Diagonally opposite corner

	    public Rectangle(int x, int y, int x2, int y2) {
	        super(x, y);
	        this.x2 = x2;
	        this.y2 = y2;
	    }

	    @Override
	    public void show() {
	        System.out.println(toString());
	    }

	    @Override
	    public String toString() {
	        return "Rectangle with corners at (" + x + ", " + y + ") and (" + x2 + ", " + y2 + ")";
	    }
	}

	// PolyLine class
	class PolyLine extends Shape {
	    private int[] xPoints, yPoints; // Points of the polyline

	    public PolyLine(int[] xPoints, int[] yPoints) {
	        super(xPoints[0], yPoints[0]); // Initial position at the first point
	        this.xPoints = xPoints;
	        this.yPoints = yPoints;
	    }

	    @Override
	    public void show() {
	        System.out.println(toString());
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("PolyLine with points: ");
	        for (int i = 0; i < xPoints.length; i++) {
	            sb.append("(").append(xPoints[i]).append(", ").append(yPoints[i]).append(")");
	            if (i < xPoints.length - 1) sb.append(", ");
	        }
	        return sb.toString();
	    }
	}

	// Test class to test the shapes
	public class Testshapes {
	    public static void main(String[] args) {
	        Shape[] shapes = new Shape[10];
	        Random rand = new Random();

	        // Create random shapes
	        for (int i = 0; i < shapes.length; i++) {
	            int shapeType = rand.nextInt(4); 
	            switch (shapeType) {
	                case 0:
	                    shapes[i] = new Line(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
	                    break;
	                case 1:
	                    shapes[i] = new Circle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(50) + 1);
	                    break;
	                case 2:
	                    shapes[i] = new Rectangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
	                    break;
	                case 3:
	                    int n = rand.nextInt(5) + 2; 
	                    int[] xPoints = new int[n];
	                    int[] yPoints = new int[n];
	                    for (int j = 0; j < n; j++) {
	                        xPoints[j] = rand.nextInt(100);
	                        yPoints[j] = rand.nextInt(100);
	                    }
	                    shapes[i] = new PolyLine(xPoints, yPoints);
	                    break;
	            }
	        }

	        
	        for (Shape shape : shapes) {
	            shape.show();
	        }
	    }
	}


