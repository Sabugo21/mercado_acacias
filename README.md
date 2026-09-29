 # 🛒 Sistema de Gestão de Estoque

 ## Supermercado Acácias

 **Localização:** Jardim das Acácias\
 **Ano:** 2026

 Sistema de gestão de estoque desenvolvido para o **Supermercado Acácias**, com o objetivo de centralizar e automatizar o controle de produtos, movimentações, validade, preços, pedidos e informações gerenciais.

---

 ## 👥 Equipe do Projeto

 | Função | Responsável |
| --- | --- |
| **Product Owner** | Vinicius de Oliveira Torres |
| **Scrum Master** | Bruno Rossi |
| **Front-end** | Sabrina / Carlos / Mayara |
| **Back-end** | Mateus / Vinicius |
| **DBA** | Maicon / Harley|

---

 ## 📑 Sumário

 - 1\. Introdução
  - 1.1 Tema
  - 1.2 Objetivo do Projeto
  - 1.3 Delimitação do Problema
  - 1.4 Justificativa da Escolha do Tema
  - 1.5 Método de Trabalho
  - 1.6 Organização do Trabalho
  - 1.7 Glossário
- 2\. Descrição Geral do Sistema
  - 2.1 Descrição do Problema
  - 2.2 Principais Envolvidos
  - 2.3 Regras de Negócio
- 3\. Requisitos do Sistema
  - 3.1 Requisitos Funcionais
  - 3.2 Requisitos Não-Funcionais
  - 3.3 Protótipo
  - 3.4 Métricas e Cronograma
- 4\. Análise e Design
  - 4.1 Diagrama de Caso de Uso
  - 4.2 Diagrama de Sequência
  - 4.3 Diagrama de Classes
  - 4.4 Modelo de Dados
- 5\. Implementação
- 6\. Testes
- 7\. Implantação
- 8\. Manual do Usuário
- 9\. Conclusões e Considerações Finais
- Anexo A — Análise Estratégica

---

 # 1\. Introdução

 ## 1.1 Tema

 Desenvolvimento de um **Sistema Web de Gestão de Estoque** voltado para o **Supermercado Acácias**, estabelecimento de pequeno porte localizado no bairro Jardim das Acácias.

 O sistema visa centralizar e automatizar o controle de produtos, movimentações e informações gerenciais.

 ## 1.2 Objetivo do Projeto

 Desenvolver um sistema web de gestão de estoque voltado para supermercados de pequeno e médio porte, com o propósito de:

 - Automatizar o controle de produtos.
- Reduzir perdas por vencimento ou ruptura de estoque.
- Apoiar o gestor na tomada de decisões com base em dados reais.
- Centralizar as informações relacionadas ao estoque.
- Melhorar o controle de entradas e saídas de mercadorias.

 ### Objetivos Específicos

 - Permitir o cadastro e gerenciamento de produtos, categorias e fornecedores.
- Registrar entradas e saídas de mercadorias em tempo real.
- Emitir alertas automáticos para produtos com estoque abaixo do mínimo.
- Monitorar datas de validade e notificar sobre produtos próximos ao vencimento.
- Gerar relatórios de movimentação por período e categoria.
- Apresentar dashboard com os principais indicadores do negócio.

 ## 1.3 Delimitação do Problema

 O escopo deste projeto limita-se ao desenvolvimento de um sistema de gestão de estoque para o **Supermercado Acácias**, abrangendo:

 - Cadastro de produtos.
- Controle de estoque.
- Alertas automáticos.
- Atualização de preços.
- Controle de pedidos.
- Geração de relatórios.
- Dashboard gerencial.

 Não estão incluídos no escopo:

 - Frente de caixa (PDV).
- Contabilidade fiscal.
- Integração com sistemas externos de Nota Fiscal Eletrônica.

 ## 1.4 Justificativa da Escolha do Tema

 O Supermercado Acácias enfrenta problemas operacionais recorrentes decorrentes da falta de um sistema centralizado de controle de estoque.

 Entre os principais problemas identificados estão:

 - Produtos vencidos gerando prejuízos, como o incidente de **R$ 340,00**.
