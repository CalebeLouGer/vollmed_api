ALTER TABLE medicos
ADD COLUMN telefone VARCHAR(20);

UPDATE medicos
SET telefone = '000000000';

ALTER TABLE medicos
ALTER COLUMN telefone SET NOT NULL;
