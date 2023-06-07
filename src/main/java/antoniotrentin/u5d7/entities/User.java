package antoniotrentin.u5d7.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

	// Attributi
	private UUID id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
}
