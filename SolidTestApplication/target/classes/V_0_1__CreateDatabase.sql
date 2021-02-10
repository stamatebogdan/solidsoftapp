create schema if not exists telephone;

create table telephone.telephone_book(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(20) NOT NULL,
    Telephone VARCHAR(20) NOT NULL,
    Email VARCHAR(30) NOT NULL
);

insert into telephone.telephone_book (Name, Telephone, Email)
values ('Ana', '0732320424', 'ana@mail.ro'),
       ('Ion', '0732320424', 'ion@mail.ro'),
       ('Gigi', '0732320424', 'gigi@mail.ro');