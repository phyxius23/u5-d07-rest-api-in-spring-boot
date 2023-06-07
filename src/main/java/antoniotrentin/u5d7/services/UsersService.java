package antoniotrentin.u5d7.services;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

	//	private List<User> users = new ArrayList<>(
	//			List.of(new User(UUID.randomUUID(), "aldobaglio", "Aldo", "Baglio", "aldobaglio@gmail.com"),
	//					new User(UUID.randomUUID(), "giovannistorti", "Giovanni", "Storti", "giovannistorti@gmail.com"),
	//					new User(UUID.randomUUID(), "giacomostori", "Giacomo", "Poretti", "giacomostori@gmail.com")));

	// SEARCH ALL USERS
	//	public List<User> findUsers() {
	//		return this.users;
	//	}

	// SEARCH USER BY ID
	//	public User findUserById(UUID id) {
	//		User u = null;
	//		for (User user : users) {
	//			if (user.getId() == id) {
	//				u = user;
	//			}
	//		}
	//		return u;
	//	}
	//
	//	// SAVE NEW USER
	//	public User saveNewUser(User user) {
	//		UUID uuidRandom = UUID.randomUUID();
	//		user.setId(uuidRandom);
	//		this.users.add(user);
	//		return user;
	//	}

}
