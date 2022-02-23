create table CourtFollower(
courtID int,
profileID int,

PRIMARY KEY (courtID,profileID),
FOREIGN KEY (courtID) REFERENCES Court(courtID),
FOREIGN KEY (profileID) REFERENCES Users (profileID)

);