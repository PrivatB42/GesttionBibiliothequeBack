package com.gestion.GesttionBibiliothequeBack.Exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(int id){
        super(" Utilisateur introuvable" +id);
    }

}
