package inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.inheritance.EmployeeSalary;

public class TestEmployee {
	
	EmployeeSalary e = new EmployeeSalary(1,"sai",20000.0,2000.0);
	
	
	@Test
	public void testToCalculateGrossSalary() {
		
		assertEquals(32000.0,e.calculateGrossSal(),0.01);
		System.out.println(e.showDetials());
		
	}
	@Test
	public void testToCalculateNetSal() {
		e.calculateGrossSal();
		assertEquals(29400.0,e.calculateNetSal(),0.01);
		System.out.println(e.showDetials());
	}
	
//	@Test
//	public void  testShowDetails() {
//		System.out.println(e.showDetials());
//	}
//	
	
	

}
