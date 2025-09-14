# ClinicaMedica

Sistema simples para gerenciamento de atendimentos em uma clínica médica.

## Estrutura do Projeto

```
src/
├── model/
│   └── Paciente.java
├── service/
│   ├── FilaDeAtendimento.java
│   └── PilhaHistoricoAtendimentos.java
└── GerenciadorClinica.java
```

## Funcionalidades

- Adicionar pacientes à fila de atendimento
- Atender pacientes e registrar no histórico
- Exibir fila de atendimento
- Exibir histórico de atendimentos
- Validação de entradas numéricas sem uso de try-catch
- Uso de LinkedList para fila e Stack para histórico

## Como Compilar e Executar

1. Abra o projeto no IntelliJ IDEA
2. Compile o projeto
3. Execute `GerenciadorClinica.java`
4. Siga o menu interativo no console
