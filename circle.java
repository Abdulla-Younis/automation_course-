
public class circle {
private double radius;
	
		public circle() {
		this.radius = 1.0;
	}
	
		public circle(double rad) {
		this.radius = rad;
	}
	
		public circle(double rad, String col, boolean fill) {
		this.radius = rad;
		this.setcolor(col);
		this.setfiller(fill);
	}
	
		public void setRadius(double rad) {
		this.radius = rad;
	}
		public void setcolor(String col) {
			String color = col;
		}
		public void setfiller(boolean fill) {
			boolean filler = fill;
		}
	
		public double getRadius() {
		return radius;
	}
	
		public double getArea() {
		double area;
		area = 3.14 * this.getRadius() * this.getRadius();
		return area;

	}
	
		public double getPerimeter() {
		double per;
		per = (2 * 3.14) * this.getRadius();
		return per;
	}
	
		public String toString() {
		return String.format("A Circle with radius= %.2f, which is a subclass of %s",getRadius(),super.toString());
	}

}
