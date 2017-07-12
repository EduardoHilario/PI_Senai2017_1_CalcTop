package projetointegrador.calctop;


    public class Capacidade {
    public double litroToGalao(double l){
        double res = l*0.264172;
        return res;
    }
    public double litroToquilolitro(double s){
        double res = s*0.001;
        return res;
    }
    public double litroToMetcubico(double s){
        double res = s/1000;
        return res;
    }
    public double litroToCmcubico(double s){
        double res = s*1000;
        return res;
    }
    public double litroToDmcubico(double s){
        double res=s;
         return res;
    }
    
    public double galaoTolitros(double s){
        double res=s*3.78541;
        return res;
    }
    public double galaoToquilolitros(double s){
        double res=s*0.00378541;
                return res;
    }
    public double galaoTocmcubicos(double s){
        double res=s*3785.41;
        return res;
    }
    public double galaoTodmcubicos(double s){
        double res=s*3.78541;
                return res;
    }
    public double galaoTomcubicos(double s){
        double res=s*0.00378541;
                return res;
    }
    
    public double metroTolitro(double s){
        double res=s*1000;
        return res;
    }
    public double metroToGalao(double s){
        double res=s*1000/3.78541;
        return res;
    }
    public double metroToQl(double s){
        double res=s;
        return res;
    }
    public double metroToCmCubicos(double s){
        double res=s*100000;
        return res;
    }
    public double metroToDmCubicos(double s){
        double res=s*1000;
        return res;
    }
    
    public double qlToLitro(double s){
        double res=s*1000;
        return res;
    }
    public double qlToGalao(double s){
        double res=s*1000/3.78541;
        return res;
    }
    public double qlToCmcubicos(double s){
        double res=s*0.001;
        return res;
    }
    public double qlToMtcubico(double s){
        double res=s;
        return res;
    }
    public double qlToDmCubicos(double s){
        double res=s*1000;
        return res;
    }
    
    public double cmToLitro(double s){
        double res=s*0.001;
        return res;
    }
    public double cmToGalao(double s){
        double res=s*0.000264172;
        return res;
    }
    public double cmToMtcubico(double s){
        double res=s*0.000001;
        return res;
    }
    public double cmToql(double s){
        double res=s*0.000001;
        return res;
    }
    public double cmToDmcubicos(double s){
        double res=s*0.001;
        return res;
    }
    
    public double dmTolitro(double s){
        double res=s;
        return res;
        
    }
    public double dmToGalao(double s){
        double res=s*0.264172;
        return res;
    }
    public double dmToQl(double s){
        double res=s*0.001;
        return res;
    }
    public double dmTometCubico(double s){
        double res=s*0.001;
        return res;
    }
    public double dmToCmCubico(double s){
        double res=s*1000;
        return res;
    }
}
