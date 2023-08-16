
package mapaprog1;

public class MAPAprog1 {

  public static void main(String[] args) {

    EXAME exame = new Glicemia();
    exame.cadastrarexame();
    exame.mostrarexame();

    exame = new Colesterol();
    exame.cadastrarexame();
    exame.mostrarexame();

    exame = new Triglicerideos();
    exame.cadastrarexame();
    exame.mostrarexame();

  }

}
