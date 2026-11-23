# ATIVIDADE 1 -- MODELAGEM

**Aluno(a):** Gabriela Alves Nascimento

## Estudo de Caso 1 -- Conecta Campus

### 1. Concepção

O Conecta Campus surge com a proposta de solucionar a dispersão das informações acadêmicas e as dificuldades encontradas pelos usuários ao
utilizar a plataforma atual, que apresenta problemas de desempenho e de facilidade de navegação. Os estudantes necessitam consultar notas, grade
de horários e comunicados. Já os docentes precisam disponibilizar conteúdos e avisos, enquanto a coordenação deve compartilhar eventos e
demais informações institucionais.

Dessa forma, a ideia é concentrar esses recursos em uma única plataforma. Com isso, espera-se facilitar a localização das informações,
tornar os serviços mais ágeis e seguros e melhorar a interação entre estudantes, professores e coordenação.

### 2. Elicitação

Os envolvidos que possuem interesse direto no funcionamento do sistema
são:

-   **Alunos:** desejam visualizar seus resultados acadêmicos, horários das aulas e comunicados.
-   **Professores:** necessitam disponibilizar conteúdos de apoio e transmitir avisos às turmas.
-   **Coordenação:** utiliza o sistema para comunicar eventos e divulgar informações da instituição.
-   **Equipe de desenvolvimento:** precisa compreender as regras do negócio e definir como serão tratados o acesso, a segurança e a
    operação da plataforma.

Para levantar as necessidades desses grupos, algumas técnicas podem ser aplicadas:

-   **Entrevistas:** realizar conversas com representantes de cada grupo para conhecer os problemas enfrentados e entender o que esperam da
    nova plataforma. Com os alunos, por exemplo, pode-se investigar quais informações são consultadas com maior frequência e quais
    dificuldades existem no sistema utilizado atualmente.
-   **Questionários:** disponibilizar perguntas para vários usuários, permitindo reunir opiniões sobre a plataforma atual e identificar
    quais recursos devem receber prioridade. As respostas também ajudam a perceber necessidades que aparecem com frequência.

### 3. Análise e modelagem

**Requisitos funcionais (RF)**

-   **RF01:** A plataforma deverá disponibilizar aos estudantes a consulta de suas notas.
-   **RF02:** Os alunos deverão conseguir visualizar os horários de suas aulas.
-   **RF03:** O sistema deverá apresentar avisos e comunicados relacionados à vida acadêmica.
-   **RF04:** Os docentes deverão ter a opção de inserir e disponibilizar materiais de estudo.
-   **RF05:** Os professores deverão poder encaminhar comunicados aos estudantes.
-   **RF06:** A coordenação deverá conseguir publicar eventos e notícias de interesse acadêmico.
-   **RF07:** O acesso à plataforma deverá ocorrer por meio de autenticação com credenciais válidas.
-   **RF08:** Cada usuário deverá visualizar apenas as opções e informações permitidas para seu tipo de perfil.

**Requisitos não funcionais (RNF)**

-   **RNF01 -- Desempenho:** As consultas de notas e horários deverão ser concluídas em até 2 segundos em, no mínimo, 95% das
    solicitações, considerando as condições normais estabelecidas para os testes.
-   **RNF02 -- Segurança:** O acesso a dados acadêmicos protegidos deverá exigir autenticação, e a plataforma deverá bloquear usuários
    que tentem consultar informações sem a devida permissão.
-   **RNF03 -- Usabilidade:** Em uma avaliação com usuários, pelo menos 90% dos participantes deverão conseguir consultar notas e horários
    sem receber auxílio do avaliador.

### 4. Negociação

**Must have -- Recursos obrigatórios**

-   Autenticação e entrada dos usuários na plataforma.
-   Consulta de notas e horários pelos estudantes.
-   Disponibilização de materiais e comunicados pelos professores.
-   Publicação de eventos e informações pela coordenação.
-   Restrição de acesso conforme as permissões de cada perfil.

