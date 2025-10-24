
public class Celsius {
public double ConverttoFarenheit(double celsius) {
	return(celsius*9/5)+32;
}
	public static void main(String[] args) {
		Celsius c=new Celsius();
		double result=c.ConverttoFarenheit(25.0);
		System.out.println("25 degree is converted to "+result+" farenheit");

	}

}
