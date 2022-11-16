CREATE USER 'wada'@'localhost' IDENTIFIED BY 'wada';
CREATE USER 'wada'@'%' IDENTIFIED BY 'wada';

GRANT ALL PRIVILEGES ON *.* TO 'wada'@'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'wada'@'%';

CREATE DATABASE wada DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;