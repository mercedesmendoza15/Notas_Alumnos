/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas_alumnos;

import java.util.Scanner;

/**
 *
 * @author Mercedes Mendoza
 */
public class Alumno {
     public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
String[] nombres = new String[100];
String[] apellidos = new String[100];
int[] zona = new int[100];
int[] parcial_1 = new int[100];
int[] parcial_2 = new int[100];
int[] total = new int[100];
int opcion=0;
int carne=0;

do{
System.out.println("Menu");
System.out.println("1. Agregar alumnos y notas");
System.out.println("2. ver datos");
System.out.println("3. ver promedio general");
System.out.println("4. salir");
System.out.println("selecciona una opcion");
opcion = input.nextInt();
switch(opcion){
    
case 1:
System.out.println("Agregar alumnos y notas");
System.out.println("ingrese numero de carne");
carne = input.nextInt();
for(int i = 0; i < carne; i++){
System.out.println("Ingrese nombres: ");
nombres[i] = input.next();
System.out.println("Ingrese apellidos: ");
apellidos[i] = input.next();
System.out.println("ingrese zona:");
zona[i] = input.nextInt();
System.out.println("ingrese 1er parcial:");
parcial_1[i] = input.nextInt();
System.out.println("ingrese 2do parcial:");
parcial_2[i] = input.nextInt();
System.out.println("total");
total[i] = input.nextInt();

}break;
    
    
case 2:
 for(int i = 0; i < carne; i++){
 total[i]=zona[i]+parcial_1[i]+parcial_2[i];
 }
 System.out.println("Nombres\t\tApellidos\tzona\t1er parcial\t2do parcial\tTOTAL");
 for(int i = 0; i < carne; i++){
System.out.println(nombres[i]+"\t"+apellidos[i]+"\t"+zona[i]+"\t"+parcial_1[i]+"\t\t"+parcial_2[i]+"\t\t"+total[i]);
 }
break;
    
    
case 3:
int suma=0;
int promedio;
for(int i = 0; i< carne; i++){
suma+=total[i];}
promedio= suma/carne;
System.out.println("El promedio es:" +promedio);
break;
    

}
 }while(opcion!=4);
 }
 }   
