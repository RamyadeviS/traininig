package org.chainsys.dao;

import java.sql.SQLException;

import org.chainsys.model.TravelEpassStatus;


public interface TravelHistoryStatusInterface {
	public String TravelHistoryStatusCheck(TravelEpassStatus TravelStatus) throws ClassNotFoundException, SQLException, Exception;
	}

