-- Productos de Pizzas
-- Productos de Pizzas
INSERT INTO producto(id, name, code, price, stock) VALUES(1, 'Pizza Margarita', 'B001', 35.00, 15);
INSERT INTO producto(id, name, code, price, stock) VALUES(2, 'Pizza Pepperoni', 'B002', 38.00, 20);
INSERT INTO producto(id, name, code, price, stock) VALUES(3, 'Pizza Cuatro Quesos', 'B003', 42.00, 10);
INSERT INTO producto(id, name, code, price, stock) VALUES(4, 'Pizza Hawaiana', 'B004', 37.50, 18);
INSERT INTO producto(id, name, code, price, stock) VALUES(5, 'Pizza BBQ Pollo', 'B005', 40.00, 12);
INSERT INTO producto(id, name, code, price, stock) VALUES(6, 'Pizza Vegetariana', 'B006', 36.50, 14);

-- Entradas y Acompañamientos
INSERT INTO producto(id, name, code, price, stock) VALUES(7, 'Pan de Ajo', 'B007', 12.00, 25);
INSERT INTO producto(id, name, code, price, stock) VALUES(8, 'Alitas BBQ', 'B008', 18.00, 16);
INSERT INTO producto(id, name, code, price, stock) VALUES(9, 'Papas Fritas', 'B009', 10.00, 30);
INSERT INTO producto(id, name, code, price, stock) VALUES(10, 'Mozzarella Sticks', 'B010', 14.99, 20);
INSERT INTO producto(id, name, code, price, stock) VALUES(11, 'Bruschettas', 'B011', 16.00, 18);
INSERT INTO producto(id, name, code, price, stock) VALUES(12, 'Nachos con Queso', 'B012', 15.90, 12);

-- Bebidas y Postres
INSERT INTO producto(id, name, code, price, stock) VALUES(13, 'Refresco de Maracuyá', 'B013', 8.00, 25);
INSERT INTO producto(id, name, code, price, stock) VALUES(14, 'Limonada', 'B014', 7.50, 20);
INSERT INTO producto(id, name, code, price, stock) VALUES(15, 'Cerveza Artesanal', 'B015', 12.00, 15);
INSERT INTO producto(id, name, code, price, stock) VALUES(16, 'Tiramisú', 'B016', 18.00, 10);
INSERT INTO producto(id, name, code, price, stock) VALUES(17, 'Cheesecake de Fresa', 'B017', 16.50, 12);
INSERT INTO producto(id, name, code, price, stock) VALUES(18, 'Brownie con Helado', 'B018', 17.99, 8);

-- Clientes
INSERT INTO cliente(id, name, last_name, email) VALUES(1, 'Miguel', 'Zare', 'miguel@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(2, 'Camila', 'Ocampo', 'camila@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(3, 'Amalia', 'Sanchez', 'amalia@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(4, 'Pepito', 'Suarez', 'pepito@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(5, 'Angel', 'Cruz', 'angel@gmail.com');
INSERT INTO cliente(id, name, last_name, email) VALUES(6, 'Liberson', 'Chinguel', 'liberson@gmail.com');

-- Ventas
INSERT INTO venta (numero_venta, estado, total, fecha, id_client) VALUES (1, 1, 120.75, '2024-08-19 12:00:00', 1);
INSERT INTO venta (numero_venta, estado, total, fecha, id_client) VALUES (2, 1, 150.50, '2024-08-18 15:30:00', 2);
INSERT INTO venta (numero_venta, estado, total, fecha, id_client) VALUES (3, 1, 89.99, '2024-08-17 09:45:00', 3);
INSERT INTO venta (numero_venta, estado, total, fecha, id_client) VALUES (4, 1, 110.00, '2024-08-16 14:20:00', 4);
INSERT INTO venta (numero_venta, estado, total, fecha, id_client) VALUES (5, 1, 250.00, '2024-08-15 18:50:00', 5);