package HelloWorld;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Hello {
	
	private final static Logger LOGGER = Logger.getLogger(Hello.class.getName());
	
	public static void main(String args[]) {
		LOGGER.log(Level.INFO, "Hello, World!");
	}
}
