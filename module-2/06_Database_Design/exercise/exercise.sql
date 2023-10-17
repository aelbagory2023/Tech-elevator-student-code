
CREATE TABLE event (
	event_number int NOT NULL,
	name varchar(50),
	description varchar(50),
	start_date_and_time TIMESTAMP,
	duration int ,
	group_number int NOT NULL UNIQUE,
	PRIMARY KEY (event_number),
	FOREIGN KEY (group_number) REFERENCES interest_group(group_number)
);

CREATE TABLE interest_group (
    group_number int NOT NULL UNIQUE,
	name varchar(50) UNIQUE,
	PRIMARY KEY (group_number)
);
 CREATE TABLE member (
     member_number int NOT NULL,
	 last_name varchar(50),
	 first_name varchar(50),
	 email_address varchar(50),
	 phone_number varchar(50),
	 date_of_birth date,
	 does_want_reminder_emails boolean,
	 PRIMARY KEY (member_number)
	 
 );
CREATE TABLE group_event (
    event_number int NOT NULL,
	group_number int NOT null,
	PRIMARY KEY (event_number),
	FOREIGN KEY (group_number) REFERENCES group(group_number)
);
CREATE TABLE member_event (
    event_number int NOT NULL,
	member_number int NOT null,
	PRIMARY KEY (event_number),
	FOREIGN KEY (member_number) REFERENCES member(member_number)
);
CREATE TABLE member_group (
    member_number int NOT NULL,
	group_number int NOT null,
	PRIMARY KEY (member_number),
	FOREIGN KEY (group_number) REFERENCES group(group_number)
);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (1,'Micheal','Chase','chase.micheal@gmail.com','216-758-4875','04/05/1992',true);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (2,'Harris','Patrick','p.harris1@gmail.com','440-580-5679','09/25/1986',true);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (3,'Savage','John','john.sav23@gmail.com','330-276-7009','01/15/1966',false);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (4,'Long','Peter','peter.long1@gmail.com','799-210-8979','12/25/1996',true);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (5,'Johnson','Mikayla','mjohnson@gmail.com','216-150-2227','02/23/1991',true);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (6,'Livingston','Armond','alivingston1999@gmail.com','216-459-8279','02/19/1999',false);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (7,'Toretto','Domonic','domt23@gmail.com','719-273-9979','06/14/1979',false);

INSERT INTO member (member_number,last_name,first_name,email_address,phone_number,date_of_birth,does_want_reminder_emails)
VALUES (8,'Obama','Michelle','michelleo21@gmail.com','719-299-4523','03/17/1989',true);

INSERT INTO interest_group (group_number,name)
VALUES (1,'Alpha Group')

INSERT INTO interest_group (group_number,name)
VALUES (2,'Zed Group')

INSERT INTO interest_group (group_number,name)
VALUES (3,'Beta Group')

INSERT INTO interest_group (group_number,name)
VALUES (4,'Gamma Group')

INSERT INTO event (event_number,name,description,start_date_and_time,duration,group_number)
VALUES (1,'Disney Tech Meet','A Disney technology meetup for all',02/15/2023 12:30:00, 100, 1)
				  
INSERT INTO event (event_number,name,description,start_date_and_time,duration,group_number)
VALUES (2,'Sony Tech Meet','A Sony technology meetup for all',08/25/2023 01:30:00, 120, 2)

INSERT INTO event (event_number,name,description,start_date_and_time,duration,group_number)
VALUES (3,'Apple Tech Meet','A Apple technology meetup for all',09/11/2023 01:30:00, 90, 3)
			
INSERT INTO event (event_number,name,description,start_date_and_time,duration,group_number)
VALUES (4,'Microsoft Tech Meet','A Microsoft technology meetup for all',06/19/2023 05:30:00, 65, 4)
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  )