create table Notifications(
notificationID int NOT NULL,
postID int NOT NULL,
profileID int NOT NULL,
notificationType int,
taggerProfileID int,

PRIMARY KEY (notificationID,postID,profileID),
FOREIGN KEY (profileID) REFERENCES Users(profileID)

);