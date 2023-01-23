package org.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.model.EpassTravelStatusView;

public interface TravelStatusViewInterface {

	  public boolean userLogin(long aadhar_no,String password) throws ClassNotFoundException, SQLException, Exception;
	  public List<EpassTravelStatusView> travelView(EpassTravelStatusView travelView) throws ClassNotFoundException, SQLException, Exception;
		
}
