package asu.ser322.test.util;

import org.junit.Test;

import asu.ser322.util.AppConUtil;
import asu.ser322.util.AppExceptionUtil;

public class AppConnTest {

	@Test
    public void testConn() {
		
		AppConUtil connTest = new AppConUtil();
		try {
			connTest.crtCon();
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
	
}
