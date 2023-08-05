-- task 7
DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

-- tasks 8-9
DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	name VARCHAR (50)
) COMMENT "домашние животные";

ALTER TABLE pets AUTO_INCREMENT = 10;
INSERT INTO pets (name) VALUES ('dogs'), ('cats'), ('hamsters');

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	name VARCHAR (50)
) COMMENT "вьючные животные";

ALTER TABLE pack_animals AUTO_INCREMENT = 20;
INSERT INTO pack_animals (name) VALUES ('horses'), ('camels'), ('donkeys');

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 10,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Лаять!"
) COMMENT "собаки";

ALTER TABLE dogs AUTO_INCREMENT = 100;
INSERT INTO dogs (pets_name, pets_birsday) 
VALUES ('Шарик', '2020-05-03'), 
		('Турмалин', '2018-08-15'),
		('Бобик', '2021-10-08');

DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 11,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Мяукать!"
) COMMENT "кошки";	

ALTER TABLE cats AUTO_INCREMENT = 110;
INSERT INTO cats (pets_name, pets_birsday) 
VALUES ('Мурка', '2015-06-05'), 
		('Барон', '2022-08-10'),
		('Рыжик', '2018-04-20');

DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 12,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Пищать!"
) COMMENT "хомячки";	

ALTER TABLE hamsters AUTO_INCREMENT = 120;
INSERT INTO hamsters (pets_name, pets_birsday) 
VALUES ('Мурзик', '2021-07-03'), 
		('Светик', '2022-09-11'),
		('Лисичка', '2022-10-01');

DROP TABLE IF EXISTS horses;
CREATE TABLE horses (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 20,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Ржать!"
) COMMENT "лошади";

ALTER TABLE horses AUTO_INCREMENT = 200;
INSERT INTO horses (pack_animals_name, pack_animals_birsday) 
VALUES ('Ласточка', '2015-05-10'), 
		('Ветер', '2021-03-12'),
		('Вьюга', '2018-11-18');	

DROP TABLE IF EXISTS camels;
CREATE TABLE camels (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 21,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Издавать звук!"
) COMMENT "верблюды";

ALTER TABLE camels AUTO_INCREMENT = 210;
INSERT INTO camels (pack_animals_name, pack_animals_birsday) 
VALUES ('Ветеран', '2010-12-11'), 
		('Ромашка', '2014-08-28'),
		('Марс', '2018-02-17');	

DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 22,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Реветь!"
) COMMENT "ослики";

ALTER TABLE donkeys AUTO_INCREMENT = 220;
INSERT INTO donkeys (pack_animals_name, pack_animals_birsday) 
VALUES ('Марк', '2011-11-10'), 
		('Ветеран', '2012-09-25'),
		('Маруся', '2018-01-18');	

-- task 10
DROP TABLE IF EXISTS camels;

DROP TABLE IF EXISTS dif_horses;
CREATE TABLE dif_horses
	SELECT * FROM horses
	UNION 
	SELECT * FROM donkeys;

-- task 11
DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals 
	SELECT * FROM cats
	WHERE (YEAR(current_date) - YEAR(pets_birsday)) > 1 AND (YEAR(current_date) - YEAR(pets_birsday)) < 3
	UNION 
	SELECT * FROM dogs
	WHERE (YEAR(current_date) - YEAR(pets_birsday)) > 1 AND (YEAR(current_date) - YEAR(pets_birsday)) < 3
	UNION 
	SELECT * FROM hamsters
	WHERE (YEAR(current_date) - YEAR(pets_birsday)) > 1 AND (YEAR(current_date) - YEAR(pets_birsday)) < 3
	UNION 
	SELECT * FROM horses
	WHERE (YEAR(current_date) - YEAR(pack_animals_birsday)) > 1 AND (YEAR(current_date) - YEAR(pack_animals_birsday)) < 3
	UNION 
	SELECT * FROM donkeys
	WHERE (YEAR(current_date) - YEAR(pack_animals_birsday)) > 1 AND (YEAR(current_date) - YEAR(pack_animals_birsday)) < 3
;

-- task 12
ALTER TABLE young_animals RENAME COLUMN pets_id TO group_id;
ALTER TABLE young_animals RENAME COLUMN pets_name TO animal_name;
ALTER TABLE young_animals RENAME COLUMN pets_birsday TO animal_birsday;
ALTER TABLE young_animals ADD COLUMN animal_age INT DEFAULT (YEAR(current_date) - YEAR(animal_birsday));

SELECT * FROM young_animals;
