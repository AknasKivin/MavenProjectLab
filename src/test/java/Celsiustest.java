import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Celsiustest {
@Test
void ConverttoFarenheittest() {
	Celsius c=new Celsius();
	double result=c.ConverttoFarenheit(25.0);
	assertEquals(77.0,result,0.001);
}
}
