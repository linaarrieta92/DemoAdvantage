package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.AdvantageRegisterPage;

public class VerificaMensaje implements Question<String>{
	
	private String mensaje;
	
	public VerificaMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String answeredBy(Actor actor) {
		return (AdvantageRegisterPage.REGISTER.of(mensaje)).resolveFor(actor).getText();
	}
	
	public static VerificaMensaje deRegistro(String mensaje) {
		return new VerificaMensaje(mensaje);
	}

}

                                                               
