
package mapaprog1;

import javax.swing.JOptionPane;

public class EXAME {
    
    private int idade;
    private String nome;
    private String Tiposanguineo;
    private int AnoNascimento;
    
    public int idade(){
       int idade = 2023 - AnoNascimento;
       return this.idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome (String nome){
        this.nome = nome.toUpperCase();
    }

    public String getTiposanguineo() {
        return Tiposanguineo;
    }

    public void setTiposanguineo(String Tiposanguineo) {
        this.Tiposanguineo = Tiposanguineo;
    }

    public int getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }
    public void cadastrarexame(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do paciente");
        this.Tiposanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente");
        this.AnoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de nascimento?"));
        
    }
    public void mostrarexame(){
        String msg = "Nome: " + this.nome + "\n" ;
        msg += "Tipo sanguíneo: " + this.Tiposanguineo + "\n" ;
        msg += "Ano de nascimento: " + this. AnoNascimento + "\n" ;
        JOptionPane.showMessageDialog(null, msg);  
    }
}

