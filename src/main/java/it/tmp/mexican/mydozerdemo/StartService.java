package it.tmp.mexican.mydozerdemo;

import it.tmp.mexican.mydozerdemo.domain.Address;
import it.tmp.mexican.mydozerdemo.domain.Customer;
import it.tmp.mexican.mydozerdemo.domain.TitanMessagePayload;
import it.tmp.mexican.mydozerdemo.dto.CreateCustomerDTO;
import it.tmp.mexican.mydozerdemo.dto.GenericDTO;

import org.dozer.DozerBeanMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartService {
	private static final String NAME = "Achab";
	private static final String LAST_NAME = "White";
	private static final String CITY = "Rome";
	private static final String ROAD = "via Ildebrando";
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-context.xml");
		DozerBeanMapper dozer = context.getBean(org.dozer.DozerBeanMapper.class);
//		List<ClassMappingMetadata> list = dozer.getMappingMetadata().getClassMappingsBySourceName(CreateCustomerDTO.class.getCanonicalName());
//		
//		for(ClassMappingMetadata clazz : list)
//			System.out.println(clazz.getDestinationClass().getCanonicalName());
		
		GenericDTO dto = new CreateCustomerDTO(NAME, LAST_NAME, CITY, ROAD);
		
		DozerBeanMapper dozerMapper = context.getBean(DozerBeanMapper.class);
		
		TitanMessagePayload titanMessagePayload = dozerMapper.map(dto, TitanMessagePayload.class);
		
		System.out.println("key present ["+titanMessagePayload.containsKey(Customer.class)+"]");
		System.out.println("Value is ["+titanMessagePayload.get(Customer.class).getClass()+"]");
		
		System.out.println("key present ["+titanMessagePayload.containsKey(Address.class)+"]");
		System.out.println("Value is ["+titanMessagePayload.get(Address.class).getClass()+"]");
	}
}
