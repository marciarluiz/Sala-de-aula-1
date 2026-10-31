# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

O Conecta Campus pretende resolver o problema da fragmentação dos serviços acadêmicos e das dificuldades enfrentadas pelos alunos e professores ao utilizar o sistema atual, que é lento e pouco intuitivo. 
E o principal objetivo dele é centralizar os serviços acadêmicos em uma única plataforma para que alunos, professores e coordenação acessem informações e realizem atividades de maneira rápida, prática e segura.

## 2. Elicitação

Principais stakeholders:

1. Alunos: consultam notas, horários e recebem avisos acadêmicos;
2. Professores: publicam materiais e comunicados;
3. Coordenação: divulga eventos e informações acadêmicas.
4. Universidade: estabelece regras e requisitos de segurança e acesso.
4. Equipe de desenvolvimento: responsável por construir e manter o sistema.

Técnicas de elicitação:

1\. Entrevistas: realizar conversas com alunos, professores e coordenadores para compreender suas dificuldades com o sistema atual, identificar necessidades e descobrir quais funcionalidades consideram mais importantes.

2\. Observação: acompanhar os usuários durante a utilização do sistema atual para identificar dificuldades de navegação, tarefas demoradas e problemas que talvez não sejam mencionados nas entrevistas.

## 3. Análise e modelagem

Requisitos funcionais (RF)

 RF01: O sistema deve permitir que os alunos consultem suas notas acadêmicas.
 RF02: O sistema deve permitir que os alunos consultem seus horários de aula.
 RF03: O sistema deve permitir que os professores publiquem materiais de estudo.                         
 RF04: O sistema deve permitir que os professores publiquem comunicados para os alunos.                  
 RF05: O sistema deve permitir que a coordenação divulgue eventos acadêmicos.

Requisitos não funcionais (RNF)

 RNF01: O sistema deve dar respostas rápidas (em até 3 segundos) em pelo menos 95% das consultas, considerando muitos usuários usando o sistema ao mesmo tempo.
 RNF02: O sistema deve exigir autenticação para permitir o acesso às informações acadêmicas dos alunos.
 RNF03: A interface deve ser intuitiva e permitir que os usuários encontrem as principais funcionalidades em, no máximo, três etapas de navegação. 

## 4. Negociação

Must have: RF01, RF02, RF04 e RF05 | São funcionalidades essenciais para atender às principais necessidades dos alunos, professores e coordenação.

Should have: RF05 |É importante que a coordenação possa divulgar os eventos da universidade pela sistema, mas comparado com os outros requesitos, esse é o menos indispensável.
Could have: Fazer melhorias visuais adicionais. | São recursos desejáveis que podem melhorar a experiência dos usuários.

Won't have: Chat entre alunos e professores.| Apesar de ser uma funcionalidade desejada por alguns professores, isso pode aumentar o tempo e a complexidade do desenvolvimento.

## 5. Especificação

RNF01 – Desempenho: O sistema deve responder às consultas dos alunos em até 3 segundos em pelo menos 95% das solicitações, considerando muitos usuários simultâneos. | Simular vários usuários acessando o sistema e medir o tempo de resposta das consultas.|
RNF02 – Segurança: O sistema deve exigir autenticação por login e senha antes de permitir o acesso às informações acadêmicas. | Tentar acessar as páginas de notas e horários sem estar autenticado e verificar se o acesso é bloqueado. 

## 6. Validação

Técnicas de validação:

1. Revisão de requisitos: mostrar os requisitos documentados aos alunos, professores e coordenadores para que eles vejam se as funcionalidades estão corretas, completas e de acordo com suas necessidades, ou para que possam apontar erros.
2. Testes de aceitação: depois da implementação, chamar representantes dos diferentes grupos de usuários para executar tarefas reais no sistema, verificando se as funcionalidades atendem aos requisitos estabelecidos.




# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

Principais stakeholders:

- Tutores dos animais: precisam agendar consultas, consultar informações dos seus animais e receber lembretes de vacinação.
- Veterinários: precisam acessar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- Recepcionistas: precisam organizar os horários disponíveis, confirmar consultas e realizar cancelamentos.
- Gerência: precisa acompanhar a quantidade de atendimentos realizados por meio de relatórios.
- Proprietário da clínica: define os objetivos do sistema, o orçamento e o prazo de desenvolvimento.
- Equipe de desenvolvimento: responsável por compreender os requisitos e desenvolver o sistema conforme as necessidades identificadas.

Técnicas de elicitação:

1\. Entrevistas: ter conversas individuais com veterinários, recepcionistas e gerência para saber como os processos funcionam atualmente, quais as dificuldades e funcionalidades que devem ser essenciais.

2\. Questionários: aplicar formulários pra os tutores para saber suas preferências sobre os agendamentos, lembretes de vacinação e outras funcionalidades.

## 2. Análise e especificação de requisitos

Requisitos funcionais (RF)

 RF01| O sistema deve permitir que os tutores cadastrem seus animais, informando nome, espécie, raça e idade.
 
 RF02| O sistema deve permitir que os tutores agendem consultas pelo aplicativo, escolhendo data e horário disponíveis.
 RF03| O sistema deve permitir que a recepção confirme e cancele consultas agendadas.
 RF04| O sistema deve permitir que os veterinários consultem o histórico médico dos animais.
 RF05| O sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos administrados aos animais. 

