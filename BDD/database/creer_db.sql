--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.5
-- Dumped by pg_dump version 9.6.5

-- Started on 2019-01-06 21:08:53

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12387)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2172 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 186 (class 1259 OID 42205)
-- Name: auteur; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE auteur (
    nom character varying NOT NULL,
    prenom character varying,
    id integer NOT NULL
);


ALTER TABLE auteur OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 42265)
-- Name: auteur_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE auteur_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE auteur_id_seq OWNER TO postgres;

--
-- TOC entry 2173 (class 0 OID 0)
-- Dependencies: 189
-- Name: auteur_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE auteur_id_seq OWNED BY auteur.id;


--
-- TOC entry 187 (class 1259 OID 42216)
-- Name: emprunt; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE emprunt (
    date_emprunt date,
    date_retour date,
    id_livre bigint NOT NULL,
    id_utilisateur bigint NOT NULL,
    id integer NOT NULL,
    en_cours boolean,
    repousse boolean,
    statut character varying,
    recupere boolean,
    mail_sent boolean
);


ALTER TABLE emprunt OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 42289)
-- Name: emprunt_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE emprunt_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE emprunt_id_seq OWNER TO postgres;

--
-- TOC entry 2174 (class 0 OID 0)
-- Dependencies: 191
-- Name: emprunt_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE emprunt_id_seq OWNED BY emprunt.id;


--
-- TOC entry 185 (class 1259 OID 42194)
-- Name: livre; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE livre (
    titre character varying NOT NULL,
    id_auteur bigint NOT NULL,
    date_publication date,
    nb_exemplaires integer NOT NULL,
    id integer NOT NULL,
    disponible boolean
);


ALTER TABLE livre OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 42277)
-- Name: livre_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE livre_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE livre_id_seq OWNER TO postgres;

--
-- TOC entry 2175 (class 0 OID 0)
-- Dependencies: 190
-- Name: livre_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE livre_id_seq OWNED BY livre.id;


--
-- TOC entry 194 (class 1259 OID 42465)
-- Name: reservation; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE reservation (
    id integer NOT NULL,
    id_user integer,
    id_livre integer,
    date_reservation timestamp without time zone
);


ALTER TABLE reservation OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 42463)
-- Name: reservation_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE reservation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE reservation_id_seq OWNER TO postgres;

--
-- TOC entry 2176 (class 0 OID 0)
-- Dependencies: 193
-- Name: reservation_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE reservation_id_seq OWNED BY reservation.id;


--
-- TOC entry 188 (class 1259 OID 42224)
-- Name: utilisateur; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE utilisateur (
    nom character varying NOT NULL,
    prenom character varying NOT NULL,
    mail character varying,
    mdp character varying,
    id integer NOT NULL,
    rappel boolean
);


ALTER TABLE utilisateur OWNER TO postgres;

--
-- TOC entry 192 (class 1259 OID 42298)
-- Name: utilisateur_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE utilisateur_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE utilisateur_id_seq OWNER TO postgres;

--
-- TOC entry 2177 (class 0 OID 0)
-- Dependencies: 192
-- Name: utilisateur_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE utilisateur_id_seq OWNED BY utilisateur.id;


--
-- TOC entry 2030 (class 2604 OID 42267)
-- Name: auteur id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY auteur ALTER COLUMN id SET DEFAULT nextval('auteur_id_seq'::regclass);


--
-- TOC entry 2031 (class 2604 OID 42291)
-- Name: emprunt id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY emprunt ALTER COLUMN id SET DEFAULT nextval('emprunt_id_seq'::regclass);


--
-- TOC entry 2029 (class 2604 OID 42279)
-- Name: livre id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY livre ALTER COLUMN id SET DEFAULT nextval('livre_id_seq'::regclass);


--
-- TOC entry 2033 (class 2604 OID 42468)
-- Name: reservation id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reservation ALTER COLUMN id SET DEFAULT nextval('reservation_id_seq'::regclass);


--
-- TOC entry 2032 (class 2604 OID 42300)
-- Name: utilisateur id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY utilisateur ALTER COLUMN id SET DEFAULT nextval('utilisateur_id_seq'::regclass);


--
-- TOC entry 2037 (class 2606 OID 42269)
-- Name: auteur auteur_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY auteur
    ADD CONSTRAINT auteur_pkey PRIMARY KEY (id);


--
-- TOC entry 2039 (class 2606 OID 42293)
-- Name: emprunt emprunt_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY emprunt
    ADD CONSTRAINT emprunt_pkey PRIMARY KEY (id);


--
-- TOC entry 2035 (class 2606 OID 42281)
-- Name: livre livre_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY livre
    ADD CONSTRAINT livre_pkey PRIMARY KEY (id);


--
-- TOC entry 2043 (class 2606 OID 42470)
-- Name: reservation reservation_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reservation
    ADD CONSTRAINT reservation_pkey PRIMARY KEY (id);


--
-- TOC entry 2041 (class 2606 OID 42302)
-- Name: utilisateur utilisateur_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY utilisateur
    ADD CONSTRAINT utilisateur_pkey PRIMARY KEY (id);


--
-- TOC entry 2046 (class 2606 OID 42321)
-- Name: emprunt emprunt_id_livre_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY emprunt
    ADD CONSTRAINT emprunt_id_livre_fkey FOREIGN KEY (id_livre) REFERENCES livre(id);


--
-- TOC entry 2045 (class 2606 OID 42316)
-- Name: emprunt emprunt_id_utilisateur_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY emprunt
    ADD CONSTRAINT emprunt_id_utilisateur_fkey FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id);


--
-- TOC entry 2044 (class 2606 OID 42311)
-- Name: livre livre_id_auteur_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY livre
    ADD CONSTRAINT livre_id_auteur_fkey FOREIGN KEY (id_auteur) REFERENCES auteur(id);


--
-- TOC entry 2047 (class 2606 OID 42476)
-- Name: reservation reservation_livre_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reservation
    ADD CONSTRAINT reservation_livre_id_fk FOREIGN KEY (id_livre) REFERENCES livre(id);


--
-- TOC entry 2048 (class 2606 OID 42481)
-- Name: reservation reservation_utilisateur_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reservation
    ADD CONSTRAINT reservation_utilisateur_id_fk FOREIGN KEY (id_user) REFERENCES utilisateur(id);


-- Completed on 2019-01-06 21:08:56

--
-- PostgreSQL database dump complete
--

