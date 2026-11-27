# Atividade 1 — Engenharia de Requisitos

Aluna: Janaina Gabrielly Barbosa Farias

---

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

A ideia do Conecta Campus é facilitar o acesso aos serviços da universidade. Atualmente, muitas informações ficam espalhadas em diferentes lugares, e o sistema que já existe é lento e complicado de usar.

Com isso, a proposta é criar uma plataforma que reúna tudo em um só lugar, como notas, horários, avisos, materiais de aula e eventos. Assim, alunos, professores e coordenação conseguem encontrar as informações de que precisam com mais facilidade, sem perder tanto tempo procurando em vários sistemas.

## 2. Elicitação

Stakeholders envolvidos:

- Alunos: precisam consultar notas, horários e receber avisos da universidade.
- Professores: precisam disponibilizar materiais de aula e publicar comunicados.
- Coordenação: precisa divulgar eventos e informações importantes.
- Universidade: quer garantir que os dados sejam protegidos e acessados somente por pessoas autorizadas.
- Equipe de desenvolvimento: fica responsável por desenvolver o sistema, considerando o tempo e os recursos disponíveis.

Técnicas utilizadas:

- Entrevistas: conversaria com alguns alunos, professores e pessoas da coordenação para entender as principais dificuldades que eles enfrentam no sistema atual. Perguntas como "o que você acha mais complicado na hora de acessar as informações?" ajudariam a identificar o que precisa melhorar.
- Questionários: como existem muitos alunos, seria difícil conversar com todos individualmente. Por isso, um formulário online seria uma boa opção para conhecer a opinião de mais pessoas, perguntando quais funções utilizam com mais frequência e o que acham da facilidade de uso do sistema.

## 3. Análise e modelagem

Depois de entender as necessidades dos usuários, foram definidos os seguintes requisitos:

Requisitos funcionais:

- RF01: O sistema deve permitir que os usuários façam login com usuário e senha.
- RF02: O aluno deve conseguir consultar suas notas.
- RF03: O aluno deve conseguir consultar seus horários de aula.
- RF04: O sistema deve enviar avisos aos alunos.
- RF05: O professor deve conseguir publicar materiais de aula.
- RF06: O professor deve conseguir publicar comunicados.
- RF07: A coordenação deve conseguir divulgar eventos da universidade.

Requisitos não funcionais:

- RNF01: As informações acadêmicas devem ser acessadas somente por usuários autenticados.
- RNF02: O sistema deve apresentar um bom desempenho, mesmo quando muitos usuários estiverem acessando ao mesmo tempo.
- RNF03: A interface deve ser simples e fácil de entender, permitindo que os alunos encontrem notas e horários sem precisar passar por muitas telas.

## 4. Negociação (MoSCoW)

Para definir o que seria mais importante na primeira versão do sistema, utilizei o método MoSCoW:

- Must have (obrigatório): RF01, RF02, RF03, RF04 e RNF01.
- Should have (importante): RF05, RF06 e RF07.
- Could have (poderia ter): filtros e ferramenta de busca nos avisos e materiais.
- Won't have (não terá nesta versão): chat entre alunos e professores.

Justificativa:

Escolhi como obrigatórios os requisitos que considero essenciais para o funcionamento do sistema, principalmente o login, a consulta de notas e horários e o recebimento de avisos. A segurança também é indispensável, já que existem informações acadêmicas que não podem ficar disponíveis para qualquer pessoa.

As funções dos professores e da coordenação também são importantes, mas podem ser desenvolvidas em uma segunda etapa. Os filtros e a busca seriam recursos interessantes, mas não são essenciais no começo.

Já o chat ficou de fora da primeira versão porque exigiria mais tempo de desenvolvimento e não é uma das principais necessidades do sistema neste momento.

## 5. Especificação

Expressões como "rápido, seguro e fácil de usar" podem ter significados diferentes para cada pessoa. Por isso, é importante transformar essas características em requisitos que possam ser testados.

- RNF01 — Segurança: o sistema deve exigir login para acessar informações acadêmicas, armazenar as senhas de forma protegida e encerrar a sessão após 15 minutos sem atividade. Para testar, seria necessário tentar acessar páginas internas sem fazer login e verificar se a sessão realmente expira.
- RNF02 — Desempenho: as telas de notas, horários e avisos devem carregar em até 3 segundos, mesmo com 1.000 usuários acessando ao mesmo tempo. Para verificar isso, seria realizado um teste de carga, simulando vários acessos simultâneos.
- RNF03 — Usabilidade: o aluno deve conseguir encontrar suas notas em até 3 cliques, e pelo menos 90% dos usuários participantes do teste devem conseguir realizar essa tarefa sem ajuda. Isso seria avaliado por meio de testes com alunos.

