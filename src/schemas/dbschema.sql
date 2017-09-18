create database if not exists ibatis character set 'utf8';

use ibatis;

drop table if exists users;

create table users (
	id int not null comment '主键',
	username varchar(40) not null comment '用户名',
	password varchar(40) not null comment '密码',
	primary key(id)
) engine=InnoDB default charset=utf8 comment '用户表';
