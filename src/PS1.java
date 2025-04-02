import org.testng.annotations.BeforeMethod;

public class PS1 {
	

    public void doThis() {
		
		System.out.println("I am here");
	}
    
    @BeforeMethod
    public void beforeRun() {
    	System.out.println("i will run fast");
    }
    
    
}
