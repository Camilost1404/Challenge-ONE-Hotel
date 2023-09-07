package com.latam.alura.hotel.dao;

import javax.persistence.EntityManager;

import com.latam.alura.hotel.modelo.Reserva;

public class ReservaDao {

	private EntityManager entityManager;

	public ReservaDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void guardar(Reserva reserva) {
		this.entityManager.persist(reserva);
	}
	
}
