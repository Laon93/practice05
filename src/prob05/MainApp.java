package prob05;

public class MainApp {
	
	//특정 부모를 상속받고 있는 애들만 넣게 하겠다! --> wildCard를 사용하여 제네릭 타입 제한하기
	//파라미터 값으로 받을 때, Number을 상속받고 있는 mystack만 파라미터 값으로 받겠다.
	//생성할 때 사용한다기보다 이렇게 파라미터 값으로 받거나 그럴때 사용한다.ㄴㄴㄴㄴ
	public void test(MyStack<? extends Number> mystack) {
		
	}
	
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
			
			
			//WildCard 모든 객체가 다 들어와도 된다.
			MyStack<?> numberStack = new MyStack<String>(10);
			
			
			
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
