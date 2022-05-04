package net.sparkminds.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sparkminds.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);
	
}