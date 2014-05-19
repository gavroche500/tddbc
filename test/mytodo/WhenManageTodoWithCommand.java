package mytodo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
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

	@Test
	public void 初期状態でaaaというTODOを1件追加して最後の1件を見るとaaaと表示されるべき() {
		初期状態で複数のTODOを追加して最後の1件を見る(Arrays.asList("1"));
		初期状態で複数のTODOを追加して最後の1件を見る(Arrays.asList("1", "2"));
	}
	
	public void 初期状態で複数のTODOを追加して最後の1件を見る(List<String> todos) {
		TodoList todoList = new TodoList();
		for (String todo : todos) {
			todoList.addTodo(todo);
		}
		assertThat(todoList.showLast(), is(todos.get(todos.size() - 1)));
	}

	@Test
	public void 初期状態で2件のTODOを追加して最後の1件を削除すると最初の1件をと表示されるべき() {
		TodoList todoList = new TodoList();
		todoList.addTodo("aaa");
		todoList.addTodo("bbb");
		todoList.delLastTodo(todoList);
		assertThat(todoList.showLast() , is("aaa"));
	}
}
