#FORTUNER + 3 variants
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Fortuner", "2.4 G Diesel 4x2", "MT", "SUV", "Diesel", 1736000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Fortuner", "2.4 V Diesel 4x2", "AT", "SUV", "Diesel", 1958000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Fortuner", "2.4 Q Diesel 4x2", "AT", "SUV", "Diesel", 2115000);


#INNOVA + 3 variants
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Innova", "2.8 J", "MT", "MPV", "Diesel", 1236000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Innova", "2.8 XE", "AT", "MPV", "Diesel", 1375000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Innova", "2.8 G", "MT", "MPV", "Diesel", 1572000);


#HILUX + 3 variants
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Hilux", "2.4 J DSL 4x2", "MT", "Pickup Truck", "Diesel", 989000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Hilux", "2.4 E DSL 4x2", "MT", "Pickup Truck", "Diesel", 1306000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Hilux", "2.4 G DSL 4x2", "AT", "Pickup Truck", "Diesel", 1460000);


#Vios + 3 variants
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "GR-S", "CVT", "Sedan", "Gasoline", 1055000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "1.5 G", "MT", "Sedan", "Gasoline", 946000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "1.3 XE", "CVT", "Sedan", "Gasoline", 769000);


#Corolla + 3 variants
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.6 E", "CVT", "Sedan", "Gasoline", 1135000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.6 G GR-S", "CVT", "Sedan", "Gasoline", 1302000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.8 GR-S Hybrid", "CVT", "Sedan", "Hybrid", 1730000);


#3 Mechanics
INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Jab", "Pablo", "09649636671", "Mechanic");
SET @ID = LAST_INSERT_ID();
INSERT INTO Mechanic(EMPLOYEE_ID)
VALUES (@ID);

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Gemoto", "Radzen", "09939813961", "Mechanic");
SET @ID = LAST_INSERT_ID();
INSERT INTO Mechanic(EMPLOYEE_ID)
VALUES (@ID);

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Ray", "Jhon", "09753612835", "Mechanic");
SET @ID = LAST_INSERT_ID();
INSERT INTO Mechanic(EMPLOYEE_ID)
VALUES (@ID);


#3 Salesperson
INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Wazowski", "Mike", "09726153921", "Salesperson");
SET @ID = LAST_INSERT_ID();
INSERT INTO Salesperson(EMPLOYEE_ID)
VALUES (@ID);

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Goodman", "Saul", "09872134523", "Salesperson");
SET @ID = LAST_INSERT_ID();
INSERT INTO Salesperson(EMPLOYEE_ID)
VALUES (@ID);

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Huh", "Yunjin", "09213423512", "Salesperson");
SET @ID = LAST_INSERT_ID();
INSERT INTO Salesperson(EMPLOYEE_ID)
VALUES (@ID);


#3 other Staff
INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Kim", "Chaewon", "09654378913", "Accountant");

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("White", "Walter", "09832512096", "Receptionist");

INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Pinkman", "Jesse", "09914562187", "Receptionist");


#10 customers
INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Dimagiba", "Gusion", "09114613892");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Wick", "John", "09653458010");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Trump", "Donald", "09138283693");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Pacquiao", "Manny", "09392838396");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Tesla", "Nikola", "09663429847");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Jordan", "Michael", "09664392748");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Babbage", "Charles", "09748392643");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Yeager", "Eren", "09473829346");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Ford", "Henry", "09653458010");

INSERT INTO Customer(lastname, firstname, phonenumber)
VALUES("Bolt", "Usain", "09564385100");

#CARPARTS
INSERT INTO Part(part_name, price)
VALUES("2015-CURRENT 2.4/2.8 FORTUNER UPPER CONTROL ARM LEFT", 5554.36);

INSERT INTO Part(part_name, price)
VALUES("2015-CURRENT 2.4/2.8 FORTUNER UPPER CONTROL ARM RIGHT", 5554.36);

INSERT INTO Part(part_name, price)
VALUES("2015-CURRENT 2.4/2.8 FORTUNER RADIATOR", 9496.17);

INSERT INTO Part(part_name, price)
VALUES("2020-CURRENT HILUX INTERCOOLER", 35132.51);

INSERT INTO Part(part_name, price)
VALUES("2020-CURRENT HILUX WEATHER SHIELDS", 3943.45);

INSERT INTO Part(part_name, price)
VALUES("2020-CURRENT HILUX POWER STEERING PUMP", 17924.75);

#https://www.carparts2u.com.au//files/results.php?par_make=TOYOTA&par_model=HILUX&par_year=23&par_category=&par_utility=&view=

#SET CUSTOMERID IN CAR;
UPDATE CAR
SET CUSTOMER_ID = 4
WHERE SERIAL_NUMBER = 9;

UPDATE CAR
SET CUSTOMER_ID = 7
WHERE SERIAL_NUMBER = 2;

