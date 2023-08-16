
package mapaprog1;

import javax.swing.JOptionPane;

public class Glicemia extends EXAME {
    private int resultadoglicose;

    @Override
    public void cadastrarexame() {
        super.cadastrarexame();
        resultadoglicose = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de glicose"));
    }

    // Para Glicemia: Normoglicemia: Inferior a 100 mg/dL
    // Pré-diabetes: Superior ou igual a 100 mg/dL eles Inferior a 126 mg/dL
    // Diabetes estabelecido: Superior ou igual a 126 mg/dL
    @Override
    public void mostrarexame() {
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo sanguíneo: " + this.getTiposanguineo() + "\n";
        msg += "Ano de nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Glicemia: " + this.resultadoglicose + " MG/l \n";

        if (this.resultadoglicose < 100) {
            msg += "Resultado: Normoglicemia";
        } else if (this.resultadoglicose >= 100 || this.resultadoglicose < 126) {
            msg += "Resultado: Pré-diabetes";
        } else if (this.resultadoglicose >= 126) {
            msg += "Resultado: Diabetes estabelecido";
        }

        JOptionPane.showMessageDialog(null, msg);

    }

    public int getResultadoglicose() {
        return resultadoglicose;
    }

    public void setResultadoglicose(int resultadoglicose) {
        this.resultadoglicose = resultadoglicose;
    }

}
