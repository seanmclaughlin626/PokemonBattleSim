DROP TABLE IF EXISTS TypeEffectivenessChart;

CREATE TABLE TypeEffectivenessChart (
	base_type varchar(20),
	vs_normal decimal(2,1) NOT NULL,
	vs_fire decimal(2,1) NOT NULL,
	vs_water decimal(2,1) NOT NULL,
	vs_electric decimal(2,1) NOT NULL,
	vs_grass decimal(2,1) NULL,
	vs_ice decimal(2,1) NOT NULL,
	vs_fighting decimal(2,1) NOT NULL,
	vs_poison decimal(2,1) NOT NULL,
	vs_ground decimal(2,1) NOT NULL,
	vs_flying decimal(2,1) NOT NULL,
	vs_psychic decimal(2,1) NOT NULL,
	vs_bug decimal(2,1) NOT NULL,
	vs_rock decimal(2,1) NOT NULL,
	vs_ghost decimal(2,1) NOT NULL,
	vs_dragon decimal(2,1) NOT NULL,
	vs_dark decimal(2,1) NOT NULL,
	vs_steel decimal(2,1) NOT NULL,
	vs_fairy decimal(2,1) NOT NULL,
	CONSTRAINT PK_type PRIMARY KEY(base_type)
);

INSERT INTO TypeEffectivenessChart VALUES ('Normal',1,1,1,1,1,1,1,1,1,1,1,1,0.5,0,1,1,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Fire',1,0.5,0.5,1,2,2,1,1,1,1,1,2,0.5,1,0.5,1,2,1);
INSERT INTO TypeEffectivenessChart VALUES ('Water', 1,2,0.5,1,0.5,1,1,1,2,1,1,1,2,1,0.5,1,1,1);
INSERT INTO TypeEffectivenessChart VALUES ('Electric',1,1,2,0.5,0.5,1,1,1,0,2,1,1,1,1,0.5,1,1,1);
INSERT INTO TypeEffectivenessChart VALUES ('Grass',1,0.5,2,1,0.5,1,1,0.5,2,0.5,1,0.5,2,1,0.5,1,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Ice',1,0.5,0.5,1,2,0.5,1,1,2,2,1,1,1,1,2,1,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Fighting',2,1,1,1,1,2,1,0.5,1,0.5,0.5,0.5,2,0,1,2,2,0.5);
INSERT INTO TypeEffectivenessChart VALUES ('Poison',1,1,1,1,2,1,1,0.5,0.5,1,1,1,0.5,0.5,1,1,0,2);
INSERT INTO TypeEffectivenessChart VALUES ('Ground',1,2,1,2,0.5,1,1,2,1,0,1,0.5,2,1,1,1,2,1);
INSERT INTO TypeEffectivenessChart VALUES ('Flying',1,1,1,0.5,2,1,2,1,1,1,1,2,0.5,1,1,1,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Psychic',1,1,1,1,1,1,2,2,1,1,0.5,1,1,1,1,0,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Bug',1,0.5,1,1,2,1,0.5,0.5,1,0.5,2,1,1,0.5,1,2,0.5,0.5);
INSERT INTO TypeEffectivenessChart VALUES ('Rock',1,2,1,1,1,2,0.5,1,0.5,2,1,2,1,1,1,1,0.5,1);
INSERT INTO TypeEffectivenessChart VALUES ('Ghost',0,1,1,1,1,1,1,1,1,1,2,1,1,2,1,0.5,1,1);
INSERT INTO TypeEffectivenessChart VALUES ('Dragon',1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,0.5,0);
INSERT INTO TypeEffectivenessChart VALUES ('Dark',1,1,1,1,1,1,0.5,1,1,1,2,1,1,2,1,0.5,1,0.5);
INSERT INTO TypeEffectivenessChart VALUES ('Steel',1,0.5,0.5,0.5,1,2,1,1,1,1,1,1,2,1,1,1,0.5,2);
INSERT INTO TypeEffectivenessChart VALUES ('Fairy',1,0.5,1,1,1,1,2,0.5,1,1,1,1,1,1,2,2,0.5,1);