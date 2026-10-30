# Atividade 1 — Engenharia de Requisitos

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção:
O Conecta Campus pretende resolver o problema da falta de centralização dos serviços acadêmicos, além da lentidão e da dificuldade de uso do sistema atual. Seu principal objetivo é reunir em uma única plataforma informações como notas, horários, materiais, comunicados e eventos, facilitando a comunicação entre alunos, professores e coordenação.

### 2. Elicitação:
Os principais stakeholders são:
- Alunos: Precisam consultar notas, horários e avisos de maneira rápida e fácil.
- Professores: Precisam publicar materiais e comunicados.
- Coordenação: Precisa divulgar eventos e informações acadêmicas.
- Universidade: Exige segurança e acesso autenticado às informações acadêmicas.
- Equipe de desenvolvimento: Responsável por desenvolver o sistema conforme as necessidades identificadas.

Duas técnicas de elicitação que poderiam ser utilizadas são: Entrevistas, visando conversar com alunos, professores e coordenadores para compreender suas necessidades, dificuldades e expectativas em relação ao sistema, e questionários para disponibilizar perguntas para vários usuários, identificando quais funcionalidades são mais importantes e quais dificuldades encontram no sistema atual.

### 3. Análise e modelagem: 
Requisitos funcionais (RF):
- RF01: O sistema deve permitir que os alunos consultem suas notas.
- RF02: O sistema deve permitir que os alunos consultem seus horários acadêmicos.
- RF03: O sistema deve permitir que os professores publiquem materiais de estudo.
- RF04: O sistema deve permitir que professores e coordenação publiquem comunicados.
- RF05: O sistema deve permitir que a coordenação divulgue eventos acadêmicos.
- RF06: O sistema deve permitir que os alunos recebam avisos acadêmicos.
- RF07: O sistema deve permitir que os usuários realizem login para acessar as informações acadêmicas.
  
Requisitos não funcionais (RNF):
- RNF01 (Desempenho): O sistema deve apresentar as principais informações acadêmicas em até 3 segundos, em condições normais de uso.
- RNF02 (Segurança): O sistema deve exigir autenticação para acessar informações acadêmicas restritas.
- RNF03 (Usabilidade): Os usuários devem conseguir consultar notas e horários em até 3 etapas após realizar o login.

### 4. Negociação:
- Must have (indispensável): Consulta de notas e horários, publicação de materiais e comunicados, divulgação de eventos, recebimento de avisos e autenticação. Essas funcionalidades atendem às necessidades principais dos usuários e aos requisitos de segurança da universidade.
- Should have (importante): Melhorias na navegação e na organização das informações, pois facilitam o uso do sistema, embora possam ser implementadas gradualmente.
- Could have (desejável): Personalização dos avisos e outras opções adicionais de conveniência, caso haja tempo e recursos disponíveis.
- Won't have (fora da versão atual): Chat entre alunos e professores. Apesar de ser interessante, poderá ser desenvolvido em uma versão futura para não atrasar a primeira entrega.

### 5. Especificação:
- RNF01 (Desempenho): As principais páginas do sistema devem carregar em até 3 segundos em pelo menos 95% das solicitações, sob condições normais de uso.

Teste: Realizar vários acessos às páginas e medir o tempo de carregamento.

- RNF02 (Segurança): O sistema deve exigir login antes de permitir o acesso a notas, horários e outras informações acadêmicas restritas.

Teste: Tentar acessar essas informações sem estar autenticado e verificar se o sistema bloqueia o acesso.

- RNF03 (Usabilidade): Um usuário que já realizou o login deve conseguir consultar suas notas em até 3 etapas, sem ajuda externa.
  
Teste: Solicitar que usuários realizem a consulta e verificar a quantidade de etapas e se conseguem concluir a tarefa.

### 6. Validação: 
A equipe poderia utilizar as seguintes técnicas:

