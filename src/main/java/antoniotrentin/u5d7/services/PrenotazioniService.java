package antoniotrentin.u5d7.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

import org.springframework.stereotype.Service;

import antoniotrentin.u5d7.entities.Edificio;
import antoniotrentin.u5d7.entities.Postazione;
import antoniotrentin.u5d7.entities.PostazioneType;
import antoniotrentin.u5d7.entities.Prenotazione;
import antoniotrentin.u5d7.entities.User;

@Service
public class PrenotazioniService {

	Edificio edificio1 = new Edificio(UUID.randomUUID(), "Palazzo Ducale", "Piazza San Marco", "Venezia");
	Edificio edificio2 = new Edificio(UUID.randomUUID(), "Ca' Vendramin", "Rialto", "Roma");
	Edificio edificio3 = new Edificio(UUID.randomUUID(), "Ca' Noghera", "Tessera", "Firenze");
	Edificio edificio4 = new Edificio(UUID.randomUUID(), "Ca' D'Oro", "Cannaregio", "Venezia");

	User user1 = new User(UUID.randomUUID(), "aldobaglio", "Aldo", "Baglio", "aldobaglio@gmail.com");
	User user2 = new User(UUID.randomUUID(), "giovannistorti", "Giovanni", "Storti", "giovannistorti@gmail.com");
	User user3 = new User(UUID.randomUUID(), "giacomostori", "Giacomo", "Poretti", "giacomostori@gmail.com");

	Postazione postazione1 = new Postazione(UUID.randomUUID(), "descrizione", PostazioneType.OPENSPACE, 10, edificio1);
	Postazione postazione2 = new Postazione(UUID.randomUUID(), "descrizione", PostazioneType.PRIVATO, 10, edificio2);
	Postazione postazione3 = new Postazione(UUID.randomUUID(), "descrizione", PostazioneType.SALA_RIUNIONI, 10,
			edificio3);

	private List<Prenotazione> prenotazioni = new ArrayList<>(
			List.of(new Prenotazione(UUID.randomUUID(), LocalDate.of(2023, 02, 23), user1, postazione1),
					new Prenotazione(UUID.randomUUID(), LocalDate.of(2023, 02, 21), user2, postazione2),
					new Prenotazione(UUID.randomUUID(), LocalDate.of(2023, 02, 22), user3, postazione1),
					new Prenotazione(UUID.randomUUID(), LocalDate.of(2023, 02, 25), user2, postazione3)));

	// GET -> FIND ALL PRENOTAZIONI
	public List<Prenotazione> getPrenotazioni() {
		return this.prenotazioni;
	}

	//GET -> FIND PRENOTAZIONE BY ID
	public Prenotazione findPrenotazioneById(UUID id) {
		Prenotazione found = null;

		for (Prenotazione prenotazione : prenotazioni) {
			if (prenotazione.getId() == id) {
				found = prenotazione;
			}
		}

		return found;
	}

	// POST -> SAVE NEW PRENOTAZIONE
	public Prenotazione saveNewPrenotazione(Prenotazione p) {
		p.setId(UUID.randomUUID());		// imposto ID
		this.prenotazioni.add(p); 		// aggiungo prenotazione alla lista prenotazioni
		return p;											// ritorno la prenotazione salvata
	}

	// PUT -> MODIFY PRENOTAZIONE
	public Prenotazione findPrenotazioneAndUpdate(UUID id, Prenotazione prenotazione) {
		Prenotazione found = null;

		for (Prenotazione p : prenotazioni) {
			if (prenotazione.getId() == id) {
				found = p;
				found.setId(id);
				found.setReservationDay(prenotazione.getReservationDay());
				found.setUser(prenotazione.getUser());
				found.setPostazione(prenotazione.getPostazione());
			}
		}

		return found;
	}

	// DELETE -> DELETE PRENOTAZIONE
	public Prenotazione findPrenotazioneByIdAndDelete(UUID id) {
		ListIterator<Prenotazione> iterator = this.prenotazioni.listIterator();

		Prenotazione found = null;
		while (iterator.hasNext()) {

			Prenotazione currentUser = iterator.next();
			if (currentUser.getId() == id) {
				found = currentUser;
				iterator.remove();
			}
		}
		return found;
	}

	//	// GET -> FIND PRENOTAZIONI PER DATA E CITTA SPECIFICA
	//	public List<Postazione> getPostazioni() {
	//		return this.
	//	}

	// POST -> ESEGUI UNA PRENOTAZIONE SE LA POSTAZIONE E' LIBERA IN UN DATO GIORNO
	//	public 

}
