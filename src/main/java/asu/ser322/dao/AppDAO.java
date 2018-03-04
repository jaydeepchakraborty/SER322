package asu.ser322.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import asu.ser322.model.Student;
import asu.ser322.util.AppConUtil;
import asu.ser322.util.AppExceptionUtil;
import asu.ser322.util.AppSqlConst;
import asu.ser322.util.AppTblConst;

public class AppDAO {

	AppConUtil appCon = new AppConUtil();

	public boolean insrtStu(Student stuObj) throws AppExceptionUtil {
		boolean insrtSuccess = false;
		try {
			Connection conn = appCon.crtCon();
			PreparedStatement preparedStmt = conn.prepareStatement(AppSqlConst.STU_INST);
			preparedStmt.setString(1, stuObj.getsNm());
			insrtSuccess = preparedStmt.executeUpdate() == 1?true:false;
			appCon.closeCon(conn);
		} catch (SQLException se) {
			throw new AppExceptionUtil(se.getMessage());
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
			sList = new ArrayList<Student>();
			Connection conn = appCon.crtCon();
			PreparedStatement preparedStmt = conn.prepareStatement(AppSqlConst.STU_SELECT);
			preparedStmt.setString(1, stuObj.getsNm());
			ResultSet rs = preparedStmt.executeQuery();

			while (rs.next()) {
				Student sObj = new Student();
				sObj.setsId(rs.getLong(AppTblConst.STU_ID));
				sObj.setsNm(rs.getString(AppTblConst.STU_NM));
				sList.add(sObj);
			}

			appCon.closeCon(conn);
		} catch (SQLException se) {
			throw new AppExceptionUtil(se.getMessage());
		} catch (AppExceptionUtil ae) {
			throw ae;
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}

		return sList;
	}
	
	 public boolean updtStu(Student stuObj) throws  AppExceptionUtil{
	
		 boolean updtSuccess = false;
		 try {
				Connection conn = appCon.crtCon();
				PreparedStatement preparedStmt = conn.prepareStatement(AppSqlConst.STU_UPDT);
				preparedStmt.setString(1, stuObj.getsNm());
				preparedStmt.setLong(2, stuObj.getsId());
				updtSuccess = preparedStmt.executeUpdate() == 1?true:false;
				appCon.closeCon(conn);
			} catch (SQLException se) {
				throw new AppExceptionUtil(se.getMessage());
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
				Connection conn = appCon.crtCon();
				PreparedStatement preparedStmt = conn.prepareStatement(AppSqlConst.STU_DEL);
				preparedStmt.setLong(1, stuObj.getsId());
				delSuccess = preparedStmt.executeUpdate() == 1?true:false;
				appCon.closeCon(conn);
			} catch (SQLException se) {
				throw new AppExceptionUtil(se.getMessage());
			} catch (AppExceptionUtil ae) {
				throw ae;
			} catch (Exception e) {
				throw new AppExceptionUtil(e.getMessage());
			}
		 return delSuccess;
	 }
}
