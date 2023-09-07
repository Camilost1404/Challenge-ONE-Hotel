package com.latam.alura.hotel.dao;

import javax.persistence.EntityManager;

import com.latam.alura.hotel.modelo.Huesped;

public class HuespedDao {

	private EntityManager entityManager;

	public HuespedDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void guardar(Huesped huesped) {
		this.entityManager.persist(huesped);
	}

}
