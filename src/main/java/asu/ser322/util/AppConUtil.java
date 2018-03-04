package asu.ser322.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConUtil {

	Connection conn = null;

	public Connection crtCon() throws AppExceptionUtil {

		try {
			Class.forName(AppConst.DRIVER);
			if (conn != null) {
				return conn;
			} else {
				conn = DriverManager.getConnection(AppConst.URL, AppConst.UNM, AppConst.UPWD);
			}
		} catch (ClassNotFoundException cfe) {
			throw new AppExceptionUtil(cfe.getMessage());
		} catch (SQLException se) {
			throw new AppExceptionUtil(se.getMessage());
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}
		return conn;
	}

	public void closeCon(Connection conn) throws AppExceptionUtil {
		try {
			conn.close();
		} catch (SQLException se) {
			throw new AppExceptionUtil(se.getMessage());
		} catch (Exception e) {
			throw new AppExceptionUtil(e.getMessage());
		}
	}

}
