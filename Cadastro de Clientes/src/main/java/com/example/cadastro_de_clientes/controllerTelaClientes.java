package com.example.cadastro_de_clientes;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class controllerTelaClientes {


    @FXML
    ListView<String> clientesListview;

    public void listarCLientes(ArrayList<Cliente> clientes){
        for(Cliente cliente : clientes){
            clientesListview.getItems().addAll(String.format("%d | Nome: %s | Telefone: %s | CEP: %s | Número: %s",cliente.getCodigo(), cliente.getNome(),
                    cliente.getTelefone(), cliente.getEndereco().getCep(),cliente.getEndereco().getNumero()));
        }
    }

}
