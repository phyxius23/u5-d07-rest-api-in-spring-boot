package antoniotrentin.u5d7.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antoniotrentin.u5d7.entities.Prenotazione;
import antoniotrentin.u5d7.services.PrenotazioniService;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {

	@Autowired
	PrenotazioniService prenotazioniService;

	@GetMapping("")
	public List<Prenotazione> findPrenotazioni() {
		return prenotazioniService.getPrenotazioni();
	}

	@PostMapping("/add")
	public Prenotazione savePrenotazione(@RequestBody Prenotazione body) {
		Prenotazione newReservation = prenotazioniService.saveNewPrenotazione(body);
		return newReservation;
	}

	@GetMapping("/{id}") // torna 200 ma non il body
	public Prenotazione findPrenotazioneById(@PathVariable UUID id) {
		return prenotazioniService.findPrenotazioneById(id);
	}

	@PutMapping("/{id}")
	public Prenotazione findPrenotazioneByIdAndUpdate(@PathVariable UUID id, @RequestBody Prenotazione body) {
		return prenotazioniService.findPrenotazioneAndUpdate(id, body);
	}

	@DeleteMapping("/{id}") // torna 200 ma non il body dell'oggetto cancellato
	public void findByIdAndDelete(@PathVariable UUID id) {
		prenotazioniService.findPrenotazioneByIdAndDelete(id);
	}

	//	@PostMapping("")
	//	public

	//	@GetMapping("")
	//	public List<Postazioni> findPostazioniByTypeAndCity() {
	//		return ;
	//	}
}
