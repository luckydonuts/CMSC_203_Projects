import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	Property property;
	ManagementCompany mangementCompany ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCompany= new ManagementCompany("Bushman", "23322",2);
	}

	@After
	public void tearDown() throws Exception {
		mangementCompany=null;
	}

	@Test
	public void testAddProperty() {
		property = new Property ("Estates", "North Potomac", 2332, "Bushman",3,3,2,1);		 
		assertEquals(mangementCompany.addProperty(property),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		property = new Property ("Estates", "North Potomac", 2332, "Bushman",3,3,2,1);		 
		assertEquals(mangementCompany.addProperty(property),0,0);	
		assertEquals(mangementCompany.getPropertiesCount(), 1);
	}
}
