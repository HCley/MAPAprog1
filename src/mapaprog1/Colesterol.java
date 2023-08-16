
package mapaprog1;

import javax.swing.JOptionPane;

public class Colesterol extends EXAME {
    private int resultadocolesterolldl;
    private int resultadocolesterolhdl;
  

      
    
   
    @Override
    public void cadastrarexame() {
        super.cadastrarexame();
        resultadocolesterolldl = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de LDL: \n"));
       
        resultadocolesterolhdl = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de HDL: \n"));
    }

    @Override
    public void mostrarexame() {
        String msg = "Nome: " + this.getNome() + "\n" ;
        msg += "Tipo sanguíneo: " + this.getTiposanguineo() + "\n" ;
        msg += "Ano de nascimento: " + this. getAnoNascimento() + "\n" ;
        msg += "Valor de LDL do Colesterol: " + this.resultadocolesterolldl + " MG/l \n";
        msg += "Valor de HDL do Colesterol: " + this.resultadocolesterolhdl + "MG/L \n";
        JOptionPane.showMessageDialog(null, msg);
        
    }

    public int getResultadocolesterolldl() {
        return resultadocolesterolldl;
    }

    public void setResultadocolesterolldl(int resultadocolesterolldl) {
        this.resultadocolesterolldl = resultadocolesterolldl;
    }

    public int getResultadocolesterolhdl() {
        return resultadocolesterolhdl;
    }

    public void setResultadocolesterolhdl(int resultadocolesterolhdl) {
        this.resultadocolesterolhdl = resultadocolesterolhdl;
    }
}
