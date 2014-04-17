package it.tmp.mexican.mydozerdemo;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.tmp.mexican.mydozerdemo.domain.Address;
import it.tmp.mexican.mydozerdemo.domain.Customer;
import it.tmp.mexican.mydozerdemo.dto.CreateCustomerDTO;
import it.tmp.mexican.mydozerdemo.dto.DozerUtil;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

public class CreateCustomerDTOToCDMTest {
	private final String NAME = "Achab";
	private final String LAST_NAME = "White";
	private final String CITY = "Rome";
	private final String ROAD = "via Ildebrando";
	
	@Test @Ignore
	public void genericObjectToMap_withValidCustomer(){
		
		Customer object = new Customer();
		object.setName(NAME);
		object.setLastName(LAST_NAME);
		object.setAddress(new Address(ROAD, CITY));
		
		Map<String, Object> map = DozerUtil.mapper(object);
		
		assertTrue( map.containsKey(Customer.class.getCanonicalName()) );
		assertSame( Customer.class, map.get(Customer.class.getCanonicalName()).getClass() );
	}
	
	@Test @Ignore
	public void genericObjectToMap_withValidCustomerAndAddress(){
		Address address = new Address(ROAD, CITY);
		
		Customer customer = new Customer();
		customer.setName(NAME);
		customer.setLastName(LAST_NAME);
		customer.setAddress(address);
		
		Map<String, Object> map = DozerUtil.mapper(customer);
		map = DozerUtil.mapper(address);
		
		assertTrue( map.containsKey(Customer.class.getCanonicalName()) );
		assertTrue( map.containsKey(Address.class.getCanonicalName()) );
		
		assertSame( Customer.class, map.get(Customer.class.getCanonicalName()).getClass() );
		assertSame( Address.class, map.get(Address.class.getCanonicalName()).getClass() );
		
		assertTrue(map.size() == 2);
	}
	
	@Test
	public void dtoToMap_withValidCreateCustomerDTO(){
		CreateCustomerDTO dto = new CreateCustomerDTO(NAME, LAST_NAME, CITY, ROAD);
		
		Map<String, Object> map = DozerUtil.mapper(dto);
		
		assertTrue( map.containsKey(Customer.class.getCanonicalName()) );
		assertSame( Customer.class, map.get(Customer.class.getCanonicalName()).getClass() );
		

		assertTrue( map.containsKey(Address.class.getCanonicalName()) );
		assertSame( Address.class, map.get(Address.class.getCanonicalName()).getClass() );
		
		assertTrue(map.size() == 2);
	}
}