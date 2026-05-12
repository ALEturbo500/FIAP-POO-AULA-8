🧠 Pergunta de Reflexão
Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que Veiculo é abstract? Por que ele não deduz isso sozinho? 
Pense: Se esquecermos de colocar abstract, qual o risco que corremos? Alguém pode criar new Veiculo() e quebrar a lógica do nosso sistema?

Resposta: No mundo real, “Veículo” é apenas uma categoria geral, porque sempre existe um tipo específico, como carro, moto ou caminhão. 
Por isso usamos abstract: para impedir que alguém crie um objeto genérico que não faz sentido sozinho. 
O Java não deduz isso automaticamente porque ele não sabe a intenção do programador; uma classe pode ser genérica ou não dependendo da regra do sistema. 
Se esquecermos de colocar abstract, alguém poderia fazer new Veiculo() e criar objetos incompletos ou sem comportamento definido.
