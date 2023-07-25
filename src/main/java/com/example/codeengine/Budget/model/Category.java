package com.example.codeengine.Budget.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {
	
	@Id
	private Long id;
	
	private String name;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User user;
}
