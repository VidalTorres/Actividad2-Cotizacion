package practica2;

import java.util.Scanner;


public class Concesionaria {
    //Variables
    private int numeroCotizacion;
    private String descripcionAuto;
    private double precio;
    private double porcentajeInicial;
    private int plazo;
    
    private double pagoInicial;
    private double totalFin;
    private double pagoMensual;
    
    //Constructores
    Concesionaria(){
        this.numeroCotizacion = 0;
        this.descripcionAuto = "";
        this.precio = 0.0;
        this.porcentajeInicial = 0.0;
        this.plazo = 0;
    }
    
    Concesionaria(int numeroCotizacion, String descripcionAuto, double precio, double porcentajeInicial, int plazo){
        this.numeroCotizacion = numeroCotizacion;
        this.descripcionAuto = descripcionAuto;
        this.precio = precio;
        this.porcentajeInicial = porcentajeInicial;
        this.plazo = plazo;
    }
    
    Concesionaria(Concesionaria cotizacion){
        this.numeroCotizacion = cotizacion.numeroCotizacion;
        this.descripcionAuto = cotizacion.descripcionAuto;
        this.precio = cotizacion.precio;
        this.porcentajeInicial = cotizacion.porcentajeInicial;
        this.plazo = cotizacion.plazo;
    }
    
    //Encapsulamiento

    /**
     * @return the numeroCotizacion
     */
    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    /**
     * @param numeroCotizacion the numeroCotizacion to set
     */
    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    /**
     * @return the descripcionAuto
     */
    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    /**
     * @param descripcionAuto the descripcionAuto to set
     */
    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajeInicial
     */
    public double getPorcentajeInicial() {
        return porcentajeInicial;
    }

    /**
     * @param porcentajeInicial the porcentajeInicial to set
     */
    public void setPorcentajeInicial(double porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    //funciones
    public void obtenerDatos(){
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Numero de Cotizacion: ");
        numeroCotizacion = captura.nextInt(); captura.nextLine();
        
        System.out.print("Descripcion; ");
        descripcionAuto = captura.nextLine();
        
        System.out.print("Precio: ");
        precio = captura.nextDouble(); captura.nextLine();
        
        System.out.print("Porcentaje de pago incial: ");
        porcentajeInicial = captura.nextDouble(); captura.nextLine();
        
        System.out.print("Plazo: ");
        plazo = captura.nextInt(); captura.nextLine();
    }
    
    public void obtenerPagoInicial(){
        pagoInicial = precio * (porcentajeInicial/100);
    }
    
    public void obtenerTotalFin(){
        totalFin = precio - pagoInicial;
    }
    
    public void obtenerPagoMensual(){
        pagoMensual = totalFin/plazo;
    }
    
    public void imprimir(){
        System.out.println("----------------------------------------------------");
        System.out.print("Numero de Cotizacion: " + numeroCotizacion);
        System.out.println("Descripcion; "+descripcionAuto);
        System.out.println("Precio: "+precio);
        System.out.println("Porcentaje de pago incial; "+porcentajeInicial);
        System.out.println("Plazo: "+plazo);
        System.out.println("----------------------------------------------------");
        System.out.println("Pago inicial: "+pagoInicial);
        System.out.println("Total a fin: "+totalFin);
        System.out.println("Pago mensual: "+pagoMensual);
    }
    
}
