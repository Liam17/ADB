create table UserFollower(
profileID int NOT NULL,
followingID int NOT NULL,

PRIMARY KEY (profileID,followingID),
FOREIGN KEY (profileID) REFERENCES Users(profileID),
FOREIGN KEY (followingID) REFERENCES Users(profileID)

);