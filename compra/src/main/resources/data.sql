-- create table producto (id bigint not null, nombre varchar(255), precio double not null, unidades_en_stock integer not null, primary key (id))

INSERT INTO LISTA_COMPRA (ID, NOMBRE_PRODUCTO, CANTIDAD, OBSERVACION)
VALUES (NEXTVAL('hibernate_sequence'), 'Botellines', 8, 'Cubo de 5 botellines');

INSERT INTO LISTA_COMPRA (ID, NOMBRE_PRODUCTO, CANTIDAD, OBSERVACION)
VALUES (NEXTVAL('hibernate_sequence'), 'Sobre de 100g Jamón Ibérico', 6, 'Jamón iberico del weno');

INSERT INTO LISTA_COMPRA (ID, NOMBRE_PRODUCTO, CANTIDAD, OBSERVACION)
VALUES (NEXTVAL('hibernate_sequence'), 'Regañás de Cañada Rosal', 12, 'Las mejores regañás del mundo');

