
public class Logical {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println(a<b&&a<c);//false
		System.out.println(a>b&&b<a);//true
		System.out.println(b<a&&b<c);//true
		System.out.println("*************");
		
		System.out.println(a>b&&b++>a);
		System.out.println(a>++b&&++b<a);//true
		System.out.println("*********");
		System.out.println(a>b||b<a);//both condition true /true
		System.out.println(a>b||a>c);//any one condition is true / true
	}

}
