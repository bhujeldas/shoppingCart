create DATABASE shopping_cart;
use shopping_cart;

create table products(id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(128),price FLOAT);
DESCRIBE products;
INSERT INTO products(name, price) VALUE ("Lamp",10);
INSERT INTO products(name, price) VALUE ("Axe chocolate",10);
INSERT INTO products(name, price) VALUE ("Axe Phonix",4.50);
INSERT INTO products(name, price) VALUE ("Axe Apollo",5.8);
INSERT INTO products(name, price) VALUE ("Echo dot",29.99);
INSERT INTO products(name, price) VALUE ("USB 3.0 3ft",4.30);
INSERT INTO products(name, price) VALUE ("USB 3.0 6ft",6);
INSERT INTO products(name, price) VALUE ("USB 3.0 10ft",11);
INSERT INTO products(name, price) VALUE ("Anker portable charger 20100 mAh",39.99);
INSERT INTO products(name, price) VALUE ("Anker portable charger 10000 mAh",20);
INSERT INTO products(name, price) VALUE ("Anker Super Bright Tactical Flashlight",25.99);
INSERT INTO products(name, price) VALUE ("Anker SoundCore Bluetooth Speaker ",29.99);
INSERT INTO products(name, price) VALUE ("Anker Quick Charge 3.0 39W Dual USB ",23.99);
INSERT INTO products(name, price) VALUE ("Colgate Max Fresh Toothpaste with Breath Strips",9.22);
INSERT INTO products(name, price) VALUE ("USB Wall Charger, HONGGE",11.99);
INSERT INTO products(name, price) VALUE ("Axe Hair Care - 2 in 1 Shampoo Plus Conditioner",14.99);
INSERT INTO products(name, price) VALUE ("Deik Vacuum Cleaner",66.36);

select * from product LIMIT 0,10;