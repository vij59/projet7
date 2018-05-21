--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.5
-- Dumped by pg_dump version 9.6.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

--
-- Data for Name: auteur; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY auteur (nom, prenom, id) FROM stdin;
eric	monbaerts	1
thierry	adam	2
\.


--
-- Name: auteur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('auteur_id_seq', 2, true);


--
-- Data for Name: livre; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY livre (titre, id_auteur, date_publication, nb_exemplaires, id, disponible) FROM stdin;
guepes	1	2017-10-10	10	2	t
tortue	2	2010-10-10	7	3	t
fouines	1	2014-10-10	12	4	t
\.


--
-- Data for Name: utilisateur; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY utilisateur (nom, prenom, mail, mdp, id) FROM stdin;
Cocker	joe	jokoker@gmail.com	losc	1
joe	jo	joo	jooo	2
vij	ed	ed.vigier@gmail.com	losc	3
\.


--
-- Data for Name: emprunt; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY emprunt (date_emprunt, date_retour, id_livre, id_utilisateur, id, en_cours, repousse) FROM stdin;
2018-04-18	2018-11-19	4	2	10	t	t
2018-05-01	2018-05-03	3	3	25	t	f
2018-05-01	2018-05-04	3	3	26	t	f
2018-05-01	2018-05-02	3	3	24	t	t
2018-04-21	2018-08-21	2	1	5	t	t
2018-04-18	2018-08-19	3	2	11	t	t
\.


--
-- Name: emprunt_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('emprunt_id_seq', 26, true);


--
-- Name: livre_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('livre_id_seq', 4, true);


--
-- Name: utilisateur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('utilisateur_id_seq', 3, true);


--
-- PostgreSQL database dump complete
--

