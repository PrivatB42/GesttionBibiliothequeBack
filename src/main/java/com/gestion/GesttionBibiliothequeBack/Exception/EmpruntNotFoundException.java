package com.gestion.GesttionBibiliothequeBack.Exception;


public class EmpruntNotFoundException extends RuntimeException {

    public EmpruntNotFoundException(int id ){
        super("L'emprunt n'existe pas" + id);
    }

}
