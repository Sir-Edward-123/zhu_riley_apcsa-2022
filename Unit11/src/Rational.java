//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator;
	int denominator;

	//write two constructors
	public Rational(){
		setRational(1, 1);
	}

	public Rational(int numerator, int denominator) {
		setRational(numerator, denominator);
	}
	
	//write a setRational method
	public void setRational(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	

	//write  a set method for numerator and denominator
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int newNumerator = getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator();
		int newDenominator = getDenominator() * other.getDenominator();
		setNumerator(newNumerator);
		setDenominator(newDenominator);

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(getNumerator(), getDenominator());
		setNumerator(getNumerator() / gcd);
		setDenominator(getDenominator() / gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int greater;
		int lesser;
		if(numOne > numTwo) {
			greater = numOne;
			lesser = numTwo;
		} else {
			lesser = numOne;
			greater = numTwo;
		}

		int gcd = 1;
		for(int factor = 2; factor <= lesser; factor++) {
			if(lesser % factor == 0 && greater % factor == 0) {
				gcd = factor;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	
	public boolean equals(Rational other)
	{
		reduce();
		other.reduce();
		
		if(numerator == other.getNumerator() && denominator == other.getDenominator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double first = (double) numerator / denominator;
		double second = (double) other.getNumerator() / other.getDenominator();

		if(first > second){
			return 1;
		} else if (second > first) {
			return -1;
		} else {
			return 0;
		}
	}

	
	//write  toString() method
	public String toString() {
		return getNumerator() + "/" + getDenominator();
	}
	
}