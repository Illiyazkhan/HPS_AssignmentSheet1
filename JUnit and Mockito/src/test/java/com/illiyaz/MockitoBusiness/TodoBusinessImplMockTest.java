package com.illiyaz.MockitoBusiness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

import com.illiyaz.MockitoTodo.TodoService;


class TodoBusinessImplMockTest {

	@Test
	public void testretrieveTodosRelatedToSpring_usingMock() {
		TodoService todoServiceMock= mock(TodoService.class);
		List<String> todos= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos =todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
