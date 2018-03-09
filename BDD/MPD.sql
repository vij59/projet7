
CREATE SEQUENCE bibliotheque.emprunt_id_seq;

CREATE TABLE bibliotheque.Emprunt (
                id BIGINT NOT NULL DEFAULT nextval('bibliotheque.emprunt_id_seq'),
                date_emprunt DATE NOT NULL,
                date_retour DATE NOT NULL,
                id_livre BIGINT NOT NULL,
                id_utilisateur BIGINT NOT NULL,
                CONSTRAINT emprunt_pk PRIMARY KEY (id)
);


ALTER SEQUENCE bibliotheque.emprunt_id_seq OWNED BY bibliotheque.Emprunt.id;

CREATE TABLE bibliotheque.Utilisateur (
                id BIGINT NOT NULL,
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                mail VARCHAR NOT NULL,
                mdp VARCHAR NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id)
);


CREATE SEQUENCE bibliotheque.auteur_id_seq;

CREATE TABLE bibliotheque.Auteur (
                id BIGINT NOT NULL DEFAULT nextval('bibliotheque.auteur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                CONSTRAINT auteur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE bibliotheque.auteur_id_seq OWNED BY bibliotheque.Auteur.id;

CREATE TABLE bibliotheque.Livre (
                id BIGINT NOT NULL,
                titre VARCHAR NOT NULL,
                nb_exemplaires INTEGER NOT NULL,
                date_publication DATE NOT NULL,
                id_auteur INTEGER NOT NULL,
                CONSTRAINT livre_pk PRIMARY KEY (id)
);


ALTER TABLE bibliotheque.Utilisateur ADD CONSTRAINT emprunt_utilisateur_fk
FOREIGN KEY (id)
REFERENCES bibliotheque.Emprunt (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE bibliotheque.Livre ADD CONSTRAINT emprunt_livre_fk
FOREIGN KEY (id)
REFERENCES bibliotheque.Emprunt (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE bibliotheque.Livre ADD CONSTRAINT auteur_livre_fk
FOREIGN KEY (id)
REFERENCES bibliotheque.Auteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
