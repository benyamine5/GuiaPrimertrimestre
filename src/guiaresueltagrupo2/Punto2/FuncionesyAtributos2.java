
package guiaresueltagrupo2.Punto2;
public class FuncionesyAtributos2 {
    public int seg;
    
    public String funcionhhmmss(){
        int horas,min,ss;
        horas = this.seg/3600;
        min = (this.seg%3600)/60;
        ss = this.seg%60;
        String hhmmss = horas+":"+min+":"+ss;
        return hhmmss;
    }
    
}
