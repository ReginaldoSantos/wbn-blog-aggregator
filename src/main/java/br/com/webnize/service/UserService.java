package br.com.webnize.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webnize.entity.User;
import br.com.webnize.repository.UserRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;
  
  public List<User> findAll(){
    return userRepository.findAll();
  }
  
}
