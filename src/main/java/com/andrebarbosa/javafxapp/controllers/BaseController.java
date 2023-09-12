package com.andrebarbosa.javafxapp.controllers;

import com.andrebarbosa.javafxapp.utils.Logger;
import com.andrebarbosa.javafxapp.models.Empresa;

abstract class BaseController {

    Empresa empresa;

    public BaseController() {
        Logger.log("BaseController: BaseController()");
        empresa = Empresa.getInstance();
    }

}