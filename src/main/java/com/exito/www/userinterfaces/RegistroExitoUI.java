package com.exito.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroExitoUI {

    public static final Target LBL_NOMBRES = Target.the("Campo Nombres").locatedBy("//*[contains(@text, 'Nombres')]");
    public static final Target LBL_APELLIDOS = Target.the("Campo apellidos").locatedBy("//*[contains(@text, 'Apellidos')]");
    public static final Target LBL_NUMERO_DOCUMENTO = Target.the("Campo numero de documento").locatedBy("//*[contains(@text, 'Número de documento')]");
    public static final Target BTN_ANIO = Target.the("Desplegable anio").locatedBy("//*[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_anio_registro']");

    public static final Target BTN_MES = Target.the("Desplegable Mes").locatedBy("//*[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_mes_registro']");
    public static final Target BTN_DIA = Target.the("Desplegable dia").locatedBy("//*[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_dia_registro']");
    public static final Target LBL_CEL = Target.the("Campo celular").locatedBy("//*[contains(@text, 'Celular')]");
    public static final Target LBL_CORREO = Target.the("Campo correo").locatedBy("//*[contains(@text, 'Correo electrónico')]");
    public static final Target LBL_VALIDAR_ENVIO_DE_CODIGO = Target.the("Texto de envio de codigo al correo").locatedBy("//*[contains(@text, 'Correo electrónico')]");
    public static final Target CHK_TERMINOS = Target.the("Chek de terminos ").locatedBy("//*[@resource-id='com.exito.appcompania:id/AppCompatTextView_terminos_y_condiciones']");
    public static final Target CHK_POLITICAS = Target.the("Chek de politicas").locatedBy("//*[@resource-id='com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento']");
    public static final Target BTN_CONFIRMAR = Target.the("Boton confirmar").locatedBy("");
}
