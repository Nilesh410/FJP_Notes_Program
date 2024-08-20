class Complex_No
{
	double real,imag;
	Complex_No()
	{
		this.real=0;
		this.imag=0;
	}
	Complex_No(double real,double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	Complex_No add(Complex_No c2)
	{
		//Complex_No c3=new Complex_No();
		real=this.real+c2.real;
		imag=this.imag+c2.imag;
		return (this);
	}
}
public class Complex {

	public static void main(String[] args) {
	
       Complex_No c1=new Complex_No(3,2);
       Complex_No c2=new Complex_No(4,3);
       Complex_No c4=c1.add(c2);
       System.out.println("add="+c4.real+"+"+c4.imag+"i");
	}
}
