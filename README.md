Exercícios I

 Crie uma classe em java chamada ContaBancaria, com os seguintes atributos,  nomeCliente,  numConta,  saldo, método sacar (o saldo não pode ficar negativo), método depositar. Feito isso acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaCorrente, com as seguintes características a mais. 

 A Classe ContaPoupanca, deve ter o seguinte atributo, diaDeRendimento (tipo int), possui o método calcularNovoSaldo, esse método recebe a taxa e o dia rendimento da poupança  e verifica se atualiza o saldo. 

 OBS:a remuneração da caderneta de poupança  é creditada mensalmente apenas em sua data de “aniversário”, que é o dia do mês em que o depósito foi feito. Assim, uma aplicação realizada no dia 10 de um determinado mês só fará jus à remuneração exatamente no dia 10 do mês seguinte.

 Já a classe ContaCorrente deve ter o atributo limite e a redefinição do método sacar, permitindo saldo negativo até o valor do limite.
 
  Após a implementação das classes acima, você deverá implementar uma classe Contas.Java, contendo o método main. Nesta classe, você deverá implementar:

 - Incluir dados relativos a(s) conta(s) de um cliente;
 - Sacar um determinado valor da(s) sua(s) conta(s);
 - Depositar um determinado valor na(s) sua(s) conta(s);
 - Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;
 - Mostrar saldo  da em conta corrente
