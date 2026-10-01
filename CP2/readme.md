# CP2 - FiapDelivery 

Projeto desenvolvido para o Check Point 2 da disciplina de Object-Oriented Programming.

## Objetivo
Diagnosticar e corrigir falhas em um código legado de um sistema, elevando-o aos padrões profissionais de Engenharia de Software.

## Refatorações Aplicadas
- **Clean Code:** Substituição de nomenclaturas confusas por nomes descritivos.
- **Encapsulamento:** Proteção de dados (atributos privados) e controle de acesso por construtores e métodos de acesso.
- **Herança:** Criação de uma super classe `Veiculo`, estendida pelas subclasses `Caminhao` e `Moto`, eliminando a duplicação de atributos estruturais.
- **Associação:** Reestruturação da classe `Rota` recebendo dependência da classe `Veiculo`, permitindo entregas com qualquer tipo de transporte.
---

*RM568438 Julia Yamazaki*