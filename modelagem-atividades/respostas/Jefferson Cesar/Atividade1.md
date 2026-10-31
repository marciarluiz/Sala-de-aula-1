## 1. Concepção 

O Conecta Campus pretende resolver o problema da falta de centralização dos serviços acadêmicos, pois atualmente os alunos enfrentam dificuldades para acessar informações, como notas, horários e avisos.

Seu principal objetivo é criar um sistema rápido, seguro e fácil de utilizar, reunindo as principais informações acadêmicas em um único lugar e facilitando a comunicação entre alunos, professores e coordenação.

## 2. Elicitação

Principais stakeholders:

Alunos: precisam consultar notas, horários e receber avisos.
Professores: precisam publicar materiais e comunicados.
Coordenação: precisa divulgar eventos e informações acadêmicas.
Universidade: exige segurança e controle de acesso às informações.
Equipe de desenvolvimento: responsável por construir e manter o sistema.

Técnicas de elicitação:

1. Entrevistas: conversar diretamente com alunos, professores e coordenadores para entender suas dificuldades e descobrir quais funcionalidades são mais importantes.

2. Questionários: aplicar perguntas para vários usuários, identificando quais problemas são mais frequentes e quais recursos eles gostariam de encontrar no sistema.

3. Observação: acompanhar como os usuários utilizam o sistema atual para identificar dificuldades e oportunidades de melhoria.

## 3. Análise e modelagem

Requisitos funcionais (RF):

RF01: O sistema deve permitir que os alunos consultem suas notas.
RF02: O sistema deve permitir que os alunos visualizem seus horários de aula.
RF03: O sistema deve permitir que os professores publiquem materiais de estudo.
RF04: O sistema deve permitir que os professores publiquem comunicados.
RF05: O sistema deve permitir que a coordenação divulgue eventos acadêmicos.
RF06: O sistema deve enviar avisos aos alunos.
RF07: O sistema deve permitir que os usuários realizem login para acessar as informações acadêmicas.

Requisitos não funcionais (RNF):

RNF01: O sistema deve carregar suas páginas principais em até 3 segundos em condições normais de uso.
RNF02: O sistema deve utilizar autenticação para impedir que pessoas não autorizadas acessem informações acadêmicas.
RNF03: O sistema deve apresentar uma interface simples, permitindo que os usuários encontrem as principais funcionalidades sem dificuldades.

## 4. Negociação — MoSCoW

Must have (indispensável):

Consultar notas e horários.
Publicar materiais e comunicados.
Divulgar eventos acadêmicos.
Realizar login e autenticação.

Essas funcionalidades são essenciais para atender às necessidades principais dos usuários e garantir a segurança das informações.

Should have (importante):

Envio de avisos e notificações aos alunos.

É importante para manter os alunos informados, mas o sistema ainda pode funcionar sem notificações automáticas na primeira versão.

Could have (desejável):

Melhorias visuais e personalização da interface.

São recursos interessantes, mas podem ser adicionados posteriormente.

Won't have (não será implementado nesta versão):

Chat entre alunos e professores.

Apesar de alguns professores terem solicitado essa funcionalidade, ela pode aumentar o tempo e a complexidade do desenvolvimento. Por isso, ficará para uma versão futura.

## 5. Especificação

A frase original é muito vaga. Para torná-la verificável, podemos definir os seguintes requisitos:

RNF01 — Desempenho: O sistema deve carregar suas páginas principais em até 3 segundos, em condições normais de uso.

Como testar: realizar testes de desempenho e medir o tempo de carregamento das páginas.

RNF02 — Segurança: O sistema deve exigir login e senha para permitir o acesso às informações acadêmicas.

Como testar: tentar acessar as informações sem realizar login e verificar se o acesso é bloqueado.

RNF03 — Usabilidade: Um usuário deve conseguir localizar suas notas em até 3 cliques, após realizar o login.

