package asu.ser322.test.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asu.ser322.dao.AppDAO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuUpdtTest {
	
	@Test
    public void testStuDel() {
		
		AppDAO appDao = new AppDAO();
		Student stuObj = new Student();
		stuObj.setsId(1l);
		stuObj.setsNm("Ross");
		try {
			boolean result = appDao.updtStu(stuObj);
			assertEquals(true, result);
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
