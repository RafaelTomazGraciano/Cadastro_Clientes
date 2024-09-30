package com.example.cadastro_de_clientes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscadorTest {
    @Test
    public void BuscadorTest() {
        try{
            Buscador b = new Buscador();
            b.buscar("86360-000");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}