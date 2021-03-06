package co.edu.usbcali.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.bank.domain.UserType;
import co.edu.usbcali.bank.repository.UserTypeRepository;

@Service
public class UserTypeServiceImpl implements UserTypeService{

	
	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<UserType> findAll() {
		return userTypeRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<UserType> finById(Long id) {
		
		return userTypeRepository.findById(id);
	}

	@Override
	public UserType save(UserType entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserType update(UserType entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserType entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(UserType entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
