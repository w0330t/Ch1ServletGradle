import java.io.PrintWriter
import java.util.*
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "Chapter1Servlet", value = "/Serv1")
class Ch1Servlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?){
        val out: PrintWriter = resp!!.writer
        val today = Date()
        out.println(
                "<html>" +
                "<body>" +
                "<h1 align=center>HF\'s Chapter1 Servlet</h1>" +
                "<br>" +
                today +
                "</body>" +
                "<html>"
        )
    }
}