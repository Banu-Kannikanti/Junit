package testClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class JunitTestClass {
@Test
public void setup() {
	String str="Hello,Welcome";
	assertEquals("Hello,Welcome",str);
}
}
