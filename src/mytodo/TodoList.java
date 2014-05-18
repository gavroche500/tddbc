package mytodo;

import java.util.ArrayList;
import java.util.List;


public class TodoList {
	ArrayList<Todo> todo = new ArrayList<>();
	
	public List<Todo> getTodos() {
		return todo;
	}

	public void addTodo(String todo) {
		this.todo.add(new Todo(todo));
	}

	public String showLast() {
		return todo.get(todo.size() - 1).show();
	}
}
