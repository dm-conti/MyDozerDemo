package it.tmp.mexican.mydozerdemo.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class TitanMessagePayload implements Map< Class<? extends GenericObject>, GenericObject>, Serializable {
	private static final long serialVersionUID = 6901029029524535147L;

	/** The headers object */
	private final Map<Class<? extends GenericObject>, GenericObject> entities;
	
	public TitanMessagePayload() {
		this.entities = new HashMap< Class<? extends GenericObject>, GenericObject>();
	}

	/**
	 * Create a new MessageHeaders with the given headers.
	 * 
	 * @param entities message headers
	 */
	public TitanMessagePayload(Map< Class<? extends GenericObject>, ? extends GenericObject > entities) {
		this.entities = (entities != null) ? new HashMap< Class<? extends GenericObject>, GenericObject >(entities) : new HashMap< Class<? extends GenericObject>, GenericObject >();
	}

	@Override
	public int size() {
		return entities.size();
	}

	@Override
	public boolean isEmpty() {
		return entities.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return entities.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return entities.containsValue(value);
	}

	@Override
	public GenericObject get(Object key) {
		return entities.get(key);
	}

	@Override
	public GenericObject put(Class<? extends GenericObject> key, GenericObject value) {
		return entities.put(key, value);
	}

	@Override
	public GenericObject remove(Object key) {
		return entities.remove(key);
	}

	@Override
	public void putAll(Map<? extends Class<? extends GenericObject>, ? extends GenericObject> m) {
		entities.putAll(m);
	}

	@Override
	public void clear() {
		entities.clear();
	}

	@Override
	public Set<Class<? extends GenericObject>> keySet() {
		return entities.keySet();
	}

	@Override
	public Collection<GenericObject> values() {
		return entities.values();
	}

	@Override
	public Set<java.util.Map.Entry<Class<? extends GenericObject>, GenericObject>> entrySet() {
		return entities.entrySet();
	}
}