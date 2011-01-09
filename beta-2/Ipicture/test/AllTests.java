import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestPages.class);
		suite.addTestSuite(TestServlet.class);
		suite.addTestSuite(TestPost.class);
		suite.addTestSuite(TestLink.class);
		suite.addTestSuite(TestForm.class);
		//$JUnit-END$
		return suite;
	}

}
