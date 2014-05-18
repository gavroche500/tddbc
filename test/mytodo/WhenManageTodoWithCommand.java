package mytodo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class WhenManageTodoWithCommand {
	@Test
	public void 初期状態で一覧を取得すると空であるべき() {
		TodoList todoList = new TodoList();
		List<Todo> todos = todoList.getTodos();
		assertThat(todos.isEmpty(), is(true));
	}
	
	@Test
	public void 初期状態でTODOを1件追加すると取得した一覧の件数は1であるべき() {
		TodoList todoList = new TodoList();
		todoList.addTodo("aaa");
		List<Todo> todos = todoList.getTodos();
		assertThat(todos.size(), is(1));
	}
}
