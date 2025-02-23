-- Categorías
INSERT INTO categoria(id, name) VALUES(1, 'Pizzas');
INSERT INTO categoria(id, name) VALUES(2, 'Entradas y Acompañamientos');
INSERT INTO categoria(id, name) VALUES(3, 'Bebidas y Postres');

-- Productos de Pizzas
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(1, 'Pizza Margarita', 35.00, 15, 1);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(2, 'Pizza Pepperoni', 38.00, 20, 1);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(3, 'Pizza Cuatro Quesos', 42.00, 10, 1);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(4, 'Pizza Hawaiana', 37.50, 18, 1);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(5, 'Pizza BBQ Pollo', 40.00, 12, 1);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(6, 'Pizza Vegetariana', 36.50, 14, 1);

-- Entradas y Acompañamientos
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(7, 'Pan de Ajo', 12.00, 25, 2);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(8, 'Alitas BBQ', 18.00, 16, 2);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(9, 'Papas Fritas', 10.00, 30, 2);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(10, 'Mozzarella Sticks', 14.99, 20, 2);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(11, 'Bruschettas', 16.00, 18, 2);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(12, 'Nachos con Queso', 15.90, 12, 2);

-- Bebidas y Postres
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(13, 'Refresco de Maracuyá', 8.00, 25, 3);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(14, 'Limonada', 7.50, 20, 3);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(15, 'Cerveza Artesanal', 12.00, 15, 3);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(16, 'Tiramisú', 18.00, 10, 3);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(17, 'Cheesecake de Fresa', 16.50, 12, 3);
INSERT INTO producto(id, name, price, stock, id_categoria) VALUES(18, 'Brownie con Helado', 17.99, 8, 3);

-- Clientes
INSERT INTO cliente(id, name, last_name, email) VALUES(1, 'Miguel', 'Zare', 'miguel@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(2, 'Camila', 'Ocampo', 'camila@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(3, 'Amalia', 'Sanchez', 'amalia@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(4, 'Pepito', 'Suarez', 'pepito@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(5, 'Angel', 'Cruz', 'angel@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(6, 'Liberson', 'Chinguel', 'liberson@gmail.com');

-- Ventas
INSERT INTO venta (estado, total, fecha, id_client) VALUES (1, 120.75, '2024-08-19 12:00:00', 1);
INSERT INTO venta (estado, total, fecha, id_client) VALUES (1, 150.50, '2024-08-18 15:30:00', 2);
INSERT INTO venta (estado, total, fecha, id_client) VALUES (1, 89.99, '2024-08-17 09:45:00', 3);
INSERT INTO venta (estado, total, fecha, id_client) VALUES (1, 110.00, '2024-08-16 14:20:00', 4);
INSERT INTO venta (estado, total, fecha, id_client) VALUES (1, 250.00, '2024-08-15 18:50:00', 5);
