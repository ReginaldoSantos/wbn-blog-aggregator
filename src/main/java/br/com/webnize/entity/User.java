package br.com.webnize.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class User {
  
  @Id
  @GeneratedValue
  private Integer id;
  
  private String name;
  
  private String email;
  
  private String password;
  
  @ManyToMany
  @JoinTable
  private List<Role> roles;
  
  @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
  private List<Blog> blogs;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return this.roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<Blog> getBlogs() {
    return this.blogs;
  }

  public void setBlogs(List<Blog> blogs) {
    this.blogs = blogs;
  }
  
}
