INSERT INTO team (id, name,description) VALUES (1, 'Liverpool','The reds');
INSERT INTO team (id, name,description) VALUES (2, 'Manchester city','Cityzens');
INSERT INTO team (id, name,description) VALUES (3, 'Arsenal','Gunners');
INSERT INTO team (id, name,description) VALUES (4, 'Manchester United','Red devils');
INSERT INTO team (id, name,description) VALUES (5, 'Tottenham Hotspur','Lilywhites');
INSERT INTO team (id, name,description) VALUES (6, 'Chelsea','Blues');


INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (1, '28','Sadio','Mane','0','1');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (2, '28','Mohamed','Salah','0','1');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (3, '28','Roberto','Firminho','1','1');

INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (4, '28','Riyad','Mahrez','0','2');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (5, '28','Sterling','Raheem','0','2');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (6, '28','Gabriel','Jesus','1','2');

INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (7, '28','Aubemeyang','Pierr','0','3');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (8, '28','Lacazett','Alex','0','3');
INSERT INTO player (id, age,first_name,last_name,is_injured,team_id) VALUES (9, '28','Smith','Row','1','3');



INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (1, SYSDATE(),'3','0','1','1','2');

INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (2, SYSDATE(),'3','0','1','3','4');

INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (3, SYSDATE(),'3','0','1','5','6');


INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (4, SYSDATE()+1,'0','0','0','1','2');

INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (5, SYSDATE()+1,'0','0','0','3','4');

INSERT INTO fixture (id,date_played, home_team_score,away_team_score,played,team_away_id,team_home_id)
VALUES (6, SYSDATE()+1,'0','0','0','5','6');