package it.tmp.mexican.mydozerdemo.converter;

import it.tmp.mexican.mydozerdemo.domain.Address;
import it.tmp.mexican.mydozerdemo.domain.Customer;
import it.tmp.mexican.mydozerdemo.dto.CreateCustomerDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class CreateCustomerDTOToMapConverter extends DozerConverter<CreateCustomerDTO, Map> {
	private final List<String> myMappingFiles;
	private final DozerBeanMapper mapper;
	private final Map<String, Object> entities;
	
	public CreateCustomerDTOToMapConverter() {
		super(CreateCustomerDTO.class, Map.class);
		myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		mapper = new DozerBeanMapper(myMappingFiles);
		entities = new HashMap<String, Object>(); 
	}

	@Override
	public Map<String, Object> convertTo(CreateCustomerDTO source, Map destination) {
		String key = source.getClass().getCanonicalName();
		
//		if(destination == null)
//			destination = new HashMap<String, Object>();
		
//		destination.put(key, mapper.map(source, Customer.class));
		entities.put(key, mapper.map(source, Customer.class));
		entities.put(key, mapper.map(source, Address.class));
		
		return entities;
	}
	
	@Override
	public CreateCustomerDTO convertFrom(Map source, CreateCustomerDTO destination) {
		String key = destination.getClass().getCanonicalName();
		return (CreateCustomerDTO)source.get(key);
	}
}