package prob03;

public class Sparrow extends Bird {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	public String toString() {
		System.out.println("참새의 이름은 " + getName() + "입니다.");
		return super.toString();
	}

	@Override
	public void fly() {
		System.out.println("참새(" + getName() + ")는 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println("참새(" + getName() + ")는 소리내어 웁니다.");
	}

}