- Divergências de preço que interrompem o atendimento.
- Rupturas de estoque causando perda de clientes.
- Dependência de planilhas desatualizadas.
- Falta de informações confiáveis para tomada de decisão.

 A implementação de um sistema adequado busca solucionar esses problemas e contribuir para uma gestão mais eficiente e sustentável do estabelecimento.

 ## 1.5 Método de Trabalho

 O projeto será desenvolvido utilizando a metodologia ágil **Scrum**, com sprints semanais planejadas e acompanhadas via Trello.

 As entregas serão organizadas em ciclos iterativos, com:

 - Revisões periódicas de progresso.
- Avaliação de qualidade.
- Organização das tarefas.
- Controle de versão através do GitHub.
- Documentação técnica baseada em padrões UML.

 ## 1.6 Organização do Trabalho

 O trabalho está organizado nos seguintes capítulos:

 | Capítulo | Descrição |
| --- | --- |
| **Capítulo 1** | Introdução, objetivos e metodologia |
| **Capítulo 2** | Descrição geral do sistema, problema, envolvidos e regras de negócio |
| **Capítulo 3** | Requisitos funcionais, não funcionais, protótipo e cronograma |
| **Capítulo 4** | Análise, design, diagramas UML e modelo de dados |
| **Capítulo 5** | Implementação e detalhes técnicos |
| **Capítulo 6** | Plano e execução dos testes |
| **Capítulo 7** | Implantação e manual de implantação |
| **Capítulo 8** | Manual do usuário |
| **Capítulo 9** | Conclusões e considerações finais |

## 1.7 Glossário

 | Termo | Definição |
| --- | --- |
| **ERP** | Enterprise Resource Planning — sistema de gestão integrada de recursos empresariais |
| **CRUD** | Create, Read, Update e Delete — operações básicas de banco de dados |
| **Dashboard** | Painel visual com indicadores e métricas |
| **Ruptura de estoque** | Ausência de um produto no momento em que o cliente deseja adquiri-lo |
| **Scrum** | Metodologia ágil de gerenciamento de projetos baseada em sprints |
| **Sprint** | Ciclo de trabalho de duração fixa dentro da metodologia Scrum |
| **MVC** | Model-View-Controller — padrão de arquitetura de software |
| **DAO** | Data Access Object — padrão para acesso ao banco de dados |
| **UML** | Unified Modeling Language — linguagem de modelagem de sistemas |
| **DER** | Diagrama Entidade-Relacionamento |
| **MER** | Modelo Entidade-Relacionamento |

---

 # 2\. Descrição Geral do Sistema

 ## 2.1 Descrição do Problema

 No bairro Jardim das Acácias, o Supermercado Acácias é referência há mais de 15 anos. Seu Jonas, proprietário, construiu o negócio do zero e atualmente emprega 12 pessoas, atendendo centenas de clientes por semana.

 Com o crescimento do estabelecimento, processos que anteriormente eram suficientes passaram a gerar problemas operacionais.

 ### Situação Atual

 **Ricardo**, gerente, controla os pedidos aos fornecedores através de uma planilha desatualizada, tomando decisões sem uma base de dados confiável.

 **Patrícia**, responsável pelo almoxarifado, depende de seu conhecimento e memória para controlar o estoque, o que gera dificuldades quando está ausente.

 **Fernanda**, operadora de caixa, frequentemente encontra divergências de preço entre o sistema e a gôndola.

 **Dona Carmen**, cliente fiel, começa a considerar outros estabelecimentos após encontrar produtos em falta repetidas vezes.

 ### Exemplo de Problemas

 Em uma sexta-feira de início de mês, três problemas ocorreram simultaneamente:

 1. Dona Carmen foi embora sem realizar sua compra devido à falta de feijão.
2. Patrícia encontrou duas caixas de iogurte vencido no depósito, gerando prejuízo de **R$ 340,00**.
3. Fernanda precisou interromper o atendimento no caixa, com seis clientes na fila, devido à divergência no preço do azeite.

 Diante desse cenário, identificou-se a necessidade de um sistema capaz de centralizar e automatizar o controle de estoque.

 ## 2.2 Principais Envolvidos e suas Características

 | Persona | Papel | Necessidade / Problema |
