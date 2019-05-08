package abcde;

public class square  extends rec{
	public square() {
		this.setSide(1.0);
	}
	
	public square(double s) {
		super(s,s);
	}
	
		public square(double s,String col, boolean fill) {
		this.setSide(s);;
		this.setcolor(col);
		this.setfiller(fill);
	}
	
		public void setSide(double s) {
		setWidth(s);
		setLength(s);
	}
	
	public void setfiller(boolean fill) {
		boolean filler = fill;
	}
	
	public void setcolor(String col) {
		String color = col;
	}
	
		public double getSide() {
		return getLength();
	}
	
		public void setWidth(double s) {
		super.setWidth(s);
	}
	
		public void setLength(double s) {
		super.setLength(s);
	}
	
		public double getArea() {
		double area;
		area = this.getSide() * this.getSide();
		return area;
	}
	
		public double getPerimeter() {
		double per;
		per = 4 * this.getSide();
		return per;
	}
	
		public String toString() {
		return String.format("A Square with side= %.2f, which is a subclass of %s",this.getSide(),super.toString());
	}

}



