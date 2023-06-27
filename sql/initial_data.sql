-- Active: 1686749315704@@127.0.0.1@3306@leyvaraunt
DELIMITER ;

/* Agregaremos al usuario */
CALL add_manager ("Cristhian", "Lima", "clb.com", MD5("clb"));
CALL add_manager ("Erick", "Leyva", "leyva", MD5("leyva"));

CALL add_information(
  "Alguna descripcion bien perrona generada por chatGPT",
  "alguna localizacion bien perrona para nuestro restaurante igualmente generado por ChatGPT",
  "Unos horarios bien guachines por la tarde (Comida) y por la noche (Cena)"
);

CALL add_category("Entradas");
CALL add_category("Ensaladas");
CALL add_category("Sopas");
CALL add_category("Especialidad de la casa");
CALL add_category("Clasicos");
CALL add_category("Postres");
CALL add_category("Bebidas");
CALL add_category("Cocteles");
CALL add_category("Vinos");

CALL add_product(1, "Jamon con queso", "NINGUNA", 5);
CALL add_product(1, "Jamon con brocoli", "NINGUNA", 5);
CALL add_product(2, "Ensalada Rusa", "NINGUNA", 7.65);
CALL add_product(2, "Ensalada verde", "NINGUNA", 4.99);
CALL add_product(2, "Ensalada de pepino", "NINGUNA", 6.12);
CALL add_product(3, "Sopa de mani", "NINGUNA", 11);
CALL add_product(3, "Sopa de semola", "NINGUNA", 11);
CALL add_product(3, "Locro", "NINGUNA", 15.68);
CALL add_product(3, "Sopa de tomate", "NINGUNA", 8.75);
CALL add_product(4, "Pollo a la LEYVA", "NINGUNA", 86.68);
CALL add_product(5, "Asado", "NINGUNA", 15.39);
CALL add_product(5, "Chuleta de cerdo", "NINGUNA", 18.99);
CALL add_product(5, "Bistec", "NINGUNA", 14.65);
CALL add_product(5, "Saise", "NINGUNA", 14.65);
CALL add_product(5, "Sajta", "NINGUNA", 14.65);
CALL add_product(5, "Thimpu", "NINGUNA", 16.54);
CALL add_product(5, "Fricase", "NINGUNA", 17.99);
CALL add_product(5, "Fricase especial", "NINGUNA", 22.36);
CALL add_product(6, "Gelatina", "NINGUNA", 5);
CALL add_product(6, "Pudin", "NINGUNA", 9.99);
CALL add_product(6, "Cup Cake", "NINGUNA", 9.5);
CALL add_product(6, "Brazo gitano", "NINGUNA", 10);
CALL add_product(7, "Mocochinchi", "NINGUNA", 2);
CALL add_product(7, "Chicha", "NINGUNA", 3.5);
CALL add_product(7, "Leche de majo", "NINGUNA", 7.43);
CALL add_product(7, "Asai", "NINGUNA", 7.53);
CALL add_product(7, "Jugo de maracuya", "NINGUNA", 4.53);
CALL add_product(8, "Coctleyva", "NINGUNA", 14.99);
CALL add_product(8, "Martini", "NINGUNA", 24.98);
CALL add_product(9, "Vino rozado LAMUE", "NINGUNA", 199.98);
CALL add_product(9, "Vino blanco LAMUE", "NINGUNA", 149.98);
CALL add_product(9, "Vino tinto LAMUE", "NINGUNA", 289.98);
CALL add_product(9, "Vino tinto LAMUE exclusivo", "Una cosecha de hace mas de un siglo macerado desde 1893", 1289.98);