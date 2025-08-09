# Cadastro de Clientes

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-brightgreen.svg)](https://maven.apache.org/)
[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](LICENSE)

Este projeto foi desenvolvido como parte da disciplina de Programação 2 na [UENP](https://uenp.edu.br/), Universidade Estadual do Norte do Paraná. O sistema tem como objetivo realizar o cadastro e a gestão de clientes, utilizando Java e JavaFX para a interface gráfica, além de seguir boas práticas de organização de código e arquitetura.

## Funcionalidades

- Cadastro de clientes com informações detalhadas
- Busca eficiente de clientes
- Interface gráfica intuitiva (JavaFX)
- Estrutura modular e orientada a objetos

## Estrutura do Projeto

```
Cadastro de Clientes/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/cadastro_de_clientes/
│   │   │       ├── App.java
│   │   │       ├── Buscador.java
│   │   │       ├── Cliente.java
│   │   │       ├── Controlador.java
│   │   │       ├── controllerTelaClientes.java
│   │   │       └── Endereco.java
│   │   └── resources/
│   │       └── com/example/cadastro_de_clientes/
│   │           ├── tela.fxml
│   │           └── telaClientes.fxml
│   └── test/
│       └── java/com/example/cadastro_de_clientes/BuscadorTest.java
├── pom.xml
└── README.md
```

## Requisitos

- Java 17 ou superior
- Maven 3.6+

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/RafaelTomazGraciano/Cadastro_Clientes.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd "Cadastro de Clientes"
   ```
3. Compile e execute com Maven:
   ```sh
   ./mvnw javafx:run
   ```
   Ou, no Windows:
   ```sh
   mvnw.cmd javafx:run
   ```

## Licença

Este projeto está licenciado sob a Unlicense. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
