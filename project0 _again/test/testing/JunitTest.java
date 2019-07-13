package testing;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import project0.functions.CustomerLogin;
import project0.functions.Utility;

public class JunitTest {
	Utility u = new Utility();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	CustomerLogin c1 = new CustomerLogin();
	
	
	@Test
	public void nonNumberReturnsFalse() {
	assertTrue(CustomerLogin.Register("dick", "Austin", "lame", "More lame"));
	}

}
