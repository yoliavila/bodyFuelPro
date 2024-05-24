package com.dawes.bodyFuelPro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrenadores")
public class Entrenador {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	 
	 @Column
	 private String nombreYapellidos;
	 
	 @Column
	 private String estudios;
	 
	
}
