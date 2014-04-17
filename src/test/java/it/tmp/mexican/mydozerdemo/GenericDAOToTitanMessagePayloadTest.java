package it.tmp.mexican.mydozerdemo;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import it.tmp.mexican.mydozerdemo.domain.Address;
import it.tmp.mexican.mydozerdemo.domain.Customer;
import it.tmp.mexican.mydozerdemo.domain.TitanMessagePayload;
import it.tmp.mexican.mydozerdemo.dto.CreateCustomerDTO;
import it.tmp.mexican.mydozerdemo.dto.GenericDTO;

import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/spring-context.xml")
public class GenericDAOToTitanMessagePayloadTest {
	private final String NAME = "Achab";
	private final String LAST_NAME = "White";
	private final String CITY = "Rome";
	private final String ROAD = "via Ildebrando";
	
	@Autowired
	private ApplicationContext context;
	
	@Test
	public void dtoToMap_withValidCreateCustomerDTO(){
		GenericDTO dto = new CreateCustomerDTO(NAME, LAST_NAME, CITY, ROAD);
		
		DozerBeanMapper dozerMapper = context.getBean(DozerBeanMapper.class);
		
		TitanMessagePayload titanMessagePayload = dozerMapper.map(dto, TitanMessagePayload.class);
		
		assertTrue( titanMessagePayload.containsKey(Customer.class) );
		assertSame( Customer.class, titanMessagePayload.get(Customer.class).getClass() );
		

		assertTrue( titanMessagePayload.containsKey(Address.class) );
		assertSame( Address.class, titanMessagePayload.get(Address.class).getClass() );
		
		assertTrue(titanMessagePayload.size() == 2);
	}
}