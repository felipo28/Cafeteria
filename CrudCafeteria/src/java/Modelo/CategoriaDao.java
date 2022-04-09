package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "select * from PRODUCTOS";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria ca = new Categoria();
                ca.setID(rs.getInt(1));
                ca.setNOMBRE_PRODUCTO(rs.getString(2));
                ca.setREFERENCIA(rs.getString(3));
                ca.setPRECIO(rs.getInt(4));
                ca.setPESO(rs.getInt(5));
                ca.setID_CATEGORIA(rs.getInt(6));
                ca.setSTOCK(rs.getInt(7));
                ca.setFECHA_CREACION(rs.getDate(8));

                lista.add(ca);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public List MayorStock() {
        List<Categoria> Stock = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTOS WHERE STOCK = (SELECT MAX(STOCK) FROM PRODUCTOS) ORDER BY ID";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria ca = new Categoria();
                ca.setID(rs.getInt(1));
                ca.setNOMBRE_PRODUCTO(rs.getString(2));
                ca.setREFERENCIA(rs.getString(3));
                ca.setPRECIO(rs.getInt(4));
                ca.setPESO(rs.getInt(5));
                ca.setID_CATEGORIA(rs.getInt(6));
                ca.setSTOCK(rs.getInt(7));
                ca.setFECHA_CREACION(rs.getDate(8));

                Stock.add(ca);
            }
        } catch (Exception e) {
        }
        return Stock;
    }

    public List MasVendido() {
        List<Categoria> Mayor = new ArrayList<>();
        String sql = "SELECT distinct count(v.idproducto) as numVentas, c.NOM_CATEGORIA "
                + "from venta v\n"
                + "Inner join Productos P ON P.id = V.Idproducto "
                + "Inner join Categoria C ON C.ID_CATEGORIA = P.Id_categoria\n"
                + "group by v.idproducto, c.NOM_CATEGORIA ";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria ca = new Categoria();
                ca.setNUMVENTAR(rs.getInt(1));
                ca.setNOM_CATEGORIA(rs.getString(2));

                Mayor.add(ca);
            }
        } catch (Exception e) {
        }
        return Mayor;
    }

    /*public int agregar(Categoria ca) {
        int r = 0;
        String sql = "INSERT INTO productos (NOM_PRODUCTO, REFERENCIA, PRECIO, PESO, ID_CATEGORIA, STOCK, FECHA_CREACION)\n"
                + "VALUES (?, 'pepe', 2000, 20, 1 , 500000, 28-06-2000)";
        try {
            con= c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, ca.getNOMBRE_PRODUCTO());
            ps.setString(3, ca.getREFERENCIA());
            ps.setInt(4, ca.getPRECIO());
            ps.setInt(5, ca.getPESO());
            ps.setInt(6, ca.getID_CATEGORIA());
            ps.setInt(7, ca.getSTOCK());
            ps.setDate(8, ca.getFECHA_CREACION());
            
            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            }else{
                r =0;
            }
        } catch (Exception e) {
        }
        return r;
    }*/
}
