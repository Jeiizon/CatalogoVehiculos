package com.catalogo.vehiculos.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogo.vehiculos.entidades.Vehiculo;

@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
	

}
