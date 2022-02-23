create table Post(
profileID int NOT NULL,
postID int NOT NULL,
courtID int NOT NULL,
postType varchar(500),
description varchar(500),
body varchar(500),
props int,
shooter int,
clutch int,
handle int,
posterizer int,
shotCreator int,
rimProtector int,

PRIMARY KEY (profileID,postID,courtID),
FOREIGN KEY (profileID) REFERENCES Users(profileID),
FOREIGN KEY (courtID) REFERENCES Court(courtID)
);