# waterservicermi
Aplicação Servidora RMI para o cálculo do consumo ideal de água por uma pessoa. 

## Problema
Para podermos melhor entender o desenvolvimento de uma aplicação Cliente/Servidor através do RMI, iremos desenvolver uma solução básica para o problema apresentado a seguir.

### Quantidade de água que devemos consumir durante o dia
A água é o principal componente químico do nosso organismo. O ser humano consegue sobreviver muito mais tempo sem consumir alimentos do que sem ingerir água. Precisamos tanto da água, que cerca de 60% do peso do nosso corpo é composto apenas por ela. É comum ouvirmos que devemos ingerir dois litros de água por dia. Porém, esta medida de certa forma, pode variar de pessoa para pessoa e um dos fatores que podem alterar essa medida é o peso, por isso, um cálculo foi criado para estimar o volume de água necessário para cada pessoa.
Essa conta matemática considera que são necessários 35 ml de água para cada kg de peso corporal, dessa maneira, é necessário multiplicar seu peso em kg por 35 para obter o resultado em ml, por exemplo:
Por exemplo, uma pessoa pesando 80kg deverá beber 2,8 litros de água por dia, vejamos o cálculo:

**80 kg X 35 = 2.800 ml ou 2 litros e 800 ml**

### Aplicação Servidora
A nossa aplicação servidora terá um serviço disponibilizado aos seus clientes. Ela irá, baseado no peso de uma pessoa, informar a quantidade de água que a mesma deve consumir durante o dia.

### Composição da Aplicação Servidora
* Pacote interfaces
	* Interface IServiceBeberAgua
 * Pacote model
	 * Classe Pessoa
* Pacote service
	* Classe BeberAgua
	* Classe ServiceBeberAgua
* Pacote application
	* Classe Application
