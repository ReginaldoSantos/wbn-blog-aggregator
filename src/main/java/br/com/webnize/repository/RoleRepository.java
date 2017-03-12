package br.com.webnize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webnize.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

  Role findByName(String string);
  
}
