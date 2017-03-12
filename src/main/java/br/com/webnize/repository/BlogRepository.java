package br.com.webnize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webnize.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
  
}
