package com.spring.springcore.springorm.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springcore.springorm.dao.PassengerDao;
import com.spring.springcore.springorm.entity.Passenger;

@Repository("passengerImpl")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired(required = true)
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional("txManager")
	public int savePassenger(Passenger p1) {
		return (Integer) hibernateTemplate.save(p1);

	}

	@Override
	@Transactional("txManager")
	public void updatePassenger(Passenger p1) {
		hibernateTemplate.update(p1);
	}

	@Override
	@Transactional("txManager")
	public void deletePassenger(int p1) {
		hibernateTemplate.delete(p1);
	}

	@Override
	public Passenger getPassengerById(int id) {
		Passenger result = (Passenger) hibernateTemplate.get(Passenger.class, id);
		return result;
	}

	@Override
	public List<Passenger> fetchAllPassengers() {
		List<Passenger> list = hibernateTemplate.loadAll(Passenger.class);
		return list;
	}

}
