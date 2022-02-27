package br.study.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.study.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "Luan", "luancoelho.dev@gmail.com", "63992651081", "123");
		
		return ResponseEntity.ok().body(user);
	}

}
