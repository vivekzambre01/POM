package Opp_concept;

public class Find_Area1 implements Find_Area
{

	public static void main(String[] args) {
		
		Find_Area1 a1= new Find_Area1();
		a1.Triangle();
		a1.Rectangle();
		a1.Circle();
		a1.Area();
	}

	 public void Triangle()
	      {
			double A = 0.5*50*40;
			System.out.println(A);
				}

	public void Rectangle() {

		int A=50*40;
		System.out.println(A);		
	}

	public void Circle() {

        int A = 50*50;
		System.out.println(A);
	}

	public void Area() {
        System.out.println("Print  Area");
		}

}
