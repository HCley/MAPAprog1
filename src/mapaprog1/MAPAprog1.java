
package mapaprog1;

public class MAPAprog1 {

    
    public static void main(String[] args) {
       
      // EXAME exame = new EXAME();  
       //exame.cadastrarexame();
       //exame.mostrarexame();
       
       Glicemia exaG = new Glicemia();
       exaG.cadastrarexame();
       exaG.mostrarexame();
       
       Colesterol Coles = new Colesterol();
       Coles.cadastrarexame();
       Coles.mostrarexame();
       
    }
    
}
