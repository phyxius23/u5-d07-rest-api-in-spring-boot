package antoniotrentin.u5d7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antoniotrentin.u5d7.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersService usersService;

	//GET http://localhost:8080/users (+opzionalmente query params) <-- READ
	//	@GetMapping("")
	//	public List<User> getUsers() {
	//		return usersService.findUsers();
	//	}
	//
	//	//GET http://localhost:8080/users/:id <-- READ
	//	@GetMapping("/{id}")
	//	public User getUserById(UUID id) {
	//		return usersService.findUserById(id);
	//	}
}
