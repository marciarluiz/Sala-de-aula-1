## Caso - 1. Concepção

O Conecta Campus pretende resolver o problema da dificuldade de acesso às informações e aos serviços acadêmicos, que atualmente estão distribuídos ou disponíveis em um sistema lento e pouco intuitivo.

Seu principal objetivo é centralizar os serviços acadêmicos em uma única plataforma, permitindo que alunos, professores e coordenadores acessem informações e realizem suas atividades de maneira mais rápida, prática e segura.

## 2. Elicitação

### 2.1. Principais stakeholders

- **Alunos:** precisam consultar notas, horários e receber avisos e comunicados.
- **Professores:** precisam publicar materiais e comunicados para os alunos.
- **Coordenação:** precisa divulgar eventos e informações acadêmicas.
- **Universidade:** responsável por estabelecer regras de segurança e garantir o acesso adequado às informações.
- **Equipe de desenvolvimento:** responsável por compreender as necessidades e desenvolver o sistema.

### 2.2. Técnicas de elicitação

**1. Entrevistas:** seriam realizadas conversas com alunos, professores e coordenadores para compreender suas dificuldades, necessidades e expectativas em relação ao sistema.

**2. Questionários:** seriam disponibilizados formulários para diferentes grupos de usuários, permitindo coletar opiniões sobre o sistema atual, identificar problemas frequentes e descobrir quais funcionalidades são mais importantes.

## 3. Análise e modelagem

### 3.1. Requisitos funcionais (RF)

- **RF01:** O sistema deve permitir que os alunos consultem suas notas.
- **RF02:** O sistema deve permitir que os alunos consultem seus horários de aula.
- **RF03:** O sistema deve permitir que os professores publiquem materiais acadêmicos.
- **RF04:** O sistema deve permitir que os professores publiquem comunicados.
- **RF05:** O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas.
- **RF06:** O sistema deve permitir que os usuários recebam notificações e avisos.
- **RF07:** O sistema deve permitir que os usuários realizem login para acessar as informações acadêmicas.

### 3.2. Requisitos não funcionais (RNF)

- **RNF01 — Desempenho:** O sistema deve carregar as principais informações acadêmicas em até 3 segundos, em condições normais de uso.
- **RNF02 — Segurança:** O sistema deve exigir autenticação para permitir o acesso às informações acadêmicas.
- **RNF03 — Usabilidade:** A interface deve ser simples e intuitiva, permitindo que os usuários encontrem as principais funcionalidades sem dificuldades.

## 4. Negociação — Técnica MoSCoW

**Must have (indispensável):**

- Consulta de notas e horários.
- Publicação de materiais e comunicados.
- Divulgação de eventos acadêmicos.
- Autenticação dos usuários.

Essas funcionalidades são essenciais porque atendem às principais necessidades dos usuários e garantem o funcionamento básico da plataforma.

**Should have (importante):**

- Sistema de notificações e avisos.

É importante para manter os alunos informados, mas o sistema ainda pode funcionar sem essa funcionalidade inicialmente.

**Could have (desejável):**

- Melhorias visuais e personalização da interface.

Esses recursos podem melhorar a experiência dos usuários, mas não são essenciais para o funcionamento inicial.

**Won't have (não será implementado na versão atual):**

- Chat entre alunos e professores.

Apesar de ser uma funcionalidade interessante, sua implementação pode aumentar a complexidade e atrasar a primeira versão. Por isso, poderá ser considerada em uma atualização futura.

## 5. Especificação

A frase "O aplicativo deve ser rápido, seguro e fácil de usar" pode ser transformada nos seguintes requisitos:

**RNF01 — Desempenho:** O sistema deve carregar as principais telas em até 3 segundos, considerando uma conexão de internet estável.

**Como testar:** realizar testes de desempenho medindo o tempo de carregamento das telas.

**RNF02 — Segurança:** O sistema deve exigir login e senha para permitir o acesso às informações acadêmicas, impedindo que usuários não autenticados visualizem esses dados.

**Como testar:** tentar acessar as informações acadêmicas sem realizar login e verificar se o acesso é bloqueado.

**RNF03 — Usabilidade:** Um usuário que nunca utilizou o sistema deve conseguir localizar suas notas em até 2 minutos, sem auxílio externo.

**Como testar:** solicitar que usuários realizem a tarefa e observar o tempo necessário para concluí-la.

## 6. Validação

**1. Revisão de requisitos:** os requisitos seriam apresentados aos alunos, professores e coordenadores para que verificassem se estão corretos, completos e de acordo com suas necessidades. Essa técnica permite identificar informações incorretas ou funcionalidades que foram esquecidas.

**2. Prototipação:** seria criada uma versão visual simplificada das telas do sistema, permitindo que os usuários simulassem tarefas como consultar notas, visualizar horários e publicar materiais. Dessa forma, seria possível identificar dificuldades de navegação e realizar ajustes antes do desenvolvimento.

# Estudo de Caso 2 — PetCare

## 1. Concepção

O PetCare pretende desenvolver um sistema para modernizar o atendimento de uma clínica veterinária. Atualmente, os agendamentos são realizados por telefone ou WhatsApp, e os registros dos animais ficam espalhados, dificultando o acesso às informações.

O sistema deverá facilitar o agendamento de consultas, organizar os históricos dos animais, enviar lembretes de vacinação e permitir que a clínica acompanhe seus atendimentos e resultados.

## 2. Elicitação

### 2.1. Principais stakeholders

