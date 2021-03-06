package com.illiyaz.MockitoBusiness;

import java.util.ArrayList;
import java.util.List;

import com.illiyaz.MockitoTodo.TodoService;

//TodoBusinessImpl is the SUT(System under Test)
//TodoService is the dependency
public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos=new ArrayList<String>();
		List<String> todos=todoService.retrieveTodos(user);
		
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		} 
		return  filteredTodos;
	}
}