## 6. Validação

Para ter certeza de que os requisitos realmente atendem às necessidades dos usuários, utilizaria duas formas de validação:

- Revisão com os stakeholders: apresentaria os requisitos para alunos, professores e coordenação, para que todos pudessem conferir se as funções descritas estão corretas e se alguma necessidade importante ficou de fora.
- Protótipo: criaria algumas telas no Figma para mostrar como o sistema poderia funcionar. Os usuários poderiam testar o protótipo e dar opiniões sobre a organização das informações e a facilidade de uso. Dessa forma, seria possível fazer alterações antes de começar o desenvolvimento.

---

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

Primeiramente, é importante entender quem vai utilizar o sistema e quais são as necessidades de cada pessoa envolvida.

Stakeholders e suas necessidades:

- Tutores: precisam marcar consultas pelo celular e receber lembretes sobre as vacinas dos animais.
- Veterinários: precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- Recepção: precisa organizar os horários disponíveis, confirmar consultas e realizar cancelamentos.
- Gerência: precisa acompanhar a quantidade de atendimentos realizados por meio de relatórios.
- Proprietário: deseja um sistema rápido, seguro e fácil de utilizar, que fique pronto dentro do prazo de quatro meses.

Técnicas utilizadas:

- Entrevistas: conversaria com o proprietário, os funcionários da recepção, os veterinários e a gerência para entender o que cada um espera do sistema. Também perguntaria ao proprietário o que ele considera um sistema rápido, seguro e fácil de usar, para evitar que essas características fiquem muito vagas.
- Observação: acompanharia o funcionamento da clínica durante um período, observando como são feitos os agendamentos por telefone e WhatsApp e como os veterinários procuram as informações dos animais nas fichas. Escolhi essa técnica porque, observando a rotina, é possível perceber dificuldades que nem sempre são mencionadas durante uma entrevista.

## 2. Análise e especificação de requisitos

Com base nas necessidades identificadas, foram definidos os seguintes requisitos:

Requisitos funcionais:

- RF01: O tutor deve conseguir agendar consultas pelo celular.
- RF02: O sistema deve enviar lembretes de vacinação aos tutores.
- RF03: O veterinário deve conseguir consultar o histórico do animal.
- RF04: O veterinário deve conseguir registrar diagnósticos, tratamentos e medicamentos.
- RF05: A recepção deve conseguir visualizar os horários disponíveis, confirmar e cancelar consultas.
- RF06: O sistema deve gerar relatórios mostrando a quantidade de atendimentos realizados.

Requisitos não funcionais:

- RNF01: As telas de agendamento e histórico devem carregar em até 3 segundos.
- RNF02: O sistema deve exigir login e controlar o acesso de acordo com o perfil de cada usuário.
- RNF03: O tutor deve conseguir agendar uma consulta em até 5 etapas, sem precisar de treinamento.

## 3. Negociação com MoSCoW

Como o prazo para desenvolver o sistema é de apenas quatro meses, é necessário escolher quais funcionalidades são mais importantes para a primeira versão.

- Must have (obrigatório): RF01, RF03, RF04, RF05 e RNF02.
- Should have (importante): RF02 e RF06.
- Could have (poderia ter): chat entre o tutor e o veterinário.
- Won't have (não terá nesta versão): pagamento pelo aplicativo e publicação de fotos dos animais.

Justificativa:

Os requisitos classificados como obrigatórios foram escolhidos porque resolvem os principais problemas da clínica. O agendamento pelo celular e o controle da agenda ajudam a organizar as consultas, enquanto o histórico e o registro das informações permitem que os veterinários encontrem os dados dos animais com mais facilidade.

A segurança também é obrigatória, pois o sistema terá informações dos tutores e históricos dos atendimentos.

Os lembretes de vacinação e os relatórios são recursos importantes, mas podem ser adicionados depois, já que a clínica ainda consegue funcionar sem eles inicialmente.

O chat ficou como Could have porque seria interessante para facilitar a comunicação, mas também poderia aumentar a quantidade de trabalho dos veterinários, que precisariam acompanhar e responder às mensagens.

Já o pagamento pelo aplicativo ficou como Won't have porque exigiria integração com serviços de pagamento e mais cuidados com a segurança. Como o prazo é curto, acredito que não seria interessante incluir essa função agora. A publicação de fotos também ficou de fora porque não resolve diretamente os principais problemas apresentados pela clínica.

## 4. Requisitos não funcionais mensuráveis

Assim como no primeiro estudo de caso, expressões como "rápido, seguro e muito fácil de usar" precisam ser mais específicas para que seja possível verificar se o sistema realmente atende ao esperado.

