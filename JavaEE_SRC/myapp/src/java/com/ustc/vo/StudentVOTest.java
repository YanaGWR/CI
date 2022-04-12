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
		S2.setGender("��");
		S2.setCity("����");
	}

	@Test
	public void testSetUsername() {
		S1.setUsername("LiHua");
	}
	
	@Test
	public void testSetGender() {
		S1.setGender("��");
	}
	
	@Test
	public void testSetCity() {
		S1.setCity("����");
	}
	
	@Test
	public void testGetUsername() {
		String sname = S2.getUsername();
		assertEquals("LiHua",sname);
	}

	@Test
	public void testGetGender() {
		String sgender = S2.getGender();
		assertEquals("��",sgender);
	}
	
	@Test
	public void testGetCity() {
		String scity = S2.getCity();
		assertEquals("����",scity);
	}
}
