package it.tmp.mexican.mydozerdemo.converter;

import it.tmp.mexican.mydozerdemo.domain.Customer;
import it.tmp.mexican.mydozerdemo.domain.GenericObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class ObjectToMapConverter extends DozerConverter<GenericObject, Map> {
	private final List<String> myMappingFiles;
	private final DozerBeanMapper mapper;
	
	public ObjectToMapConverter() {
		super(GenericObject.class, Map.class);
		myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		mapper = new DozerBeanMapper(myMappingFiles);
	}

	@Override
	public Map<String, Object> convertTo(GenericObject source, Map destination) {
		String key = source.getClass().getCanonicalName();
		if(destination == null)
			destination = new HashMap<String, Object>();
		
		destination.put(key, mapper.map(source, Customer.class));
		
		return destination;
	}
	
	@Override
	public GenericObject convertFrom(Map source, GenericObject destination) {
		String key = destination.getClass().getCanonicalName();
		return (GenericObject)source.get(key);
	}
}