alter table consultas 
add column cancelada boolean not null default false;

alter table consultas 
add column motivo_cancelamento varchar(255);
