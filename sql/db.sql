drop database if exists db_boot;
create database db_boot;

drop table if exists db_boot.user;
create table db_boot.user(
  id int(11) auto_increment primary key ,
  username varchar(255),
  password varchar(255)
);

# truncate db_boot.user;
# insert into db_boot.user value (null,'tom','123');
# insert into db_boot.user value (null,'jerry','456');

select * from db_boot.user;