Como testar: solicitar que alguns alunos encontrem suas notas e observar a quantidade de cliques necessários.

## 6. Validação

A equipe pode utilizar as seguintes técnicas:

1. Reuniões de validação: apresentar os requisitos aos alunos, professores e coordenadores para verificar se as funcionalidades descritas correspondem às suas necessidades. Os participantes poderão sugerir alterações ou apontar informações que estejam faltando.

2. Protótipos: criar modelos visuais das telas do sistema e permitir que os usuários testem a navegação. Assim, será possível identificar dificuldades e verificar se a organização das funcionalidades está adequada.

------

Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

Principais stakeholders:

Tutores dos animais: precisam agendar consultas pelo celular e receber lembretes de vacinação.
Veterinários: precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
Recepcionistas: precisam organizar os horários disponíveis e confirmar ou cancelar consultas.
Gerência: precisa acompanhar a quantidade de atendimentos por meio de relatórios.
Proprietário da clínica: deseja melhorar a organização dos serviços e garantir que o sistema seja rápido, seguro e fácil de usar.
Equipe de desenvolvimento: responsável por desenvolver e manter o sistema.

Técnicas de elicitação:

1. Entrevistas: conversar com veterinários, recepcionistas e tutores para entender suas dificuldades atuais e descobrir quais funcionalidades são mais necessárias.

2. Observação: acompanhar o atendimento da clínica, observando como são realizados os agendamentos e como os profissionais consultam as fichas dos animais. Isso ajudará a identificar problemas no processo atual.

3. Questionários: aplicar perguntas aos tutores para descobrir quais recursos gostariam de utilizar, como agendamento pelo celular e lembretes de vacinação.

## 2. Análise e especificação de requisitos

Requisitos funcionais (RF):

RF01: O sistema deve permitir que os tutores realizem cadastro e login.
RF02: O sistema deve permitir que os tutores agendem consultas pelo celular.
RF03: O sistema deve permitir que a recepção confirme e cancele consultas.
RF04: O sistema deve permitir que os veterinários consultem o histórico dos animais.
RF05: O sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos.
RF06: O sistema deve enviar lembretes de vacinação aos tutores.
RF07: O sistema deve permitir que a gerência visualize relatórios de atendimentos realizados.

Requisitos não funcionais (RNF):

RNF01: As páginas principais do sistema devem carregar em até 3 segundos em condições normais de uso.
RNF02: O sistema deve exigir autenticação para permitir o acesso aos dados dos clientes e dos animais.
RNF03: O sistema deve apresentar uma interface simples, permitindo que um tutor consiga realizar um agendamento em até 5 minutos, sem ajuda de outra pessoa.

## 3. Negociação com MoSCoW

Must have (indispensável):

Cadastro e login dos usuários.
Agendamento de consultas.
Controle de horários disponíveis.
Consulta e registro do histórico dos animais.

Essas funcionalidades são essenciais para organizar os atendimentos e resolver os principais problemas da clínica.

Should have (importante):

Lembretes de vacinação.
Relatórios de atendimentos.

São funcionalidades importantes para melhorar o acompanhamento dos animais e a administração da clínica, mas podem ser desenvolvidas após as funções principais.

Could have (desejável):

Pagamentos pelo aplicativo.

Facilitaria a vida dos tutores, mas exigiria integração com serviços de pagamento, aumentando a complexidade do desenvolvimento.

Won't have (não será implementado nesta versão):

Chat com o veterinário.
Publicação de fotos dos animais.

Essas funcionalidades não são essenciais para o funcionamento inicial do sistema. Como o prazo é de apenas quatro meses, é melhor priorizar os recursos relacionados aos agendamentos e ao atendimento veterinário.

## 4. Especificação de requisitos não funcionais

RNF01 — Desempenho: O sistema deve carregar suas páginas principais em até 3 segundos em condições normais de uso.

