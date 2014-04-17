package it.tmp.mexican.mydozerdemo.converter;

import it.tmp.mexican.mydozerdemo.domain.GenericObject;
import it.tmp.mexican.mydozerdemo.domain.TitanMessagePayload;
import it.tmp.mexican.mydozerdemo.dto.GenericDTO;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;
import org.dozer.Mapper;
import org.dozer.MapperAware;
import org.dozer.metadata.ClassMappingMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GlobalTitanConverter extends DozerConverter<Object, TitanMessagePayload> {
	
	private DozerBeanMapper mapper;
	private Mapper mapper2;
	
	public GlobalTitanConverter() {
		super(Object.class, TitanMessagePayload.class);
		
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-global-configuration.xml");
		myMappingFiles.add("dozer-dto_to_cdm-mapping.xml");
		mapper = new DozerBeanMapper(myMappingFiles);
	}

	@Override
	public TitanMessagePayload convertTo(Object source, TitanMessagePayload destination) {
		Class<? extends Object> sourceClassType = source.getClass();
		List<ClassMappingMetadata> mappings = mapper.getMappingMetadata().getClassMappingsBySource(sourceClassType);
		
		TitanMessagePayload messagePayload = new TitanMessagePayload();
		Class<? extends GenericObject> targetCDMClass = null;
		for(ClassMappingMetadata mapping : mappings){
			targetCDMClass = (Class<? extends GenericObject>) mapping.getDestinationClass();
			messagePayload.put(targetCDMClass, (GenericObject) mapper.map(sourceClassType, mapping.getDestinationClass()));
		}
		
		return messagePayload;
	}

	@Override
	public GenericDTO convertFrom(TitanMessagePayload source, Object destination) {
		return (GenericDTO) source.get(destination.getClass());
	}
	
	@Autowired
	public void setMapper(DozerBeanMapper dozerBeanMapper){
		mapper = dozerBeanMapper;
	}
}