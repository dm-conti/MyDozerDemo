package it.tmp.mexican.mydozerdemo;

import it.tmp.mexican.mydozerdemo.domain.example.ClassA;
import it.tmp.mexican.mydozerdemo.domain.example.ClassA1;
import it.tmp.mexican.mydozerdemo.domain.example.ClassB;
import it.tmp.mexican.mydozerdemo.dto.DozerUtil;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class DozerTest {
	
	@Test @Ignore
	public void dozerTest(){
		ClassA a = new ClassA();
		a.setStringField("aaa");
		a.setBooleanField(false);
		a.setLongField(100L);
		ClassA1 classA1 = new ClassA1();
		classA1.setStringField1("A1");
		classA1.setBooleanField1(true);
		classA1.setLongField1(10000L);
		
		a.setClassA1(classA1);
		ClassB b = DozerUtil.mapper(a);
		
		Assert.assertEquals(a.getStringField(), b.getStringField());
		System.out.println(a);
		System.out.println(b);
		Assert.assertEquals(a.isBooleanField(), b.isBooleanField());
		Assert.assertEquals(a.getLongField(), b.getLongField());
	}
}