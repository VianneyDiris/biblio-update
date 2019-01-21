INSERT INTO public.auteur VALUES (1, 'J.R.R', 'Tolkien');
INSERT INTO public.auteur VALUES (2, 'Isaac', 'Azimov');
INSERT INTO public.auteur VALUES (3, 'Frank', 'Herbert');


INSERT INTO public.editeur VALUES (1, 'Pocket');
INSERT INTO public.editeur VALUES (2, 'Debolsillo');
INSERT INTO public.editeur VALUES (3, 'Folio');
INSERT INTO public.editeur VALUES (4, 'j''ai lu');


INSERT INTO public.genre VALUES (1, 'science fiction');
INSERT INTO public.genre VALUES (2, 'horreur');
INSERT INTO public.genre VALUES (3, 'polar');
INSERT INTO public.genre VALUES (4, 'heroic fantasy');
INSERT INTO public.genre VALUES (5, 'fantastique');


INSERT INTO public.langue VALUES (1, 'français', 'fr');
INSERT INTO public.langue VALUES (2, 'anglais', 'en');
INSERT INTO public.langue VALUES (3, 'espagnol', 'es');
INSERT INTO public.langue VALUES (4, 'italien', 'it');


INSERT INTO public.ouvrage VALUES (1, 'Le Seigneur des anneaux - tome 1 : La Fraternité de l''Anneau', 'rings.jpg', 'L''Anneau de Pouvoir, forgé par Sauron au cœur de la Montagne du Feu, dépositaire de son sombre pouvoir, est perdu. Nul ne sait ce qu''il est devenu depuis qu''un homme l''a arraché de la main du Seigneur Sombre et, ainsi, put chasser ce dernier hors du monde. 
Mais de noirs présages s''étendent à nouveau sur la Terre du Milieu, les créatures maléfiques se multiplient et, dans les Montagnes de Brume, les Orques traquent les Nains. L''ennemi veut récupérer son bien, son Maître le cherche partout et l''œil de Sauron est désormais pointé sur le Comté. 
Heureusement Gandalf le Gris les a devancés, s''ils font vite, lui et le petit Frodo parviendront peut-être à détruire l''Anneau à temps...', 1, 1, 9782266282369, 2);
INSERT INTO public.ouvrage VALUES (2, 'Intégrale Le Seigneur des Anneaux', 'lordofring.jpg', 'La Terre est peuplée d''innombrables créatures étranges. Les Hobbits, apparentés à l''homme, mais proches également des Elfes et des Nains, vivent en paix au nord-ouest de l''Ancien Monde, dans la Comté. Paix précaire et menacée, cependant, depuis que Bilbon Sacquet a dérobé au monstre Gollum l''anneau de Puissance jadis forgé par Sauron de Mordor. Car cet anneau est doté d''un pouvoir immense et maléfique. Il permet à son détenteur de se rendre invisible et lui confère une autorité sans limite.', 1, 1, 9782266232999, 3);
INSERT INTO public.ouvrage VALUES (3, 'Dune', 'dune.jpg', 'l n''y a pas, dans tout l''Empire, de planète plus inhospitalière que Dune. Partout des sables à perte de vue. Une seule richesse : l''épice de longue vie, née du désert, et que tout l''univers convoite.
Quand Leto Atréides reçoit Dune en fief, il flaire le piège. Il aura besoin des guerriers Fremen qui, réfugiés au fond du désert, se sont adaptés à une vie très dure en préservant leur liberté, leurs coutumes et leur foi.', 2, 2, 9788497596824, 1);
INSERT INTO public.ouvrage VALUES (4, 'Le cycle de Fondation, I : Fondation', 'fondation.jpg', 'Au début du 13e millénaire, l''Empire est à son apogée de sa puissance. Sa planète-capitale, Trantor, contrôle toute la galaxie, avec ses 25 millions de planètes habitées. C''est à ce moment-là qu''un mathématicien, du nom d''Hari Seldon, invente une nouvelle science : la psychohistoire. Cette dernière permet de prédire l''évolution de la société grâce aux mathématiques et donc l''avenir.', 1, 3, 9782070360536, 2);
INSERT INTO public.ouvrage VALUES (5, 'Le cycle des robots, Tome 1 : Les robots', 'robot.jpg', 'Première Loi : Un robot ne peut porter atteinte à un être humain ni, restant passif, laisser cet être humain exposé au danger. Deuxième Loi : Un robot doit obéir aux ordres donnés par les êtres humains, sauf si de tels ordres entrent en contradiction avec la Première Loi. Troisième Loi : Un robot doit protéger son existence dans la mesure où cette protection n''entre pas en contradiction avec la Première ou la Deuxième Loi.', 1, 4, 9782290055953, 3);


INSERT INTO public.ouvrage_auteur VALUES (1, 1);
INSERT INTO public.ouvrage_auteur VALUES (2, 1);
INSERT INTO public.ouvrage_auteur VALUES (3, 3);
INSERT INTO public.ouvrage_auteur VALUES (4, 2);
INSERT INTO public.ouvrage_auteur VALUES (5, 2);


INSERT INTO public.ouvrage_genre VALUES (1, 4);
INSERT INTO public.ouvrage_genre VALUES (2, 4);
INSERT INTO public.ouvrage_genre VALUES (3, 1);
INSERT INTO public.ouvrage_genre VALUES (3, 5);
INSERT INTO public.ouvrage_genre VALUES (4, 1);
INSERT INTO public.ouvrage_genre VALUES (5, 1);
INSERT INTO public.ouvrage_genre VALUES (5, 3);

INSERT INTO public.status VALUES (1, 'en cours');
INSERT INTO public.status VALUES (2, 'fini');


INSERT INTO public.utilisateur VALUES (1, 'Diris', 'Vianney', 'vianney.diris@gmail.com', '$2a$10$w9iwGdYfIDDeXhVU3W4uwuES14XcqM52DefVi3p5veESNYESOEHKG', true);
INSERT INTO public.utilisateur VALUES (2, 'deris', 'vianney', 'vianney.deris@gmail.com', '$2a$10$TWKGVpRdFRcew02zzQkzHelVqwaGv6b9fj.kixAKF6PgpKXTebZ0W', true);


INSERT INTO public.pret VALUES (1, 1, 5, 1, '2018-03-22', '2019-01-17', false, false);
INSERT INTO public.pret VALUES (2, 1, 3, 1, '2018-03-22', '2019-01-19', false, true);
INSERT INTO public.pret VALUES (3, 2, 2, 2, '2018-03-22', '2018-06-05', true, false);
INSERT INTO public.pret VALUES (4, 2, 1, 2, '2018-03-22', '2019-01-19', false, false);



INSERT INTO public.reservation VALUES (1, '2019-01-14', 1, 1, false, '2019-01-13');