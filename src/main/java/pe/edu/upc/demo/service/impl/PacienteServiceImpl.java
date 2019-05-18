package pe.edu.upc.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.demo.repository.IPacienteRepository;
import pe.edu.upc.demo.entity.Paciente;
import pe.edu.upc.demo.service.IPacienteService;

public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private IPacienteRepository pacienteRepository;
	@Transactional(readOnly=true)
	@Override
	public List<Paciente> findAll() throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}
	@Transactional
	@Override
	public Paciente save(Paciente t) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.save(t);
	}
	@Transactional
	@Override
	public Paciente update(Paciente t) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.save(t);
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<Paciente> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		pacienteRepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		pacienteRepository.deleteAll();
		
	}
	@Override
	public List<Paciente> FindByNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.FindByNombre(nombre);
	}

}
