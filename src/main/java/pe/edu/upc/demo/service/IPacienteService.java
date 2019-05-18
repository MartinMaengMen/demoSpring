package pe.edu.upc.demo.service;

import java.util.List;

import pe.edu.upc.demo.entity.Paciente;

public interface IPacienteService extends CrudService<Paciente>{
	List<Paciente> FindByNombre(String nombre) throws Exception;
}
