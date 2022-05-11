INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Andres', 'Guzman', '1234567','Jr: El sol 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Mario', 'Guzmanes', '1234437','Jr: Tierra 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Luis', 'Linares', '1234522','Jr: El iris 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Luisa', 'Zela', '1234217','Jr: El platano 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Pedro', 'Zapata', '1004567','Jr: El vaso 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Neymar', 'Dios', '1299567','Jr: El luca 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Panchito', 'Yepeto', '7734567','Jr: El arco 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Pinocho', 'Salaz', '1288567','Jr: El trueno 123');
INSERT INTO clientes(nombre,apellido,telefono,direccion) VALUES ('Jorge', 'Neira', '1234997','Jr: La luna 123');

INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Lazy','Pitbull',null,1);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Toby','Dogo',null,1);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Aji seco','San Ica ',null,2);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Nemo','Payaso',null,3);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Tomi','Dalmata',null,4);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Hansluck','Cruzado',null,5);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('NemoII','Payaso',null,6);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Boster','Dalmata',null,7);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('luck','Cruzado',null,8);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('Boby','Lorito',null,9);
INSERT INTO mascotas(nombre,raza,foto,duenio_id) VALUES ('luck','Cruzado',null,9);

INSERT INTO servicios(nombre,precio) VALUES ('Baño',20);
INSERT INTO servicios(nombre,precio) VALUES ('Profilaxis',40);
INSERT INTO servicios(nombre,precio) VALUES ('Corte de cabello',50);
INSERT INTO servicios(nombre,precio) VALUES ('Desparacitacion',10);
INSERT INTO servicios(nombre,precio) VALUES ('Estadia',80);
INSERT INTO servicios(nombre,precio) VALUES ('Uñas',100);

INSERT INTO boletas(observacion, cliente_id, create_at) VALUES ('Bañarlo 1 vez cada 15 días',1,NOW());
INSERT INTO boletas(observacion, cliente_id, create_at) VALUES ('No darle hueso',5,NOW());
INSERT INTO boletas(observacion, cliente_id, create_at) VALUES ('Darle agua',6,NOW());

INSERT INTO boleta_items(cantidad, servicio_id, boleta_id) VALUES (2,1,1);
INSERT INTO boleta_items(cantidad, servicio_id, boleta_id) VALUES (1,4,1);
INSERT INTO boleta_items(cantidad, servicio_id, boleta_id) VALUES (1,3,2);
INSERT INTO boleta_items(cantidad, servicio_id, boleta_id) VALUES (1,2,2);
INSERT INTO boleta_items(cantidad, servicio_id, boleta_id) VALUES (1,6,3);



