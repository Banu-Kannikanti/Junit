package testClass;



import static org.junit.Assert.*;

import org.junit.Test;

public class AssertFunctions {
@Test
public void Equals() {
	String str1="hi";
	String str3="hi";
	String str2="Hello";
	String str=null;
	int a1[]= {1,2,3};
	int a2[]= {1,2,3};
	assertArrayEquals(a1,a2);
	assertNotNull(str1);
	assertTrue(str1!=str2);
	assertEquals(str1,"hi");
	assertFalse(str1==str2);
	assertNull(str);
	assertSame(str1,str3);
	
}
}
