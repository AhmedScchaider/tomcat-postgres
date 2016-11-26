DROP TABLE IF EXISTS personnes;
CREATE TABLE personnes (
    id SERIAL PRIMARY KEY,
    prenom VARCHAR(64),
    nomFamille VARCHAR(64)
);
INSERT INTO personnes (prenom, nomFamille) VALUES ('Louis', 'Martin Simoneau');
INSERT INTO personnes (prenom, nomFamille) VALUES ('Albert', 'Einstein' );
INSERT INTO personnes (prenom, nomFamille) VALUES ('Marie', 'Curie');
INSERT INTO personnes (prenom, nomFamille) VALUES ('Joe', 'Louis');
INSERT INTO personnes (prenom, nomFamille) VALUES ('Marilyn', 'Monroe');
