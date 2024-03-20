<h2>SIMULADOR DE SISTEMAS DE ARQUIVO (JAVA)</h2>
O projeto AD2_2019_2.java, é um simulador de sistemas de arquivos proposto pela curso;
Considere que queiramos implementar um simulador de sistemas de arquivos, como o Explorer no Windows ou o Finder no MacOS. Um sistema de arquivos é composto de elementos, os quais podem ser pastas e/ou arquivos. 
Pastas, por sua vez, podem ter outras pastas e/ou arquivos internamente. Pastas e Arquivos possuem nomes. Arquivos também possuem um campo que informa o seu tamanho.
<h3>RESULTADO DESSA REPRODUÇÃO:</h3>
<pre>
c:/
  dir1
    arquivo2.txt
  dir3
    arquivo4.txt
  dir2
    arquivo3.txt
</pre>    
<h3>ESPECIFICAÇÃO DO PROJETO:</h3>
<pre>
public class AD2_2019_2 {
  public static void main(String[] args) {
    Pasta p1 = new Pasta("dir1");
    p1.adiciona(new Arquivo("arquivo1.txt", 150));
    p1.adiciona(new Arquivo("arquivo2.txt", 200));
    Pasta p2 = new Pasta("dir2");
    p2.adiciona(new Arquivo("arquivo3.txt", 500));
    Pasta p3 = new Pasta("dir3");
    p3.adiciona(new Arquivo("arquivo4.txt", 350));
    p3.adiciona(p2);
    Pasta raiz = new Pasta("c:/");
    raiz.adiciona(p1);
    raiz.adiciona(p3);
    raiz.remove("dir1/arquivo1.txt");
    System.out.println(raiz.getTamanho());
    System.out.println(raiz);
  }
}
</pre>
<ol>
<li> Implemente as classes Pasta e Arquivo, com seus atributos e construtores.</li>
<li>Implemente o método adiciona(). Na linha 4, por exemplo, está sendo adicionado ao diretório dir1 um arquivo chamado arquivo1.txt com tamanho de 150 bytes.</li>
<li>Implemente o método getTamanho(), chamado na linha 14, sabendo que para um arquivo o método retorna o seu tamanho, enquanto que para uma pasta o método retorna a soma do seu conteúdo (soma dos tamanhos dos arquivos + soma dos conteúdos das subpastas). Para o exemplo acima, o valor impresso na linha 15 é 1050.</li>
<li>Implemente o método remove(), o qual remove um elemento (arquivo ou pasta) do sistema.</li>
<li>Implemente um método de impressão chamado à partir do método toString() (linha 16), o qual imprima a saída do programa dado como abaixo. Ou seja, indente a saída (imprimir com tabulação - “\t”) de forma a respeitar a hierarquia no qual os elementos (arquivos e pastas) foram criados.</li>
</ol>
