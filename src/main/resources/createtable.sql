-- Table: public.giituser

-- DROP TABLE IF EXISTS public.giituser;

CREATE TABLE IF NOT EXISTS public.giituser
(
    userid SERIAL,
    username character varying(100) NOT NULL,
    useremail character varying(100) NOT NULL UNIQUE,
    useraddedon date NOT NULL,
    CONSTRAINT giituser_pkey PRIMARY KEY (userid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.giituser
    OWNER to postgres;