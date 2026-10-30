Estudo de Caso 1 — Conecta Campus
1. Concepção
O Conecta Campus pretende resolver o problema da falta de centralização dos serviços acadêmicos, já que atualmente os alunos enfrentam dificuldades para consultar informações, além de utilizarem um sistema lento e pouco intuitivo.

Seu principal objetivo é desenvolver uma plataforma que reúna informações acadêmicas em um único lugar, permitindo que alunos, professores e coordenação acessem os serviços de maneira mais rápida, organizada e segura.
2. Elicitação
Principais stakeholders:
- Alunos: precisam consultar notas, horários e receber avisos acadêmicos.
- Professores: precisam publicar materiais e comunicados.
- Coordenação: deseja divulgar eventos e informações acadêmicas.
- Universidade: responsável por estabelecer regras de segurança e acesso às informações.
- Equipe de desenvolvimento: responsável por desenvolver e manter o sistema.
Técnicas de elicitação:

1. Entrevistas: seriam realizadas conversas com alunos, professores e coordenadores para compreender suas principais dificuldades e identificar quais funcionalidades são necessárias.

2. Questionários: seriam aplicados aos alunos e professores para coletar opiniões de um número maior de usuários sobre o sistema atual e suas expectativas em relação à nova plataforma.
3. Análise e modelagem
Requisitos funcionais (RF):
- RF01: O sistema deve permitir que os alunos consultem suas notas.
- RF02: O sistema deve permitir que os alunos consultem seus horários de aula.
- RF03: O sistema deve enviar avisos e comunicados aos alunos.
- RF04: O sistema deve permitir que os professores publiquem materiais de estudo.
- RF05: O sistema deve permitir que os professores publiquem comunicados.
- RF06: O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas.
- RF07: O sistema deve permitir que os usuários realizem login para acessar as informações acadêmicas.
Requisitos não funcionais (RNF):
- RNF01: O sistema deve apresentar tempo de resposta de até 3 segundos nas consultas realizadas em condições normais de uso.
- RNF02: O sistema deve proteger as informações acadêmicas por meio de autenticação dos usuários.
- RNF03: O sistema deve possuir uma interface intuitiva, permitindo que os usuários encontrem as principais funcionalidades com facilidade.
4. Negociação — MoSCoW
Must have (indispensável):
- Consulta de notas e horários.
- Publicação de materiais e comunicados.
- Divulgação de eventos e informações acadêmicas.
- Autenticação dos usuários.
- Envio de avisos e notificações acadêmicas.
Essas funcionalidades são essenciais porque atendem às principais necessidades dos alunos, professores e coordenação. O envio de avisos deve estar na primeira versão, pois foi uma necessidade apresentada diretamente pelos alunos.

Should have (importante):
- Melhorias de desempenho e facilidade de navegação.
- Personalização das notificações.
São importantes para melhorar a experiência dos usuários, mas a personalização pode ser implementada posteriormente.

Could have (desejável):

- Recursos adicionais de organização das informações acadêmicas.

Poderão ser desenvolvidos caso existam recursos e tempo disponíveis.

Won't have (fora da versão atual):

- Chat entre alunos e professores.

O chat ficará para uma versão futura porque pode aumentar a complexidade e o tempo de desenvolvimento da primeira versão.
5. Especificação
A frase apresentada pode ser transformada nos seguintes requisitos:
- RNF04 — Desempenho: O sistema deve carregar as páginas de consulta de notas e horários em até 3 segundos, considerando uma carga de até 100 usuários simultâneos. Será verificado por meio de testes de desempenho.
- RNF05 — Segurança: O sistema deve permitir o acesso às informações acadêmicas somente após autenticação válida. Será verificado por meio de tentativas de acesso sem login e com credenciais inválidas.
- RNF06 — Usabilidade: Pelo menos 8 de cada 10 usuários participantes do teste devem conseguir localizar suas notas e horários em até 2 minutos, sem receber ajuda. Será verificado por meio de testes com alunos.
6. Validação
A equipe poderia utilizar as seguintes técnicas:

1. Reuniões de validação: seriam realizadas reuniões com alunos, professores e coordenação para apresentar os requisitos levantados e verificar se eles representam corretamente suas necessidades.

2. Prototipação: seria criada uma versão inicial das telas do sistema para que os usuários pudessem visualizar e testar a navegação, identificando funcionalidades ausentes ou dificuldades de utilização antes do desenvolvimento.

Estudo de Caso 2 — PetCare
1. Elicitação e stakeholders
Principais stakeholders:
- Tutores dos animais: precisam agendar consultas pelo celular e receber lembretes de vacinação.
- Veterinários: precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- Recepcionistas: precisam organizar os horários disponíveis e confirmar ou cancelar consultas.
- Gerência: precisa acompanhar os atendimentos realizados por meio de relatórios.
- Proprietário da clínica: deseja melhorar a organização dos serviços e estabelecer prioridades de acordo com o orçamento e o prazo.
- Equipe de desenvolvimento: responsável por construir o sistema de acordo com as necessidades identificadas.
Técnicas de elicitação:

1. Entrevistas: seriam realizadas com veterinários, recepcionistas e gerência para entender como os processos funcionam atualmente e quais dificuldades precisam ser resolvidas.

