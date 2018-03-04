package asu.ser322.test.BO;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import asu.ser322.bo.AppBO;
import asu.ser322.model.Student;
import asu.ser322.util.AppExceptionUtil;

public class AppStuSelectTest {
	
	@Test
    public void testStuSelect() {
		
		try {
			AppBO appBo = new AppBO();
			Student stuObj = new Student();
			List<Student> retStuObjLst = new ArrayList<Student>();
			stuObj.setsNm("Ross");
			retStuObjLst = appBo.searchStu(stuObj);
			
			
			for(Student stu:retStuObjLst){
				System.out.println("ID:- "+stu.getsId());
				System.out.println("NAME:- "+stu.getsNm());
			}
			
		} catch (AppExceptionUtil e) {
			e.printStackTrace();
		}
    }
}
