CREATE TABLE NOTA
(
    id UUID NOT NULL,
    usuario_id UUID NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    date_create DATE NOT NULL,
    data_alerta DATE NOT NULL,

    FOREIGN KEY (usuario_id) REFERENCES USUARIO (id),
    PRIMARY KEY (id)
);
