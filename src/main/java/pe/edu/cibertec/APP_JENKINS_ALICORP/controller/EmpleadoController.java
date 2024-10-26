package pe.edu.cibertec.APP_JENKINS_ALICORP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APP_JENKINS_ALICORP.model.Empleado;
import pe.edu.cibertec.APP_JENKINS_ALICORP.repository.EmpleadoRepository;

@RestController
@RequestMapping("api/v1/cargo")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    public String cargoJenkins() {
        Empleado empleado = empleadoRepository.findByNombre("Adrian Llontop");
        return "El cargo del empleado " + empleado.getNombre() + " es " + empleado.getCargo() + ".";
    }
}

