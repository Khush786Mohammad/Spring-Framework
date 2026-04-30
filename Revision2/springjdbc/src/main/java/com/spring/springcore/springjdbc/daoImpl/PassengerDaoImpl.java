package com.spring.springcore.springjdbc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.springcore.springjdbc.RowMapper.PassengerRowMapper;
import com.spring.springcore.springjdbc.dao.PassengerDao;
import com.spring.springcore.springjdbc.entity.Passenger;

@Component("passenger")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int savePassenger(Passenger p1) {
		System.out.println("Executing");
		String query = "insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(query, p1.getId(), p1.getFirstname(), p1.getLastname());
		return result;
	}

	@Override
	public int updatePassenger(Passenger p1) {
		System.out.println("Updating Passenger");
		String query = "Update passenger set firstname=?, lastname=? where id=?";
		return jdbcTemplate.update(query, p1.getFirstname(), p1.getLastname(), p1.getId());
	}

	@Override
	public int deletePassenger(int id) {
		String query = "Delete from Passenger where id=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public Passenger getPassengerById(int id) {
		String query = "select * from Passenger where id = ?";
		return jdbcTemplate.queryForObject(query, new PassengerRowMapper(), id);
	}

	@Override
	public List<Passenger> fetchAllPassengers() {
		String query = "select * from Passenger";
		return jdbcTemplate.query(query, new PassengerRowMapper());
	}

}
