CREATE DATABASE bdlojinho;

USE bdlojinho;

CREATE TABLE tbCategoria(
	idCategoria INT PRIMARY KEY AUTO_INCREMENT
    , nomeCategoria VARCHAR(100) NOT NULL
    , deleted BOOLEAN DEFAULT FALSE
);

CREATE TABLE tbProduto(
	idProduto INT PRIMARY KEY AUTO_INCREMENT
    , nomeProduto VARCHAR(100) NOT NULL
    , valorProduto DECIMAL NOT NULL
    , descProduto VARCHAR(200) NOT NULL
    , quantidadeProduto INT NOT NULL
    , deleted BOOLEAN DEFAULT FALSE
    , idCategoria INT
    , FOREIGN KEY (idCategoria) REFERENCES tbCategoria(idCategoria)
)

