package org.chainsys.dao;

import java.sql.SQLException;

import org.chainsys.model.TravelHistory;

public interface TravelHistoryInterface {
     
	public String insertTravelHistory(TravelHistory insert) throws ClassNotFoundException, SQLException, Exception;
	public String updateTravelHistory(TravelHistory updateHistory) throws ClassNotFoundException, SQLException, Exception;
	//public void TypesOfReason() throws ClassNotFoundException, SQLException, Exception;
	
}
