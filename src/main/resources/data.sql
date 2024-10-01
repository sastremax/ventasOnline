INSERT INTO Cliente (id, nombre, email) VALUES (1, "Maxi Sastre", "sastremaximiliano@gmail.com");
INSERT INTO Cliente (id, nombre, email) VALUES (2, "Mariana Perez", "marianaperezbruno@gmail.com");
INSERT INTO Producto (codigo, nombre, precio, stock) VALUES ("000052", "lapicera", 550, 100);
INSERT INTO Producto (codigo, nombre, precio, stock) VALUES ("000145", "goma", 402.5, 50);

INSERT INTO Ventas (codigo_venta, cliente_id) VALUES ("V00001", 1);
INSERT INTO Ventas (codigo_venta, cliente_id) VALUES ("V00002", 2);

INSERT INTO Ventas_Productos (venta_codigo, producto_codigo, cantidad) VALUES ("V00001", "000052", 1);
INSERT INTO Ventas_Productos (venta_codigo, producto_codigo, cantidad) VALUES ("V00001", "000145", 1);
INSERT INTO Ventas_Productos (venta_codigo, producto_codigo, cantidad) VALUES ("V00002", "000052", 1);
INSERT INTO Ventas_Productos (venta_codigo, producto_codigo, cantidad) VALUES ("V00002", "000145", 1);

UPDATE Producto SET stock = stock - 1 WHERE codigo = "000052";
UPDATE Producto SET stock = stock - 1 WHERE codigo = "000145";
