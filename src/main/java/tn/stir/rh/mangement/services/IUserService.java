package tn.stir.rh.mangement.services;

import tn.stir.rh.mangement.entities.User;

import java.util.List;


public interface IUserService {

	List<User> retrieveAllOperateurs();

	User addOperateur(User o);

	void deleteOperateur(Long id);

	User updateOperateur(User o);

	User retrieveOperateur(Long id);

}
