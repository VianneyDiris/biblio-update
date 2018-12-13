
CREATE SEQUENCE public.status_id_seq;

CREATE TABLE public.status (
                id INTEGER NOT NULL DEFAULT nextval('public.status_id_seq'),
                satus VARCHAR NOT NULL,
                CONSTRAINT status_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.status_id_seq OWNED BY public.status.id;

CREATE SEQUENCE public.genre_id_seq;

CREATE TABLE public.genre (
                id INTEGER NOT NULL DEFAULT nextval('public.genre_id_seq'),
                genre VARCHAR NOT NULL,
                CONSTRAINT genre_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.genre_id_seq OWNED BY public.genre.id;

CREATE SEQUENCE public.editeur_id_seq;

CREATE TABLE public.editeur (
                id INTEGER NOT NULL DEFAULT nextval('public.editeur_id_seq'),
                nom VARCHAR NOT NULL,
                CONSTRAINT editeur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.editeur_id_seq OWNED BY public.editeur.id;

CREATE SEQUENCE public.auteur_id_seq;

CREATE TABLE public.auteur (
                id INTEGER NOT NULL DEFAULT nextval('public.auteur_id_seq'),
                prenom VARCHAR NOT NULL,
                nom VARCHAR NOT NULL,
                CONSTRAINT auteur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.auteur_id_seq OWNED BY public.auteur.id;

CREATE SEQUENCE public.langue_id_seq;

CREATE TABLE public.langue (
                id INTEGER NOT NULL DEFAULT nextval('public.langue_id_seq'),
                langue VARCHAR NOT NULL,
                code VARCHAR NOT NULL,
                CONSTRAINT langue_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.langue_id_seq OWNED BY public.langue.id;

CREATE SEQUENCE public.ouvrage_id_seq;

CREATE TABLE public.ouvrage (
                id INTEGER NOT NULL DEFAULT nextval('public.ouvrage_id_seq'),
                titre VARCHAR NOT NULL,
                photos VARCHAR NOT NULL,
                resume VARCHAR NOT NULL,
                langue_id INTEGER NOT NULL,
                editeur_id INTEGER NOT NULL,
                ISBN INTEGER NOT NULL,
                exemplaire INTEGER NOT NULL,
                CONSTRAINT ouvrage_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.ouvrage_id_seq OWNED BY public.ouvrage.id;

CREATE TABLE public.ouvrage_auteur (
                ouvrage_id INTEGER NOT NULL,
                auteur_id INTEGER NOT NULL,
                CONSTRAINT ouvrage_auteur_pk PRIMARY KEY (ouvrage_id, auteur_id)
);


CREATE TABLE public.ouvrage_genre (
                ouvrage_id INTEGER NOT NULL,
                genre_id INTEGER NOT NULL,
                CONSTRAINT ouvrage_genre_pk PRIMARY KEY (ouvrage_id, genre_id)
);


CREATE SEQUENCE public.utilisateur_id_seq;

CREATE TABLE public.utilisateur (
                id INTEGER NOT NULL DEFAULT nextval('public.utilisateur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                mail VARCHAR NOT NULL,
                password VARCHAR NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.utilisateur_id_seq OWNED BY public.utilisateur.id;

CREATE SEQUENCE public.pret_id_seq;

CREATE TABLE public.pret (
                id INTEGER NOT NULL DEFAULT nextval('public.pret_id_seq'),
                utilisateur_id INTEGER NOT NULL,
                ouvrage_id INTEGER NOT NULL,
                status_id INTEGER NOT NULL,
                date_debut DATE NOT NULL,
                date_fin VARCHAR NOT NULL,
                prolongation BOOLEAN NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.pret_id_seq OWNED BY public.pret.id;

ALTER TABLE public.pret ADD CONSTRAINT status_pret_fk
FOREIGN KEY (status_id)
REFERENCES public.status (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage_genre ADD CONSTRAINT genre_ouvrage_genre_fk
FOREIGN KEY (genre_id)
REFERENCES public.genre (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage ADD CONSTRAINT editeur_ouvrage_fk
FOREIGN KEY (editeur_id)
REFERENCES public.editeur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage_auteur ADD CONSTRAINT auteur_ouvrage_auteur_fk
FOREIGN KEY (auteur_id)
REFERENCES public.auteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage ADD CONSTRAINT langue_ouvrage_fk
FOREIGN KEY (langue_id)
REFERENCES public.langue (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pret ADD CONSTRAINT ouvrage_pret_fk
FOREIGN KEY (ouvrage_id)
REFERENCES public.ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage_genre ADD CONSTRAINT ouvrage_ouvrage_genre_fk
FOREIGN KEY (ouvrage_id)
REFERENCES public.ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.ouvrage_auteur ADD CONSTRAINT ouvrage_ouvrage_auteur_fk
FOREIGN KEY (ouvrage_id)
REFERENCES public.ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pret ADD CONSTRAINT utilisateur_pret_fk
FOREIGN KEY (utilisateur_id)
REFERENCES public.utilisateur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
