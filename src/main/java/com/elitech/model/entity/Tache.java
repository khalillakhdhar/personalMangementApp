package com.elitech.model.entity;

import com.elitech.model.AuditModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Tache extends AuditModel {
	@Column(nullable = false)
	private String sujet;

	private String description;
	@Column(nullable = false,columnDefinition = "varchar(30) default 'en attente'")
	private String etat;
	@ManyToOne(optional = false)
	private User user;

}
