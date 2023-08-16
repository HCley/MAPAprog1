
package mapaprog1;

import javax.swing.JOptionPane;

public class Triglicerideos extends EXAME {
    private int resultadoTrig;
    
    @Override
    public void cadastrarexame() {
        super.cadastrarexame();
        resultadoTrig = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Triglicerideos:"));
    }

    @Override
    public void mostrarexame() {
       String msg = "Nome: " + this.getNome() + "\n" ;
        msg += "Tipo sanguíneo: " + this.getTiposanguineo() + "\n" ;
        msg += "Ano de nascimento: " + this.getAnoNascimento() + "\n" ;
        msg+= "Triglicerideos" + this.resultadoTrig + " MG/l \n"; 
        JOptionPane.showMessageDialog(null, msg);
}
        
    public int getResultadoTrig() {
        return resultadoTrig;
    }

    public void setResultadoTrig(int resultadoTrig) {
        this.resultadoTrig = resultadoTrig;
    }
}  
