package asu.ser322.util;

public interface AppSqlConst {
	
	String STU_INST = "INSERT INTO \"SER322_SCHEMA\".\"STUDENT\" (\"SNM\") VALUES (?)";
	String STU_SELECT = "SELECT \"SID\",\"SNM\"  FROM \"SER322_SCHEMA\".\"STUDENT\" WHERE \"SNM\" = (?)";
	String STU_UPDT = "UPDATE \"SER322_SCHEMA\".\"STUDENT\" SET \"SNM\" = (?) WHERE \"SID\" = (?)";
	String STU_DEL = "DELETE FROM \"SER322_SCHEMA\".\"STUDENT\" WHERE \"SID\" = (?)";

}