| --- | --- | --- |
| **Seu Jonas** | Proprietário / Administrador | Precisa de visibilidade gerencial e indicadores confiáveis para tomar decisões estratégicas |
| **Ricardo** | Gerente | Necessita de uma base de dados atualizada para controle de pedidos e prevenção de rupturas |
| **Patrícia** | Almoxarife | Precisa registrar entradas e saídas e receber alertas de vencimento |
| **Fernanda** | Operadora de Caixa | Necessita de preços sempre atualizados para evitar divergências |
| **Dona Carmen** | Cliente | Espera encontrar produtos disponíveis e preços corretos |

## 2.3 Regras de Negócio

 | ID | Regra |
| --- | --- |
| **RN01** | Todo produto cadastrado deve possuir obrigatoriamente nome, categoria, preço, quantidade e data de validade. |
| **RN02** | Quando a quantidade em estoque atingir ou ultrapassar o limite mínimo configurado, o sistema deve emitir alerta automático ao gerente. |
| **RN03** | Produtos com data de validade inferior a 7 dias devem ser destacados no painel com alerta de urgência. |
| **RN04** | Somente usuários com perfil Administrador ou Gerente podem alterar preços de produtos. |
| **RN05** | O registro de saída de produtos não pode resultar em quantidade negativa no estoque. |
| **RN06** | Todo pedido a fornecedor deve ser registrado no sistema com data, produtos solicitados e quantidades. |
| **RN07** | O dashboard deve ser atualizado em tempo real, refletindo as movimentações de estoque imediatamente. |

---

 # 3\. Requisitos do Sistema

 ## 3.1 Requisitos Funcionais

 | ID | Requisito | Descrição | Usuário |
| --- | --- | --- | --- |
| **RF01** | Cadastro de Produtos | Permite cadastrar nome, categoria, validade, preço e quantidade | Patrícia / Ricardo |
| **RF02** | Controle de Estoque | Registro de entrada e saída de produtos com atualização automática | Patrícia |
| **RF03** | Alerta de Estoque Mínimo | Notificação automática quando a quantidade atingir o mínimo configurado | Ricardo |
| **RF04** | Controle de Vencimento | Alerta de produtos próximos ao vencimento | Patrícia |
| **RF05** | Atualização de Preços | Permite edição dos preços conforme necessidade operacional | Ricardo / Fernanda |
| **RF06** | Controle de Pedidos | Acompanhamento e registro de pedidos realizados com base no estoque mínimo | Ricardo |
| **RF07** | Relatório de Estoque | Geração de relatório da situação atual de quantidade e validade | Seu Jonas |
| **RF08** | Dashboard Gerencial | Painel com os principais indicadores do negócio em tempo real | Seu Jonas |

## 3.2 Requisitos Não-Funcionais

 | ID | Categoria | Descrição |
| --- | --- | --- |
| **RNF01** | Desempenho | O sistema deve ser estável e responder rapidamente às interações dos usuários |
| **RNF02** | Disponibilidade | O sistema deve permanecer online a maior parte do tempo, com mínima indisponibilidade |
| **RNF03** | Compatibilidade | O sistema deve ser compatível com diferentes computadores e sistemas operacionais |
| **RNF04** | Segurança | Senhas e dados sensíveis devem ser armazenados de forma segura e criptografada |
| **RNF05** | Escalabilidade | O banco de dados deve suportar o crescimento do volume de dados sem degradação significativa de performance |

## 3.3 Protótipo

 > 🚧 **Em desenvolvimento**

 Adicionar nesta seção os prints das principais telas do sistema.

 Exemplo:

```
docs/
└── imagens/
    ├── login.png
    ├── dashboard.png
    ├── produtos.png
    ├── estoque.png
    └── pedidos.png
```

 ### Exemplos de telas

 #### Login

 #### Dashboard

 #### Cadastro de Produtos

 ## 3.4 Métricas e Cronograma

 O projeto será gerenciado utilizando o **Trello**, com as seguintes sprints planejadas:

 | Sprint | Período | Entregáveis |
