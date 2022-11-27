CREATE TABLE countries(
    `id` INTEGER PRIMARY KEY,
    `name` VARCHAR(20)
);

CREATE TABLE login(
    `id` INTEGER PRIMARY KEY,
    `password` VARCHAR(60),
    `status` VARCHAR(10)
);

CREATE TABLE user_details(
    `id` INTEGER PRIMARY KEY,
    `login_id` INTEGER,
    `name` VARCHAR(60),
    `contact_number` VARCHAR(20),
    `type` VARCHAR(10),
    FOREIGN KEY(`login_id`) REFERENCES login(`id`)
);

CREATE TABLE permission(
    `id` INTEGER PRIMARY KEY,
    `user_id` INTEGER,
    `permission_level` INTEGER,
    FOREIGN KEY(`user_id`) REFERENCES user_details(`id`)
);

INSERT INTO countries (id,name) VALUES (1, 'USA');
INSERT INTO countries (id,name) VALUES (2, 'France');
INSERT INTO countries (id,name) VALUES (3, 'Brazil');
INSERT INTO countries (id,name) VALUES (4, 'Italy');
INSERT INTO countries (id,name) VALUES (5, 'Canada');

INSERT INTO login (id,password,status) VALUES (1,'123456','active');
INSERT INTO login (id,password,status) VALUES (2,'abcdefg','inactive');
INSERT INTO login (id,password,status) VALUES (3,'123456abcd','active');
INSERT INTO login (id,password,status) VALUES (4,'abcd123456','inactive');
INSERT INTO login (id,password,status) VALUES (5,'123abc456def','active');

INSERT INTO user_details (id, login_id,name,contact_number,type) VALUES (1,2,'user1','07421725429','admin');
INSERT INTO user_details (id, login_id,name,contact_number,type) VALUES (2,4,'user2','13276606235','user');
INSERT INTO user_details (id, login_id,name,contact_number,type) VALUES (3,3,'user3','07422234429','user');
INSERT INTO user_details (id, login_id,name,contact_number,type) VALUES (4,5,'user4','07234343429','user');
INSERT INTO user_details (id, login_id,name,contact_number,type) VALUES (5,1,'user5','07433725429','user');

INSERT INTO permission (id,user_id,permission_level) VALUES (1,2,3);
INSERT INTO permission (id,user_id,permission_level) VALUES (2,1,5);
INSERT INTO permission (id,user_id,permission_level) VALUES (3,3,2);
INSERT INTO permission (id,user_id,permission_level) VALUES (4,5,1);
INSERT INTO permission (id,user_id,permission_level) VALUES (5,4,3);