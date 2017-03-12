package br.com.webnize.service;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webnize.entity.Blog;
import br.com.webnize.entity.Item;
import br.com.webnize.entity.Role;
import br.com.webnize.entity.User;
import br.com.webnize.repository.BlogRepository;
import br.com.webnize.repository.ItemRepository;
import br.com.webnize.repository.RoleRepository;
import br.com.webnize.repository.UserRepository;

@Service
public class InitDbService {
  
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private BlogRepository blogRepository;
  
  @Autowired
  private ItemRepository itemRepository;
  
  @PostConstruct
  public void initDb(){
    
    if (roleRepository.findByName("ROLE_ADMIN") == null) {
      
      Role roleUser = new Role();
      roleUser.setName("ROLE_USER");
      roleRepository.save(roleUser);
      
      Role roleAdmin = new Role();
      roleAdmin.setName("ROLE_ADMIN");
      roleRepository.save(roleAdmin);
      
      User userAdmin = new User();
      userAdmin.setName("admin");
      
      ArrayList<Role> adminRoles = new ArrayList<Role>();    
      adminRoles.add(roleUser);    
      userAdmin.setRoles(adminRoles);
      userRepository.save(userAdmin);
      
      Blog blogJavaVids = new Blog();
      blogJavaVids.setName("javavids");
      blogJavaVids.setUrl("http://feeds.feedburner.com/javavids?format=xml");
      blogJavaVids.setUser(userAdmin);
      blogRepository.save(blogJavaVids);
      
      Item item1 = new Item();
      item1.setBlog(blogJavaVids);
      item1.setTitle("FIRST");
      item1.setDescription("The Fisrt Blog");
      item1.setLink("http://www.javavids.com");
      item1.setPublishedDate(new Date());
      itemRepository.save(item1);
  
      Item item2 = new Item();
      item2.setBlog(blogJavaVids);
      item2.setTitle("SECOND");
      item2.setDescription("The Second Blog");
      item2.setLink("http://www.javavids.com");
      item2.setPublishedDate(new Date());
      itemRepository.save(item2);
    }    
  }
  
}
