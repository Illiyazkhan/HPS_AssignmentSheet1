package com.illiyaz.MockitoBusiness;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	public void MockListSize() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void MockListSize_MultipleValue() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	@Test
	public void MockListGet() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("illiyaz");
		assertEquals("illiyaz",listMock.get(0)); 
		
	}
	
	@Test
	public void MockListAnyInt() {
		List listMock=mock(List.class);
		when(listMock.get(anyInt())).thenReturn("illiyaz");
		assertEquals("illiyaz",listMock.get(0));
		assertEquals("illiyaz",listMock.get(15452));
		assertEquals("illiyaz",listMock.get(789));
	}
	
	@Test
	public void List_throwsException() {
		Exception exception=assertThrows(RuntimeException.class,() -> {
			List listMock=mock(List.class);
			when(listMock.get(anyInt())).thenThrow(new RuntimeException("Class"));
			listMock.get(0);
		});
	}

}
