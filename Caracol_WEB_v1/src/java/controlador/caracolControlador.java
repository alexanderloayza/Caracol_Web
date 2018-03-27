
package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "carControl")
@SessionScoped
public class caracolControlador implements Serializable {

    private int altura= 20;
    private int sube= 7;
    private int resbala= 5;
    private String respuesta="";
    
    public void calcularDays(){
      int days=0;
      int meta=0;
      while (meta <=altura){
          days++;
          meta+=sube;  // meta = meta + sube
          if (meta>=altura){
          break;
          }
          meta-=resbala; // meta = meta - resbala
                           
      }
      respuesta =" tardó" + days + " dias en salir del hoyo";
    }

     public caracolControlador() {
    }
    
     public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSube() {
        return sube;
    }

    public void setSube(int sube) {
        this.sube = sube;
    }

    public int getResbala() {
        return resbala;
    }

    public void setResbala(int resbala) {
        this.resbala = resbala;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
   
    
}
