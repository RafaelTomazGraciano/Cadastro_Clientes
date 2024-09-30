module com.example.cadastro_de_clientes {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;


    opens com.example.cadastro_de_clientes to javafx.fxml;
    exports com.example.cadastro_de_clientes;
}