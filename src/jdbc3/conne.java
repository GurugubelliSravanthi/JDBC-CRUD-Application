package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class conne {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String us = "jdbc:mysql://localhost:3306/sravsdb";
		String user = "root";
		String pass = "12345678";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(us, user, pass);
//	INSERTION
//		int a;
//		String b;
//		System.out.println("Enter your id");
//		a = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter your name");
//		b = sc.nextLine();
//		String tomy = "insert into myTable(id,name)values(?,?)";
//		PreparedStatement io = con.prepareStatement(tomy);
//		io.setInt(1, a);
//		io.setString(2, b);
//		int sq = io.executeUpdate();
//		if (sq > 0) {
//			System.out.println("success");
//		} else {
//			System.out.println("fail");
//		}
//		io.close();

//		Select 

		String tomy2 = "select  * from myTable";
		PreparedStatement ioo = con.prepareStatement(tomy2);
		ResultSet rs = ioo.executeQuery(tomy2);

		while (rs.next()) {
			System.out.println("id:" + rs.getInt("id"));
			System.out.println("name:" + rs.getString("name"));
			
		}
		ioo.close();
//		update
//		int r  ;
//		String c;
//		System.out.println("enter your id");
//		r=sc.nextInt();
//		sc.nextLine();
//		System.out.println("enter your name");
//		c=sc.nextLine();
//		String tomy3 = "update myTable  set name= ? where id = ?";
//		PreparedStatement iooo = con.prepareStatement(tomy3);
//		
//		iooo.setString(1, c);
//		iooo.setInt(2, r);
//		iooo.executeUpdate();
//		iooo.close();
		
//	delete
//		int t;
//		System.out.println("enter your id uh wanna delete");
//		t=sc.nextInt();
//		String tomy4 = "delete from myTable where id = ?";
//		PreparedStatement ij = con.prepareStatement(tomy4);
//		ij.setInt(1, t);
//		ij.executeUpdate();
//		ij.close();
////		

	}

}
