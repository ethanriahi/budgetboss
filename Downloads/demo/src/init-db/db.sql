-- Création de la table "users"
CREATE TABLE if not exists users (
    identity VARCHAR(255),
    mailAdress VARCHAR(255),
    numberPhone VARCHAR(255),
    dateOfBirth DATE,
    username VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    idUser SERIAL PRIMARY KEY
    );