Como testar: realizar testes de desempenho, medindo o tempo de carregamento das páginas.

RNF02 — Segurança: O sistema deve exigir login e senha para acessar informações pessoais dos tutores e históricos médicos dos animais.

Como testar: tentar acessar os dados sem autenticação e verificar se o sistema bloqueia o acesso.

RNF03 — Usabilidade: Um tutor deve conseguir realizar um agendamento em até 5 minutos, sem precisar de ajuda.

Como testar: pedir para alguns tutores realizarem um agendamento e medir o tempo necessário para concluir a tarefa.

## 5. Validação dos requisitos

A equipe pode utilizar duas técnicas principais:

1. Reuniões de validação: apresentar os requisitos aos tutores, veterinários, recepcionistas e gerência. Cada participante poderá verificar se suas necessidades foram atendidas e apontar possíveis erros ou funcionalidades que estejam faltando.

2. Prototipação: desenvolver modelos das telas do sistema, permitindo que os usuários testem funções como agendamento, consulta ao histórico e controle de horários. Dessa forma, a equipe poderá identificar problemas antes de iniciar o desenvolvimento.

Essas técnicas ajudam a garantir que o sistema seja desenvolvido de acordo com as expectativas dos envolvidos, evitando retrabalho.

## 6. Desafio — Priorização da primeira versão

Considerando o orçamento disponível e o prazo de quatro meses, escolheria as seguintes cinco funcionalidades para a primeira versão:

1. Cadastro e login dos usuários

Necessidade atendida: permitir que os usuários tenham acesso ao sistema de forma organizada e segura.
Beneficiados: tutores, veterinários e recepcionistas.
Justificativa: é necessário identificar os usuários e controlar o acesso às informações.

2. Agendamento de consultas

Necessidade atendida: permitir que os tutores marquem consultas pelo celular.
Beneficiados: tutores e recepcionistas.
Justificativa: resolve o problema dos agendamentos realizados exclusivamente por telefone e WhatsApp.

3. Controle de horários disponíveis

Necessidade atendida: organizar os horários e evitar conflitos entre consultas.
Beneficiados: recepcionistas, veterinários e tutores.
Justificativa: permite que a clínica tenha uma agenda organizada e facilite a marcação de consultas.

4. Histórico dos animais

Necessidade atendida: armazenar e consultar diagnósticos, tratamentos e medicamentos.
Beneficiados: veterinários e tutores.
Justificativa: substitui as fichas e arquivos separados, facilitando a localização das informações dos animais.

5. Lembretes de vacinação

Necessidade atendida: avisar os tutores sobre as datas de vacinação dos animais.
Beneficiados: tutores e veterinários.
Justificativa: ajuda a manter as vacinas em dia e melhora o acompanhamento da saúde dos animais.

Riscos de adiar as demais funcionalidades:

Pagamentos pelo aplicativo: os tutores continuarão realizando pagamentos pelos meios já utilizados pela clínica.
Chat com o veterinário: a comunicação continuará acontecendo por telefone ou WhatsApp.
Publicação de fotos: os usuários não poderão compartilhar fotos dos animais dentro do sistema.
Relatórios de atendimentos: a gerência poderá precisar continuar utilizando controles manuais temporariamente.

Mesmo com esses adiamentos, a primeira versão atenderá às necessidades mais importantes da clínica, permitindo organizar os agendamentos e melhorar o atendimento aos animais.

---

## Conclusão

A Engenharia de Requisitos é importante para compreender as necessidades dos usuários antes de iniciar o desenvolvimento de um sistema.

Nos dois estudos de caso, foi possível identificar os stakeholders, levantar requisitos funcionais e não funcionais, utilizar técnicas de elicitação e validação e priorizar funcionalidades com a técnica MoSCoW.

Com isso, a equipe consegue organizar melhor o desenvolvimento, evitar problemas e entregar um sistema que realmente atenda às necessidades dos usuários.