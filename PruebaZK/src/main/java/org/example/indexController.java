package org.example;


import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class indexController extends baseController{



    @Wire
    private Label labelcito ;
    @Wire
    private Window ventana;
    @Wire
    private Button boton;
    @Wire
    private Textbox cajaTexto;


    public void onCreate$ventana(){
        System.out.println("Se renderizo ventana");
    }


    public void onClick$boton (){
        String textoObtenido = cajaTexto.getText();
        labelcito.setValue(textoObtenido);
        System.out.println("Texto obtenido: " + textoObtenido);
    }

}
