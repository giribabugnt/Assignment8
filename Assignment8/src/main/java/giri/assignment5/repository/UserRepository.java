package giri.assignment5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import giri.assignment5.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public User findByUsername(String username);
}