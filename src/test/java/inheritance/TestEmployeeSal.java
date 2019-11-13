package inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.inheritance.Employee;
import com.training.inheritance.Manager;
import com.training.inheritance.MarketingExecutive;

public class TestEmployeeSal {
	
	
	Employee e = new Manager(1,"sai",5000.0,2000.0);
	Employee m = new MarketingExecutive(2,"jay",5000.0,2000.0,2);
	
	@Test
	public void toTestCalculateGrossSal() {
		System.out.println("manager gross:"+e.calculateGrossSal());
		assertEquals(10700.0,e.calculateGrossSal(),0.01);
	}
	
	@Test
	public void toTestCalculatenetSal() {
		System.out.println("manager net:" +e.calculateNetSal());
		System.out.println(e.toString());
		assertEquals(8700.0,e.calculateNetSal(),0.01);
	}
	
	@Test
	public void toTestCalculateGrossSalForExecutive() {
		System.out.println("Executive gross:" +m.calculateGrossSal());
		assertEquals(11010.0,m.calculateGrossSal(),0.01);
	}
	
	@Test
	public void toTestCalculateNetSalForExecutive() {
		System.out.println("Executive net:" +m.calculateNetSal());
		System.out.println(m.toString());
		assertEquals(8700.0,m.calculateNetSal(),0.01);
	}
	
	
	
	
	
	

}
