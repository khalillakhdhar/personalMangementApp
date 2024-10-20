package com.elitech.model.entity;

import java.time.LocalDateTime;

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
public class RendezVous extends AuditModel {
@Column(nullable = false)
private String titre;
@Column(nullable = false)
private String lieu;

private LocalDateTime dateHeure;
@ManyToOne(optional = false)
private User user;

}
