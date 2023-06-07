package antoniotrentin.u5d7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antoniotrentin.u5d7.services.EdificiService;

@RestController
@RequestMapping("/edifici")
public class EdificiController {

	@Autowired
	EdificiService edificiService;

	//GET http://localhost:8080/edifici (+opzionalmente query params) <-- READ
	//	@GetMapping("")
	//	public List<Edificio> getUsers() {
	//		return edificiService.findEdifici();
	//	}
}
