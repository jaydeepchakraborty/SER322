package asu.ser322.test.BO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asu.ser322.bo.AppBO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuUpdtTest {
	
	@Test
    public void testStuDel() {
		
		AppBO appBo = new AppBO();
		Student stuObj = new Student();
		stuObj.setsId(6l);
		stuObj.setsNm("Bank");
		try {
			boolean result = appBo.updtStu(stuObj);
			assertEquals(true, result);
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
