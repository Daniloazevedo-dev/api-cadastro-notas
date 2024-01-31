CREATE TABLE NOTAS
(
    id BIGINT NOT NULL,
    usuario_id INTEGER NOT NULL ,
    descricao VARCHAR(255) NOT NULL,
    date_create DATE NOT NULL,
    data_alerta DATE NOT NULL,

    FOREIGN KEY (usuario_id) REFERENCES USUARIO (id),
    PRIMARY KEY (id)
);
CREATE SEQUENCE notas_seq START WITH 1 INCREMENT BY 1;