import javax.servlet.http.HttpServletRequest;
import org.jmock.Expectations;
import org.jmock.Mockery;
import junit.framework.TestCase;

public class TestLoginAction{
	
	private Mockery context = new Mockery();
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testExecute() {
		final HttpServletRequest request = context.mock(HttpServletRequest.class);
		final String name = "test";
		LoginAction login = new LoginAction();
		login.setServletRequest(request);
		login.setName("test");
		login.setPsd("test");
		
		context.checking(new Expectations() {{
			oneOf(request).getAttribute("userName");will(returnValue("test"));
			atMost(1).of(request).setAttribute("loginName", name);
        }});

		try {
			String res = login.execute();
			System.out.println("result=" + res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		context.assertIsSatisfied();
	}																		
}