Requisitos não funcionais (RNF)

RNF01: O sistema deve apresentar tempo de resposta de até 3 segundos em pelo menos 95% das operações, considerando até 100 usuários simultâneos. 
RNF02: O sistema deve exigir autenticação para permitir o acesso aos dados dos tutores e históricos médicos dos animais.                         
RNF03: A interface deve permitir que um tutor realize um agendamento em até três minutos, sem precisar de ajuda de outra pessoa.                 

## 3. Negociação com MoSCoW

Must haven: Cadastro de animais, agendamento de consultas, controle de horários, consulta e registro do histórico médico. | São funcionalidades fundamentais para o funcionamento da clínica e para resolver os principais problemas existentes.

Should have: Lembretes de vacinação e relatórios de atendimentos.| São importantes para melhorar o acompanhamento dos animais e a gestão da clínica, mas o sistema consegue funcionar inicialmente sem elas.

Could have: Pagamentos pelo aplicativo e publicação de fotos dos animais.| São coisas adicionais que melhoram a experiência dos usuários, mas não é essenciais no inicio.

Won't hav: Chat com o veterinário.| Pode aumentar a complexidade do desenvolvimento e exigir disponibilidade dos profissionais para responder às mensagens. Por isso, será considerado em versões futuras.

Justificativa das funcionalidades adicionais:

- Pagamentos pelo aplicativo: exigem integração com serviços de pagamento e cuidados adicionais com segurança. Como o prazo é de quatro meses, essa funcionalidade pode ser adiada.
- Chat com o veterinário: pode facilitar a comunicação entre tutores e profissionais, mas exige uma estrutura de mensagens e gerenciamento de disponibilidade dos veterinários.
- Publicação de fotos: é interessante para os tutores, mas não contribui diretamente para resolver os principais problemas administrativos e médicos da clínica.

## 4. Especificação de requisitos não funcionais

RNF01 – Desempenho | O sistema deve responder às operações de consulta de histórico e agendamento em até 3 segundos em pelo menos 95% das solicitações, considerando muitos usuários usando ele no mesmo tempo. | Simular acessos simultâneos e medir o tempo de resposta das operações.

RNF02 – Segurança | O sistema deve exigir autenticação antes de permitir o acesso aos dados pessoais dos tutores e aos históricos médicos dos animais.| Tentar acessar essas informações sem realizar login e verificar se o acesso é bloqueado.

RNF03 – Usabilidade: Um tutor deve poder realizar um agendamento em até três minutos usando um celular. | Convidar tutores para realizar agendamentos e medir o tempo necessário para concluir a tarefa.

## 5. Validação dos requisitos

1\. Prototipação: desenvolver modelos visuais das principais telas do PetCare, como cadastro de animais, agendamento de consultas e histórico médico. Os stakeholders poderão visualizar e interagir com os protótipos, sugerindo alterações antes do início da programação.

2\. cenários de uso: mostrar situações reais, como um tutor tentando agendar uma consulta ou um veterinário registrando um diagnóstico. Os stakeholders poderão verificar se os requisitos permitem realizar essas atividades da maneira esperada.

Essas técnicas ajudam a evitar que a equipe desenvolva funcionalidades que não atendam às necessidades reais da clínica.

## 6. Desafio — Priorização da primeira versão

| Funcionalidade                  | Necessidade atendida                                                 | Quem será beneficiado             | Justificativa                                                                                                             |
| ------------------------------- | -------------------------------------------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| 1. Cadastro de animais          | Centralizar as informações dos animais em um único sistema.          | Tutores, veterinários e recepção. | É necessário ter os dados dos animais cadastrados para utilizar as demais funcionalidades.                                |
| 2. Agendamento de consultas     | Permitir que os tutores marquem consultas pelo celular.              | Tutores e recepção.               | Reduz a dependência de ligações telefônicas e mensagens pelo WhatsApp.                                                    |
| 3. Controle de horários         | Organizar os horários disponíveis e evitar conflitos de agendamento. | Recepção e veterinários.          | Permite controlar a agenda da clínica e evitar marcações duplicadas.                                                      |
| 4. Histórico médico dos animais | Registrar e consultar diagnósticos, tratamentos e medicamentos.      | Veterinários e tutores.           | Resolve um dos principais problemas atuais da clínica: a dificuldade de encontrar informações sobre consultas anteriores. |
| 5. Lembretes de vacinação       | Avisar os tutores sobre as datas de vacinação dos animais.           | Tutores e veterinários.           | Ajuda a manter a vacinação em dia e melhora o acompanhamento da saúde dos animais.                                        |

Riscos de adiar outras funcionalidades:

- Pagamentos pelo aplicativo: os tutores continuarão usando os meios de pagamento já disponíveis na clínica.
- Chat com o veterinário: a comunicação continuará acontecendo por telefone ou WhatsApp.
- Publicação de fotos: os tutores não terão um espaço próprio para compartilhar imagens dos animais, mas isso não prejudica o atendimento veterinário.
