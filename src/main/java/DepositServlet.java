

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class DepositServlet
 */
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","8073121866");
			Statement s = con.createStatement();
			String accno = request.getParameter("accno");
			int amount = Integer.parseInt(request.getParameter("amount"));
			String q = "Select balance from bank where id = "+accno+"";
			ResultSet rs = s.executeQuery(q);

			System.out.println(rs);
			int balance = -1;
			int newbalance = 0;
		    while(rs.next()) {
			balance = rs.getInt("balance");
			}
			System.out.println(balance);
			if (balance>0) {
				if(balance>amount) {
					newbalance=balance-amount;
					String query = "Update bank set balance="+newbalance+" where accno ="+accno+"";
					s.executeUpdate(query);
					out.print("You have successfully withdrawn the bank ");
				}else {
					System.out.println("no suffecient balance");
				}
			}else {
				System.out.println("your balance is 0");
			}
			out.write("<form action=\"home.jsp\"><input type=\"submit\" value=\"HomePage\"></form>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	}


