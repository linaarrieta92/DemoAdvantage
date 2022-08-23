package interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Task {
	
	private int tiempo;
		
	public Wait(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(tiempo);
		
	}
	
	public static Wait unRatico(int tiempo) {
		return Tasks.instrumented(Wait.class, tiempo);
	}

}
