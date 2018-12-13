-- User: "adm-biblio"
-- DROP USER "adm-biblio";

CREATE USER "adm-biblio" WITH
  LOGIN
  SUPERUSER
  INHERIT
  CREATEDB
  CREATEROLE
  REPLICATION;