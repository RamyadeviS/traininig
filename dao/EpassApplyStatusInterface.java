package org.chainsys.dao;

import java.sql.SQLException;

import org.chainsys.model.EpassApplyStatus;

public interface EpassApplyStatusInterface {
	
	 public String epassApplyStatusCheck(EpassApplyStatus EpassStatus) throws ClassNotFoundException, SQLException, Exception;
}
