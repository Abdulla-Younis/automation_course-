
public class rec {
	private double length;
	private double width;
	
		public rec() {
		this.length =2.0;
		this.width =2.0;
	}
	
		public rec(double l, double w) {
		this.width = w;
		this.length = l;
	}
	
		public rec(double l, double w, String col, boolean fill) {
		this.width = w;
		this.length = l;
		this.setcolor(col);
		this.setfiller(fill);
	}
	
		public void setWidth(double w) {
		width = w;
	}
	
		public void setcolor(String col) {
			String color = col;
		}
		public void setfiller(boolean fill) {
			boolean filler = fill;
		}
		public void setLength(double l) {
		length = l;
	}
	
		public double getLength() {
		return length;
	}
	
		public double getWidth() {
		return width;

	}
	
		public double getArea() {
		double area;
		area = this.length * this.width;
		return area;

	}
	
		public double getPerimeter() {
		double per;
		per = (2 * this.length) + (2 * this.width);
		return per;

	}
	
		public String toString() {
		return String.format("A Rectangle with width= %.2f and length= %.2f, which is a subclass of %s",getWidth(),getLength(),super.toString());
	}

}
