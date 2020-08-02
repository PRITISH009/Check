insert into sector (brief, sector_name) values ('Health Care Sector Brief', 'Health Care');
insert into sector (brief, sector_name) values ('Manufacturing Sector Brief', 'Manufacturing');
insert into sector (brief, sector_name) values ('Service Sector Brief', 'Service');
insert into sector (brief, sector_name) values ('Transportation Sector Brief', 'Transportation');
insert into sector (brief, sector_name) values ('Construction & Housing Sector Brief', 'Real Estate');

COMMIT;

insert into company (ceo, company_name, company_turn_over, write_up, sector_id) values ('Mukesh Ambani', 'Jio Platforms', 18632, 'Telecom Company', 3);
insert into company (ceo, company_name, company_turn_over, write_up, sector_id) values ('Ulf Mark Schneider', 'Nestle', 12615, 'Food & Beverage', 2);
insert into company (ceo, company_name, company_turn_over, write_up, sector_id) values ('Frefrick W. Smith', 'FedEx', 3012, 'Delievery Service', 4);
insert into company (ceo, company_name, company_turn_over, write_up, sector_id) values ('James D. Taichlet Jr.', 'American Tower', 3100, 'Real Estate Investment Trust', 5);
insert into company (ceo, company_name, company_turn_over, write_up, sector_id) values ('Arun Shawhney', 'Ranbaxy Laboratories', 8000, 'Pharmaceutical', 1); 

COMMIT;

insert into bod (first_name, last_name, company_id) values ('Anant', 'Ambani', 1);
insert into bod (first_name, last_name, company_id) values ('Pankaj', 'Powar', 1);
insert into bod (first_name, last_name, company_id) values ('Isha', 'Ambani', 1);
insert into bod (first_name, last_name, company_id) values ('Akash', 'Ambani', 1);

insert into bod (first_name, last_name, company_id) values ('Paul', 'Bulcke', 2);
insert into bod (first_name, last_name, company_id) values ('Henri', 'Castries', 2);
insert into bod (first_name, last_name, company_id) values ('Renato', 'Fassbind', 2);
insert into bod (first_name, last_name, company_id) values ('Pablo', 'Isla', 2);

insert into bod (first_name, last_name, company_id) values ('Marvin', 'Ellison', 3);
insert into bod (first_name, last_name, company_id) values ('Susan', 'Griffith', 3);
insert into bod (first_name, last_name, company_id) values ('John', 'Inglis', 3);
insert into bod (first_name, last_name, company_id) values ('Shirley', 'Jackson', 3);

insert into bod (first_name, last_name, company_id) values ('Thomas', 'Bratlet', 4);
insert into bod (first_name, last_name, company_id) values ('Robert', 'Hormats', 4);
insert into bod (first_name, last_name, company_id) values ('Raymond', 'Dolan', 4);
insert into bod (first_name, last_name, company_id) values ('Grace', 'Lieblein', 4);

insert into bod (first_name, last_name, company_id) values ('Akhiro', 'Watanabe', 5);
insert into bod (first_name, last_name, company_id) values ('Anthony', 'Wild', 5);
insert into bod (first_name, last_name, company_id) values ('Kazunori', 'Hirokawa', 5);
insert into bod (first_name, last_name, company_id) values ('Rajesh', 'Shah', 5);

COMMIT;