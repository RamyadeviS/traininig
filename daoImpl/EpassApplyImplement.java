package org.chainsys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.chainsys.E_pass.JDBCConnection;
import org.chainsys.dao.EpassApplyFormInterface;
import org.chainsys.model.EpassApplyForm;

public class EpassApplyImplement implements EpassApplyFormInterface {

	EpassApplyForm apply = new EpassApplyForm();

	@Override
	public String insertApplyForm(EpassApplyForm insert) throws ClassNotFoundException, SQLException, Exception {
		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		 System.out.println("1");
		String query = "insert into epassApply (application_no,applicant_name,aadhar_no,"
				+ "gender,reason,father_name,dob,from_district,to_district,state,"
				+ "travel_date,return_date,no_of_passengers,vehicle_no,mobile_no,"
				+ "vaccination_certificate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps =connection.prepareStatement(query);
		ps.setLong(1, insert.getApplicationNo());
		ps.setString(2, insert.getApplicantName());
		ps.setLong(3, insert.getAadharNo());
		ps.setString(4, insert.getGender());
		ps.setString(5, insert.getReason());
		ps.setString(6, insert.getFatherName());
		ps.setString(7, insert.getDob());
		ps.setString(8, insert.getFromDistrict());
		ps.setString(9, insert.getToDistrict());
		ps.setString(10, insert.getState());
		ps.setString(11, insert.getTravelDate());
		ps.setString(11, insert.getReturnDate());
		ps.setInt(13, insert.getNoOfPassengers());
		ps.setString(14, insert.getVehicleNo());
		ps.setLong(15, insert.getMobileNo());
		ps.setString(16, insert.getVaccinationCertificate());

		int rows = ps.executeUpdate();
		//System.out.println("2");// update status
		System.out.println("Values are Inserted");

		return null;
	}

	@Override
	public String updateApplyForm(EpassApplyForm update) throws ClassNotFoundException, SQLException, Exception {

		Connection connection = JDBCConnection.getConnection();// JDBC connectivity
		// System.out.println(connection);
		String query = "update epassApply SET no_of_passengers=? where application_no=?";

		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, update.getNoOfPassengers());
		pst.setLong(2, update.getApplicationNo());
		int rows = pst.executeUpdate();
		System.out.println(rows);// update status
		System.out.println("Values are updated");
		return query;
	}

}
