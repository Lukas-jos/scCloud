public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci teste = new Fibonacci();
        //teste.fibonnaciLinear(10);
        Fibonacci teste2 = new Fibonacci();
        //teste.fibonacciRecursivo(10);
        //só descomentar o teste 1 e 2 pra rodar o código de cada um
    }
            public void fibonnaciLinear(int n){
                if (n <= 0) {
                    System.out.println("Não pode esse número, use um número positivo e maior que zero se não vai ficar caindo nesse erro ;)");
                    return;
                }
                int inicio = 0;
                int soma = 1;
                int proximo;
                for (int i = 0; i < n; i++) {
                    System.out.print(inicio + " ");
                    proximo = inicio + soma;
                    inicio = soma;
                    soma = proximo;
                }
            }
            //recursivo
            public void fibonacciRecursivo(int n) {
                if (n <= 0) {
                    System.out.println("Não pode esse número, use um número positivo e maior que zero se não vai ficar caindo nesse erro ;)");
                    return;
                }
                recursivoPraSegundaQuestao(n, 0, 1);
            }
            private void recursivoPraSegundaQuestao(int n, int inicio, int soma) {
                if (n > 0) {
                    System.out.print(inicio + " ");
                    recursivoPraSegundaQuestao(n - 1, soma, inicio + soma);
                }
            }
        }




