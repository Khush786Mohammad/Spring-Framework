package com.spring.springcore.springjdbc.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.springcore.springjdbc.entity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger objPassenger = new Passenger();
		objPassenger.setId(rs.getInt("id"));
		objPassenger.setFirstname(rs.getString("firstname"));
		objPassenger.setLastname(rs.getString("lastname"));
		return objPassenger;
	}

}
