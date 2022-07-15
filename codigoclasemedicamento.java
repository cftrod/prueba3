
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_3;

/**
 *
 * @author Rodrigo
 */
public class Medicamento {

    static Medicamento get(int rowIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
String nombre;
String nombreCientifico;
String codigoMedicamento;
String Categoria;
String fechaVencimiento;
String laboratorio;
String dosisMedicamento;
String precio;
String cantidadStock;

//constructores
    public Medicamento(String nombre, String nombreCientifico, String codigoMedicamento, String Categoria, String fechaVencimiento, String laboratorio, String dosisMedicamento, String precio, String cantidadStock) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.codigoMedicamento = codigoMedicamento;
        this.Categoria = Categoria;
        this.fechaVencimiento = fechaVencimiento;
        this.laboratorio = laboratorio;
        this.dosisMedicamento = dosisMedicamento;
        this.precio = precio;
        this.cantidadStock=cantidadStock;
    }

//metodo para mostrar medicamento
public void mostrarMedicamento(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nombre Cientifico: " + this.nombreCientifico);
        System.out.println("Codigo Medicamento: " + this.codigoMedicamento);
        System.out.println("Categoría: " + this.Categoria);
        System.out.println("Fecha de Vencimiento: " + this.fechaVencimiento);
        System.out.println("Laboratorio: " + this.laboratorio);
        System.out.println("Dosis Medicamento: " + this.dosisMedicamento);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad Stock: " + this.cantidadStock);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDosisMedicamento() {
        return dosisMedicamento;
    }

    public void setDosisMedicamento(String dosisMedicamento) {
        this.dosisMedicamento = dosisMedicamento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(String cantidadStock) {
        this.cantidadStock = cantidadStock;
    }







    
}