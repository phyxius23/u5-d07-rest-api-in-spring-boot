package antoniotrentin.u5d7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antoniotrentin.u5d7.exceptions.UnknownLanguageException;

@RestController
@RequestMapping("")
public class InfoController {

	@GetMapping("")
	public String getWelcome() {
		return "Scegli la lingua desiderata - Choose the desired language" + "\nVai su /ita per proseguire in italiano"
				+ "\nGo to /eng for english version";
	}

	@GetMapping("/ita")
	public String getItalian() {
		return "Benvenuto nella pagina di gestione delle prenotazioni";
	}

	@GetMapping("/eng")
	public String getEnglish() {
		return "Welcome to the reservation management page";
	}

	@GetMapping("/{lang}")
	public String getUnknownLanguage(@PathVariable String lang) {
		throw new UnknownLanguageException(lang);
	}
}
