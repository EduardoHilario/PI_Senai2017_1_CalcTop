package projetointegrador.calctop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Historico {
    public String dataHoraSist() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
    public void criarArq(String nomeArquivo, String conteudo, boolean append){
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            FileWriter grava = new FileWriter(arquivo, append);
            PrintWriter escreve = new PrintWriter(grava);
            escreve.println(dataHoraSist()+" | "+conteudo);
            escreve.close();
            grava.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Histórico não encontrado");
        }
    }
    public String lerArq(String nome){
        String hist ="";
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine();
            
            while(linha != null){
                hist += "\n"+linha;
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hist;
    }
    public void limparArq(String nomeArquivo, boolean append){
        File arquivo = new File(nomeArquivo + ".txt");
        try {
            FileWriter grava = new FileWriter(arquivo, append);
            PrintWriter escreve = new PrintWriter(grava);
            escreve.println("");
            escreve.close();
            grava.close();
        } catch (IOException ex) {
            System.out.println("deu errado");
        }
    }
    public String gerarHist(String ent, String ori,String  conv,String  res){
        String out;
        out = ent+" de "+ori+" para "+conv+" = "+res;
        return out;
    }
    
    

        
    
    
}
