package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import Domain.Usuario;

@Controller
public class MianController {
	
	@GetMapping("/Login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if(usuario.getName().equals("Raul") && usuario.getPassword().equals("12345"))
		{
			return "MostrarMensajeCorrecto";
		}
		
		return "MostrarMensajeIncorrecto";

	}
}
