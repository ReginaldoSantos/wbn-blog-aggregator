package br.com.webnize.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
  
  @Id
  @GeneratedValue
  private Integer id;
  
  private String title;
  
  private String description;
  
  @Column(name="published_date")
  private Date publishedDate;
  
  private String link;
  
  @ManyToOne
  @JoinColumn(name="blog_id")
  private Blog blog;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getPublishedDate() {
    return this.publishedDate;
  }

  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Blog getBlog() {
    return this.blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }
  
  
}