UPDATE CAR
SET CUSTOMER_ID = 10
WHERE SERIAL_NUMBER = 11;

UPDATE CAR
SET CUSTOMER_ID = 5
WHERE SERIAL_NUMBER = 8;

UPDATE CAR
SET CUSTOMER_ID = 3
WHERE SERIAL_NUMBER = 5;

UPDATE CAR
SET CUSTOMER_ID = 1
WHERE SERIAL_NUMBER = 13;

UPDATE CAR
SET CUSTOMER_ID = 6
WHERE SERIAL_NUMBER = 7;

UPDATE CAR
SET CUSTOMER_ID = 2
WHERE SERIAL_NUMBER = 6;

UPDATE CAR
SET CUSTOMER_ID = 8
WHERE SERIAL_NUMBER = 1;

UPDATE CAR
SET CUSTOMER_ID = 9
WHERE SERIAL_NUMBER = 15;


#SERVICE
INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(1, "Part Replacement");
SET @SID1 = LAST_INSERT_ID();
INSERT INTO Part_Replacement_Summary(SERVICE_ID, PART_ID, part_quantity) #fortuner LCA
VALUES (@SID1, 1, 1);

INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(1, "Part Replacement");
SET @SID2 = LAST_INSERT_ID();
INSERT INTO Part_Replacement_Summary(SERVICE_ID, PART_ID, part_quantity) #fortuner LCA 
VALUES (@SID2, 2, 1);

INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(3, "Part Replacement");
SET @SID3 = LAST_INSERT_ID();
INSERT INTO Part_Replacement_Summary(SERVICE_ID, PART_ID, part_quantity) #hilus weather shields 
VALUES (@SID3, 6, 2);

INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(2, "Maintenance");
SET @SID4 = LAST_INSERT_ID();
INSERT INTO Maintenance(SERVICE_ID, maintenance_description)
VALUES (@SID4, "Oil Change");

INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(2, "Maintenance");
SET @SID5 = LAST_INSERT_ID();
INSERT INTO Maintenance(SERVICE_ID, maintenance_description)
VALUES (@SID5, "ECU Calibration");

INSERT INTO Service(MECHANIC_ID, service_type)
VALUES(3, "Maintenance");
SET @SID6 = LAST_INSERT_ID();
INSERT INTO Maintenance(SERVICE_ID, maintenance_description)
VALUES (@SID6, "Fuel Filter Change");


#Showroom Car 
INSERT INTO Showroom_Car(SERIAL_NUMBER)
VALUES(3);
INSERT INTO Showroom_Car(SERIAL_NUMBER)
VALUES(4);
INSERT INTO Showroom_Car(SERIAL_NUMBER)
VALUES(10);
INSERT INTO Showroom_Car(SERIAL_NUMBER)
VALUES(12);
INSERT INTO Showroom_Car(SERIAL_NUMBER)
VALUES(14);
INSERT INTO Showroom_Car(SERIAL_NUMBER, CUSTOMER_ID) #hilux
VALUES(8, 5);
INSERT INTO Showroom_Car(SERIAL_NUMBER, CUSTOMER_ID) #fortuner
VALUES(2, 7);


#Customer Car and service history
INSERT INTO Service_History(SERVICE_ID)
VALUES(1);
SET @SH_ID1 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #fortuner
VALUES(1, 8, @SH_ID1);

INSERT INTO Service_History(SERVICE_ID)
VALUES(4);
SET @SH_ID2 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #innova
VALUES(5, 3, @SH_ID2);

INSERT INTO Service_History(SERVICE_ID)
VALUES(4);
SET @SH_ID3 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #innova
VALUES(6, 2, @SH_ID3);

INSERT INTO Service_History(SERVICE_ID)
VALUES(3);
SET @SH_ID4 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #hilux
VALUES(7, 6, @SH_ID4);

INSERT INTO Service_History(SERVICE_ID)
VALUES(6);
SET @SH_ID5 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #hilux
VALUES(9, 4, @SH_ID5);

INSERT INTO Service_History(SERVICE_ID)
VALUES(5);
SET @SH_ID6 = LAST_INSERT_ID();
INSERT INTO Customer_Car(SERIAL_NUMBER, CUSTOMER_ID, SERVICE_HISTORY_ID) #vios
VALUES(11, 10, @SH_ID6);

#invoice
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(1, 1, 8, 1, 5554.36, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(4, 7, 2, 1958000, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(2, 4, 3, 5, 10000, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(2, 4, 2, 6, 10000, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(3, 3, 6, 7, 2*17924.75, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(4, 5, 8, 1306000, CURDATE());
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(,4,9);
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(,10,11);
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(,1,13);
INSERT INTO Invoice(EMPLOYEE_ID, SERVICE_ID, CUSTOMER_ID, SERIAL_NUMBER, total_cost, date_issued)
VALUES(,9,15);