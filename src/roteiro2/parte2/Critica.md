1. Esta modelagem permite que usemos todas as instâncias de um único tipo (Pagamento)? 

    Sim, pois o pagamento pode ser feito por um cartão de crédito ou um Dinheiro.

2. Por que essa análise é importante?

    Porque ela nos permite identificar pontos de reaproveitamento de código e nos permite identificar pontos de melhoria de código, além de podermos implementar ou não um comportamento especifico para cada tipo de classe filha.

3. Tomando como referência o modelo formal do strategy, qual classe está a fazer o papel do Strategy e qual classe está a fazer o papel do cliente?

    A classe Pagamento tem o papel do Strategy e a classe Gateway tem o papel do cliente