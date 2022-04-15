package Polymorphism_In_Java;

public class CompileDemo1 {

public static void main(String[] args) {
	CompileDemo1 com= new CompileDemo1();
	com.add(10.15, 15.15);
	com.add(10, 20.20);
	com.add("viv", "ek");
	com.add(7, 100);
	System.out.println(com.add('v'));
	System.out.println(com.add(9223374, 922337234));
  	System.out.println(com.add(2655654));
     System.out.println(com.add(10f, 22f, 10f));//22.0
     System.out.println(com.add(12f));
     System.out.println(com.add(12f, 20));
     System.out.println(com.add(12, 15f));
 //  System.out.println(com.show());
   System.out.println(com.add(10f, 20));//30.0
  System.out.println(com.add("ritesh"));
  System.out.println(com.add("vhg", "kjhi", "vnjh", "agsg"));
  System.out.println("***********");
  System.out.println('a'+'a');
  System.out.println(com.add('v', 'i', "mumbai", "dombivali"));
  System.out.println(com.add(12f, 'v', "shgdjhg", "sdhd"));
  System.out.println(com.add('b','d'));
  System.out.println(com.add("hgjh", 't'));
  System.out.println(com.add('t',"hgjh"));
}
	
	
public void add()
{
	System.out.println("add");
}

public double add(double a, double b)
{
	double sum = a+b;
	System.out.println("sum of number is "+sum);
	return sum;
}
public double add(int a,  double b)
{
	double sum = a+b;
	System.out.println("sum ofnumber is "+sum);
	return sum;
}
public double add(double a,  int b)         //change sequence of parameter
{
	double sum = a+b;
	System.out.println("sum ofnumber is "+sum);
	return sum;
}
public String add(String a, String b )
{
	    String concate = a+b;
	    System.out.println("concate of number is"+" " +concate);
	    return concate;
}
private int add(int a, int b)
{
	       int a1 = a+b;
	       System.out.println(a1);
	       return a1;
}
public char add(char a)
{
	    char c1 = a;
	    return c1;
}
public long add(long a, long b)
{
	        long l1 = a+b;
	        return l1;
}
private Long add(long a)
{
	       Long num = a;
	       return num;
}
private float add(float a, float b, float c)
{
	                float f1 = a+b-c;
	                return f1;
}
public float add(float hh)
{
	    float num1 = hh;
	    return num1;
}

public  byte  add(byte b)
{
	    byte num1 = b;
	    return num1;
}
public float add(float a, int b)
{
	        float num2 = a+b;
	        return num2;
}
public float add(int a, float b)
{
	            float num3 = a-b;
	            return num3;
}
public String add(String v)
{
	         String str = v;
	         return str;
}
public String add(String v, String i, String e, String k)
{
	          String viek = v+i+e+k;
	        
	          System.out.println(viek);
	           return viek;
}
public String add(char c , char b,  String a, String d)
{
	                String lla = c+b+a+d;
	                return lla;
}
public String add(float c , char b,  String a, String d)
{
	                String lla = c+b+a+d;
	                return lla;
}

public String add(char c , int b,  String a, String d)
{
	                String lla = c+b+a+d;
	                return lla;
}
public char add(char a,char b)
{
	    char c1 = b;
	    return c1;
}

public String add(String a, char b)
{
	    String hjj = a+b;
	    return hjj;
}
public String add(char a, String b)
{
	    String hjj = a+b;
	    return hjj;
}



}

