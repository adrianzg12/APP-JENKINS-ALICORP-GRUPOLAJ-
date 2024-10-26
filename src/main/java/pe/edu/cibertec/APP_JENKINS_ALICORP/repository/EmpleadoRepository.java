package pe.edu.cibertec.APP_JENKINS_ALICORP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.APP_JENKINS_ALICORP.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Empleado findByNombre(String nombre);
}

