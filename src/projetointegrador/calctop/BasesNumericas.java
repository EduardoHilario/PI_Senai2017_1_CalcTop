package projetointegrador.calctop;


public class BasesNumericas {
    //Validações
   public boolean verificaBin(String entrada){
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
    public boolean verificaHex(String entrada){
        int cont=0;
        boolean isHex;
        for (int i = 0; i < entrada.length(); i++) {
            if(!(entrada.charAt(i) < 'G')){
                cont++;
            }
        }
        isHex = cont == 0;
        return isHex;
    }
    public boolean verificaOct(String entrada){
        int cont=0;
        boolean isOct;
        for (int i = 0; i < entrada.length(); i++) {
            if(!(entrada.charAt(i) == '0') && !(entrada.charAt(i) == '1') && !(entrada.charAt(i) == '2') && !(entrada.charAt(i) == '3') 
                    && !(entrada.charAt(i) == '4') && !(entrada.charAt(i) == '5') && !(entrada.charAt(i) == '6') && !(entrada.charAt(i) == '7')){
                cont++;
            }
        }
        isOct = cont == 0;
        return isOct;
    }
    //Inicio de Conversoes Base Binária
    //Binário para Decimal
    public int binToDec(String bin){
        int res=0;
        for (int i = 0; i < bin.length(); i++) {
            char binNum = bin.charAt(i);
                if(binNum == '1'){
                    res += Math.pow(2, bin.length()-1-i);
                }
            }
        return res;
    }
    //Binário para Hexadecimal
    public String binToHex(String bin){
        String res="";
        while(bin.length()>0){
            if(bin.length()%4 != 0){
                switch (bin.length()%4) {
                    case 1: bin = "000"+bin.substring(0); break;
                    case 2: bin = "00"+bin.substring(0); break;
                    case 3: bin = "0"+bin.substring(0); break;
                }
            }
            String hex = bin.substring(0, 4);
            switch (hex){
                case "0000": res+= "0";break;
                case "0001": res+= "1";break;
                case "0010": res+= "2";break;
                case "0011": res+= "3";break;
                case "0100": res+= "4";break;
                case "0101": res+= "5";break;
                case "0110": res+= "6";break;
                case "0111": res+= "7";break;
                case "1000": res+= "8";break;
                case "1001": res+= "9";break;
                case "1010": res+= "A";break;
                case "1011": res+= "B";break;
                case "1100": res+= "C";break;
                case "1101": res+= "D";break;
                case "1110": res+= "E";break;
                case "1111": res+= "F";break;
            }
            bin = bin.substring(4, bin.length());
        }
        return res;
    }
    //Binario para Octal
    public String binToOct(String bin){
        String res="";
        while(bin.length()>0){
            if(bin.length()%3 != 0){
                switch (bin.length()%3) {
                    case 1: bin = "00"+bin.substring(0); break;
                    case 2: bin = "0"+bin.substring(0); break;
                }
            }
            String oct = bin.substring(0, 3);
            switch (oct){
                case "000": res+= "0";break;
                case "001": res+= "1";break;
                case "010": res+= "2";break;
                case "011": res+= "3";break;
                case "100": res+= "4";break;
                case "101": res+= "5";break;
                case "110": res+= "6";break;
                case "111": res+= "7";break;
            }
            bin = bin.substring(3, bin.length());
        }
        return res;
    }
    //Fim Conversoes de Base Binária
    
    //Inicio Conversoes de Base Decimal
    //Decimal para Binário
    public String decToBin(int dec){
        String res="", bin="";
        while(dec/2 != 0){
            if(dec%2 == 0){
                res+= "0";
            }else{
                res+= "1";
            }
            dec /= 2;
        }
        res +="1";
        for (int i = res.length()-1; i >=0; i--) {
            bin += res.charAt(i);
        }
        return bin;
    }
    //Decimal para hexadecimal
    public String decToHex(int dec){
        String res="", hex="";
        int aux=0;
        while(dec >= 16){
            aux = dec%16;
            switch (aux){
                case 0: res += "0";break;
                case 1: res += "1";break;
                case 2: res += "2";break;
                case 3: res += "3";break;
                case 4: res += "4";break;
                case 5: res += "5";break;
                case 6: res += "6";break;
                case 7: res += "7";break;
                case 8: res += "8";break;
                case 9: res += "9";break;
                case 10: res += "A";break;
                case 11: res += "B";break;
                case 12: res += "C";break;
                case 13: res += "D";break;
                case 14: res += "E";break;
                case 15: res += "F";break;
            }
            dec = dec/16;
        }
        res += dec;
        for (int i = res.length()-1; i >= 0; i--) {
            hex += res.charAt(i);
        }
        return hex;
    }
    //Decimal para Octal
    public String decToOct(int dec){
        String res="", oct="";
        while(dec >= 8){
            res += dec%8;
            dec /= 8;
        }
        res += dec;
        for (int i = res.length()-1; i >= 0; i--) {
            oct += res.charAt(i);
        }
        return oct;
    }
    //Fim Conversoes de Base Decimal
    
    //Inicio conversões de Base Hexadecimal
    //Hexadecimal para decimal
    public int hexToDec(String hex){
        int res=0;
        int aux=0;
        for (int i = 0; i < hex.length(); i++) {
            char ltHex = hex.charAt(hex.length()-1-i);
            switch (ltHex){
                case '0' : aux=0;break;
                case '1' : aux=1;break;
                case '2' : aux=2;break;
                case '3' : aux=3;break;
                case '4' : aux=4;break;
                case '5' : aux=5;break;
                case '6' : aux=6;break;
                case '7' : aux=7;break;
                case '8' : aux=8;break;
                case '9' : aux=9;break;
                case 'A' : aux=10;break;
                case 'B' : aux=11;break;
                case 'C' : aux=12;break;
                case 'D' : aux=13;break;
                case 'E' : aux=14;break;
                case 'F' : aux=15;break;
            }
            res += Math.pow(16, i)*aux;
        }
        return res;
    }
    //Hexadecimal para Binário
    public String hexToBin(String hex){
        String bin="";
        for (int i = 0; i < hex.length(); i++) {
            char ltbin = hex.charAt(i);
            switch (ltbin){
                case '0': bin+= "0000";break;
                case '1': bin+= "0001";break;
                case '2': bin+= "0010";break;
                case '3': bin+= "0011";break;
                case '4': bin+= "0100";break;
                case '5': bin+= "0101";break;
                case '6': bin+= "0110";break;
                case '7': bin+= "0111";break;
                case '8': bin+= "1000";break;
                case '9': bin+= "1001";break;
                case 'A': bin+= "1010";break;
                case 'B': bin+= "1011";break;
                case 'C': bin+= "1100";break;
                case 'D': bin+= "1101";break;
                case 'E': bin+= "1110";break;
                case 'F': bin+= "1111";break;
            }
        }
        return bin;
    }
    //Hexadecimal para Octal
    public String hexToOct(String hex){
        String oct;
        oct = hexToBin(hex);
        oct = binToOct(oct);
        return oct;
    }
    //Fim Conversões de Base Hexadecimal
    
    //Início conversões de Base Octal
    //Octal para Decimal
    public int octToDec(String oct){
        int dec=0, aux;
        for (int i = 0; i < oct.length(); i++) {
            char ltOct = oct.charAt(oct.length()-1-i);
            aux = Integer.parseInt(Character.toString(ltOct));
            dec += Math.pow(8, i)*aux;
        }
        return dec;
    }
    //Octal para Binario
    public String octToBin(String oct){
        String res="";
        for (int i = 0; i < oct.length(); i++) {
            char bin = oct.charAt(i);
            switch (bin){
                case '0': res+= "000";break;
                case '1': res+= "001";break;
                case '2': res+= "010";break;
                case '3': res+= "011";break;
                case '4': res+= "100";break;
                case '5': res+= "101";break;
                case '6': res+= "110";break;
                case '7': res+= "111";break;
            }
        }
        return res;
    }
    //Octal para Hexadecimal
    public String octToHex(String oct){
        oct = octToBin(oct);
        oct = binToHex(oct);
        return oct;
    }
    
}
