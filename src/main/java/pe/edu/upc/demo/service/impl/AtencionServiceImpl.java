package pe.edu.upc.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import pe.edu.demo.repository.IAtencionRepository;
import pe.edu.upc.demo.entity.Atencion;
import pe.edu.upc.demo.service.IAtencionService;

public class AtencionServiceImpl implements IAtencionService{
	private IAtencionRepository atencionRepository;
	@Transactional(readOnly=true)
	@Override
	public List<Atencion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return atencionRepository.findAll();
	}
	@Transactional
	@Override
	public Atencion save(Atencion t) throws Exception {
		// TODO Auto-generated method stub
		return atencionRepository.save(t);
	}
	@Transactional
	@Override
	public Atencion update(Atencion t) throws Exception {
		// TODO Auto-generated method stub
		return atencionRepository.save(t);
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<Atencion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return atencionRepository.findById(id);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		atencionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		atencionRepository.deleteAll();
		
	}

}