Esses itens precisam estar presentes desde a primeira versão, pois correspondem às atividades centrais do sistema e garantem que as
informações acadêmicas sejam acessadas de maneira adequada.

**Should have -- Recursos importantes**

-   Organização mais intuitiva das telas e dos conteúdos.
-   Envio de notificações e avisos acadêmicos.

Esses recursos contribuem para uma navegação melhor e tornam a comunicação mais eficiente. Caso seja necessário, parte dos avisos
poderá ser consultada diretamente na plataforma enquanto as notificações são aprimoradas.

**Could have -- Recursos opcionais**

-   Configuração das notificações conforme as preferências individuais.
-   Opções extras para personalizar a aparência da interface.

São funcionalidades que agregam conforto ao uso, mas podem ficar para depois, pois não impedem o funcionamento dos serviços acadêmicos fundamentais.

**Won't have -- Não incluídos na versão inicial**

-   Conversa em tempo real entre estudantes e professores.

A comunicação por chat poderá ser avaliada em uma atualização futura. Deixá-la fora da primeira entrega ajuda a equipe a concentrar o tempo
disponível nos recursos prioritários e concluir a plataforma dentro de um prazo menor.

### 5. Especificação

**RNF01 -- Desempenho**

As páginas de consulta de notas e horários deverão responder em até 2 segundos em pelo menos 95% das solicitações, dentro do cenário de uso
definido para a avaliação.

**Como verificar:** executar no mínimo 100 consultas em um ambiente de testes e registrar o tempo de resposta de cada uma. O critério será
considerado cumprido se 95% ou mais das operações estiverem dentro do limite de 2 segundos.

**RNF02 -- Segurança**

A plataforma deverá solicitar autenticação antes de liberar informações acadêmicas restritas e deverá impedir acessos realizados por contas sem autorização.

**Como verificar:** tentar abrir páginas protegidas sem entrar no sistema e repetir os testes utilizando contas com diferentes perfis.
Deve-se confirmar que cada conta acessa somente os dados permitidos.

**RNF03 -- Usabilidade**

Ao menos 90% das pessoas participantes dos testes deverão conseguir localizar notas e horários sem precisar da orientação do avaliador.

**Como verificar:** apresentar um protótipo ou uma versão em funcionamento aos participantes e solicitar que realizem as consultas.
Depois, registrar quantos concluíram as atividades de forma independente e calcular o percentual de sucesso.

### 6. Validação

-   **Revisão dos requisitos:** compartilhar a lista de requisitos com estudantes, docentes e representantes da coordenação. Eles deverão
    analisar se o que foi descrito corresponde ao que realmente precisam, indicando possíveis falhas, informações ausentes ou pontos
    que precisam ser reformulados.
-   **Prototipação:** preparar modelos das telas para demonstrar como a plataforma será organizada antes de iniciar o desenvolvimento
    completo. Os usuários poderão avaliar se encontram com facilidade as áreas de notas, horários, materiais e comunicados.
-   **Testes de aceitação:** quando existir uma versão funcional, cada grupo poderá executar tarefas relacionadas às suas
    responsabilidades. Os estudantes, por exemplo, poderão consultar notas, enquanto os professores poderão publicar materiais. A
    avaliação permitirá verificar se o sistema atende ao que foi solicitado.

## Estudo de Caso 2 -- PetCare

### 1. Elicitação e stakeholders

Os principais participantes envolvidos no PetCare são:

-   **Tutores dos animais:** precisam marcar atendimentos pelo celular, acompanhar informações dos pets e receber avisos sobre vacinação.
-   **Veterinários:** necessitam consultar dados anteriores dos pacientes e inserir informações sobre diagnósticos, procedimentos e medicamentos.
-   **Recepcionistas:** são responsáveis por verificar a agenda, confirmar horários e registrar desistências ou cancelamentos.
-   **Gerência:** precisa acompanhar os atendimentos realizados para analisar os resultados e administrar melhor a clínica.
-   **Proprietário da clínica:** estabelece o que se espera do sistema e define os limites de investimento e o prazo para a entrega inicial.
-   **Equipe de desenvolvimento:** deve reunir as necessidades dos envolvidos e transformá-las em uma solução que seja viável, segura e
    compatível com os recursos disponíveis.

