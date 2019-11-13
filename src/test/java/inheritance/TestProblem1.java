package inheritance;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.training.inheritance.Problem1;

public class TestProblem1 {
	

	
	
	@Test
	public void testAccessingAndSetting() throws ParseException {
		String inputPattern = "dd/MM/yyyy";
	

		SimpleDateFormat sdf = new SimpleDateFormat(inputPattern);
		Date date = sdf.parse("12/10/19");
		Problem1 p1 = new Problem1();
		p1.setDate(date);
		Date expected =p1.getDate();
		assertEquals(expected, date);
		
	}

}
