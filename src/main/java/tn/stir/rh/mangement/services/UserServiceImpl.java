package tn.stir.rh.mangement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.stir.rh.mangement.entities.User;
import tn.stir.rh.mangement.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository operateurRepository;
	@Override
	public List<User> retrieveAllOperateurs() {
		return (List<User>) operateurRepository.findAll();
	}

	@Override
	public User addOperateur(User o) {
		operateurRepository.save(o);
		return o;
	}

	@Override
	public void deleteOperateur(Long id) {
		operateurRepository.deleteById(id);
		
	}

	@Override
	public User updateOperateur(User o) {
		operateurRepository.save(o);
		return o;
	}

	@Override
	public User retrieveOperateur(Long id) {
		return operateurRepository.findById(id).orElse(null);
	}

}
