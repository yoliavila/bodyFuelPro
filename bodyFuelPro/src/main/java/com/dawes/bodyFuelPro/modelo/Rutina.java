package com.dawes.bodyFuelPro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name = "rutinas")
public class Rutina {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	 
	 @Column
	 private String titulo;
	 
	 @Column 
	 private String resumen;
	 
	 @Column
	 private String descripcion;

}