- Revisão dos requisitos: Apresentar os requisitos documentados aos alunos, professores e coordenadores para verificar se estão corretos, completos e de acordo com suas necessidades.
- Prototipação: Criar telas de exemplo do sistema para que os usuários possam visualizar e testar a navegação antes do desenvolvimento. Assim, seria possível identificar dificuldades e solicitar ajustes.
- Reuniões de validação: Reunir os representantes dos diferentes grupos para discutir os requisitos, resolver divergências e aprovar as funcionalidades da primeira versão.


## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders:
Os principais stakeholders do PetCare são:

- Tutores dos animais: Precisam agendar consultas pelo celular e receber lembretes de vacinação.
- Veterinários: Precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- Recepção: Precisa organizar os horários disponíveis e confirmar ou cancelar consultas.
- Gerência: Precisa acompanhar a quantidade de atendimentos realizados por meio de relatórios.
- Proprietário da clínica: Deseja melhorar a organização dos serviços e disponibilizar o sistema dentro do prazo de quatro meses.
- Equipe de desenvolvimento: Precisa compreender as necessidades para planejar e desenvolver o sistema.
  
Duas técnicas de elicitação que seriam utilizadas são:
- Entrevistas: Conversar com veterinários, recepcionistas, tutores e gerência para entender como os processos funcionam atualmente e quais problemas precisam ser resolvidos.
- Observação: Acompanhar a rotina da clínica, observando como são realizados os agendamentos, os registros dos animais e o atendimento. Isso ajudaria a identificar dificuldades que talvez não fossem mencionadas nas entrevistas.

### 2. Análise e especificação de requisitos: 
Requisitos funcionais (RF):

- RF01: O sistema deve permitir que os tutores agendem consultas pelo celular.
- RF02: O sistema deve permitir que a recepção consulte os horários disponíveis e confirme ou cancele consultas.
- RF03: O sistema deve permitir que os veterinários consultem o histórico dos animais.
- RF04: O sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos.
- RF05: O sistema deve enviar lembretes de vacinação aos tutores.
- RF06: O sistema deve gerar relatórios com a quantidade de atendimentos realizados.
- RF07: O sistema deve permitir o cadastro dos tutores e de seus animais.
  
Requisitos não funcionais (RNF):
- RNF01 (Desempenho): O sistema deve apresentar os resultados das consultas e dos agendamentos em até 3 segundos em pelo menos 95% das solicitações, sob condições normais de uso.
- RNF02 (Segurança): O sistema deve exigir autenticação para acessar informações dos clientes e históricos dos animais, permitindo que cada usuário acesse somente as funcionalidades autorizadas para seu perfil.
- RNF03 (Usabilidade): Um tutor deve conseguir realizar um agendamento em até 5 etapas após entrar no sistema, sem ajuda externa.

### 3. Negociação com MoSCoW
- Must have (indispensável): Cadastro de tutores e animais, agendamento de consultas, controle dos horários, consulta ao histórico dos animais e registro de diagnósticos e tratamentos. Essas funcionalidades são essenciais para organizar os atendimentos e substituir os processos manuais.
- Should have (importante): Lembretes de vacinação e relatórios de atendimentos. São funcionalidades importantes para melhorar o acompanhamento dos animais e a gestão da clínica, podendo ser priorizadas conforme o planejamento.
- Could have (desejável): Pagamentos pelo aplicativo e publicação de fotos dos animais. São recursos adicionais que podem melhorar a experiência dos usuários, mas não são essenciais para o funcionamento inicial.
- Won't have (fora da versão atual): Chat com o veterinário. Essa funcionalidade pode exigir mais tempo de desenvolvimento e acompanhamento das mensagens, por isso poderá ser implementada futuramente.

Os pagamentos pelo aplicativo também podem exigir integração com serviços externos e cuidados adicionais de segurança. Já a publicação de fotos não resolve os principais problemas operacionais da clínica. Como o prazo é de quatro meses, é melhor priorizar as funções essenciais e deixar esses recursos para versões futuras.

