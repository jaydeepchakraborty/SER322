package asu.ser322.test.BO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asu.ser322.bo.AppBO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuInsrtTest {
	
	@Test
    public void testStuInsrt() {
		
		AppBO appBo = new AppBO();
		Student stuObj = new Student();
		stuObj.setsNm("Betty");
		try {
			boolean result = appBo.insrtStu(stuObj);
			assertEquals(true, result);
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