Para conhecer melhor a rotina e as expectativas desses participantes podem ser utilizadas as técnicas abaixo:

1.  **Entrevistas:** conversar separadamente com tutores, profissionais veterinários, recepcionistas e gerentes. Assim, será possível
    entender os obstáculos do trabalho atual e descobrir quais recursos são mais necessários. Os veterinários, por exemplo, podem explicar
    quais dados do animal precisam consultar durante um atendimento.
2.  **Observação:** acompanhar o trabalho diário da recepção e dos veterinários. A equipe poderá observar como os horários são
    organizados, de que forma os prontuários são consultados e em quais etapas acontecem atrasos. Isso ajuda a encontrar dificuldades que
    talvez não apareçam nas entrevistas.

### 2. Análise e especificação de requisitos

**Requisitos funcionais (RF)**

-   **RF01 -- Marcação de consultas:** o tutor deverá conseguir solicitar um atendimento pelo celular e escolher entre os horários
    que estiverem livres.
-   **RF02 -- Organização da agenda:** a recepção deverá consultar a disponibilidade, confirmar os horários solicitados e registrar cancelamentos.
-   **RF03 -- Consulta do histórico:** veterinários com permissão deverão visualizar os registros de consultas, vacinas e medicamentos
    de cada animal cadastrado.
-   **RF04 -- Registro veterinário:** os profissionais autorizados deverão inserir no sistema os diagnósticos, tratamentos e
    medicamentos relacionados ao atendimento.
-   **RF05 -- Avisos de vacinação:** deverá ser possível registrar as datas das vacinas e encaminhar lembretes aos tutores de acordo com
    as informações cadastradas e as regras da clínica.
-   **RF06 -- Relatórios:** a gerência deverá consultar demonstrativos da quantidade de atendimentos realizados durante um intervalo escolhido.
-   **RF07 -- Cadastro de pacientes:** a plataforma deverá permitir registrar os animais e relacioná-los aos respectivos tutores.
-   **RF08 -- Controle de usuários:** o sistema deverá exigir identificação dos usuários e liberar as funções conforme as permissões de cada perfil.

**Requisitos não funcionais (RNF)**

-   **RNF01 -- Desempenho:** as consultas à agenda e aos históricos deverão ser exibidas em até 2 segundos em pelo menos 95% das
    requisições, considerando as condições normais definidas para os testes.
-   **RNF02 -- Segurança:** informações protegidas deverão ficar disponíveis somente após autenticação, impedindo que pessoas sem
    autorização consultem ou modifiquem prontuários.
-   **RNF03 -- Usabilidade:** em testes com pessoas que representem os usuários do sistema, pelo menos 90% deverão conseguir marcar uma
    consulta e encontrar o histórico de um animal sem ajuda.
-   **RNF04 -- Compatibilidade:** os tutores deverão conseguir realizar agendamentos em navegadores atuais de celulares Android e iOS,
    conforme os aparelhos e navegadores selecionados para a avaliação.

### 3. Negociação com MoSCoW

**Must have -- Indispensáveis**

-   Agendamento de atendimentos pelo celular.
-   Consulta da agenda, confirmação de horários e registro de cancelamentos.
-   Registro dos animais e de seus responsáveis.
-   Acesso e atualização do histórico veterinário, incluindo diagnósticos, tratamentos e medicamentos.
-   Autenticação dos usuários e definição de permissões.

