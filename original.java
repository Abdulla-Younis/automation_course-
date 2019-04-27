
public class original {

	public static void main(String[] args) {
		shape shape1 = new shape();
		shape shape2 = new shape("black",false);
		
		System.out.println("shape:");
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());
		
		System.out.println("\nCircle:");
		circle circle1 = new circle();
		circle circle2 = new circle(5.5);
		circle circle3 = new circle(7.25,"red",false);
		
		System.out.printf("The Area of Circle1 is: %.2f\n",circle1.getArea());
		System.out.printf("The Perimeter of Circle1 is: %.2f\n",circle1.getPerimeter());
		System.out.println(circle1.toString());
		System.out.printf("\nThe Area of Circle2 is: %.2f\n",circle2.getArea());
		System.out.printf("The Perimeter of Circle2 is: %.2f\n",circle2.getPerimeter());
		System.out.println(circle2.toString());
		System.out.printf("\nThe Area of Circle3 is: %.2f\n",circle3.getArea());
		System.out.printf("The Perimeter of Circle3 is: %.2f\n",circle3.getPerimeter());
		System.out.println(circle3.toString());
		
		System.out.println("\nRectangle:");
		rec rectangle1 = new rec();
		rec rectangle2 = new rec(6.2,7.4);
		rec rectangle3 = new rec(3.1,2.3,"yellow",false);
		
		System.out.printf("The Area of rectangle1 is: %.2f\n",rectangle1.getArea());
		System.out.printf("The Perimeter of rectangle1 is: %.2f\n",rectangle1.getPerimeter());
		System.out.println(rectangle1.toString());
		System.out.printf("\nThe Area of rectangle2 is: %.2f\n",rectangle2.getArea());
		System.out.printf("The Perimeter of rectangle2 is: %.2f\n",rectangle2.getPerimeter());
		System.out.println(rectangle2.toString());
		System.out.printf("\nThe Area of rectangle3 is: %.2f\n",rectangle3.getArea());
		System.out.printf("The Perimeter of rectangle3 is: %.2f\n",rectangle3.getPerimeter());
		System.out.println(rectangle3.toString());

		

	}

		
	}


