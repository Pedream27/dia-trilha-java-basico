import javax.lang.model.util.ElementScanner14;
import javax.print.DocFlavor.STRING;

public class Operadores {

    public static void main(String[] args) {
        int numero = 5; 
        System.out.println(numero ++); // ++ = a adicionar mais um //-- = a subitrair menos um // para que seja adcionado na impressão ele deve ser colocado na antes da "variavel" exempro (++/-- numero)
// boolean = false/treu

// operadores unitarios 
//(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
//(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
//(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
//(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
//(!) Operador unário lógico de negação – nega o valor de uma expressão booleana;
        boolean variavel = true;
        System.out.println(!variavel); // ! antes da variavel boolean inverta o valor
        System.out.println(variavel);  //temporariamente// serve tbm pro ++ 
        variavel = !variavel;      // para mudar teria q atribuir de novo a "variavel"
        System.out.println(variavel);   

        int a, b;

        a = 5;
        b = 5;

    // String resultado = "";
    // if(a==b)
    //     resultado = "Verdadeiro";
    // else 
    //    resultado = "Falso";
    //System.out.println(resultado); 
    //sem operador ternario (nao simplificada) "/" e ":" so funciona na função booleana
    
    String resultado = a == b ? "verdadeiro" : "Falso";
    System.out.println(resultado);

    // Relacionais 
    //== Quando desejamos verificar se uma variável é IGUAL A outra.
    //!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
    //> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    //>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    //< Quando desejamos verificar se uma variável é MENOR QUE outra.
    //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    int numero1, numero2;

    numero1 = 1;
    numero2 = 2;
    
    boolean simNao = numero1 == numero2;
    System.out.println("Numero1 é igual a o numero2 ? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("Numero1 é diferente do numero2 ? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("Numero1 é maior que o numero2 ? " + simNao);

    simNao = numero1 < numero2;
    System.out.println("Numero1 é menor que o numero 2 "  + simNao); 

    // Operadores logicos
   //  && Operador Lógico "E"
    // || Operador Lógico "OU"

    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2){
        System.out.println("As duas condiçoes sao verdadeiras ");
    }

    if(condicao1 || condicao2){
        System.out.println(" Uma das condiçoes é verdadeira ");
    }



    
}


}
