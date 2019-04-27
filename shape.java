
public class shape {
	private String color;
	private boolean filled;
	
		public shape() {
		this.color = "red";
		this.filled = true;
	}
	
		public shape(String col, boolean fill) {
		this.color = col;
		this.filled = fill;
	}
	
		public void setColor(String col) {
		color = col;
	}
	
	public void setfilled(boolean fill) {
		filled = fill;

	}
	
		public String getColor() {
		return color;
	}
	
	public String isfilled() {
		if (filled) {
			return "filled";
		}else {
			return "Not filled";
		}
	}
	
	public String toString() {
		return String.format("A Shape with color of %s and %s",this.color,this.isfilled());
	}


}
