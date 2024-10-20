package com.elitech.model.entity;

import java.util.List;
import java.util.Set;

import com.elitech.model.AuditModel;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class User  extends AuditModel{
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String adresse;
	/*
	@OneToMany(mappedBy = "user")
	private List<Tache> taches;
	@OneToMany(mappedBy = "user")
	private Set<RendezVous> rendezVous;
	*/

}
