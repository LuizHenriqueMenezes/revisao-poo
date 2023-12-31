/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package luizhenrique;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/luizhenrique.json"})
public class json extends HttpServlet {
    
    private String[] disciplinasCursadas = {
        "Ética e Responsabilidade Profissional",
        "Banco de Dados",
        "Engenharia de Software III",
        "Programação Orientada a Objetos",
        "Linguagem de Programação IV - INTERNET",
        "Sistemas Operacionais II",
        "Inglês IV",
        "Metodologia da Pesquisa Científico-Tecnológica"
    };

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Disciplinas Cursadas por Luiz Henrique</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Luiz Henrique Menezes Messias</h1>");
            out.println("<h1>RA: 1290482212038</h1>");
            out.println("<h2>Disciplinas Cursadas:</h2>");
            out.println("<ul>");
            for (String disciplina : disciplinasCursadas) {
                out.println("<li>" + disciplina + "</li>");
            }
            out.println("</ul>");
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet para exibir as disciplinas cursadas por Luiz Henrique";
    }
}