| --- | --- | --- |
| **Sprint 1** | Semanas 1–2 | Levantamento de requisitos, documentação inicial e modelagem do banco |
| **Sprint 2** | Semanas 3–4 | Desenvolvimento do cadastro de produtos e autenticação |
| **Sprint 3** | Semanas 5–6 | Controle de estoque, entradas, saídas e sistema de alertas |
| **Sprint 4** | Semanas 7–8 | Relatórios, dashboard gerencial e atualização de preços |
| **Sprint 5** | Semanas 9–10 | Testes, ajustes, documentação final e implantação |

---

 # 4\. Análise e Design

 ## 4.1 Diagrama de Caso de Uso

 Os principais casos de uso identificados para o sistema são:

 | Ator | Casos de Uso |
| --- | --- |
| **Cliente** | Realizar compra |
| **Operador de Caixa** | Registrar venda / Consultar preço |
| **Estoquista — Patrícia** | Atualizar estoque / Controlar validade |
| **Gerente — Ricardo** | Fazer pedido ao fornecedor / Gerar relatório |
| **Administrador — Seu Jonas** | Cadastrar produto / Atualizar preços / Visualizar dashboard |

### Diagrama

 > 🚧 **Adicionar imagem do diagrama de caso de uso**

 ## 4.2 Diagrama de Sequência

 ### Fluxo principal de uma venda

```
Cliente → Caixa: realizar compra
Caixa → Sistema: buscar produto
Sistema → Estoque: verificar quantidade
Estoque → Sistema: retornar disponibilidade
Sistema → Caixa: retornar preço
Caixa → Sistema: finalizar venda
Sistema → Estoque: reduzir quantidade automaticamente
```

 ### Diagrama

 ## 4.3 Diagrama de Classes

 As principais classes do sistema são:

 ### Produto

 | Atributo / Método | Descrição |
| --- | --- |
| `id` | Identificador |
| `nome` | Nome do produto |
| `preco` | Preço do produto |
| `validade` | Data de validade |
| `quantidade` | Quantidade em estoque |
| `atualizarPreco()` | Atualiza o preço do produto |

### Venda

 | Atributo / Método | Descrição |
| --- | --- |
| `id` | Identificador |
| `data` | Data da venda |
| `valorTotal` | Valor total |
| `finalizarVenda()` | Finaliza a venda |

### Fornecedor

 | Atributo / Método | Descrição |
| --- | --- |
| `id` | Identificador |
| `nome` | Nome do fornecedor |
| `telefone` | Telefone de contato |
| `fornecerProduto()` | Operação relacionada ao fornecimento |

### Diagrama

 ## 4.4 Modelo de Dados

 ### 4.4.1 DER — Diagrama Entidade-Relacionamento

 ### 4.4.2 MER — Modelo Entidade-Relacionamento

 ### 4.4.3 Dicionário de Dados

 | Tabela / Entidade | Atributo | Tipo | Descrição |
| --- | --- | --- | --- |
| **Produto** | `id` | INT (PK) | Identificador único do produto |
| **Produto** | `nome` | VARCHAR(100) | Nome do produto |
| **Produto** | `categoria` | VARCHAR(50) | Categoria do produto |
| **Produto** | `preco` | DECIMAL(10,2) | Preço de venda |
| **Produto** | `validade` | DATE | Data de vencimento |
| **Produto** | `quantidade` | INT | Quantidade atual em estoque |
| **Venda** | `id` | INT (PK) | Identificador único da venda |
| **Venda** | `data` | DATETIME | Data e hora da realização da venda |
| **Venda** | `valorTotal` | DECIMAL(10,2) | Valor total da venda |
| **Fornecedor** | `id` | INT (PK) | Identificador único do fornecedor |
| **Fornecedor** | `nome` | VARCHAR(100) | Nome do fornecedor |
| **Fornecedor** | `telefone` | VARCHAR(20) | Telefone de contato |

---

 # 5\. Implementação

 ## Arquitetura do Sistema

 O sistema adotará a arquitetura **MVC (Model-View-Controller)** juntamente com o padrão **DAO (Data Access Object)**, buscando separar responsabilidades e facilitar a manutenção.

