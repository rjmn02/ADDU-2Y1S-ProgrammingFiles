CREATE TABLE IF NOT EXISTS
Customer(
    CUSTOMER_ID INT NOT NULL auto_increment, 
    lastname varchar(20),
    firstname varchar(20),
    phonenumber varchar(11),
    
    PRIMARY KEY (CUSTOMER_ID)
);

CREATE TABLE IF NOT EXISTS
Employee(
    EMPLOYEE_ID INT NOT NULL auto_increment,
    employee_lastname varchar(20),
    employee_firstname varchar(20),
    employee_phonenumber varchar(11),

    PRIMARY KEY(EMPLOYEE_ID)
);

CREATE TABLE IF NOT EXISTS
Salesperson(
    EMPLOYEE_ID INT NOT NULL,
    SALES_RECORD_ID INT NOT NULL,
    employee_lastname varchar(20),
    employee_firstname varchar(20),
    employee_phonenumber varchar(11),
    

    FOREIGN KEY (EMPLOYEE_ID) REFERENCES Employee(EMPLOYEE_ID),
    UNIQUE KEY (SALES_RECORD_ID),
    FOREIGN KEY (employee_lastname) REFERENCES Employee(employee_lastname),
    FOREIGN KEY (employee_firstname) REFERENCES Employee(employee_firstname),
    FOREIGN KEY (employee_phonenumber) REFERENCES Employee(employee_phonenumber),
);

CREATE TABLE IF NOT EXISTS
Sales_Record(
    SALES_RECORD_ID INT NOT NULL auto_increment,
    EMPLOYEE_ID INT NOT NULL,
    SERIAL_NUMBER INT NOT NULL,
    INVOICE_ID INT NOT NULL,
    CUSTOMER_ID INT NOT NULL,

    PRIMARY KEY (SALES_RECORD_ID),
    FOREIGN KEY (EMPLOYEE_ID) REFERENCES Salesperson(EMPLOYEE_ID),
    FOREIGN KEY (SERIAL_NUMBER) REFERENCES Car(SERIAL_NUMBER),
    FOREIGN KEY (INVOICE_ID) REFERENCES Invoice(INVOICE_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID),
    FOREIGN KEY (employee_lastname) REFERENCES Salesperson(employee_lastname),
    FOREIGN KEY (employee_firstname) REFERENCES Salesperson(employee_firstname),
    FOREIGN KEY (employee_phonenumber) REFERENCES Salesperson(employee_phonenumber),
);

CREATE TABLE IF NOT EXISTS
Invoice(
    INVOICE_ID INT NOT NULL auto_increment,
    SERIAL_NUMBER INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    CUSTOMER_ID INT NOT NULL,
    total_cost DOUBLE,
    date_issued DATE,

    PRIMARY KEY (INVOICE_ID),
    FOREIGN KEY (SERIAL_NUMBER) REFERENCES Car(SERIAL_NUMBER),
    FOREIGN KEY (EMPLOYEE_ID) REFERENCES Salesperson(EMPLOYEE_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID)
);

CREATE TABLE IF NOT EXISTS
Car(
    SERIAL_NUMBER INT NOT NULL auto_increment,
    CUSTOMER_ID INT NOT NULL,
    INVOICE_ID INT NOT NULL,
    brand varchar(20),
    model_year YEAR, 
    model varchar(20),
    variant varchar(20),
    price DOUBLE,
    PRIMARY KEY (SERIAL_NUMBER),
    FOREIGN KEY (INVOICE_ID) REFERENCES Invoice(INVOICE_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID)
);