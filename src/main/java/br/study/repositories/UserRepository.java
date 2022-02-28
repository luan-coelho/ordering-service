package br.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.study.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
