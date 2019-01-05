package fr.tuto.keycloak.app.modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {

    private String id;
    private String reference;
    private double price;


}
