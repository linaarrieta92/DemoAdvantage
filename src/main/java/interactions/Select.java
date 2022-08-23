package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Select implements Interaction{
	
	
	private String item;
	private Target targetList;
	
	public Select(Target targetList, String item) {
		this.item = item;
		this.targetList = targetList;
	}

	@Step ("{0} selecciona la opcion")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(targetList.of(item)));
		
	}
	
	
	public static Select theOption(Target targetList, String item) {
		return Tasks.instrumented(Select.class, targetList, item);
	}

	



	

}