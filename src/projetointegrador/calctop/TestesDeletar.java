/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.calctop;



/**
 *
 * @author eduar
 */
public class TestesDeletar {
    public static void main(String[] args) {
        String bin = "10101010";
        int cont=0;
        boolean isBin;
        for (int i = 0; i < bin.length(); i++) {
            if(!(bin.charAt(i) == '0') && !(bin.charAt(i) == '1')){
                cont++;
            }
        }
        if(cont == 0){
            isBin = true;
        }else{
            isBin = false;
        }
        System.out.println(cont);
        System.out.println(isBin);
        System.out.println("");
        System.out.println(verificaBin("100101"));
    }
    public static boolean verificaBin(String entrada){
        int cont=0;
        boolean isBin;
        for (int i = 0; i < entrada.length(); i++) {
            if(!(entrada.charAt(i) == '0') && !(entrada.charAt(i) == '1')){
                cont++;
            }
        }
        isBin = cont == 0;
        return isBin;
    }
}
