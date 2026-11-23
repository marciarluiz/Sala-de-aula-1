# Resolução do Estudo de Caso — Conecta Campus

**Disciplina:** Engenharia de Requisitos / Análise de Sistemas  
**Aluno:** João Batista Almeida
**Data:** 20 de Novembro de 2026  

---

## 1. Concepção

* **Qual problema o Conecta Campus pretende resolver?**  
  O Conecta Campus pretende resolver o problema da falta de centralização dos serviços acadêmicos e das dificuldades encontradas pelos alunos ao utilizar o sistema atual, que é lento e difícil de usar.

* **Qual é o seu principal objetivo?**  
  desenvolver uma plataforma que reúna os principais serviços acadêmicos em um único ambiente, permitindo que alunos, professores e coordenação acessem informações de maneira rápida,

---

## 2. Elicitação

* **Quem são os principais stakeholders?**
  * **Alunos:** precisam consultar notas, horários e receber avisos.
  * **Professores:** Precisam publicar materiais e comunicados.
  * **Coordenação Acadêmica:** Responsáveis por publicar eventos e comunicados gerais.
  * **Equipe de TI / Desenvolvedores:** Responsáveis por construir e manter a plataforma.
  * **Administração da Universidade:** responsável pelas regras, segurança e funcionamento do sistema.

* **Quais técnicas poderiam ser utilizadas para descobrir suas necessidades?**
 Entrevistas: conversar diretamente com alunos, professores e coordenadores para entender suas dificuldades, expectativas e necessidades em relação ao sistema.

Questionários: aplicar formulários aos alunos e professores para coletar opiniões sobre o sistema atual, identificar problemas frequentes e descobrir quais funcionalidades são mais importantes.

Observação: acompanhar usuários utilizando o sistema atual para identificar dificuldades de navegação, lentidão e problemas que talvez não sejam mencionados nas entrevistas.

---

## 3. Análise / Modelagem

### Requisitos Funcionais (RF)
RF01 = O sistema deve permitir que os alunos consultem suas notas acadêmicas.
RF02 =	O sistema deve permitir que os alunos consultem seus horários de aulas.
RF03 =	O sistema deve enviar avisos e notificações aos alunos.
RF04 =	O sistema deve permitir que os professores publiquem materiais didáticos.
RF05 = O sistema deve permitir que os professores publiquem comunicados.
RF06	= O sistema deve permitir que a coordenação divulgue eventos acadêmicos.
RF07 =	O sistema deve permitir que os usuários realizem login para acessar as informações acadêmicas.


### Requisitos Não Funcionais (RNF)
RNF01	O sistema deve apresentar tempo de resposta rápido durante as consultas.
RNF02	O sistema deve proteger as informações acadêmicas, permitindo acesso somente a usuários autenticados e autorizados.
RNF03	O sistema deve possuir uma interface simples e intuitiva, facilitando a navegação dos usuários.
---

## 4. Negociação (Matriz MoSCoW)

* **Must Have (Indispensável para o MVP / Lançamento):**
  * Autenticação e login seguro de usuários (alunos, professores, coordenação).
  * Consulta de notas e frequências pelos alunos.
  * Visualização da grade horária pelos alunos.
  * Publicação de materiais e avisos por parte dos professores.
  * Divulgação de comunicados e eventos pela coordenação.

* **Should Have (Importante, mas dá para lançar sem se o prazo apertar):**
  * Notificações *push* no celular ou aviso por e-mail quando uma nota/material for publicado.
  * Filtro de busca para materiais e comunicados antigos.

* **Could Have (Desejável para versões futuras):**
  * Modo escuro na interface.
  * Integração com calendário pessoal (ex: Google Agenda) para salvar horários de aula e eventos.

* **Won't Have (Fora do escopo da primeira versão):**
  * Chat em tempo real entre alunos e professores (descartado no MVP para não atrasar a entrega inicial, conforme decidido pela equipe).

---

## 5. Especificação

Transformando termos genéricos em requisitos mensuráveis:

* **Vago:** "O aplicativo deve ser rápido."  
  * **Especificado:** "O tempo de resposta do sistema para o carregamento da tela de notas e horários não deve ultrapassar 2 segundos para 95% das requisições simultâneas."


* **Vago:** "O aplicativo deve ser fácil de usar."  
  * **Especificado:** "Um usuário novo (aluno ou professor) deve ser capaz de realizar a consulta de notas ou publicação de um aviso em no máximo 3 cliques sem necessidade de treinamento prévio, alcançando taxa de sucesso de pelo menos 90% em testes de usabilidade."

---

## 6. Validação

Para garantir que o levantamento reflete o que os usuários realmente precisam, a equipe pode adotar as seguintes estratégias:

Prototipação: criar uma versão visual do sistema, mostrando telas de login, consulta de notas, horários e publicação de materiais. Apresentar o protótipo aos alunos, professores e coordenadores para verificar se a organização e as funcionalidades atendem às expectativas.

Reuniões de validação: reunir representantes dos alunos, professores e coordenação para apresentar os requisitos documentados. Durante a reunião, os participantes poderão apontar erros, sugerir melhorias e confirmar se as funcionalidades estão de acordo com suas necessidades.

Questionários de satisfação: após apresentar o protótipo, aplicar questionários para avaliar a facilidade de uso, a organização das informações e a importância das funcionalidades propostas.