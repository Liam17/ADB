create table Court(
courtID int NOT NULL,
courtName varchar(500) UNIQUE,
rating float,
courtAddress varchar(500),
followers int,
hypeLevel float,
numHoops int,
pickUp boolean,
lights boolean,
intensity int,
numReviews int,
PRIMARY KEY (courtID)
);