- RNF01 — Desempenho: as telas de agendamento e histórico devem carregar em até 3 segundos, considerando até 100 usuários acessando ao mesmo tempo. A verificação seria feita por meio de um teste de carga.
- RNF02 — Segurança: o acesso deve ser feito por login e senha, com armazenamento protegido das senhas. Além disso, cada usuário só poderá acessar as funções permitidas para seu perfil. Por exemplo, um tutor não poderá consultar o histórico de outro animal. Para testar, seriam realizados acessos com diferentes perfis para verificar se as permissões estão funcionando corretamente.
- RNF03 — Usabilidade: um tutor que nunca utilizou o sistema deve conseguir agendar uma consulta em até 5 etapas e em menos de 2 minutos, sem receber ajuda. Para verificar, seria realizado um teste com pelo menos 5 tutores, observando o tempo e a quantidade de etapas necessárias.

## 5. Validação dos requisitos

Para validar os requisitos do PetCare, utilizaria duas técnicas:

- Revisão com os envolvidos: apresentaria o documento de requisitos ao proprietário, à recepção, aos veterinários e à gerência. Cada um poderia verificar se as funcionalidades atendem às suas necessidades. Isso também ajudaria a identificar possíveis erros, informações que ficaram faltando ou até opiniões diferentes sobre o que deveria ser prioridade.
- Protótipo das telas: criaria modelos das principais telas do sistema, como agendamento de consultas, histórico dos animais e painel da recepção. Depois, deixaria os usuários testarem e darem suas opiniões. Assim, seria possível perceber se as telas estão organizadas e se as funções são fáceis de encontrar antes de começar a programação.

## 6. Desafio — Priorização da primeira versão

Considerando que existe dinheiro para desenvolver apenas cinco funcionalidades, escolhi aquelas que considero mais importantes para resolver os problemas atuais da clínica.

### 1. Agendamento de consultas pelo celular (RF01)

- Necessidade: permitir que os tutores marquem consultas sem precisar entrar em contato com a clínica por telefone ou WhatsApp.
- Beneficiados: tutores e recepção.
- Motivo da escolha: é uma das principais necessidades do projeto, já que a clínica apresenta dificuldades para organizar os agendamentos.

### 2. Controle da agenda pela recepção (RF05)

- Necessidade: permitir que a recepção visualize os horários disponíveis e consiga confirmar ou cancelar consultas.
- Beneficiados: recepção e tutores.
- Motivo da escolha: essa funcionalidade é necessária para que o agendamento pelo celular funcione corretamente. As duas precisam trabalhar juntas para evitar horários duplicados e problemas na organização.

### 3. Histórico do animal (RF03)

- Necessidade: permitir que os veterinários encontrem informações sobre consultas, vacinas e medicamentos anteriores.
- Beneficiados: veterinários, tutores e animais.
- Motivo da escolha: facilita o acompanhamento dos animais e evita que os profissionais precisem procurar informações em várias fichas diferentes.

### 4. Registro de diagnósticos, tratamentos e medicamentos (RF04)

- Necessidade: permitir que os veterinários registrem as informações de cada atendimento diretamente no sistema.
- Beneficiados: veterinários e clínica.
- Motivo da escolha: essa função complementa o histórico do animal, pois não adianta ter um espaço para consultar informações se os profissionais não conseguem registrar os novos atendimentos.

### 5. Lembretes de vacinação (RF02)

- Necessidade: avisar os tutores quando estiver chegando o período de vacinação dos animais.
- Beneficiados: tutores, animais e clínica.
- Motivo da escolha: considero uma funcionalidade bastante útil, pois ajuda os tutores a não esquecerem as vacinas e também contribui para que os animais mantenham os cuidados em dia.

### Riscos de deixar as outras funcionalidades para versões futuras

- Relatórios: a gerência precisará acompanhar a quantidade de atendimentos de outra maneira por enquanto. Como as informações já estarão sendo registradas no sistema, os relatórios poderão ser adicionados depois.
- Pagamento pelo aplicativo: os tutores continuarão pagando pelos meios que a clínica já utiliza. Isso não impede que as consultas sejam realizadas.
- Chat com o veterinário: a comunicação continuará acontecendo por telefone ou WhatsApp, como já acontece atualmente.
- Publicação de fotos: a ausência dessa função não prejudica o funcionamento principal do sistema, apenas deixa de oferecer um recurso adicional para os tutores.

### Conclusão

Na minha opinião, essas cinco funcionalidades são suficientes para começar, porque atendem às necessidades mais urgentes da clínica. O sistema já permitirá organizar os agendamentos, consultar e registrar informações dos animais e lembrar os tutores das vacinas. As outras funcionalidades podem ser desenvolvidas posteriormente, conforme a necessidade da clínica e a disponibilidade de recursos.