Esses recursos formam a estrutura básica do PetCare. Eles permitem organizar os atendimentos, manter os dados dos animais reunidos em um só
lugar e garantir que informações importantes sejam acessadas apenas por pessoas autorizadas.

**Should have -- Prioritários, mas não essenciais à primeira entrega**

-   Lembretes relacionados às vacinas.
-   Emissão de relatórios sobre os atendimentos.

A inclusão desses itens facilita o acompanhamento da saúde dos animais e oferece informações úteis para a administração da clínica. Mesmo assim,
eles podem ser implementados em uma etapa seguinte se o orçamento ou o prazo forem insuficientes.

**Could have -- Funcionalidades adicionais**

-   Pagamento de serviços diretamente pelo aplicativo.

Essa possibilidade deixaria o processo mais cômodo para os tutores e poderia simplificar as cobranças. Entretanto, seria necessário integrar
uma solução de pagamento e considerar os cuidados extras com segurança e tratamento de erros. Por esse motivo, sua implementação pode aguardar a
conclusão das funções principais.

**Won't have -- Fora da primeira versão**

-   Mensagens instantâneas entre tutores e veterinários.
-   Espaço para os usuários publicarem fotografias dos animais.

Essas ideias podem ser consideradas em versões posteriores, depois que a clínica estiver utilizando e avaliando os recursos fundamentais.

A ordem de prioridade deverá ser discutida com os envolvidos no projeto. Se houver limitações financeiras ou de tempo, devem ser mantidos em
primeiro lugar os recursos necessários para realizar os atendimentos e proteger os dados.

### 4. Especificação dos requisitos não funcionais

**RNF01 -- Desempenho**

As consultas da agenda e dos históricos deverão apresentar resposta em até 2 segundos em, no mínimo, 95% das solicitações, considerando um
ambiente e condições de teste previamente definidos.

**Como testar:** fazer pelo menos 100 consultas em ambiente controlado e medir o tempo gasto em cada operação. O requisito será considerado
cumprido caso 95% ou mais das respostas ocorram em até 2 segundos.

**RNF02 -- Segurança**

O acesso às informações restritas deverá depender de autenticação. Além disso, cada categoria de usuário poderá consultar ou modificar somente
os dados permitidos para sua função.

**Como testar:** tentar acessar informações sem realizar login e repetir o procedimento com contas que possuam permissões diferentes. Também
deverão ser feitas tentativas de alteração de prontuários por usuários sem autorização, verificando se o sistema bloqueia essas ações.

**RNF03 -- Usabilidade**

Pelo menos 90% dos participantes que representem os usuários da clínica deverão conseguir realizar um agendamento e localizar o histórico de um
animal sem orientação do avaliador.

**Como testar:** pedir que tutores e funcionários executem essas atividades em um protótipo ou sistema funcional. A equipe deverá
registrar os resultados e calcular a porcentagem de participantes que concluíram cada tarefa sem auxílio.

**RNF04 -- Compatibilidade**

O agendamento deverá funcionar nos dispositivos móveis e navegadores que forem definidos na matriz de compatibilidade do projeto.

**Como testar:** repetir os mesmos procedimentos de agendamento nos celulares e navegadores selecionados, observando se as funções
principais apresentam o comportamento esperado em todos eles.

A definição desses critérios deixa mais claro o nível de qualidade esperado pelo proprietário e permite avaliar, por meio de testes, se o
PetCare está atendendo às condições estabelecidas.

### 5. Validação dos requisitos

Para conferir se os requisitos representam corretamente as necessidades da clínica, podem ser adotadas as seguintes práticas:

1.  **Análise conjunta da documentação:** apresentar os requisitos aos tutores, veterinários, recepcionistas e gerentes. Cada grupo poderá
    verificar se as funções descritas correspondem à sua rotina e apontar informações esquecidas ou descrições que não estejam claras.
    Um veterinário, por exemplo, pode perceber que determinado dado clínico importante não foi previsto.
