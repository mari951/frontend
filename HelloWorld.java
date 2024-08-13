/**

*public:declaração que espera "exporta" e permite que a classe/método/variável seja importada/reutilizada em outras classes/objetos 
* classe: declaração de classe (que poderá se tornar um objeto)
*HelloWorld:nome da classse,seguindo o padrão de nomenclatura PascalCase
* { ("abre" chave):serve para declaração o inicio de um bloco de codigo/ações}
} ("fecha" chave):serve para declarar o fim de um bloco de códigos/ações 
*/
public class HelloWorld {// Aqui é criada a classe HelloWord}

/**

*static:declaração de método somente leitura,o qual não poderá ser editado,exceto pelo uso de @Override 
* void:modo protegido de um método,o qual não retornará qaulquer valor 
*main : nome do método "executor"
* ( ("abre" parênteses):serve para declarar o inicio das declarações de parametros de um metodo/funcão 
*) (fecha parenteses):serve para declarar o fim das declarações de parametros de um metodo/funcão
*@param args 
*System:invoca a classe 
* . (ponto): serve como operador de invocação de método 
*out: invoca a subclasse de saída do sistema 
*println:invoca o metodo,ou função abstrata,o qual irá"imprimir"na tela uma string
* " Hello World ": texto (string)que será "impresso"na tela 
* : (ponto e virgula ): serve para encerrar uma linha de código
*/
public static void main (String[] args) {// Aqui é criado o método executor main 
System.out.println(x:"Hello World !!!"); // Aqui é "impressa" uma linha com o texto "Hello World"
} // Aqui encerra o bloco de código do método main 
} // Aqui encerra o bloco de codigo da classe HelloWorld 


