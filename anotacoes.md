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

#### m<sub>i</sub> = Quantidade de processadores da maq<sub>i-1</sub>