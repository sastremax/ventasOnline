CREATE TABLE Cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);

CREATE TABLE Producto (
    codigo VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio DOUBLE NOT NULL,
    stock INT NOT NULL
);

CREATE TABLE Ventas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    cliente_id BIGINT,
    CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE Ventas_Productos (
    venta_id BIGINT,
    producto_codigo VARCHAR(15),
    cantidad INT NOT NULL,
    CONSTRAINT fk_venta FOREIGN KEY (venta_id) REFERENCES Ventas(id),
    CONSTRAINT fk_producto FOREIGN KEY (producto_codigo) REFERENCES Producto(codigo),
    PRIMARY KEY (venta_id, producto_codigo)
);