# Ticket #3 - Créer un batch de rappel des prêts arrivant bientôt à expiration
Création d'un batch pour les prêts arrivant à expiration



## Base de données
- Ajout d'un attribut boolean notification dans la table Pret
- Ajout d'un attribut boolean expiration dans la table Utilisateur

## Bibliotheque
- No update

## Annexe
- No update


## Batch
- création d'un nouveau Spring batch
- récupération de la liste des prêts en cours
- comparaison des dates de fin de réservation
- envoie des mails annonçant la fin prochaine des réservations