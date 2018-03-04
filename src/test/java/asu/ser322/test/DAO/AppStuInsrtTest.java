package asu.ser322.test.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asu.ser322.dao.AppDAO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuInsrtTest {
	
	@Test
    public void testStuInsrt() {
		
		AppDAO appDao = new AppDAO();
		Student stuObj = new Student();
		stuObj.setsNm("Hannah");
		try {
			boolean result = appDao.insrtStu(stuObj);
			assertEquals(true, result);
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
