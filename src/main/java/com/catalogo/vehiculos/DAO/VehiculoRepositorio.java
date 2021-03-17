package com.catalogo.vehiculos.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogo.vehiculos.entidades.Vehiculo;

@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

	public Optional<List<Vehiculo>> findAllByTipo(String tipo);

	public Optional<List<Vehiculo>> findAllByModelo(Integer modelo);

}
