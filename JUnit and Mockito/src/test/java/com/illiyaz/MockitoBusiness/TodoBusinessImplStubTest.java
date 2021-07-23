package com.illiyaz.MockitoBusiness;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.illiyaz.MockitoTodo.TodoService;
import com.illiyaz.MockitoTodo.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	public void testretrieveTodosRelatedToSpring_usingStub() {
		TodoService todoServiceStub= new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos =todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
