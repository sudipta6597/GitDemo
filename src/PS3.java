
public class PS3 extends PS4 {
	int a;
	public PS3(int a) {
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;
	}
	public int increment() {
		a=a+1;
		return a;
	}
	public int decrement() {
		a=a-1;
		return a;
	}
	
	

}
