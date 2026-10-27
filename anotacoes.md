# Anotacoes

*honestamente tinha jeito melhor de anotar mas meh*

## Programação Distribuída

- Ainda usa threads e sockets, como na Arquitetura Cliente-Servidor

### Arquitetura

- Cliente -> Maq 1
    - Socket 1
    - Socket 2
    - Socket n
- Servidor 1 -> Maq 2
    - Socket -> Socket 1 Cliente
    - m<sub>1</sub> Threads
- Servidor 2 -> Maq 3
    - Socket - > Socket 2 Cliente
    - m<sub>2</sub> Threads
- Servidor n --> Maq n
    - Socket
    - m<sub>n</sub> Threads

#### OBS:
- Cliente não é chamado de Cliente, mas de "Programa com comportamento de Cliente". 
- Mesmo se aplica ao Servidor, sendo chamado de "Programa com comportamento de Servidor".
#### m<sub>i</sub> = Quantidade de processadores da maq<sub>i-1</sub>

Exemplificando com a prova, cada thread Processadora era um Servidor, onde cada uma enviava a sua resposta. A thread Distribuidora, nesse caso, seria o Cliente, recebendo as respostas de cada servidor.

## Revisão: Conexão entre máquinas via Socket

Para divisão de dados, solicitar a cada servidor o número de processadores da máquina e dividir por esse.

### Como o cliente sabe com quantas e quais máquinas se comunicar?
- Precisa saber o IP da máquina.
- Para isso, após rodar o programa, tenta conectar com as máquinas da rede. Por apenas x máquinas estarem rodando, apenas x máquinas irão responder, obtendo os endereços IP.
- Pode também usar um arquivo de configuração com máquinas definidas.

---

Computador pronto para uso -> 20:05

## Revisão

Sempre existirá um proativo e um reativo, e o reativo sempre será o Servidor, respondendo o Cliente, o proativo.

Usa-se IP ou nome simbólico para identificar a máquina

### Tratamento do args

Utilizamos args para enviar parâmetros do Windows ao programa para a execução.

*return 0 em C -> envia parâmetros do programa ao Windows.*

```return 0 ``` em C equivale a ```System.exit(0)``` em Java


```
public static final String DEFAULT_PORT = "3000"
if (args.length > 1) {
    System.err.println("Uso esperado: java Servidor [Porta]\n")
}
String porta = Servidor.DEFAULT_PORT;
if (args.length == 1) {
    porta = args[0]
}

ArrayList<Parceiro> usuarios = new ArrayList<Parceiro>

AceitadoraConexao aceitadoraDeConexao = null;

try {
    aceitadoraDeConexao = new AceitadoraConexao(porta,usuarios);
    aceitadoraDeConexao.start();
} catch (Exception ex) {
    System.err.println(ex);
    return
}

for (;;) {
    System.out.println("Servidor ativo. Para desativar, use o comando: ");
    #Algum comando
}

```
