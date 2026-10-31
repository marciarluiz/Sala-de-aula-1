 atividade 1 - respostas

1 -   O problema apresentado é a insuficiência dos sistema atuais, que são lentos e dividem informações importantes em diferentes plataformas, pretende-se resolver criando um sistema novo que une essas diferentes informações numa aplicação só.

2 - Doscentes, Discentes e a administracao da universidade.

   Para entender as necessidades de todas as pessoas envolvidadas, se pode utilizar técnicas como entrevistas e o uso de questionar, para obter dados de natureza qualitativa e quantitativa.

3 - ID	Requisito
    RF01	O sistema deve permitir que usuários se autentiquem com login e senha para acessar as informações acadêmicas.
    RF02	O sistema deve permitir que o aluno consulte suas notas.
    RF03	O sistema deve permitir que o aluno consulte seus horários de aula.
    RF04	O sistema deve exibir avisos e notificações aos alunos.
    RF05	O sistema deve permitir que o professor publique materiais didáticos nas disciplinas.     
    RNF01	Todo acesso a informações acadêmicas deve exigir autenticação, e os dados devem trafegar de forma segura.
    RNF02	As consultas principais devem responder em até 3 segundos em condições normais de uso.
    RNF03	A interface deve ser intuitiva, permitindo que um aluno novo realize as consultas principais sem treinamento.

4 - 
Must have	- RF01, RF02, RF03, RF04, RF05, RNF01, RNF02, RNF03
Should have -	RF07, RNF05, RNF04
Could have	- Notificações por e-mail ou push, calendário integrado de eventos, filtros e busca de avisos	Melhoram a experiência, mas só devem ser feitos se sobrar tempo e orçamento.
Won’t have -	Chat entre alunos e professores

5 -
RNF01,	Desempenho	- Em condições normais de uso, as telas de notas, horários e avisos devem carregar em até 3 segundos em pelo menos 95% das requisições.Teste de carga com JMeter ou k6: simular 500 usuários simultâneos acessando as telas e medir o tempo de resposta. O teste é aprovado se o percentil 95 ficar em até 3 s.
RNF02, 	Desempenho - 	Durante o período de divulgação de notas, o sistema deve suportar 2.000 usuários simultâneos com taxa de erro inferior a 1%.	Teste de estresse: aumentar gradualmente a carga até 2.000 usuários e registrar a taxa de erros. Aprovado se ficar abaixo de 1%.
RNF03,	Segurança -	Nenhuma informação acadêmica pode ser acessada sem login. Tentativas de acesso sem autenticação devem retornar bloqueio em 100% dos casos, e a conta deve ser bloqueada por 15 minutos após 5 tentativas de login falhas.

6 - Se deve utilizar técnicas como prototipacao, revisao de versoes e aberturas de versoes testes.
