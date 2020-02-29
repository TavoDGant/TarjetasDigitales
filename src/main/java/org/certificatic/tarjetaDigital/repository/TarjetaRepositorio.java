package org.certificatic.tarjetaDigital.repository;

import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

//UNA interfaz podemos definir contratos del repositorio
public interface TarjetaRepositorio {

	//Metodo para crear una tarjeta nueva y retorna la misma, una nueva
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	//Metodo para obtener todas las tarjetas
	List<Tarjeta> obtenerTodas();
	
}
