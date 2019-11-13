package inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.inheritance.CorporateTraining;
import com.training.inheritance.PublicTraining;
import com.training.inheritance.Training;

public class TestTraining {

	Training d = new PublicTraining("java",5000.0,2);
	Training c = new CorporateTraining("Bigdata",35000.0,4);


	//To test public training  get order method
	@Test
	public void testPublicTraining() {
		assertEquals(10000.0,d.getOrderValue(), 0.01);
	}
    
	//
	@Test
	public void testCorporateTraining() {
		assertEquals(140000.0, c.getOrderValue(), 0.01);
	}
	
	
	

}
