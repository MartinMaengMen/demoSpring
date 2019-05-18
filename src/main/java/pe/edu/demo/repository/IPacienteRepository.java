package pe.edu.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente,Integer>{
List<Paciente> FindByNombre(String nombre) throws Exception;
}
