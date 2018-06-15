create database meituan;
use meituan;
create table users(
	uid int primary key auto_increment,
	uphone varchar(11),
	upassword varchar(20),
	uheadportrait varchar(50),
	urole int
	)
	
create table store(
	sid int primary key foreign key references users(uid),
	sname varchar(50),
	saddress varchar(50),
	sphone varchar(11),
	stime varchar(8),
	sstate int,
	sfreight float,
	sstart float,
	smeantime int,
	slicence varchar(50),
	smaster varchar(50),
	stagid int,
	sstar float);
	
-------------------------------------------------------------------

create table store(
	sid int primary key,
	sname varchar(50),
	saddress varchar(50),
	sphone varchar(11),
	sstabusiness varchar(4),
	sendbusiness varchar(4),
	sstate int,
	sfreight float,
	sstart float,
	smeantime int,
	slicence varchar(50),
	smaster varchar(50),
	stagid int,
	sstar float);
	
create table dictionary(
	did int primary key,
	classify varchar(20),
	dstate varchar(20));