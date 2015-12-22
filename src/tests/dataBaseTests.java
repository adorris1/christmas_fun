package tests;

import static org.junit.Assert.*;
import org.dbunit.*;
import org.junit.Test;
import org.dbunit.dataset.*;
import org.dbunit.dataset.xml.*;
import org.dbunit.operation.*;
import java.io.FileInputStream;
import org.dbunit.database.*;
import connections.connect;
import java.sql.*;
import org.dbunit.DatabaseTestCase;
import connections.customer;

public class dataBaseTests extends DatabaseTestCase{
	private FlatXmlDataSet loadedDataSet;
	private connect connectionClass;
	public static final String TABLE_LOGIN = "customers";
	private Connection jdbcConnection;


	protected IDatabaseConnection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		jdbcConnection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3308/saturdays_db", "root", "12345");
		return new DatabaseConnection(jdbcConnection);
	}


    protected IDataSet getDataSet() throws Exception
    {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("C:/git/customersXml.xml"));
    }
    
    @Test
    public void testSearchSaraCustomer() throws SQLException{
    	connectionClass = new connect(); 
    	assertNotNull(connectionClass.searchCustomer(42, "", ""));
    	
    	
    }
//    @Test
//    public void testAddCustomer() throws SQLException{
//    	connectionClass = new connect(); 
//    	assertTrue(connectionClass.addCustomer("Buddy", "Bear", "111 honey bear ln", "#4", "AnyTown", "alabama", "91910", "6199857129"));
//    	
//    }
//    @Test
//	public void testSearchCustomer() throws SQLException {
//		ResultSet rs = connectionClass.searchCustomer(0, "Ashley", "");
//		customer cust = null;// = new customer();
//		
//		try{
//			while(rs.next()){
//				int id = rs.getInt("CustomerID");
//				 cust = new customer(id);
//			}
//		}catch(Exception e){
//			e.printStackTrace();}		
//		assertEquals(cust.getFirstName(),("Ashely"));
//		assertEquals(cust.getLastName(), ("Dorris"));
//		assertEquals(cust.getAddress(), ("607 Robert Ave"));
//	}
//	/** *Test case for calculator *negative scenario---InValid Employee */
//	@Test
//	public void testSearchCustomerNeg() throws SQLException {
//		ResultSet rs = connectionClass.searchCustomer(0, "Charlie", "");
//		customer cust=null;
//		try{
//			while(rs.next()){
//				int id = rs.getInt("CustomerID");
//				 cust = new customer(id);
//			}
//		}catch(Exception e){
//			e.printStackTrace();}		
//		assertEquals(cust.getFirstName(), ("Charlie"));
//		
//	}



}
