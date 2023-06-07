package antoniotrentin.u5d7.entities;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Prenotazione {

	// Attributi
	private UUID id;
	private LocalDate reservationDay;

	private User user;
	private Postazione postazione;
}
