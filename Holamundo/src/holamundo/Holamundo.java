/*

 */
package holamundo;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**s
 *
 * @author gamer
 */
public class Holamundo {

    public static void main(String[] args) {
    
        /*String cadena;
        int num;
        char cad;
        double decimal;
        
        cadena= JOptionPane.showInputDialog("Digite una cadena: ");
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        cad= JOptionPane.showInputDialog("Dame una letra: ").charAt(0);
        decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal_ "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
                JOptionPane.showMessageDialog(null, "El entero es: "+num);
                        JOptionPane.showMessageDialog(null, "La letra es: "+cad);
                                JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);*/
        
       /* Scanner entrada = new Scanner(System.in);
float numero1,numero2,suma,resta,prod,div,residuo;

        System.out.println("Digite 2 numeros");
        numero1= entrada.nextFloat();
        numero2= entrada.nextFloat();
    suma=numero1+numero2;
    resta=numero1-numero2;
    prod=numero1*numero2;
    div=numero1/numero2;
    residuo=numero1%numero2;
    
    
        System.out.println("Los datos son:" +suma  + " "+resta + " " +prod + " " +div + " " +residuo);
    
        double num2 =7.89;
        long resu= Math.round(num2);
        
        System.out.println("El numero es " +resu);
        
        float num = 4.16f;
        int resl= Math.round(num);
        
        System.out.println("El numero es" + resl);
        */
        /*El 50 es el numero que quiero que llegue y el +1 es para que nunca sea 0*/
        
        
        /*double numer=(int)(Math.random()*50)+1;
        System.out.println("El aleatorio es " +numer);*/
        
       Scanner xd= new Scanner(System.in);
        /*int horastotales,dias,semanas,horas;
        System.out.println("Digite la cantidad de horas");
        horastotales= xd.nextInt();
        semanas = horastotales/168;
        dias = horastotales%168 /24;
        horas = horastotales%24;
        System.out.println("El resultado es");
        System.out.println("Semanas " + semanas);
        System.out.println("Dias " +dias);
        System.out.println("Horas " +horas);*/
       /* 
        int a,b,c;
        double tot,temp,tot2,temp2;
        System.out.println("Dame el valor de a");
        a = xd.nextInt();
        xd.nextLine();
      System.out.println("Dame el valor de b");
        b = xd.nextInt();
        xd.nextLine();
        System.out.println("Dame el valor de c");
        c = xd.nextInt();
        xd.nextLine();
        
        temp= (-b+(Math.sqrt(Math.pow(b, 2)-4*(a*c))));
        tot= (temp/(2*a));
        temp2= (-b-(Math.sqrt(Math.pow(b, 2)-4*(a*c))));
        tot2= (temp2/(2*a));
        System.out.println("El valor de x1 es " +tot);
        System.out.println("El valor de x2 es " +tot2);*/
       
     /*  
       double sal,hrs,tot,semanas;
        System.out.println("Cuantas horas trabajo");
        hrs=xd.nextDouble();
        System.out.println("Salario?");
        sal=xd.nextDouble();
        tot=sal*hrs;
       
   semanas= hrs/168;
         System.out.println("Su paga es:" +tot +"trabajo un total de " +semanas +"semanas");
        */
     /*
     int dato;
     
     dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
     switch(dato){
         case 1: JOptionPane.showConfirmDialog(null, "Hola");
             break;

        case 2:  JOptionPane.showConfirmDialog(null, "xD");
             break;
             
        case 3:   JOptionPane.showConfirmDialog(null, "Mundo");
             break;
     
        default: JOptionPane.showConfirmDialog(null, "Ese numero no existe");
    
*/
 /*    
     int num,ca=1;
     int   [][][] apDatos = new int [5][4][7];
        for (int i = 0; i < apDatos.length; i++) {
            for (int j = 0; j < apDatos[i].length; j++) {
                for (int k = 0; k < apDatos[i][j].length; k++) {
                apDatos[i][j][k]=ca++;                    
                }

            }
   
        }
         for (int i = 0; i < apDatos.length; i++) {
        
            for (int j = 0; j < apDatos[i].length; j++) {
                for (int k = 0; k < apDatos[i][j].length; k++) {
                System.out.print("["+apDatos[i][j][k]+"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
         */
 /*
 int num;
 num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
        if (num%10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + num +" es multiplo de 10");
        }else{
        JOptionPane.showMessageDialog(null, "El numero " + num +" no es multiplo de 10");
        }
 */
/*
 char letra;
 letra= JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
 
 if(Character.isUpperCase(letra)){
 JOptionPane.showMessageDialog(null, "Es una letra Mayuscula");
 
 }else{
  JOptionPane.showMessageDialog(null, "Es una letra minuscula");
 
 }*/

/*

Clasechida [] apDatos = new Clasechida[5];

 for (int i = 0; i < apDatos.length; i++) {
            apDatos[i]= new Clasechida();
            System.out.println("Nombre:");
            apDatos[i].setNombre(xd.nextLine());
            System.out.println("Edad:");
            apDatos[i].setEdad(xd.nextInt());
        xd.nextLine();
        }
 for (Clasechida apDato : apDatos) {
            System.out.println("");
            System.out.println("Datos de la persona:");
            System.out.println("Nombre de la personita: "  +apDato.getNombre());
         
            System.out.println("Edad de la persona: " +apDato.getEdad());
          
            System.out.println("_____________________");
        }
*/
/*double rebaja,productos,cos,total=0;
        
productos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos son?"));
        for (int i = 0; i < productos; i++) {
            System.out.println("Costo de producto : " +i);
            cos=xd.nextDouble();
            total=total+cos;
        }
        
        if (total>=300) {
            rebaja= total*.20;
            total=total-rebaja;
                    System.out.println("El total es " + total);

        }else{
                System.out.println("El total es " + total);

        }*/
/*
     int horas;
     float saltot;
     horas= Integer.parseInt(JOptionPane.showInputDialog("Digite horas trabajadas"));
     
     if(horas<=40){
     saltot=horas*16;
     }else{
     saltot= (40*16) + ((horas-40)*20);
     }
     JOptionPane.showMessageDialog(null, "El salario total es: " +saltot);
     
    */
    /*int num1,num2;
    num1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
    num2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
    
    if(num1%2==0 && num2%2 == 0){
        System.out.println("Los dos son pares" +num1 + " " + num2);
    }else if(num1%2==0 || num2%2 == 0){
        System.out.println("Al menos uno de ellos es par " +num1 + " "+ num2);
    
    }else{
        System.out.println("Ninguno es par " +num1 +" " + num2);
    }*/
    
    //Ordenar numeros de mayor a menor
   /* int tem;
    int arre [] =new int [3];
        for (int i = 0; i < arre.length; i++) {
            System.out.println("Dame un numero");
            arre[i]=xd.nextInt();
            xd.nextLine();
        }
     //Arrays.sort(arre);
        for (int i = 0; i < arre.length; i++) {
            for (int j = 1; j < arre.length-i; j++) {
                if (arre[j-1]>arre[j]) {
                    tem= arre[j-1];
                    arre[j-1]=arre[j];
                    arre[j]=tem;
                }
                 System.out.println("[" +arre[i] +"]");
            }*/
   
                   Scanner yolo = new Scanner (System.in);

   int numero;
   numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99999"));
   if(numero>=0 && numero<=9){
       System.out.println("1 digito");
   }else if(numero>=10 && numero<=99){
   System.out.println("2 digito");
   }else if(numero>=100 && numero<=999){
   System.out.println("3 digito");
   }else if(numero>=1000 && numero<=9999){
   System.out.println("4 digito");
   }else if(numero>=10000 && numero<=99999){
   System.out.println("5 digito");
   }else{
   System.out.println("no esta en el rango");
   }
   
      System.out.println(" Segunda parte ");
        double form1;
        System.out.println("Ahora convertiremos de Fahrenheit a Celsius  ");
        Temperatura po = new Temperatura();
        System.out.println("Dame la temperatura Fahrenheit: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula C= (F-32)*5/9");
        form1= (po.getTempe() -32)*0.55;  
        System.out.println( po.getTempe()+ "F " + " Equivale a  " +form1 +" C");
        
        
        System.out.println("______________");
        
        
        System.out.println("Ahora de Celsius a Fahrenheit: ");
        System.out.println(" Dame la temperatura en Celsius: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula F= (9/5)C+32 ");
        form1=  (1.8*po.getTempe()+32);
        System.out.println( po.getTempe() + "C " + " Equivale a " +form1 + " F");
        
        System.out.println("______________");
        
        System.out.println("Ahora de Celsius a Kelvin");
        System.out.println(" Dame la temperatura en Celsius: ");
        po.setTempe(yolo.nextInt());
        System.out.println("Aplicaremos la siguiente formula K=C+273");
        form1= po.getTempe()+273;
        System.out.println(po.getTempe() + "C " + " Equivale a " +form1 + "K ");
        
        
        System.out.println("\n");
        System.out.println("____________________");
           
        
    
    } 
  }
   

class Clasechida{
int edad;
String nombre;

 public Clasechida(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    Clasechida() {
      
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   


}