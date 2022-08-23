package tasks;

import interactions.Select;
import interactions.Wait;
import models.Usuario;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.UsePersistantStepLibraries;
import userinterface.AdvantageRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class Register implements Task {
    Usuario listDatos;

    public Register(List<Usuario>listDatos){ this.listDatos =listDatos.get(0);}

    @Step
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.unRatico(4000),
        Click.on(AdvantageRegisterPage.LOGIN),
                Click.on(AdvantageRegisterPage.CREATE_ACCOUNT),
                Enter.theValue(listDatos.getUsername()).into(AdvantageRegisterPage.USERNAME),
                Enter.theValue(listDatos.getEmail()).into(AdvantageRegisterPage.EMAIL),
                Enter.theValue(listDatos.getPassword()).into(AdvantageRegisterPage.PASSWORD),
                Enter.theValue(listDatos.getPassword()).into(AdvantageRegisterPage.CONFIRM_PASSWORD),
                Enter.theValue(listDatos.getFirtsName()).into(AdvantageRegisterPage.NAME),
                Enter.theValue(listDatos.getLastName()).into(AdvantageRegisterPage.LASTNAME),
                Enter.theValue(listDatos.getPhoneNumber()).into(AdvantageRegisterPage.PHONE_NUMBER),
                Select.theOption(AdvantageRegisterPage.COUNTRY, listDatos.getCountry()),
                Enter.theValue(listDatos.getCity()).into(AdvantageRegisterPage.CITY),
                Enter.theValue(listDatos.getAddress()).into(AdvantageRegisterPage.ADDRESS),
                Enter.theValue(listDatos.getStateProvince()).into(AdvantageRegisterPage.STATE),
                Enter.theValue(listDatos.getPostalCode()).into(AdvantageRegisterPage.POSTAL_CODE),
                Click.on(AdvantageRegisterPage.AGREE_REGISTER),
                Click.on(AdvantageRegisterPage.REGISTER)


        );

    }
    public static Register elUsuario(List<Usuario> listDatos) {
        return Tasks.instrumented(Register.class, listDatos);
    }
}
