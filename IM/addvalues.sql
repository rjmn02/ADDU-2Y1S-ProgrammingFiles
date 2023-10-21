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


