package asu.ser322.bo;

import java.util.List;

import asu.ser322.dao.AppDAO;
import asu.ser322.model.Student;
import asu.ser322.util.AppConst;
import asu.ser322.util.AppExceptionUtil;

public class AppBO {

	AppDAO appDao = new AppDAO();

	public boolean insrtStu(Student stuObj) throws AppExceptionUtil {
		boolean insrtSuccess = false;
		try {
			insrtSuccess = appDao.insrtStu(stuObj);
		} catch (AppExceptionUtil ae) {
			throw ae;
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}

		return insrtSuccess;
	}
	
	
	public List<Student> searchStu(Student stuObj) throws AppExceptionUtil {
		List<Student> sList = null;
		try {
			sList = appDao.searchStu(stuObj);
			if(sList.size() == 0){
				throw new AppExceptionUtil(AppConst.SEARCH_ERR_MSG);
			}
		} catch (AppExceptionUtil ae) {
			throw ae;
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}

		return sList;
	}
	
	
	public boolean updtStu(Student stuObj) throws AppExceptionUtil {
		boolean updtSuccess = false;
		try {
			updtSuccess = appDao.updtStu(stuObj);
		} catch (AppExceptionUtil ae) {
			throw ae;
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}

		return updtSuccess;
	}
	
	public boolean delStu(Student stuObj) throws AppExceptionUtil {
		boolean delSuccess = false;
		try {
			delSuccess = appDao.delStu(stuObj);
		} catch (AppExceptionUtil ae) {
			throw ae;
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}

		return delSuccess;
	}

}
