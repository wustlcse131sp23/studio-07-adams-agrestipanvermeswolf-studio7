package studio7;

public class Rectangle {

	int side1 = 0;
	int side2 = 0;
	
	public Rectangle(int length, int width) {
		side1 = length;
		side2 = width;
	}

		

		public int area() {
			return side1*side2;
		}

		public int perimeter() {
			return 2*side1+2*side2;
		}

		public boolean checkSquare() {


			if (side1 == side2) {
				return true;
			}

			return false;

		}

	

}
