package com.catalogo.vehiculos.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.vehiculos.DAO.VehiculoRepositorio;
import com.catalogo.vehiculos.entidades.Vehiculo;


@RestController
@RequestMapping("vehiculos")
public class ProductRest {
	
	@Autowired
	private VehiculoRepositorio vehiculoDAO;
	
	
	@GetMapping	 // (GET)
	public ResponseEntity<List<Vehiculo>>getVehiculo(){
		List<Vehiculo> vehiculos = vehiculoDAO.findAll();
		return ResponseEntity.ok(vehiculos);
	}
	
	
	@RequestMapping(value="{vehiculoId}") // (GET)
	public ResponseEntity<Vehiculo>obtenerVehiculoId(@PathVariable("vehiculoId")long  vehiculoId){
		Optional<Vehiculo> optionalVehiculo = vehiculoDAO.findById(vehiculoId);  
		if(optionalVehiculo.isPresent()) {
			return ResponseEntity.ok(optionalVehiculo.get());
			
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	@PostMapping // (POST)
	public ResponseEntity<Vehiculo> crearVehiculo(@RequestBody Vehiculo vehiculo){
		Vehiculo nuevoVehiculo = vehiculoDAO.save(vehiculo);
		return ResponseEntity.ok(nuevoVehiculo);
		
	}
	
	@DeleteMapping(value= "{vehiculoId}") // (DELETE)
	public ResponseEntity<Vehiculo> borrarVehiculo(@PathVariable("vehiculoId")long  vehiculoId){
		vehiculoDAO.deleteById(vehiculoId);
		return ResponseEntity.ok(null);
		
	}
	
	@PutMapping // (PUT)
	public ResponseEntity<Vehiculo> actualizarVehiculo(@RequestBody Vehiculo vehiculo){
		Optional<Vehiculo> optionalVehiculo = vehiculoDAO.findById(vehiculo.getId());  
		if(optionalVehiculo.isPresent()) {
			Vehiculo actualizarVehiculo = optionalVehiculo.get();
			actualizarVehiculo.setMarca(vehiculo.getMarca());
					actualizarVehiculo.setDescripcion	(vehiculo.getDescripcion());
					actualizarVehiculo.setTipo(vehiculo.getTipo());
					actualizarVehiculo.setModelo(vehiculo.getModelo());
					actualizarVehiculo.setAltura(vehiculo.getAltura());
					actualizarVehiculo.setPeso(vehiculo.getPeso());
					actualizarVehiculo.setCombustible(vehiculo.getCombustible());
					actualizarVehiculo.setVelocidad(vehiculo.getVelocidad());
			vehiculoDAO.save(actualizarVehiculo);
			return ResponseEntity.ok(actualizarVehiculo);
			
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
 

}
 