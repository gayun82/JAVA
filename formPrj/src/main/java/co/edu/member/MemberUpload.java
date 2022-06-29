package co.edu.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet({ "/memberUpload", "/fileUpload" })
public class MemberUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberUpload() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		boolean isMulti = ServletFileUpload.isMultipartContent(request);
		
		if(isMulti) {
			
		
		
		String mn = request.getParameter("memberName"); //application/x-www-form-urlencoded => multi
		System.out.println(mn);
		String file = request.getServletContext().getRealPath("images");
		int fileSize = 5 * 1023 * 1024;//5메가
		MultipartRequest mr = new MultipartRequest(request //요청정보
				, file//파일이름
				, fileSize//파일사이즈
				, "utf-8"//인코딩타입
				,new DefaultFileRenamePolicy()//리네임 정책
				);
		
		mn = mr.getParameter("memberName");
		String ph = mr.getParameter("phone");
		String ad = mr.getParameter("address");
		String bi = mr.getParameter("birth");
		String im = mr.getParameter("image");
		im = mr.getFilesystemName("image");//바뀐이름으로 저장
		
		MemberVO vo = new MemberVO();
		vo.setMembName(mn);
		vo.setMembAddr(ad);
		vo.setMembPhone(ph);
		vo.setMembBirth(bi);
		vo.setMembImage(im);
		
		MemberDAO dao = new MemberDAO();
		Gson gson = new GsonBuilder().create();
		PrintWriter out = response.getWriter();
		
		dao.insertMember(vo);
		
		System.out.println(mn);
		//{"retCode" : "Fullfilled"}
		out.print("{\"retCode\" : \"Fullfilled\"}");
		
		}else {
			PrintWriter out = response.getWriter();
			String cmd = request.getParameter("cmd");
			String id = request.getParameter("delId");
			
			if(cmd.equals("delete")) {
				MemberDAO dao = new MemberDAO();
				if(dao.deleteMember(Integer.parseInt(id))) {
					out.print("{\"retCode\":\"Success\"}");
				}else {
					out.print("{\"retCode\":\"Fail\"}");
				}

	
			}
			}
		}
}




