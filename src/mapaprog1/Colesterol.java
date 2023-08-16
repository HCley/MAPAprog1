
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

    // LDL
    // Se o paciente for risco baixo, o colesterol LDL deve estar abaixo de 100
    // mg/dL
    // Se o paciente for risco médio, o colesterol LDL deve estar abaixo de 70 mg/dL
    // Se o paciente for risco alto, o colesterol LDL deve estar abaixo de 50 mg/dL
    //
    // HDL
    // De 0 a 19 anos..: superior a 45 mg/dL (HDL - BOM)
    // Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
    @Override
    public void mostrarexame() {
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo sanguíneo: " + this.getTiposanguineo() + "\n";
        msg += "Ano de nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Valor de LDL do Colesterol: " + this.resultadocolesterolldl + " MG/l \n";
        msg += "Valor de HDL do Colesterol: " + this.resultadocolesterolhdl + "MG/L \n";

        if (this.resultadocolesterolldl < 50) {
            msg += "Resultado LDL: alto";
        } else if (this.resultadocolesterolldl < 70) {
            msg += "Resultado LDL: medio";
        } else if (this.resultadocolesterolldl < 100) {
            msg += "Resultado LDL: baixo";
        }

        if (this.getAnoNascimento() <= 19 && this.resultadocolesterolldl > 45) {
            msg += "(HDL - BOM)";
        } else if (this.getAnoNascimento() > 19 && this.resultadocolesterolhdl > 40) {
            msg += "(HDL - BOM)";
        } else {
            msg += "(HDL - RUIM)";
        }

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
