package prob05;

public class MainApp {
	public static void main(String[] args) {
		try {
			
			MyStack<String> stack = new MyStack<String>(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				// 런타임 에러
				// generic을 사용하지 않으면 코드 작성시 타입 체크를 하지 않음
				// Integer s = (Integer)stack.pop();
				String s = stack.pop();
				
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack<String>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			//하나 넣고 2개 뽑으려 했으니 Exception 발생!!
			System.out.println(stack.pop());
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
