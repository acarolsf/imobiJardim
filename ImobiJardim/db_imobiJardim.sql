CREATE DATABASE imobiliariajardim;
USE imobiliariajardim;
 
 create table corretora(
    id_corretora int not null auto_increment,
    nome varchar(200),
    cidade varchar(200),
    telefone varchar(200),
    cnpj int,
    email varchar(200),
    primary key(id_corretora));
    
    
create table imovel(
    id_imovel int not null auto_increment ,
    id_corretora int,
    nome varchar(500),
    preco decimal (10,2),
    qtd_quarto int,
    qtd_banheiro int,
    qtd_comodos int,
    endereco varchar(200),
    cidade varchar(200),
    tipo varchar(50),
    status_imovel int,
    primary key (id_imovel),
    foreign key (id_corretora) references corretora(id_corretora));
    
create table usuario(
    login varchar(200),
    senha varchar(200),
    primary key(login));
 
 create table funcionario(
    cpf_func varchar(100),
    nome varchar(200),
    sexo varchar(30),
    data_nasc date,
    cidade varchar(200),
    telefone varchar(200),
    email varchar(200),
    salario decimal (10,2),
    primary key(cpf_func));
 
create table cliente(
    nome varchar(30),
    cpf_cli varchar(11),
    RG varchar(11),
    cidade varchar(30),
    telefone varchar(20),
    primary key(cpf_cli));
    
create table venda(
    id_venda int not null auto_increment,
    id_corretora int,
    preco float,
    data_venda date,
    cpf_cli varchar(11),
    primary key (id_venda),
    foreign key (cpf_cli) references cliente(cpf_cli),
    foreign key (id_corretora) references corretora(id_corretora));

 
insert into corretora(nome, cidade,telefone,email, cnpj)
    values ('Corretora ImoveiSerido', 'Jardim do Serido', '49215678', 'jardimoveis@corretora.com',
 '321456766');
insert into corretora(nome,cidade,telefone,email, cnpj)
    values ('Corretora Jardim Imoveis', 'Jardim do Serido', '43210078', 'jimoveis@corretora.com',
 '1234567890');
insert into corretora(nome,cidade,telefone,email, cnpj)
    values ('Corretora JardImoveis', 'Jardim do Serido', '49215678', 'jardimoveis@corretora.com',
 '321456754');
 
 select *
 from corretora;
 
 
insert into imovel (id_corretora , nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)
    values ('1' ,'Casa01','200000.00', '3', '2', '7', 'Florentino Cunha', 'Jardim do Serido', 'Casa');
insert into imovel (id_corretora , nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)
    values ('1', 'Casa02','250000.00', '4', '2','8', 'Doutor Medeiros', 'Jardim do Serido', 'Casa');
insert into imovel (id_corretora,nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)
    values ('2' ,'Casa03','150000.00', '2', '2',' 6', 'Maria Lins', 'Jardim do Serido', 'Casa');
insert into imovel (id_corretora,nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos,  endereco, cidade, tipo)
    values ('3' ,'Apartamento01','300000.00', '3', '2','7', 'Marechal Castelo Branco', 'Jardim do Serido', 'Apartamento');
insert into imovel (id_corretora ,nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)
    values ('3' ,'Apartamento02', '350000.00', '4', '2', '8', 'Doutor Fernandes', 'Jardim do Serido', 'Apartamento');
insert into imovel (id_corretora,nome, preco,qtd_quarto, qtd_banheiro, qtd_comodos, endereco, cidade, tipo)
    values ('2','Apartamento03', '250000.00', '2', '2', '6', 'Otavio Lamartine', 'Jardim do Serido', 'Apartamento');
 
 select *
 from imovel;
 
insert into usuario(login, senha)
    values ('imobiFuncionario', 'senha123');
    
insert into funcionario (cpf_func, nome, sexo, data_nasc, cidade, telefone, email, salario)
    values ( '22265584358','Sergiany Diniz','Feminino','1992-06-11', 'Jardim do Serido', '111222333',
'sergiany@gmail.com', '3500.00');
 
 
insert into cliente (nome, cpf_cli, RG, cidade, telefone)
    values ('Sergiany Diniz', '22265584358', '0001112', 'Jardim do Serido', '111222333');
insert into cliente (nome, cpf_cli, RG, cidade, telefone)
    values ('Sergianya Diniz', '22265584338', '0001133', 'Jardim do Serido', '111222311');
insert into cliente (nome, cpf_cli, RG, cidade, telefone)
    values ('Yasmin Diniz', '22265584311', '0051112', 'Jardim do Serido', '111222443');
insert into cliente (nome, cpf_cli, RG, cidade, telefone)
    values ('Alexandra', '22265584348', '0001116', 'Natal', '110022333');
 
 
insert into venda (id_corretora, preco, data_venda, cpf_cli)
    values ('2','341312.00', '2016-10-24', '22265584358');
insert into venda (id_corretora, preco, data_venda, cpf_cli)
    values ('1' ,'341312.00', '2016-10-21', '22265584338');
insert into venda (id_corretora, preco, data_venda, cpf_cli)
    values ('3','241312.00', '2016-10-22', '22265584311');
insert into venda (id_corretora, preco, data_venda, cpf_cli)
    values ('1','241333.00', '2016-10-12', '22265584348');
 
 
 select *
 from venda;
 


