
CREATE TABLE IF NOT EXISTS
Employee(
    EMPLOYEE_ID INT NOT NULL auto_increment,
    employee_lastname varchar(20),
    employee_firstname varchar(20),
    employee_phonenumber varchar(11),

    PRIMARY KEY(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS
Cashier(
    CASHIER_ID INT NOT NULL auto_increment,
    EMPLOYEE_ID INT NOT NULL,

    PRIMARY KEY (CASHIER_ID),
    FOREIGN KEY (EMPLOYEE_ID) REFERENCES Employee(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS
Salesperson(
    SALESPERSON_ID INT NOT NULL auto_increment,
    EMPLOYEE_ID INT NOT NULL,

    PRIMARY KEY (SALESPERSON_ID),
    FOREIGN KEY (EMPLOYEE_ID) REFERENCES Employee(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS
Customer(
    CUSTOMER_ID INT NOT NULL auto_increment, 
    lastname varchar(20),
    firstname varchar(20),
    phonenumber varchar(11),

    PRIMARY KEY (CUSTOMER_ID)
);

CREATE TABLE IF NOT EXISTS
Showroom_Car(
    SERIAL_NUMBER INT NOT NULL auto_increment,
    CUSTOMER_ID INT NOT NULL,
    brand varchar(20),
    model_year YEAR, 
    model varchar(20),
    variant varchar(20),
    price DOUBLE,
    
    PRIMARY KEY (SERIAL_NUMBER),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID)
);

CREATE TABLE IF NOT EXISTS
Invoice(
    INVOICE_ID INT NOT NULL auto_increment,
    SALESPERSON_ID INT NOT NULL,
    CUSTOMER_ID INT NOT NULL,
    SERIAL_NUMBER INT NOT NULL, 
    total_cost DOUBLE,
    date_issued DATE,

    PRIMARY KEY (INVOICE_ID),
    FOREIGN KEY (SALESPERSON_ID) REFERENCES Salesperson(SALESPERSON_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID),
    FOREIGN KEY (SERIAL_NUMBER) REFERENCES Showroom_Car(SERIAL_NUMBER)
);