### 4. Especificação de requisitos não funcionais:
- RNF01 (Desempenho): O sistema deve carregar as telas de agendamento e histórico dos animais em até 3 segundos em pelo menos 95% das solicitações, sob condições normais de uso.

Como testar: Realizar vários acessos às telas e medir o tempo de carregamento, verificando se o limite estabelecido é cumprido.

- RNF02 (Segurança): O sistema deve exigir autenticação e permitir o acesso aos dados conforme o perfil de cada usuário.

Como testar: Tentar acessar informações sem login e verificar se usuários sem autorização são impedidos de consultar ou modificar os dados.

- RNF03 (Usabilidade): Um tutor deve conseguir agendar uma consulta em até 5 etapas, sem ajuda externa.

Como testar: Solicitar que tutores realizem um agendamento usando o sistema e verificar se conseguem concluir a tarefa dentro do limite estabelecido.

### 5. Validação dos requisitos: 
A equipe poderia utilizar as seguintes técnicas:

- Revisão dos requisitos: Apresentar o documento aos tutores, veterinários, recepcionistas e gerência para confirmar se todas as necessidades foram identificadas e descritas corretamente. Essa técnica ajuda a encontrar requisitos incompletos, incorretos ou contraditórios.
- Prototipação: Desenvolver telas de exemplo para agendamento, histórico dos animais e controle de consultas. Os stakeholders poderiam testar as telas e informar se atendem às suas necessidades.
- Reuniões de validação: Discutir os requisitos com os representantes da clínica para resolver divergências, definir prioridades e confirmar quais funcionalidades serão desenvolvidas primeiro.

Após a validação, os requisitos devem ser revisados e aprovados pelos envolvidos antes do início do desenvolvimento.

### 6. Desafio — Priorização da primeira versão: 
As cinco funcionalidades prioritárias para a primeira versão do PetCare seriam:

1. Cadastro de tutores e animais:
- Necessidade atendida: Organizar os dados dos clientes e seus animais.
- Beneficiados: Tutores, recepção e veterinários.
- Justificativa: É a base para identificar os animais e relacioná-los aos seus responsáveis.

2. Agendamento de consultas pelo celular:
- Necessidade atendida: Permitir que os tutores marquem consultas sem depender exclusivamente de telefone ou WhatsApp.
- Beneficiados: Tutores e recepção.
- Justificativa: Facilita os agendamentos e reduz o trabalho manual.

3. Controle de horários e consultas:
- Necessidade atendida: Organizar os horários disponíveis e permitir a confirmação ou o cancelamento das consultas.
- Beneficiados: Recepção, veterinários e tutores.
- Justificativa: Evita conflitos de horários e melhora a organização dos atendimentos.

4. Histórico dos animais:
- Necessidade atendida: Consultar informações sobre consultas anteriores, vacinas, diagnósticos e tratamentos.
- Beneficiados: Veterinários e tutores.
- Justificativa: Facilita o acompanhamento dos animais e permite que os veterinários consultem informações importantes durante o atendimento.

5. Registro de diagnósticos, tratamentos e medicamentos:
- Necessidade atendida: Manter os registros clínicos dos animais organizados em um único sistema.
- Beneficiados: Veterinários, tutores e clínica.
- Justificativa: Substitui as fichas e os arquivos separados, facilitando a atualização e a consulta das informações.
- Riscos de adiar as demais funcionalidades: Adiar os lembretes de vacinação pode fazer com que alguns tutores esqueçam datas importantes. A ausência de relatórios pode dificultar o acompanhamento da quantidade de atendimentos pela gerência. Sem pagamentos pelo aplicativo, os clientes continuarão utilizando outros meios de pagamento. A falta de chat exigirá que a comunicação continue ocorrendo por outros canais, e a ausência de publicação de fotos não prejudicará diretamente o funcionamento principal da clínica. Essas funcionalidades poderão ser adicionadas em versões futuras, após a implantação das cinco prioridades e a avaliação das necessidades dos usuários.

