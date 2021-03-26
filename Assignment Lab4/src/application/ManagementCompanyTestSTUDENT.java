package application;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany mgmtCo;
	Property p1,p2,p3,p4,p5,p6;
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		//student add three properties, with plots, to mgmt co
		mgmtCo = new ManagementCompany("Railey", "555555555",6);
		 
		p1 = new Property ("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
		p2 = new Property ("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
		p3 = new Property ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
		
		
		mgmtCo.addProperty(p1);
		mgmtCo.addProperty(p2);
		mgmtCo.addProperty(p3);
	}

	@After
	public void tearDown() {
		mgmtCo = null;
		p1 = p2 = p3 = p4 = p5 = p6= null;
		//student set mgmt co to null  
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		p4 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",0,0,1,1);
		p5 = new Property ("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2);
		p6 = new Property ("Too Many Properties", "Lakepointe", 1000, "Joey BagODonuts",9,9,11,11);
		 
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		assertEquals(mgmtCo.addProperty(p4),3,0);
		assertEquals(mgmtCo.addProperty(p5),4,0);
		assertEquals(mgmtCo.addProperty(p6),-1,0); 
	}
 
	@Test
	public void testMaxRentProp() {
		
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgmtCo.maxRentProp(),4905.0,0);
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmtCo.totalRent(),13863.0,0);
	}

 }