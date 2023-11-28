CREATE TABLE IF NOT EXISTS

system_team_choices(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(30),
),

system_audit_statuses(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(30),
),

system_audit_frequencies(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(30),
),

system_statuses(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    description VARCHAR(30),
),

systems(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(ID),
    name VARCHAR(30) NOT NULL,
    description VARCHAR(500),
    service_start DATE NOT NULL,
    service_end DATE,
    status_id INT NOT NULL,
    FOREIGN KEY(status_id) REFERENCES system_statuses(id),
    audit_frequency_id INT NOT NULL,
    FOREIGN KEY(audit_frequency_id) REFERENCES system_audit_frequencies(id),
    last_id_audit DATE,
    next_id_audit DATE NOT NULL,
    --approver_id INT NOT NULL,
    --FOREIGN KEY(approver_id) REFERENCES,
    team_id INT NOT NULL,
    FOREIGN KEY(team_id) REFERENCES system_team_choices(id),
    video_sop_link VARCHAR(200),
    written_sop_link VARCHAR(200),
    flowchart_link VARCHAR(200),
    audit_status_id INT NOT NULL,
    FOREIGN KEY(audit_status_id) REFERENCES system_audit_statuses(id)
),

systems_approvers(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    system_id INT NOT NULL,
    FOREIGN KEY(system_id) REFERENCES systems(id),
    employee_id INT NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES employees(id),    

),

system_teams(
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    team_id INT NOT NULL,
    FOREIGN KEY(team_id) REFERENCES system_team_choices(id),
    system_id INT NOT NULL,
    FOREIGN KEY(system_id) REFERENCES systems(id)
),

system_components(
    id INT NOT NULL,
    PRIMARY KEY(id),
    component_id INT NOT NULL,
    FOREIGN KEY(component_id) REFERENCES components(id),
    system_id INT NOT NULL,
    FOREIGN KEY(system_id) REFERENCES systems(id),
)

