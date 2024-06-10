# Sistema de emprestimo de ferramentas
Este repositório se refere a A3 de soluções computacionais, cujo o sistema gerencia emprestimos de ferramentas

## :construction_worker: Equipe
- João Paulo Broering
- Lucas Feldman
- Gustavo Henrique de Simas Rosa

### Nomes utilizados nos commits

João Paulo Broering:
- jpbroering

Lucas Feldman:
- Lucas Feldman

Gustavo Henrique de Simas Rosa:
- S4tor11

## Requisitos
### Requisitos funcionais

RF001: O sistema deve permitir o cadastro de novas ferramentas.

RF002: O sistema deve permitir o cadastro dos amigos.

RF003 O sistema deve permitir registrar empréstimos uma ou mais ferramentas a um determinado amigo.

RF004: O sistema deve permitir registrar a data de empréstimo.

RF005: O sistema deve permitir registrar a data de devolução prevista ou efetiva.

RF006: O sistema deve, ao realizar um novo empréstimo, verificar se o amigo ainda possui ferramentas não devolvidas.
e notificar caso positivo.

RF007: O sistema deve permitir gerenciar e editar ferramentas, amigos e emprétimos depois de cadastrados.

RF008: O sistema deve permitir que o software tenha um relatório de ferramentas e o total ele gastou.

RF009: O sistema deve gerar um relatório que liste todos os empréstimos realizados e em andamento, incluindo quem fez mais emprestimo e quem nunca devolveu uma ferramenta.

#### Não será implementado:

RF0010:O sistema deve permitir o registro de algum evento para os amigos cadastrados.

RF011: O sistema deve integrar com o calendario online para compartilhar o evento.

### Requisitos não funcionais

RNF001: O software deve ser instalado e executado localmente no computador do tio-avô.

RNF002: O sistema irá ser programado em Java 1.8.0_241.

RNF003: O banco de dados usado será MySQL 8.0.37.

RFN004: O sistema deve notificar erros com mensagens de erro.

RNF005: O sistema operacional compatível é o Windows 10.

#### Não será implementado:

RNF006: O calendario online utilizado será o Google Calendar

### Regras de Negócio

RN001: Cada ferramenta deve estar associada a apenas a um emprestimo em andamento.

RN002: Cada amigo deve ter apenas um telefone associado.

#### Não será implementado:

RN003: O registro de eventos deve permitir convidar multiplos amigos.

RN004: O Google Calendar deve enviar lembretes para os amigos por email.

## :grey_exclamation: Config BD
user: root <br>
password: Unisul@1520
