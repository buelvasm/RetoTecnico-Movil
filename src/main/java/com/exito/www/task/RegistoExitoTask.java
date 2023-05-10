package com.exito.www.task;

import com.exito.www.models.Registro_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.exito.www.userinterfaces.RegistroExitoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistoExitoTask implements Task {

    private List<Registro_Data> datos;

    public RegistoExitoTask(List<Registro_Data> datos) {
        this.datos = datos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_NOMBRES, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(datos.get(0).getNombres()).into(LBL_NOMBRES),
                Enter.theValue(datos.get(0).getApellidos()).into(LBL_APELLIDOS),
                Enter.theValue(datos.get(0).getNdocumento()).into(LBL_NUMERO_DOCUMENTO),
                Click.on(BTN_ANIO),
                Enter.theValue(datos.get(0).getAnio()).into(BTN_ANIO),
                Click.on(BTN_ANIO),
                Enter.theValue(datos.get(0).getMes()).into(BTN_MES),
                Click.on(BTN_ANIO),
                Enter.theValue(datos.get(0).getDia()).into(BTN_DIA),
                Enter.theValue(datos.get(0).getCel()).into(LBL_CEL),
                Enter.theValue(datos.get(0).getCorreo()).into(LBL_CORREO),
                Click.on(CHK_TERMINOS),
                Click.on(CHK_POLITICAS),
                Click.on(BTN_CONFIRMAR)
        );
    }

    public static RegistoExitoTask elRegistro(List<Registro_Data> datos) {

        return Tasks.instrumented(RegistoExitoTask.class, datos);
    }
}
