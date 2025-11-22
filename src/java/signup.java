import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String uname = request.getParameter("uname");
        String umobile= request.getParameter("umobile");
        String uemail = request.getParameter("uemail");
        String upassword = request.getParameter("upassword");
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/milk", "root", "root");
            String sql = "insert into signup(uname,umobile,uemail,upassword)values(?,?,?,?)";
//             String sql = "update register set name = 'ankit' where name = ASHWINI" ;
//UPDATE table_name
//SET column1 = new_value1, column2 = new_value2, ...
//WHERE condition;

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, umobile);
            ps.setString(3, uemail);
            ps.setString(4, upassword);
            int i = ps.executeUpdate();
            if (i > 0) {
                out.print(" Record Inserted");
            } else {
                out.print("Record Not Inserted");
            }
        } catch (Exception ex) {
        }
    }

}
