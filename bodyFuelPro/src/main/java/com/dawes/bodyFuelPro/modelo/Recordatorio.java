package com.dawes.bodyFuelPro.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Recordatorio {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

}