2.  **Avaliação por situações práticas:** demonstrar exemplos de uso como um tutor escolhendo um horário para consulta ou um veterinário
    procurando o histórico de vacinação de um paciente. Os participantes deverão analisar se o sistema permite executar essas atividades e se
    as regras apresentadas fazem sentido para o funcionamento da clínica.

Depois dessa etapa, os ajustes indicados deverão ser registrados e incorporados à documentação. A equipe deverá revisar os requisitos com
os principais envolvidos antes de começar a implementação.

### 6. Desafio -- Escolha das prioridades para a primeira versão

Como o projeto possui orçamento suficiente para apenas cinco funcionalidades e precisa ser entregue em quatro meses, a seleção deve
priorizar o que é necessário para a rotina de atendimento.

**1. Cadastro de animais e tutores**

-   **Necessidade contemplada:** reunir os dados dos responsáveis e dos animais atendidos.
-   **Beneficiados:** tutores, veterinários e recepção.
-   **Motivo da escolha:** esse cadastro permite identificar corretamente cada paciente e relacionar a ele os atendimentos e registros clínicos. Sem essa organização, as demais funções
    dependeriam de informações espalhadas.

**2. Agendamento pelo celular**

-   **Necessidade contemplada:** oferecer aos tutores uma forma de solicitar consultas sem depender somente de ligações ou mensagens.
-   **Beneficiados:** tutores e recepcionistas.
-   **Motivo da escolha:** torna a marcação de horários mais acessível e diminui a necessidade de controlar todos os pedidos manualmente.

**3. Gerenciamento da agenda**

-   **Necessidade contemplada:** visualizar os horários livres, confirmar consultas e registrar cancelamentos.
-   **Beneficiados:** recepção, veterinários e tutores.
-   **Motivo da escolha:** complementa o agendamento e permite organizar a disponibilidade dos profissionais, reduzindo a possibilidade de
    marcações no mesmo horário.

**4. Histórico clínico dos animais**

-   **Necessidade contemplada:** manter reunidos os dados de consultas anteriores, vacinação e medicamentos.
-   **Beneficiados:** principalmente veterinários e também os demais profissionais envolvidos no atendimento.
-   **Motivo da escolha:** facilita a consulta de informações importantes durante os procedimentos e evita depender de fichas ou
    arquivos separados. O recurso também deverá permitir que veterinários autorizados registrem diagnósticos, tratamentos e medicamentos.

**5. Autenticação e controle de permissões**

-   **Necessidade contemplada:** preservar os dados pessoais dos tutores e as informações clínicas dos animais.
-   **Beneficiados:** todos os usuários da clínica.
-   **Motivo da escolha:** garante que cada pessoa tenha acesso apenas às funções relacionadas à sua responsabilidade. A proteção das
    informações precisa ser considerada desde a primeira versão.

**Possíveis consequências de deixar os outros recursos para depois**

-   **Lembretes de vacinação:** os responsáveis precisarão utilizar agendas ou outros meios para acompanhar as datas, o que pode
    aumentar a chance de esquecer alguma vacina.
-   **Relatórios de atendimento:** a gerência terá menos facilidade para visualizar o volume de consultas e acompanhar indicadores da clínica.
-   **Pagamento pelo aplicativo:** os tutores precisarão continuar utilizando as formas de pagamento já oferecidas pela clínica.
-   **Chat com veterinários:** dúvidas e mensagens continuarão sendo tratadas por telefone, WhatsApp ou outros canais externos.
-   **Compartilhamento de fotos:** não será possível publicar imagens dos animais dentro da plataforma, mas isso não interfere diretamente
    na realização dos atendimentos.

Essas limitações podem ser aceitas no lançamento, desde que a clínica mantenha outras formas de realizar as atividades que não estarão
disponíveis no PetCare. Depois da primeira versão, a equipe poderá analisar as necessidades dos usuários e os recursos disponíveis para
decidir quais melhorias serão desenvolvidas.
