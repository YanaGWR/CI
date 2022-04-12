package com.ustc.vo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentVOTest {
	StudentVO S1 = new StudentVO();
	StudentVO S2 = new StudentVO();
	@Before
	public void setUp() throws Exception {
		S2.setUsername("LiHua");
		S2.setGender("ÄÐ");
		S2.setCity("º¼ÖÝ");
	}

	@Test
	public void testSetUsername() {
		S1.setUsername("LiHua");
	}
	
	@Test
	public void testSetGender() {
		S1.setGender("ÄÐ");
	}
	
	@Test
	public void testSetCity() {
		S1.setCity("º¼ÖÝ");
	}
	
	@Test
	public void testGetUsername() {
		String sname = S2.getUsername();
		assertEquals("LiHua",sname);
	}

	@Test
	public void testGetGender() {
		String sgender = S2.getGender();
		assertEquals("ÄÐ",sgender);
	}
	
	@Test
	public void testGetCity() {
		String scity = S2.getCity();
		assertEquals("º¼ÖÝ",scity);
	}
}
