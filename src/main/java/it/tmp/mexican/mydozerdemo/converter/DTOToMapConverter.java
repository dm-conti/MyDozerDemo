package it.tmp.mexican.mydozerdemo.converter;

import it.tmp.mexican.mydozerdemo.domain.GenericObject;

import java.util.Map;

import org.dozer.DozerConverter;

public class DTOToMapConverter extends DozerConverter<GenericObject, Map> {
	
	public DTOToMapConverter() {
		super(GenericObject.class, Map.class);
	}

	@Override
	public Map<String, Object> convertTo(GenericObject source, Map destination) {
		String key = source.getClass().getCanonicalName();
		destination.put(key, source);
		return destination;
	}
	
	@Override
	public GenericObject convertFrom(Map source, GenericObject destination) {
		String key = destination.getClass().getCanonicalName();
		return (GenericObject)source.get(key);
	}
}