package pe.edu.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entity.Atencion;
public interface IAtencionRepository extends JpaRepository<Atencion,Integer>{

}
