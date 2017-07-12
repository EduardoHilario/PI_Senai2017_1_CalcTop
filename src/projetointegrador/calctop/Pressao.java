package projetointegrador.calctop;
public class Pressao {
  public double PsiToBar(double psi){
      double res=psi/14.5038;
      return res;  
  }
  public double BarToPsi(double bar){
      double res=bar*14.5038;
      return res;
  }
}
