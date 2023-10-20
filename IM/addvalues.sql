INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "GR-S", "CVT", "Sedan", "Gasoline", 1055000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "1.5 G", "MT", "Sedan", "Gasoline", 946000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Vios", "1.3 XE", "CVT", "Sedan", "Gasoline", 769000);

INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.6 E", "CVT", "Sedan", "Gasoline", 1135000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.6 G GR-S", "CVT", "Sedan", "Gasoline", 1302000);
INSERT INTO Car(model_year, brand, model, variant, transmission, body_type, fuel_type, price)
VALUES(2023, "Toyota", "Corolla Altis", "1.8 GR-S Hybrid", "CVT", "Sedan", "Hybrid", 1730000);

#Mechanics
INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Jab", "Pablo", "09649636671", "Mechanic")
SET @ID = LAST_INSERT_ID()
INSERT INTO Mechanic(EMPLOYEE_ID)
VALUES (@ID);
INSERT INTO Employee(employee_lastname, employee_firstname, employee_phonenumber, job_title)
VALUES("Jab", "Pablo", "09649636671", "Mechanic")
SET @ID = LAST_INSERT_ID()
INSERT INTO Mechanic(EMPLOYEE_ID)
VALUES (@ID);