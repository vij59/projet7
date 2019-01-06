--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.5
-- Dumped by pg_dump version 9.6.5

-- Started on 2019-01-06 21:16:26

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
-- TOC entry 2167 (class 0 OID 42205)
-- Dependencies: 186
-- Data for Name: auteur; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY auteur (nom, prenom, id) FROM stdin;
eric	monbaerts	1
thierry	adam	2
Nouvel	Auteur	3
\.


--
-- TOC entry 2180 (class 0 OID 0)
-- Dependencies: 189
-- Name: auteur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('auteur_id_seq', 3, true);


--
-- TOC entry 2166 (class 0 OID 42194)
-- Dependencies: 185
-- Data for Name: livre; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY livre (titre, id_auteur, date_publication, nb_exemplaires, id, disponible) FROM stdin;
guepes	1	2017-10-10	10	2	t
tortue	2	2010-10-10	7	3	t
fouines	1	2014-10-10	12	4	t
livre Test 2 exemplaires	3	2018-09-06	2	6	t
livre Test 1 exemplaire	3	2018-07-05	1	5	t
livre Test 0 exemplaires	2	2018-12-03	0	8	\N
\.


--
-- TOC entry 2169 (class 0 OID 42224)
-- Dependencies: 188
-- Data for Name: utilisateur; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY utilisateur (nom, prenom, mail, mdp, id, rappel) FROM stdin;
vij	ed	ed.vigier@gmail.com	losc	3	t
bill	cosby	jh	lokes	5	f
joe	jo	jokoker59@gmail.com	jooo	2	t
vij1	ed	jokoker@gmail.com	losc	4	t
Cocker	joe	jokoker5999@gmail.com	losc	1	t
\.


--
-- TOC entry 2168 (class 0 OID 42216)
-- Dependencies: 187
-- Data for Name: emprunt; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY emprunt (date_emprunt, date_retour, id_livre, id_utilisateur, id, en_cours, repousse, statut, recupere, mail_sent) FROM stdin;
2019-01-05	2019-01-05	3	2	118	f	f	rendu	t	\N
2019-01-05	2019-01-05	3	2	119	f	t	rendu	t	\N
2019-01-05	2019-01-05	5	2	120	f	f	rendu	t	\N
2019-01-06	2019-01-08	5	2	122	t	f	\N	t	t
2019-01-05	2019-01-09	5	4	121	t	\N		t	\N
2019-01-05	2019-01-05	3	2	117	f	f	rendu	t	\N
\.


--
-- TOC entry 2181 (class 0 OID 0)
-- Dependencies: 191
-- Name: emprunt_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('emprunt_id_seq', 122, true);


--
-- TOC entry 2182 (class 0 OID 0)
-- Dependencies: 190
-- Name: livre_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('livre_id_seq', 8, true);


--
-- TOC entry 2175 (class 0 OID 42465)
-- Dependencies: 194
-- Data for Name: reservation; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY reservation (id, id_user, id_livre, date_reservation) FROM stdin;
55	3	5	2019-01-06 15:40:53.521
\.


--
-- TOC entry 2183 (class 0 OID 0)
-- Dependencies: 193
-- Name: reservation_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('reservation_id_seq', 55, true);


--
-- TOC entry 2184 (class 0 OID 0)
-- Dependencies: 192
-- Name: utilisateur_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('utilisateur_id_seq', 5, true);


-- Completed on 2019-01-06 21:16:26

--
-- PostgreSQL database dump complete
--

