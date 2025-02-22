ComplexNumbers.java:
-------------------
package Module1;

public class ComplexNumbers {
	double real, img;
	
	ComplexNumbers(double r, double i){
		real=r; 
		img=i;
	}
	public static ComplexNumbers sum(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers temp = new ComplexNumbers(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(5.5,4);
		ComplexNumbers c2 = new ComplexNumbers(1.2,3.5);
		ComplexNumbers temp = sum(c1,c2);
		System.out.println("sum is " + temp.real + " + " + temp.img + "i");

	}

}


output:
------
sum is 6.7 + 7.5i
