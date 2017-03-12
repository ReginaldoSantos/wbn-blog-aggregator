package br.com.webnize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webnize.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
  
}
