--Versão 2: migrations para adicionar nova coluna "rank" ao banco de dados

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR (255);
