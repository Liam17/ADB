create table Users(
profileID int NOT NULL,
firstName varchar(500),
lastName varchar(500),
username varchar(500),
passcode varchar(500),
bio varchar(1000),
homeCourt varchar(500),
position varchar(500),
postalCode varchar(6),
email varchar(500),

PRIMARY KEY (profileID),
FOREIGN KEY (homeCourt) REFERENCES Court(courtName)
);