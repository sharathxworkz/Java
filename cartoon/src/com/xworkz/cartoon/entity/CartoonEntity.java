package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Entity
@Table (name = "cartoonshow_info")

@NamedQueries({
//	@NamedQuery(name = "findByName",query = "select cartoon from CartoonEntity cartoon where cartoonName = :nm"),
//	@NamedQuery(name = "getCount", query = "select count(*) from CartoonEntity"),
	@NamedQuery(name = "getAll", query = "select max(cartoon.createdDate)  from CartoonEntity cartoon"),
//	@NamedQuery(name = "findAll", query = "select cartoon from CartoonEntity cartoon where cartoonName = :nm and country = :cc and gender = :ge and author = :at"),
//	@NamedQuery(name = "findAuthor",query = "select cartoon.author from CartoonEntity cartoon where cartoon.cartoonName = :nm"),
//	@NamedQuery(name = "findCreatedDate",query = "select cartoon.createdDate from CartoonEntity cartoon where cartoon.author = :date"),
//	@NamedQuery(name = "findNameAndCountry",query = "select cartoon.cartoonName,cartoon.country from CartoonEntity cartoon where cartoon.author = :date"),
//	@NamedQuery(name = "updateAuthor",query = "update CartoonEntity cartoon set cartoon.author = :at where cartoon.cartoonName =:nm")
//	@NamedQuery(name = "updateType", query = "update CartoonEntity cartoon set cartoon.type =:type where cartoon.cartoonName = :name"),
//	@NamedQuery(name = "deleteByName", query = "delete from CartoonEntity cartoon where cartoon.cartoonName = :dname")
})
public class CartoonEntity extends AnimatorEntity{

	@GenericGenerator(name = "anime", strategy = "increment")
	@GeneratedValue(generator = "anime")
	
	@Id
	private Integer cid;
	private String cartoonName;
	private String country;
	private String gender;
	private String author;
	private String type;
	

	public CartoonEntity(String cartoonName,String country,String gender,String author,String type,String createdBy,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ) {
		
		super(createdBy,createdDate,updatedBy,updatedDate);
		this.cartoonName = cartoonName;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	} 

}
