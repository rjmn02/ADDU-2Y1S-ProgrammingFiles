CREATE TABLE IF NOT EXISTS 
payment_methods(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    airtable_id VARCHAR(100),
    issuing_bank VARCHAR(200),
    cardholder_name VARCHAR(200),
    card_last_four_digits VARCHAR(4)

),

it_team_member_statuses(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(200),
),

it_team_member_role(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(200),
),

it_team_member(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    airtable_id VARCHAR(100) NOT NULL,
    name VARCHAR(75) NOT NULL,
    status_id INT NOT NULL,
    FOREIGN KEY (status_id) REFERENCES it_team_member_statuses(id),
    email_address VARCHAR(500) NOT NULL,
    slack_member_id VARCHAR(200) NOT NULL,
    asana_user_id VARCHAR(200) NOT NULL,
    it_team_member_role_id INT NOT NULL,
    FOREIGN KEY (it_team_member_role_id) REFERENCES it_team_member_role(id)
),
