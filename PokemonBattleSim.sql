DROP TABLE IF EXISTS type_effectiveness_chart;

CREATE TABLE type_effectiveness_chart (
	base_type varchar(20),
	normal decimal(2,1) NOT NULL,
	fire decimal(2,1) NOT NULL,
	water decimal(2,1) NOT NULL,
	electric decimal(2,1) NOT NULL,
	grass decimal(2,1) NULL,
	ice decimal(2,1) NOT NULL,
	fighting decimal(2,1) NOT NULL,
	poison decimal(2,1) NOT NULL,
	ground decimal(2,1) NOT NULL,
	flying decimal(2,1) NOT NULL,
	psychic decimal(2,1) NOT NULL,
	bug decimal(2,1) NOT NULL,
	rock decimal(2,1) NOT NULL,
	ghost decimal(2,1) NOT NULL,
	dragon decimal(2,1) NOT NULL,
	dark decimal(2,1) NOT NULL,
	steel decimal(2,1) NOT NULL,
	fairy decimal(2,1) NOT NULL,
	CONSTRAINT PK_type PRIMARY KEY(base_type)
);

INSERT INTO type_effectiveness_chart VALUES ('normal',1,1,1,1,1,1,1,1,1,1,1,1,0.5,0,1,1,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('fire',1,0.5,0.5,1,2,2,1,1,1,1,1,2,0.5,1,0.5,1,2,1);
INSERT INTO type_effectiveness_chart VALUES ('water', 1,2,0.5,1,0.5,1,1,1,2,1,1,1,2,1,0.5,1,1,1);
INSERT INTO type_effectiveness_chart VALUES ('electric',1,1,2,0.5,0.5,1,1,1,0,2,1,1,1,1,0.5,1,1,1);
INSERT INTO type_effectiveness_chart VALUES ('grass',1,0.5,2,1,0.5,1,1,0.5,2,0.5,1,0.5,2,1,0.5,1,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('ice',1,0.5,0.5,1,2,0.5,1,1,2,2,1,1,1,1,2,1,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('fighting',2,1,1,1,1,2,1,0.5,1,0.5,0.5,0.5,2,0,1,2,2,0.5);
INSERT INTO type_effectiveness_chart VALUES ('poison',1,1,1,1,2,1,1,0.5,0.5,1,1,1,0.5,0.5,1,1,0,2);
INSERT INTO type_effectiveness_chart VALUES ('ground',1,2,1,2,0.5,1,1,2,1,0,1,0.5,2,1,1,1,2,1);
INSERT INTO type_effectiveness_chart VALUES ('flying',1,1,1,0.5,2,1,2,1,1,1,1,2,0.5,1,1,1,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('psychic',1,1,1,1,1,1,2,2,1,1,0.5,1,1,1,1,0,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('bug',1,0.5,1,1,2,1,0.5,0.5,1,0.5,2,1,1,0.5,1,2,0.5,0.5);
INSERT INTO type_effectiveness_chart VALUES ('rock',1,2,1,1,1,2,0.5,1,0.5,2,1,2,1,1,1,1,0.5,1);
INSERT INTO type_effectiveness_chart VALUES ('ghost',0,1,1,1,1,1,1,1,1,1,2,1,1,2,1,0.5,1,1);
INSERT INTO type_effectiveness_chart VALUES ('dragon',1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,0.5,0);
INSERT INTO type_effectiveness_chart VALUES ('dark',1,1,1,1,1,1,0.5,1,1,1,2,1,1,2,1,0.5,1,0.5);
INSERT INTO type_effectiveness_chart VALUES ('steel',1,0.5,0.5,0.5,1,2,1,1,1,1,1,1,2,1,1,1,0.5,2);
INSERT INTO type_effectiveness_chart VALUES ('fairy',1,0.5,1,1,1,1,2,0.5,1,1,1,1,1,1,2,2,0.5,1);