```
┌─────────────────────────┐
│          VIEW           │
│   Interface do usuário  │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│       CONTROLLER        │
│ Controle das operações  │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│          MODEL          │
│ Dados e regras negócio  │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│           DAO           │
│ Acesso e persistência   │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│          MySQL          │
│     Banco de Dados      │
└─────────────────────────┘
```

 ### Model

 Camada responsável pela representação dos dados e regras de negócio.

 ### View

 Interface gráfica com o usuário, desenvolvida em Java utilizando:

 - `JDesktopPane`
- `JFrame`
- `JInternalFrame`

 ### Controller

 Camada responsável por intermediar as operações entre **Model** e **View**.

 ### DAO

 Camada responsável pelo acesso e persistência dos dados no **MySQL**.

 ## Módulo Desktop — Java

 O módulo desktop será desenvolvido em Java e contará com:

 - Sistema de login.
- Três níveis de acesso:
  - Administrador.
  - Gerente.
  - Usuário Comum.
- CRUD completo para:
  - Funcionários.
  - Usuários.
  - Produtos.
- Interface gráfica utilizando:
  - `JDesktopPane`.
  - `JFrame`.
  - `JInternalFrame`.
- `JTabbedPane` ou `CardLayout` para melhorar a experiência do usuário.

 ## Módulo Web

 O portal institucional será desenvolvido utilizando **WordPress**, com customizações em:

 - HTML5.
- CSS3.
- Bootstrap.
- JavaScript.
- Elementor.

 ### Seções previstas

 - Home.
- Sobre.
- Missão, Visão e Valores.
- Menus estruturados.
- Âncoras.

 ### Recursos visuais

 - Efeitos Parallax.
- Carrosséis.
- Customizações avançadas utilizando Elementor.

 ## Banco de Dados

 Será utilizado o **MySQL** como Sistema Gerenciador de Banco de Dados (SGBD).

 Como diferencial, serão implementados **Jobs de automatização** para geração de relatórios diários utilizando consultas SQL programadas.

---

 # 6\. Testes

 ## 6.1 Plano de Testes

 > 🚧 **Em desenvolvimento**

 Nesta seção serão documentados:

 - Casos de teste.
- Cenários de teste.
- Dados utilizados.
- Resultado esperado.
- Resultado obtido.
- Status do teste.

 ## 6.2 Execução do Plano de Testes

 > 🚧 **Em desenvolvimento**

 Os resultados dos testes serão registrados conforme a implementação do sistema.

---

 # 7\. Implantação

 ## 7.1 Diagrama de Implantação

 > 🚧 **Em desenvolvimento**

 ## 7.2 Manual de Implantação

 > 🚧 **Em desenvolvimento**

 O manual deverá conter as instruções necessárias para instalação, configuração e execução do sistema.

---

 # 8\. Manual do Usuário

 > 🚧 **Em desenvolvimento**

 O manual do usuário deverá apresentar as principais funcionalidades do sistema, incluindo:

 - Login.
- Cadastro de produtos.
- Consulta de estoque.
- Entrada de produtos.
- Saída de produtos.
- Controle de validade.
- Atualização de preços.
- Controle de pedidos.
- Relatórios.
- Dashboard gerencial.

---

 # 9\. Conclusões e Considerações Finais

 O presente projeto propõe uma solução tecnológica para os desafios operacionais enfrentados pelo **Supermercado Acácias**.

 Por meio do desenvolvimento de um sistema de gestão de estoque, espera-se:

 - Eliminar perdas relacionadas a produtos vencidos através de alertas automáticos.
- Reduzir rupturas de estoque através de notificações de quantidade mínima.
- Padronizar os preços praticados.
- Eliminar divergências entre sistema e gôndola.
- Proporcionar ao gestor uma visão gerencial através de dashboard em tempo real.
- Substituir planilhas manuais por um processo automatizado e confiável.

 A implementação deste sistema busca contribuir para:

 - Maior eficiência operacional.
- Redução de prejuízos.
- Melhoria da experiência dos clientes.
- Maior controle das operações.
- Melhor tomada de decisão.
- Maior competitividade do estabelecimento.

 Os conhecimentos técnicos aplicados incluem:

 - Engenharia de Software.
