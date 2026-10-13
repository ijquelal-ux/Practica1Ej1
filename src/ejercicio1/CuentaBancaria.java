/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author Marco
 */
public class CuentaBancaria {
    //Atributos
    String nombre, apellido, tipocuenta; 
    double saldo;
    //Constructores
    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    //Metodos
    public void depositar(double monto){
        saldo = saldo + monto;
        System.out.println("Deposito Exitoso. Nuevo saldo $ " +saldo); 
    }
    public void retirar(double monto){
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro Exitoso. Nuevo saldo $" +saldo);
        }else{
            System.out.println("Saldo Insuficiente. ");
        }
    }
    public void mostrarSaldo(){
        System.out.println("====DATOS CUENTA BANCARIA======");
        System.out.println("Nombre del Titular: "+ nombre + " " + apellido);
        System.out.println("Tipo de Cuenta: "+tipocuenta);
        System.out.println("Saldo: "+saldo); 
    }
}