package Modelo;

import java.sql.Date;

public class Categoria {

    int ID;
    String NOMBRE_PRODUCTO;
    String REFERENCIA;
    int PRECIO;
    int PESO;
    int ID_CATEGORIA;
    String NOM_CATEGORIA;
    int STOCK;
    Date FECHA_CREACION;
    int NUMVENTAR;

    public Categoria() {
    }

    public Categoria(int ID, String NOMBRE_PRODUCTO, String REFERENCIA, int PRECIO, int PESO, int ID_CATEGORIA, String NOM_CATEGORIA, int STOCK, Date FECHA_CREACION, int NUMVENTAR) {
        this.ID = ID;
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.REFERENCIA = REFERENCIA;
        this.PRECIO = PRECIO;
        this.PESO = PESO;
        this.ID_CATEGORIA = ID_CATEGORIA;
        this.NOM_CATEGORIA = NOM_CATEGORIA;
        this.STOCK = STOCK;
        this.FECHA_CREACION = FECHA_CREACION;
        this.NUMVENTAR = NUMVENTAR;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public String getREFERENCIA() {
        return REFERENCIA;
    }

    public void setREFERENCIA(String REFERENCIA) {
        this.REFERENCIA = REFERENCIA;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getPESO() {
        return PESO;
    }

    public void setPESO(int PESO) {
        this.PESO = PESO;
    }

    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }

    public void setID_CATEGORIA(int ID_CATEGORIA) {
        this.ID_CATEGORIA = ID_CATEGORIA;
    }

    public String getNOM_CATEGORIA() {
        return NOM_CATEGORIA;
    }

    public void setNOM_CATEGORIA(String NOM_CATEGORIA) {
        this.NOM_CATEGORIA = NOM_CATEGORIA;
    }

    
    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

    public Date getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(Date FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public int getNUMVENTAR() {
        return NUMVENTAR;
    }

    public void setNUMVENTAR(int NUMVENTAR) {
        this.NUMVENTAR = NUMVENTAR;
    }

    
}
