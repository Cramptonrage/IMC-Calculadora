package imc.interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class IMC extends JFrame implements ActionListener{
    JLabel kilo=new JLabel("INGRESE PESO EN KILOGRAMOS");
     JLabel imc=new JLabel("IMC");
    JLabel metro=new JLabel("INGRESE ESTATURA EN CENTIMETROS");
    JLabel resultado=new JLabel("RESULTADO");
    JTextField kg=new JTextField();
    JTextField m=new JTextField();
    JTextField result=new JTextField();
    JButton boton=new JButton("CALCULAR");
    String x=null,y=null;
    double kilos,metros,resultados;
    String mensaje;
IMC(){
    setLayout(null);
       setBackground(Color.BLUE);
    setTitle("IMC CALCULATOR");
    setBounds(0,0,400,400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.YELLOW);
    setVisible(true);
     imc.setBounds(170, 40, 200, 10);
        add(imc);
    //TEXTO INGRESAR KILOGRAMOS
        kilo.setBounds(20, 100, 200, 10);
        add(kilo);
        kg.setBounds(230, 95, 100, 20);
        add(kg);
        //TEXTO INGRESE  
        metro.setBounds(10, 170, 250, 10);
        add(metro);
        m.setBounds(230, 165, 100, 20);
        add(m);
        //boton
        boton.setBounds(130, 220, 100, 20);
        add(boton);
       
        //resultado
      boton.addActionListener(this);
        result.setBounds(90, 260, 200, 20);
        add(result);
       boton.setBackground(Color.GREEN);
       
}    

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==boton){
         x=kg.getText();
         kg.setText(null);
         
         y=m.getText();
         m.setText(null);
         kilos=Integer.parseInt(x);
            metros=Integer.parseInt(y);
            resultados=kilos/((metros/100)*(metros/100));
           // mensaje=String.valueOf(resultados);
            if (resultados<16) {
            mensaje="BAJO PESO MUY GRABE";
         }
             if (resultados>=16&&resultados<16.99) {
            mensaje="PESO MUY BAJO";
         }
              if (resultados>=17&&resultados<18.49) {
            mensaje="BAJO PESO";
         }
              if (resultados>=18.50&&resultados<24.99){
                  mensaje="PESO NORMAL";
              }
              if (resultados>=25&&resultados<29.99){
                  mensaje="SOBREPESO";
              }
              if (resultados>=30&&resultados<34.99){
                  mensaje="OBESIDAD GRADO 1";
              }
              if (resultados>=35&&resultados<39.99){
                  mensaje="OBESIDAD GRADO 2";
              }if (resultados>=40){
                  mensaje="OBESIDAD GRADO 3";
              }
         result.setText(mensaje);
     }
       // kilos=Integer.parseInt(kg.getText());
       // metros=Integer.parseInt(m.getText());
     
           
        
        
       
      
    }
      public static void main(String[] args) {
        IMC imc=new IMC ();
    }
    
}
