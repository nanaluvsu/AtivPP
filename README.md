# Proposta

- Fazer um programa que implementa um tipo de thread que gera pontos aleatórios dentro de um quadrado de lado medindo **n** cm (n será digitado) centrado na origem de um sistema cartesiano.

- Os pontos **(x,y)**, com ```-n/2 <= x <= n/2``` aleatório, e com ```-n <= x <= n``` também aleatório, devem ser contados, assim como devem ser contados os que se localizarem dentro do círculo inscrito no quadrado.
O construtor de Thread deve receber por quanto ela deverá rodar (esse valor será digitado na main).

- As threads devem ter métodos:
```java int getTotalPontosGerados()```
```java int getQtdPontosDentroDoCirculoInscrito()```
e eles só podem ser chamados quando a thread finalizar.

- A main deve mostrar ao final o resultado desses métodos aplicados às threads.

- A main deve "startar" **t** threads, sendo **t** a quantidade de processadores.

# Métodos

- Gerar aleatórios entre **-n/2** e **n/2**:

```java 
double x = Math.random() * n - n/2;
double y = Math.random() * n - n/2;
```

- Saber se **(x,y)** está dentro do círculo:
```java
if (x*x + y*y <= n/2)
```

- Saber quantos milissegundos demora para executar um trecho de programa:

```java
    long inicio = System.nanotime();
    long fim = System.nanotime()/
    long diferencaMs = (fim - inicio)/1000000
```