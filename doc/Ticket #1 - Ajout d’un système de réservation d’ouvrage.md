# Ticket #1 - Ajout d’un système de réservation d’ouvrage!

Ajout d'une réservation pour les livres indisponibles à l'emprunt. 
La liste de réservation est limité à x2 le nombre d'exemplaires.
Impossible de réserver un livre en cours d'emprunt.
La réservation est supprimé si l'utilisateur emprunte le livre ou si il a ignoré la notification de 48h.


## Base de données
Ajout de la table "Reservation" avec comme attribut : 

|   champs             |type                          |utilisation                         |
|----------------|-------------------------------|-----------------------------|
|id|Integer |identifiant unique de réservation            |
|utilisateur_id |Integer  |  identifiant pour déterminer l'utilisateur        |
|ouvrage_id|Integer|identifiant pour déterminer l'ouvrage|
|date_reservation|Date|date de la réservation





## Bibliotheque
- Création du bean "Reservation".
- Création des interfaces "ReservationDao" et "ReservationManager".
- Création du rowmapper "ReservationRM".
- Ajout de la méthode "getReservationDao" dans l'interface "DaoFactory" et de la méthode "getReservationManager" dans l'interface "ManagerFactory".
- Création des implémentations des interfaces "ReservationDao" et "ReservationManager".
- Ajout des getter/setter dans l'implémentation des interfaces "DaoFactory" et "ManagerFactory".
- Ajout des beans dans les fichiers XML de Spring.
- Création du webService lié à la Réservation.

## Annexe
