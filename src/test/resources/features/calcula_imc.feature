@calcula_imc
Feature: Calcular o IMC dado o peso e a altura de uma pessoa
  Quero saber com essa funcionalidade o imc da pessoa e como ela está classificada segundo uma tabela

  @sua_issue_jira_9999
  Scenario Outline: Verificacao de IMC
    Given Usuario informou o peso <peso>
    And Usuario informou a altura <altura>
    When pedir para calcular 
    Then demonstra o imc <imc>
    And demonstra a classificacao <classificacao>

    Examples: 
      | peso    | altura | imc   | classificacao |
      | 50.0    |   1.80 | 15.43 | "Magreza"     |
      | 70.0    |   1.80 | 21.6  | "Normal"      | 
      | 90.0    |   1.80 | 27.78 | "Sobrepeso"   | 
      | 110.0   |   1.80 | 33.95 | "Obesidade"   | 
      | 180.0   |   1.80 | 55.56 | "Obesidade grave" |
