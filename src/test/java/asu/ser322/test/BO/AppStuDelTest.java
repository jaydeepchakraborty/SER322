package asu.ser322.test.BO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asu.ser322.bo.AppBO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuDelTest {
	
	@Test
    public void testStuDel() {
		
		AppBO appBo = new AppBO();
		Student stuObj = new Student();
		stuObj.setsId(4l);
		try {
			boolean result = appBo.delStu(stuObj);
			assertEquals(true, result);
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
