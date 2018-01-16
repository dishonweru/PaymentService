CREATE USER 'ussd_app'@'localhost' IDENTIFIED BY 'ussd_app';

GRANT ALL PRIVILEGES ON * . * TO 'ussd_app'@'localhost';

GRANT ALL PRIVILEGES ON *.* TO 'ussd_app'@'%' IDENTIFIED BY 'ussd_app' WITH GRANT OPTION;