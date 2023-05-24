create database LibaryManager
go
use LibaryManager
go

use master
drop database LibaryManager
go


create table account
(
	userName varchar(20) not null,
	name varchar(50),
	password varchar(20),
	secQuestion numeric,
	answer varchar(200),

	constraint PK_account primary key (userName),
)
go


create table publisher
(
	publisherID varchar(50) not null,
	name nvarchar(50),
	address nvarchar(200),
	email varchar(50),

	constraint PK_Publisher primary key (publisherID),

)
go


create table book
(
	bookID varchar(20) not null,
	title nvarchar(50),
	author nvarchar(50),
	price float,
	publisherID varchar(50),
	pages int,
	available int, 

	constraint PK_Book primary key (bookId),

	constraint FK_Book_Publisher foreign key (publisherID) references publisher(publisherID),
)
go


create table author
(
	bookID varchar(20) not null,
	authorName nvarchar(50) not null,
	email varchar(30),

	constraint PK_bookAuthor primary key (bookID,authorName),

	constraint FK_Author_Book foreign key (bookID) references book(bookID),
)
go



create table member
(
	memberID varchar(50) not null,
	address nvarchar(200),
	phone numeric,
	email varchar(30),
	registrationDate Date,
	constraint PK_member primary key (memberID),
)
go



create table bookLoans
(
	bookID varchar(20) not null,
	memberID varchar(50),
	dueDate date,
	dateOut date,

	constraint PK_borrowBy primary key (bookID,memberID),

	constraint FK_Borrow_Member foreign key (memberID) references member(memberID),
	constraint FK_Borrow_Book foreign key (bookID) references book(bookID),
)
go



create table bookReturn
(
	bookID varchar(20) not null,
	memberID varchar(50),
	returnDate date,

	constraint PK_ReturnBook primary key (bookID,memberID),

	constraint FK_Return_Member foreign key (memberID) references member(memberID),
	constraint FK_Return_Book foreign key (bookID) references book(bookID),
)
go
