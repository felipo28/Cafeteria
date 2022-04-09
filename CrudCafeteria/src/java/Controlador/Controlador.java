package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class Controlador extends HttpServlet {

    CategoriaDao dao = new CategoriaDao();
    Categoria c = new Categoria();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        switch (accion) {
            case "Listar Productos":
                List<Categoria> datos = dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;

            case "Busqueda":
                request.getRequestDispatcher("MostrarDatos.jsp").forward(request, response);
                break;

            case "Busqueda Mayor Stock":
                List<Categoria> dato2 = dao.MayorStock();
                request.setAttribute("datos", dato2);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;

            case "Producto Mas Vendido":
                request.getRequestDispatcher("masvendido.jsp").forward(request, response);
                break;

            case "Buscar Producto":
                List<Categoria> dato3 = dao.MasVendido();
                request.setAttribute("datos", dato3);
                request.getRequestDispatcher("masvendido.jsp").forward(request, response);
                break;
            case "back":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;

            case "Nuevo Producto":
                request.getRequestDispatcher("add.jsp").forward(request, response);
                break;
            /*case "Guardar":
                
                String nombre = request.getParameter("txtnombre");
                String referencia = request.getParameter("txtreferencia");
                String precio = request.getParameter("txtprecio");
                String peso = request.getParameter("txtpeso");
                String categoria = request.getParameter("optioncategoria");
                String stock = request.getParameter("txtstock");
                String fecha = request.getParameter("txtfecha_creacion");
                
                
                java.sql.Date sqdoj = java.sql.Date.valueOf(fecha);
                
               
                
                c.setNOMBRE_PRODUCTO(nombre);
                c.setREFERENCIA(referencia);
                c.setPRECIO(Integer.parseInt(precio));
                c.setPESO(Integer.parseInt(peso));
                c.setID_CATEGORIA(Integer.parseInt(categoria));
                c.setSTOCK(Integer.parseInt(stock));
                c.setFECHA_CREACION(sqdoj);
                
                dao.agregar(c);
                request.getRequestDispatcher("Controlador?accion= Listar").forward(request, response);
                        
                break;*/
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
