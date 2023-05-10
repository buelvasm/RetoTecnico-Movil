package com.exito.www.task;

import com.exito.www.models.Registro_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.exito.www.userinterfaces.InicioExitoUI.BTN_REGISTRARSE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioExitoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRARSE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_REGISTRARSE)
        );
    }

    public static InicioExitoTask laApp() {
        return Tasks.instrumented(InicioExitoTask.class);
    }
}