- Desenvolvimento desktop em Java.
- Desenvolvimento Web.
- Banco de Dados MySQL.
- Arquitetura MVC.
- Padrão DAO.
- UML.
- Metodologia Scrum.

---

 # 📎 Anexo A — Análise Estratégica

 ## Matriz SWOT

 A análise SWOT sintetiza os fatores internos e externos que impactam o negócio.

 | Ambiente Interno | Ambiente Externo |
| --- | --- |
| **Pontos Fortes** | **Oportunidades** |
| Reputação de mais de 15 anos no mercado | Melhora no atendimento ao cliente |
| Base sólida de clientes fiéis | Controle eficiente de estoque |
| Conhecimento do próprio negócio e do bairro | Melhora na relação com fornecedores |
|  | Reposição ágil de produtos |
| **Pontos Fracos** | **Ameaças** |
| Falta de planejamento estruturado | Perda de clientes para a concorrência |
| Falta de organização nos processos | Prejuízos com produtos vencidos |
| Ausência de atualização tecnológica | Planilhas de pedidos e preços desatualizadas |

---

 # 🔄 Metodologia PDCA

 A metodologia **PDCA (Plan-Do-Check-Act)** foi aplicada para estruturar a melhoria contínua do sistema de atendimento do Supermercado Acácias.

 ## P — Plan (Planejar)

 ### Problemas identificados

 - Controle de pedidos realizado por planilha desatualizada.
- Divergências de preço entre sistema e gôndola.
- Falta de controle de vencimento de produtos.
- Ausência de controle de quantidade mínima em estoque.

 ### Objetivo

 Automatizar o controle de produtos, reduzir perdas por vencimento ou ruptura de estoque e apoiar o gestor na tomada de decisões com base em dados reais.

 ### Plano de Ação

 | Ação | Responsável | Prazo |
| --- | --- | --- |
| Analisar desempenho do servidor | Equipe de TI | 5 dias |
| Otimizar banco de dados | Desenvolvedor | 10 dias |
| Atualizar equipamentos | Gestão | 20 dias |
| Realizar testes de carga | Equipe de TI | 25 dias |

## D — Do (Executar)

 - Análise do servidor realizada.
- Banco de dados otimizado.
- Equipamentos antigos substituídos.
- Testes de carga executados para simular múltiplos acessos simultâneos.

 ## C — Check (Verificar)

 Após a execução das ações:

 - O sistema apresentou desempenho melhorado.
- O tempo de resposta apresentou redução de **45%**.
- As filas no atendimento diminuíram.
- Houve redução significativa nas reclamações dos clientes.

 ### Resultado

 O objetivo foi considerado alcançado.

 ## A — Act (Agir)

 ### Padronização e manutenção contínua

 - Criar rotina mensal de manutenção do sistema.
- Monitorar o desempenho diariamente.
- Atualizar o sistema periodicamente conforme novas necessidades.

---

 ## 📁 Estrutura sugerida do projeto

```
sistema-gestao-estoque/
│
├── README.md
│
├── docs/
│   ├── imagens/
│   │   ├── login.png
│   │   ├── dashboard.png
│   │   ├── produtos.png
│   │   ├── estoque.png
│   │   └── pedidos.png
│   │
│   └── diagramas/
│       ├── caso-de-uso.png
│       ├── sequencia.png
│       ├── classes.png
│       ├── der.png
│       ├── mer.png
│       ├── banco-de-dados.png
│       └── implantacao.png
│
├── src/
│   └── ...
│
└── database/
    ├── schema.sql
    └── seeds.sql
```

---

 ## 📌 Status do Projeto

 > 🚧 **Em desenvolvimento**

 O projeto encontra-se em fase de desenvolvimento, documentação e implementação das funcionalidades planejadas.

---

 ## 👨‍💻 Equipe

 **Product Owner:** Vinicius de Oliveira Torres\
 **Scrum Master:** Bruno Rossi\
 **Front-end:** Sabrina / Carlos\
 **Back-end:** Mateus / Vinicius\
 **DBA:** Maicon

 **Supermercado Acácias — Jardim das Acácias — 2026**
