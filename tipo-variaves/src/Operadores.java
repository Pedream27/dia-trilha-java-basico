import javax.lang.model.util.ElementScanner14;
import javax.print.DocFlavor.STRING;

public class Operadores {

    public static void main(String[] args) {
        int numero = 5; 
        System.out.println(numero ++); // ++ = a adicionar mais um //-- = a subitrair menos um // para que seja adcionado na impressão ele deve ser colocado na antes da "variavel" exempro (++/-- numero)
// boolean = false/treu
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




        



        
}


}
