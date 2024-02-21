DROP TABLE IF EXISTS superheroes;
CREATE TABLE superheroes (id INT AUTO_INCREMENT  PRIMARY KEY,
                          alias VARCHAR(100) NOT NULL,
                          firstName VARCHAR(100),
                          lastName VARCHAR(100),
                          tier VARCHAR(100),
                          ranking int
                          );
INSERT INTO superheroes
VALUES ('Spiderman', 'Peter', 'Parker', 'S', 7);
INSERT INTO superheroes
VALUES ('Superman', 'Clark', 'Kent', 'S', 1);
INSERT INTO superheroes
VALUES ('Batman', 'Bruce', 'Wayne', 'A', 3);
INSERT INTO superheroes
VALUES ('Wonder Woman', 'Diana', 'Prince', 'B', 1);
INSERT INTO superheroes
VALUES ('Iron Man', 'Tony', 'Stark', 'C', 8);
INSERT INTO superheroes
VALUES ('Captain America', 'Steve', 'Rogers', 'S', 4);
INSERT INTO superheroes
VALUES ('Black Widow', 'Natasha', 'Romanoff', 'A', 1);

