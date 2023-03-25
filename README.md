# waterservicermi
Aplicação Servidora RMI para o cálculo do consumo ideal de água por uma pessoa. 

## Problema
Para entendermos melhor o desenvolvimento de uma aplicação Cliente/Servidor através do RMI, iremos desenvolver uma solução básica para o problema apresentado a seguir.

### Quantidade de água que devemos consumir durante o dia
A água é o principal componente químico do nosso organismo. O ser humano consegue sobreviver muito mais tempo sem consumir alimentos do que sem ingerir água. Precisamos tanto da água, que cerca de 60% do peso do nosso corpo é composto apenas por ela. É comum ouvirmos que devemos ingerir dois litros de água por dia. Porém, esta medida de certa forma, pode variar de pessoa para pessoa e um dos fatores que podem alterar essa medida é o peso, por isso, um cálculo foi criado para estimar o volume de água necessário para cada pessoa.
Essa conta matemática considera que são necessários 35 ml de água para cada kg de peso corporal, dessa maneira, é necessário multiplicar seu peso em kg por 35 para obter o resultado em ml, por exemplo:
Por exemplo, uma pessoa pesando 80kg deverá beber 2,8 litros de água por dia, vejamos o cálculo:

**80 kg X 35 = 2.800 ml ou 2 litros e 800 ml**

### Aplicação Servidora
A nossa aplicação servidora terá um serviço de cálculo disponibilizado aos seus clientes. Ela irá, baseado no peso de uma pessoa, informar a quantidade de água que a mesma deve consumir durante o dia.

### Composição da Aplicação Servidora
* Pacote interfaces
	* Interface IServiceBeberAgua
 * Pacote model
	 * Classe Pessoa
* Pacote service
	* Classe BebeAgua
	* Classe ServiceBeberAgua
* Pacote application
	* Classe Application

## Interface IServiceBeberAgua
Nesta interface serão definidos os métodos que poderão ser acessados remotamente pelos Clientes (aplicação WaterClient). A interface remota é fundamental na implementação dos serviços remotos. Esta interface será uma dependência necessária no lado do cliente. O cliente deve ter um pacote e interface, com o mesmo nome que foi definido no lado do servidor (caso contrário teremos mensagens de erro na interação do cliente com o servidor).
## Classe Pessoa
Nesta classe será definida um POJO (Plain Old Java Object) que representará uma pessoa (com nome e peso). Esta classe será usada na chamada do serviço remoto e será uma dependência necessária no lado do cliente. Todo objeto que trafega pela rede deve obrigatoriamente implementar Serializable. O cliente deve ter um pacote e classe, com o mesmo nome que foi definido no lado do servidor (caso contrário teremos mensagens de erro na interação do cliente com o servidor). 
## Classe BebeAgua
Esta classe implementa o cálculo da quantidade de água a ser bebida por uma pessoa. Ela possui um método que recebe um objeto pessoa e retorna a quantidade de água (um valor double) que a mesma deverá consumir durante o dia. Esta classe será usada pela classe que implementa a chamada de um método remoto. Não é interessante a partir de uma classe que já existe e realiza ações locais, expor diretamente seus serviços (seus métodos). Esta classe será usada internamente na classe ServiceBeberAgua que implementa a interface remota.
## Classe ServiceBeberAgua
Esta classe implementa a interface IServiceBeberAgua, ou seja, esta classe dará "corpo" (implementação) para o método remoto e abstrato, definido na interface. Este método implementado aqui, fará uso da classe BebeAgua, que realiza de fato o cálculo necessário àqueles que fizerem uso/requisitarem do serviço remoto. Uma característica importante desta classe é que ela deve ter um construtor vazio (sem parâmetros) e o mesmo deve lançar uma RemoteException.
## Classe Application
Esta classe ativa o servidor. Ela possui o método main e ao ser chamado, realiza as ações básicas do acionamento dos serviços do RMI fazendo com que o servidor fique rodando, aguardando por requisições de clientes. No método main são realizadas as ações de registro do repositório, criação de um objeto remoto, vínculo do objeto local a um endereço remoto e consequentemente, aguardo por solicitações.