- **Tutores:** responsáveis pelos animais, que desejam agendar consultas e receber lembretes.
- **Veterinários:** precisam consultar históricos, registrar diagnósticos e tratamentos.
- **Recepcionistas:** responsáveis por organizar horários, confirmar e cancelar consultas.
- **Gestores:** precisam acompanhar os atendimentos e consultar relatórios.
- **Equipe de desenvolvimento:** responsável por construir e manter o sistema.

### 2.2. Técnicas de elicitação

1. **Entrevistas:** conversar com tutores, veterinários, recepcionistas e gestores para identificar necessidades e dificuldades.
2. **Questionários:** coletar opiniões dos tutores sobre agendamentos, lembretes e funcionalidades desejadas.

## 3. Análise e modelagem

### 3.1. Requisitos funcionais (RF)

- **RF01:** O sistema deve permitir que tutores cadastrem seus animais.
- **RF02:** O sistema deve permitir que tutores agendem consultas pelo aplicativo.
- **RF03:** O sistema deve permitir que recepcionistas confirmem e cancelem agendamentos.
- **RF04:** O sistema deve permitir que veterinários consultem o histórico dos animais.
- **RF05:** O sistema deve permitir que veterinários registrem diagnósticos, tratamentos e medicamentos.
- **RF06:** O sistema deve enviar lembretes de vacinação aos tutores.
- **RF07:** O sistema deve permitir que gestores consultem relatórios de atendimentos.

### 3.2. Requisitos não funcionais (RNF)

- **RNF01:** O sistema deve apresentar uma interface simples e intuitiva.
- **RNF02:** O sistema deve proteger os dados dos tutores e dos animais contra acessos não autorizados.
- **RNF03:** O sistema deve apresentar bom desempenho durante os agendamentos e consultas de informações.

## 4. Negociação — Técnica MoSCoW

### Must Have (Deve ter)

- Cadastro dos animais.
- Agendamento de consultas.
- Consulta ao histórico dos animais.
- Registro de diagnósticos e tratamentos.
- Confirmação e cancelamento de consultas.

Essas funcionalidades são essenciais para o funcionamento da clínica e para organizar os atendimentos.

### Should Have (Deveria ter)

- Lembretes de vacinação.

São importantes para melhorar o acompanhamento da saúde dos animais, mas podem ser implementados após as funcionalidades principais.

### Could Have (Poderia ter)

- Relatórios gerenciais.
- Área para compartilhamento de fotos dos animais.

Podem agregar valor ao sistema, mas não são indispensáveis para sua primeira versão.

### Won't Have (Não terá nesta versão)

- Pagamentos pelo aplicativo.
- Chat entre tutores e veterinários.

Essas funcionalidades ficarão para versões futuras, pois podem aumentar a complexidade e o tempo de desenvolvimento.

## 5. Especificação — Requisitos não funcionais mensuráveis

- **RNF01 — Desempenho:** O sistema deve carregar as telas de agendamento em até 3 segundos em condições normais de uso. Isso poderá ser verificado por testes de desempenho.
- **RNF02 — Segurança:** Somente usuários autenticados e autorizados poderão acessar informações dos animais. Isso poderá ser verificado tentando acessar os dados sem realizar login ou utilizando uma conta sem permissão.
- **RNF03 — Usabilidade:** Um tutor que nunca utilizou o sistema deverá conseguir realizar um agendamento em até 2 minutos, sem receber ajuda. Isso poderá ser verificado por testes de usabilidade.

## 6. Validação

A validação dos requisitos será realizada por meio de:

1. **Revisão dos requisitos:** apresentar os requisitos aos tutores, veterinários, recepcionistas e gestores para confirmar se representam suas necessidades.
2. **Prototipação:** criar modelos das telas de cadastro, agendamento e histórico dos animais para que os usuários possam testar a navegação e sugerir melhorias.

## 7. Desafio — Escolha das cinco funcionalidades para a primeira versão

As cinco funcionalidades escolhidas para a primeira versão do PetCare são:

1. **Cadastro dos animais:** permite organizar as informações dos pacientes da clínica.
2. **Agendamento de consultas:** facilita a marcação de atendimentos pelos tutores.
3. **Confirmação e cancelamento de consultas:** ajuda a recepção a controlar os horários disponíveis.
4. **Consulta ao histórico dos animais:** permite que os veterinários acessem informações importantes sobre os pacientes.
5. **Registro de diagnósticos e tratamentos:** possibilita manter os dados clínicos organizados e atualizados.

Essas funcionalidades foram escolhidas porque atendem às necessidades mais importantes dos principais usuários e resolvem os problemas centrais da clínica.

Os tutores são beneficiados pelo agendamento mais simples. Os recepcionistas conseguem organizar melhor os horários, enquanto os veterinários passam a ter acesso às informações clínicas dos animais em um único local.

### Riscos de deixar outras funcionalidades para versões futuras

- **Lembretes de vacinação:** os tutores precisarão continuar acompanhando as datas manualmente, podendo esquecer vacinas importantes.
- **Pagamentos pelo aplicativo:** os pagamentos continuarão sendo realizados por outros meios, sem integração com o sistema.
- **Chat:** tutores e veterinários precisarão utilizar telefone ou WhatsApp para se comunicar.
- **Relatórios gerenciais:** os gestores terão menos recursos para acompanhar os resultados da clínica.
- **Compartilhamento de fotos:** os tutores não poderão enviar imagens dos animais diretamente pelo sistema.
