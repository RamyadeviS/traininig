package org.chainsys.dao;

import java.sql.SQLException;

import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.TravelHistory;

public interface EpassApplyFormInterface {

	public String insertApplyForm(EpassApplyForm insert) throws ClassNotFoundException, SQLException, Exception;
	public String updateApplyForm(EpassApplyForm update) throws ClassNotFoundException, SQLException, Exception;
	
}
