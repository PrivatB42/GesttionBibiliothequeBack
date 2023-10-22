package com.gestion.GesttionBibiliothequeBack.Exception;


public class LivreNotFoundException extends RuntimeException {

    public LivreNotFoundException(int id ){
        super("Livre not found" + id);
    }

}
