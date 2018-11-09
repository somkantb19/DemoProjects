package com.jdbctest1.mysqldb;
import java.sql.*;
import java.util.Scanner;

public class TestMySqlDB {
	public static void main(String[]args) throws Exception {
		
		String url= "jdbc:mysql://localhost:3306/users_database";
		Connection con= DriverManager.getConnection(url,"root","root");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from userprofile;");
		System.out.println("taska");
		System.out.println("userid\tprofilename\tgroupid\tcreationdate\t\t\tusername\t\tupdateddate\t\t\tupdatedname");
		while (rs.next()) {
			int userid = rs.getInt(1);
			String userpname=rs.getString(2);
			int usergid=rs.getInt(3);
			String cdate=rs.getString(4);
			String uname=rs.getString(5);
			String update = rs.getString(6);
			String uupname= rs.getString(7);
			
			System.out.println(userid+"\t"+userpname+"\t\t"+usergid+"\t"+cdate+"\t\t"+uname+"\t\t"+update+"\t\t"+uupname);;
		
		
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
		System.out.println("taskb");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the userid to have the profile revivion details: ");
		String uid= scan.next();
		
		String url1= "jdbc:mysql://localhost:3306/users_database";
		//Connection con= DriverManager.getConnection(url,"root","root");
		//Statement st1 = con.createStatement();
		ResultSet rs1 =st.executeQuery("select * from userprofilerevision where UserProfileId="+ uid+";");
		System.out.println("Rev_ID\tfirst_name\tlast_name\tmiddle_name\tupdate_date\t\tupdated_name");
		while (rs1.next()) {
			int revid = rs1.getInt(1);
			String ufname=rs1.getString(3);
			String ulname=rs1.getString(4);
			String umname=rs1.getString(5);
			String updated=rs1.getString(6);
			String upname = rs1.getString(7);
			//String uupname= rs.getString(7);
			System.out.println(revid+"\t"+ufname+"\t\t"+ulname+"\t\t"+umname+"\t\t"+updated+"\t"+upname);;
		
		
		}
		
		
		con.close();
	}

}
