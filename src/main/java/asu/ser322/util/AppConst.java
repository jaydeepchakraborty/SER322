package asu.ser322.util;

public interface AppConst {

	
	//DATABASE CONSTANT STARTS
	String DRIVER = "org.postgresql.Driver";
	String URL = "jdbc:postgresql://127.0.0.1:5433/SER322_DB";
	String UNM = "postgres";
	String UPWD = "postgres";
	
	//EXCEPTION MESSAGE
	String COMMON_MDG = "Something wrong happened, Please contanct Administrator";
	String MSG = "";
	String SEARCH_ERR_MSG = "Nothing Found";
	
	//PAGE PATH
	String INDX_PG = "pages/index.jsp";
	
	String APP_MSG = "appMsg";
	//STUDENT SEARCH PAGE
	String SNM = "snm";
	String SERCHED_STU = "retStuObjReq";
	
}
