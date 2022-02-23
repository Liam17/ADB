create table Profile (
profileID int NOT NULL,
props int,
checkins int,
currentStatus int,
shooter int,
clutch int,
handle int,
posterizer int,
shotCreator int,
rimProtector int,

PRIMARY KEY (profileID),
FOREIGN KEY (profileID) REFERENCES Users(profileID)
);