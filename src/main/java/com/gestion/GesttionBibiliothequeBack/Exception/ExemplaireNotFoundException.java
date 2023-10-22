package com.gestion.GesttionBibiliothequeBack.Exception;


public class ExemplaireNotFoundException extends RuntimeException {

    public ExemplaireNotFoundException(int id ){
        super("L'exemplaire n'existe pas" + id);
    }

}
