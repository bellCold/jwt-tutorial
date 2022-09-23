insert into "USERS" (username, password, nickname, activated) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 1);
insert into "USERS" (username, password, nickname, activated) values ('user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 1);

insert into AUTHORITY (authority_name) values ('ROLE_USER');
insert into AUTHORITY (authority_name) values ('ROLE_ADMIN');

insert into USER_AUTHORITY (user_id, authority_name) values (1, 'ROLE_USER');
insert into USER_AUTHORITY (user_id, authority_name) values (2, 'ROLE_USER');
insert into USER_AUTHORITY (user_id, authority_name) values (1, 'ROLE_ADMIN');
