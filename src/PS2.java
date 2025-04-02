import org.testng.annotations.Test;

public class PS2 extends PS1 {
	
	@Test
	public void tes5tRun() {
		int a=3;
		PS3 ps3 = new PS3(a);		
		doThis();
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		System.out.println(ps3.multiplybytwo());
		System.out.println(ps3.multiplybythree());
		
		
	}

}
