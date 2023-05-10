package com.exito.www.questions;

import com.exito.www.userinterfaces.RegistroExitoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCodigo implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return RegistroExitoUI.LBL_VALIDAR_ENVIO_DE_CODIGO.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje() {
        return new ValidarCodigo();
    }
}
