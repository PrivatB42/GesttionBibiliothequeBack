package com.gestion.GesttionBibiliothequeBack.Exception;

public class CategorieNotFoundException extends RuntimeException{

    public CategorieNotFoundException(int id){
        super(" Categorie introuvable" +id);
    }

}
