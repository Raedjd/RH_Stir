package tn.stir.rh.mangement.controllers;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.stir.rh.mangement.entities.User;
import tn.stir.rh.mangement.services.IUserService;

import java.util.List;

@RestController
@Api(tags = "Gestion des opérateurs")
@RequestMapping("/operateur")
@CrossOrigin("*")
public class UserController {

	@Autowired
	IUserService operateurService;
	
	// http://localhost:8089/SpringMVC/operateur/retrieve-all-operateurs
	@GetMapping("/retrieve-all-operateurs")
	@ResponseBody
	public List<User> getOperateurs() {
		return operateurService.retrieveAllOperateurs();
	}

	// http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8
	@GetMapping("/retrieve-operateur/{operateur-id}")
	@ResponseBody
	public User retrieveOperateur(@PathVariable("operateur-id") Long operateurId) {
		return operateurService.retrieveOperateur(operateurId);
	}

	// http://localhost:8089/SpringMVC/operateur/add-operateur
	@PostMapping("/add-operateur")
	@ResponseBody
	public User addOperateur(@RequestBody User op) {
		return operateurService.addOperateur(op);
	}

	@DeleteMapping("/remove-operateur/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") Long operateurId) {
		operateurService.deleteOperateur(operateurId);
	}

	// http://localhost:8089/SpringMVC/operateur/modify-operateur
	@PutMapping("/modify-operateur")
	@ResponseBody
	public User modifyOperateur(@RequestBody User operateur) {
		return operateurService.updateOperateur(operateur);
	}

	
}
