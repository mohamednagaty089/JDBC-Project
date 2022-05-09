

import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import db.Models.Department;
import db.Repo.DepartmentRepo;

/**
 *
 * @author postgresqltutorial.com
 */
public class Database{



    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
	/*
	 * public Connection connect() { Connection conn = null; try { conn =
	 * DriverManager.getConnection(url, user, password);//using to connection with
	 * any DBMS(mysql,sql server,postgresql)
	 * System.out.println("Connected to the PostgreSQL server successfully."); }
	 * catch (SQLException e) { System.out.println(e.getMessage()); }
	 * 
	 * return conn; }
	 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//    	Department nozom=new Department();
//    	nozom.setDepartmendId(99);
//    	nozom.setDepartmentName("handasia");
//    	DepartmentRepo department=new DepartmentRepo();
//    	 int result=department.insertDepartment(nozom);
//
//     	System.out.println(result+" row inserted ");
//    	DepartmentRepo department=new DepartmentRepo();
    	
//    	  int result=department.updateDepartment(nozom);
//       System.out.println(result+" row updated ");
//    	  DepartmentRepo department=new DepartmentRepo();  
//    	  int result=department.deleteDepartment("nozom"); 
//    	  System.out.println(result+" row deleted ");
//    	List<Department> departments=department.selectAllDepartment();
//    	
//    	for(Department dept:departments) {
//    		System.out.println("dept_id = "+dept.getDepartmentId()+" , department name = "+dept.getDepartmentName());
//    	}
    	DepartmentRepo department=new DepartmentRepo();
    	Department dept=department.selectDepartment(2);
		System.out.println("dept_id = "+dept.getDepartmentId()+" , department name = "+dept.getDepartmentName());

    	
    }
}

