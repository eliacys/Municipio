
package municipio;


public class Pessoa {
     // Caracterrísticas  
          String nome;
          int idade;
          char sexo;
          double rendaFixa;
     // Funcionalidades 
public void rendaAnual(){
          double resultado = this.rendaFixa * 12;
          System.out.println(resultado);
}         
}
