package br.com.webnize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webnize.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
  
}