2. Observação: a equipe acompanharia a rotina da clínica para entender como são realizados os agendamentos, os atendimentos e o armazenamento das informações dos animais. Isso ajudaria a identificar problemas que poderiam não ser mencionados durante as entrevistas.
2. Análise e especificação de requisitos
Requisitos funcionais (RF):
- RF01: O sistema deve permitir que os tutores cadastrem seus animais.
- RF02: O sistema deve permitir que os tutores agendem consultas pelo celular.
- RF03: O sistema deve enviar lembretes de vacinação aos tutores.
- RF04: O sistema deve permitir que os veterinários consultem o histórico dos animais.
- RF05: O sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos.
- RF06: O sistema deve permitir que a recepção confirme e cancele consultas.
- RF07: O sistema deve permitir que a gerência visualize relatórios sobre a quantidade de atendimentos realizados.
Requisitos não funcionais (RNF):
- RNF01: O sistema deve apresentar tempo de resposta de até 3 segundos nas operações principais, em condições normais de uso.
- RNF02: O sistema deve exigir autenticação para permitir o acesso aos dados dos tutores e dos animais.
- RNF03: O sistema deve possuir uma interface intuitiva, permitindo que os tutores realizem agendamentos sem dificuldades.
3. Negociação com MoSCoW
Must have (indispensável):
- Cadastro de tutores e animais.
- Agendamento de consultas.
- Consulta ao histórico dos animais.
- Registro de diagnósticos, tratamentos e medicamentos.
- Controle de horários e confirmação ou cancelamento de consultas.
Essas funcionalidades são fundamentais para resolver os principais problemas da clínica e permitir que o sistema funcione adequadamente.

Should have (importante):
- Lembretes de vacinação.
- Relatórios de atendimentos para a gerência.
São funcionalidades importantes, pois ajudam no acompanhamento da saúde dos animais e na organização administrativa. Entretanto, poderão ser implementadas em uma atualização posterior, caso o prazo ou orçamento não permita incluí-las inicialmente.

Could have (desejável):
- Pagamentos pelo aplicativo.
- Publicação de fotos dos animais.
Esses recursos oferecem facilidades adicionais, mas não são essenciais para o funcionamento inicial da clínica.

Won't have (fora da versão atual):

- Chat entre tutores e veterinários.

O chat ficará para uma versão futura, pois exige desenvolvimento adicional e pode aumentar a complexidade do projeto.

A classificação considera o prazo de quatro meses e a necessidade de priorizar os processos fundamentais da clínica.
4. Especificação de requisitos não funcionais
A frase apresentada pode ser transformada nos seguintes requisitos:
- RNF04 — Desempenho: O sistema deve carregar as telas de cadastro e agendamento em até 3 segundos, considerando uma carga de até 100 usuários simultâneos. Será verificado por meio de testes de desempenho.
- RNF05 — Segurança: O sistema deve exigir autenticação para acessar dados dos tutores e animais, permitindo que cada perfil visualize apenas as informações autorizadas. Será verificado por meio de testes com diferentes perfis de usuários e tentativas de acesso não autorizado.
- RNF06 — Usabilidade: Pelo menos 8 de cada 10 tutores participantes do teste devem conseguir realizar um agendamento em até 3 minutos, sem receber ajuda. Será verificado por meio de testes de usabilidade.
5. Validação dos requisitos
A equipe poderia utilizar as seguintes técnicas:

1. Revisão de requisitos: os requisitos seriam apresentados aos tutores, veterinários, recepcionistas e gerência para verificar se estão corretos, completos e de acordo com as necessidades de cada grupo.

2. Prototipação: seriam criadas telas demonstrativas das principais funcionalidades, como cadastro de animais, agendamento e consulta ao histórico. Os usuários poderiam testar o protótipo e indicar possíveis erros, dificuldades ou funcionalidades que estejam faltando.

Essas técnicas ajudariam a identificar problemas antes do início do desenvolvimento, evitando retrabalho e garantindo que o sistema atenda às expectativas dos envolvidos.
6. Desafio — Priorização da primeira versão
Considerando o orçamento limitado e o prazo de quatro meses, escolheria as seguintes cinco funcionalidades:

1. Cadastro de tutores e animais
- Necessidade atendida: armazenar as informações dos tutores e seus animais em um único sistema.
- Beneficiados: tutores, veterinários e recepcionistas.
- Justificativa: é a base para o funcionamento das demais funcionalidades, pois o sistema precisa identificar os animais e seus responsáveis.
2. Agendamento de consultas
- Necessidade atendida: permitir que os tutores marquem consultas pelo celular.
- Beneficiados: tutores e recepcionistas.
- Justificativa: reduz a dependência de ligações e mensagens pelo WhatsApp, tornando o processo mais organizado.
3. Consulta ao histórico dos animais
- Necessidade atendida: facilitar a localização de informações sobre consultas anteriores, vacinas e medicamentos.
- Beneficiados: veterinários e tutores.
- Justificativa: resolve um dos principais problemas atuais da clínica, que é a dificuldade de encontrar informações armazenadas em fichas e arquivos separados.
4. Registro de diagnósticos, tratamentos e medicamentos
- Necessidade atendida: permitir que os veterinários armazenem as informações dos atendimentos.
- Beneficiados: veterinários, tutores e demais profissionais autorizados.
- Justificativa: mantém o histórico atualizado e facilita o acompanhamento dos animais.
5. Controle de horários e confirmação ou cancelamento de consultas
- Necessidade atendida: organizar a agenda da clínica e evitar conflitos de horários.
- Beneficiados: recepcionistas, veterinários e tutores.
- Justificativa: permite que a clínica controle os agendamentos e mantenha sua rotina de atendimento organizada.
Riscos de adiar as demais funcionalidades:

O adiamento dos lembretes de vacinação pode fazer com que alguns tutores esqueçam datas importantes. A ausência de relatórios pode dificultar o acompanhamento da produtividade da clínica. Já a falta de pagamentos pelo aplicativo, chat e publicação de fotos não impede o funcionamento dos serviços principais, mas reduz algumas facilidades que poderiam melhorar a experiência dos usuários.

Essas funcionalidades poderão ser desenvolvidas em versões futuras, após a implementação e avaliação da primeira versão do PetCare.
