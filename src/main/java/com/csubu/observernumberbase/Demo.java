package com.csubu.observernumberbase;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thana
 */
@WebServlet(name = "Demo", urlPatterns = {"/Demo"})
public class Demo extends HttpServlet {

    private String encoding = "utf-8";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset=UTF-8");

        int number = Integer.parseInt(request.getParameter("number"));

//        System.out.println(Integer.toBinaryString(number));
        NumberBase num = new NumberBase();

        //create observers
        Observer binary = new BinaryObserver("binary");
        Observer octal = new OctalObserver("octal");
        Observer hexa = new HexaObserver("hexa");

        //register observers to the subject
        num.register(binary);
        num.register(octal);
        num.register(hexa);
        
        //num.unregister(binary);
       

        //attach observer to subject
        binary.setSubject(num);
        octal.setSubject(num);
        hexa.setSubject(num);

        //check if any update is available
        binary.update();
        
        num.postMessage(number);

        request.setAttribute("binary", binary.update());
        request.setAttribute("octal", octal.update());
        request.setAttribute("hexa", hexa.update());

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
