package org.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.model.EpassApplyForm;
import org.chainsys.model.Reason;

public interface ReasonInterface {

		//public boolean showReasons(String types_of_reasons) throws ClassNotFoundException, SQLException, Exception;
		//public List<EpassApplyForm> listOfReasons(Reason reason) throws ClassNotFoundException, SQLException, Exception;

		public List<EpassApplyForm> listOfReasons() throws ClassNotFoundException, SQLException, Exception;
}
