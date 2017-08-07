package prob05;

//String Buffer을 사용하면 좋을듯?
public class MyStack<T> {

	// -1일때가 empty일때 0은 하나라도 들어있을 때
	private int top = -1;
	private T[] buffer;

	// 사이즈 알아내기 int size();
	// 생성자
	public MyStack() {
		// 기본생성자
	}

	public MyStack(T[] objects, int capacity) {
		top = -1;
	}
	//unchecked Warning은 하지마라 무시해라
	@SuppressWarnings("unchecked")
	public MyStack(int num) {
		// num의 갯수만큼 기본적으로 배열을 생성한다.
		// StringBuffer stack = new StringBuffer(num);
		this.buffer = (T[]) new Object[num];
	}

	// resize
	//unchecked Warning은 하지마라 무시해라
	@SuppressWarnings("unchecked")
	public void resize() {
		T[] temp = (T[]) new Object[this.buffer.length * 2];
		for (int i = 0; i < this.buffer.length; i++)
			temp[i] = buffer[i];
		buffer = temp;

	}

	// isEmpty
	public boolean isEmpty() {
		/*if (this.top < 0)
			return true;
		else
			return false;*/
		
		return top == -1;
		//저 위에꺼를 이 밑에껄로 대체할 수 있음 
		//저 식으로 true가 되면 true를 반환 아니면 false를 반환하니까
	}

	// push
	public void push(T t) {
		if (this.top == this.buffer.length - 1) {
			resize();
		}
		this.top++;
		this.buffer[top] = t;
	}

	// pop
	// null 이라면 prob4.MyStackException: stack is empty 이런식으로 exception 발생
	public T pop() throws MyStackException {
		if (this.top < 0)
			throw new MyStackException("pop error!!");

		T data = this.buffer[top];
		this.buffer[top] = null;
		this.top--;
		return data;
	}

}
