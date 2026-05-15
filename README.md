### Sobre o Projeto

Este projeto é um sistema simples de Chat em Grupo desenvolvido em Java para a disciplina de **Projeto Orientado a Objetos**. O seu principal objetivo é demonstrar a aplicação prática do padrão de desenho **Mediator** (Mediador).

**Como funciona?**
Num sistema comum, os utilizadores teriam de estar diretamente ligados entre si para trocar mensagens, o que cria um código complexo e difícil de manter (alto acoplamento). O padrão **Mediator** resolve este problema ao introduzir um elemento central: a **Sala de Chat**.

* **Os Utilizadores (Colaboradores):** Não comunicam diretamente uns com os outros. Eles apenas enviam as suas mensagens para a Sala de Chat.
* **A Sala de Chat (Mediador):** Recebe a mensagem de um utilizador e encarrega-se de a distribuir por todos os outros participantes.

Desta forma, garantimos que os objetos se mantêm independentes, resultando num código mais limpo, organizado e com **baixo acoplamento**.
