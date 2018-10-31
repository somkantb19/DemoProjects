create database users_database
create table UserProfile (
  UserProfileID int not null,
  UserProfileName varchar(40) not null,
  UserProfileGUID varchar(2) not null,
  Createddate datetime not null,
  CreatedName varchar (50) not null,
  UpdatedDate DATETIME not null,
  UpdatedName varchar(50),
  constraint pk_UserProfile primary key(UserProfileID)
  )
  
  create table UserProfileRevision (
  RevisionIDF int not null,
  UserProfileID int not null,
  FirstName varchar(30) not null,
  LastName varchar(20),
  MiddleName varchar(20) not null,
  Updateddate DATETIME not null,
  UpdatedName varchar(60) not null,
  constraint pk_UserProfileRevision primary key(RevisionIDF),
  constraint fk_UserProfileRevision foreign key (UserProfileID) references UserProfile(UserProfileID)
  
  )
  
  