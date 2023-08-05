DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	name VARCHAR (50)
) COMMENT "домашние животные";

INSERT INTO pets (name) VALUES ('dogs'), ('cats'), ('hamsters');

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	name VARCHAR (50)
) COMMENT "вьючные животные";

INSERT INTO pack_animals (name) VALUES ('horses'), ('camels'), ('donkeys');

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 1,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Лаять!"
) COMMENT "собаки";

INSERT INTO dogs (pets_name, pets_birsday) 
VALUES ('Шарик', '2020-05-03'), 
		('Турмалин', '2018-08-15'),
		('Бобик', '2019-10-08');

DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 2,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Мяукать!"
) COMMENT "кошки";	

INSERT INTO cats (pets_name, pets_birsday) 
VALUES ('Мурка', '2015-06-05'), 
		('Барон', '2014-08-10'),
		('Рыжик', '2018-04-20');

DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pets_id INT UNSIGNED NOT NULL DEFAULT 3,
	FOREIGN KEY (pets_id) REFERENCES pets(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pets_name VARCHAR (50), 
	pets_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Пищать!"
) COMMENT "хомячки";	

INSERT INTO hamsters (pets_name, pets_birsday) 
VALUES ('Мурзик', '2021-07-03'), 
		('Светик', '2020-09-11'),
		('Лисичка', '2022-10-01');

DROP TABLE IF EXISTS horses;
CREATE TABLE horses (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 1,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Ржать!"
) COMMENT "лошади";

INSERT INTO horses (pack_animals_name, pack_animals_birsday) 
VALUES ('Ласточка', '2015-05-10'), 
		('Ветер', '2014-03-12'),
		('Вьюга', '2018-11-18');	

DROP TABLE IF EXISTS camels;
CREATE TABLE camels (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 2,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Издавать звук!"
) COMMENT "верблюды";

INSERT INTO camels (pack_animals_name, pack_animals_birsday) 
VALUES ('Ветеран', '2010-12-11'), 
		('Ромашка', '2014-08-28'),
		('Марс', '2018-02-17');	

DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	pack_animals_id INT UNSIGNED NOT NULL DEFAULT 3,
	FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
	pack_animals_name VARCHAR (50), 
	pack_animals_birsday DATE DEFAULT (current_date),
	command VARCHAR (50) DEFAULT "Реветь!"
) COMMENT "ослики";

INSERT INTO donkeys (pack_animals_name, pack_animals_birsday) 
VALUES ('Марк', '2011-11-10'), 
		('Ветеран', '2012-09-25'),
		('Маруся', '2018-01-18');	


-- TRUNCATE TABLE pets;

