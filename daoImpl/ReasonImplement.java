package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.ReasonInterface;
import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.Reason;

public class ReasonImplement implements ReasonInterface{

@Override
public List<EpassApplyForm> listOfReasons() throws ClassNotFoundException, SQLException, Exception {
	Connection connection = JDBCConnection.getConnection();// JDBC connectivity
	String query="select types_of_reasons  from reason";
					
	PreparedStatement pst=connection.prepareStatement(query);
	List<Reason> list = new ArrayList();
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		String types_of_reasons=rs.getString("types_of_reasons");
		Reason reason=new Reason();
		reason.setTypesOfReasons(types_of_reasons);
	    list.add(reason);
	
	}
	System.out.println(" ");
	System.out.println(list);
	
	return null;
	
	
}


} 
