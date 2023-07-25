package com.example.codeengine.Budget.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	
@NoArgsConstructor
@Data
@Table(name="expense")
public class Expense {
	
	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String descript;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;
}
