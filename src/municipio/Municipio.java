
package municipio;

import java.util.Scanner;


public class Municipio {

    
    public static void main(String[] args) {
         //Atributos      
             String nome;
             int idade;
             char sexo;
             double renda;
         // Objeto para leitura
             Scanner pegar= new Scanner(System.in);
         //Entrevistas
           Pessoa pessoa1 = new Pessoa();
                 System.out.println("Informe seu nome: ");
                 pessoa1.nome = pegar.nextLine();
                 System.out.println("Informe sua idade: ");
                 pessoa1.idade = pegar.nextInt();
                 System.out.println("Informe sua renda: ");
                 pessoa1.rendaFixa = pegar.nextDouble();
                 System.out.println("Informe sua sexo:  ");
                 pessoa1.sexo = pegar.next().charAt(0);
            Pessoa pessoa2 = new Pessoa();
                 System.out.println("Informe seu nome: ");
                 pessoa2.nome = pegar.next();
                 System.out.println("Informe sua idade: ");
                 pessoa2.idade = pegar.nextInt();
                 System.out.println("Informe sua renda: ");
                 pessoa2.rendaFixa = pegar.nextDouble();
                 System.out.println("Informe sua sexo:  ");
                 pessoa2.sexo = pegar.next().charAt(0);
            Pessoa pessoa3 = new Pessoa();
                 System.out.println("Informe seu nome: ");
                 pessoa3.nome = pegar.next();
                 System.out.println("Informe sua idade: ");
                 pessoa3.idade = pegar.nextInt();
                 System.out.println("Informe sua renda: ");
                 pessoa3.rendaFixa = pegar.nextDouble();
                 System.out.println("Informe sua sexo:  ");
                 pessoa3.sexo = pegar.next().charAt(0);
         //Printando uma pessoa
            System.out.println(pessoa1);          
         //Criando um vetor para salvar um objeto
            Pessoa[] listaPessoas = {pessoa1, pessoa2, pessoa3};
        // Calculando a média das pessoas
                 int totalIdade = 0, quantidade = 0;
                 for(Pessoa pessoa : listaPessoas ){
                      totalIdade = totalIdade + pessoa.idade;
                      quantidade = quantidade +1;
                 }
                 float mediaIdade = (float) totalIdade / quantidade;
                 System.out.printf("%.2f", mediaIdade);
    }
    
}
