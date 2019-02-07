--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6 (Ubuntu 10.6-1.pgdg18.04+1)
-- Dumped by pg_dump version 10.6 (Ubuntu 10.6-1.pgdg18.04+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: marcador; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.marcador (
    idmarcador integer NOT NULL,
    descripcion text NOT NULL,
    latitud double precision NOT NULL,
    longitud double precision NOT NULL
);


ALTER TABLE public.marcador OWNER TO postgres;

--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.marcador_idmarcador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.marcador_idmarcador_seq OWNER TO postgres;

--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.marcador_idmarcador_seq OWNED BY public.marcador.idmarcador;


--
-- Name: user1; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.user1 (
    iduser integer NOT NULL,
    name text NOT NULL,
    email text NOT NULL,
    password text NOT NULL,
    birthday date NOT NULL
);


ALTER TABLE public.user1 OWNER TO postgres;

--
-- Name: user1_iduser_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.user1_iduser_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user1_iduser_seq OWNER TO postgres;

--
-- Name: user1_iduser_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.user1_iduser_seq OWNED BY public.user1.iduser;


--
-- Name: marcador idmarcador; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcador ALTER COLUMN idmarcador SET DEFAULT nextval('public.marcador_idmarcador_seq'::regclass);


--
-- Name: user1 iduser; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user1 ALTER COLUMN iduser SET DEFAULT nextval('public.user1_iduser_seq'::regclass);


--
-- Data for Name: marcador; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.marcador (idmarcador, descripcion, latitud, longitud) FROM stdin;
\.


--
-- Data for Name: user1; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.user1 (iduser, name, email, password, birthday) FROM stdin;
1	Ana	cani@ciencias.unam.mx	1234	1997-01-06
\.


--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marcador_idmarcador_seq', 1, false);


--
-- Name: user1_iduser_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user1_iduser_seq', 1, true);


--
-- Name: marcador marcador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcador
    ADD CONSTRAINT marcador_pkey PRIMARY KEY (idmarcador);


--
-- Name: user1 user1_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user1
    ADD CONSTRAINT user1_pkey PRIMARY KEY (iduser);


--
-- PostgreSQL database dump complete
--

