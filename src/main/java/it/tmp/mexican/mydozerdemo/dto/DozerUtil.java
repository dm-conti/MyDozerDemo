package it.tmp.mexican.mydozerdemo.dto;

import it.tmp.mexican.mydozerdemo.domain.GenericObject;
import it.tmp.mexican.mydozerdemo.domain.example.ClassA;
import it.tmp.mexican.mydozerdemo.domain.example.ClassB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.config.GlobalSettings;

public class DozerUtil {
	public static ClassB mapper(final ClassA a) {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-global-configuration.xml");
		myMappingFiles.add("dozer-dto_to_cdm-mapping.xml");
		DozerBeanMapper mapper = new DozerBeanMapper(myMappingFiles);
		return mapper.map(a, ClassB.class);
	}
	
	public static Map<String, Object> mapper(final GenericObject object) {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		DozerBeanMapper mapper = new DozerBeanMapper(myMappingFiles);
		mapper.map(object, new HashMap());
		
		GlobalSettings gs = GlobalSettings.getInstance();
		
		return mapper.map(object, Map.class);
	}
	
	public static Map<String, Object> mapper(final CreateCustomerDTO dto) {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		DozerBeanMapper mapper = new DozerBeanMapper(myMappingFiles);
		return mapper.map(dto, Map.class);
	}
	
}