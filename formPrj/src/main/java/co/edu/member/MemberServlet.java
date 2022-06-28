package co.edu.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 응답정보에 한글처리
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");

		String cmd = request.getParameter("cmd");

		Gson gson = new GsonBuilder().create();// json 데이터 생성
		MemberDAO dao = new MemberDAO();

		if (cmd.equals("list")) {
			// db전체 리스트 = > json 화면 보여주기.
			List<MemberVO> list = dao.memberList();
			response.getWriter().print(gson.toJson(list));

		} else if (cmd.equals("insert")) {
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			MemberVO vo = new MemberVO();
			vo.setMembName(name);
			vo.setMembAddr(addr);

			dao.insertMember(vo);
			response.getWriter().print(gson.toJson(vo));

		} else if (cmd.equals("update")) {

			// 19 -전화번호.
			String numb = request.getParameter("no");
			String phone = request.getParameter("ph");

			MemberVO vo = new MemberVO();
			vo.setMemebNo(Integer.parseInt(numb));
			vo.setMembPhone(phone);

			if (dao.updateMember(vo)) {
				// {"retCode": "Success"}
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				// {"retCode": "Fail"}
				response.getWriter().print("{\"retCode\": \"Fail\"}");
			}
			
		} else if (cmd.equals("delete")) {
			String delNo = request.getParameter("delNumber");

			if (dao.deleteMember(Integer.parseInt(delNo))) {
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				response.getWriter().print("{\"retCode\": \"Fail\"}");

			}
		}
	}
	//get방식요청 : 조회
	//post 방식요청: 입력, 수정, 삭제
	//서블릿을 처리하는데
	//1)form (서블릿 => 화면.jsp)
	//2)ajax(Single Page Application)

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//한글처리
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");		
		
		//post방식의 요청이 되면 실행 메소드.
		String cmd = request.getParameter("cmd");
		
		String membName = request.getParameter("name");
		String membAddr = request.getParameter("addr");
		String membPhone =  request.getParameter("phone");
		String membBirth = request.getParameter("birth");
		String membImage =  request.getParameter("image");
		
		MemberVO vo = new MemberVO();
		vo.setMembName(membName);
		vo.setMembAddr(membAddr);
		vo.setMembPhone(membPhone);
		vo.setMembBirth(membBirth);
		vo.setMembImage(membImage);
		
		MemberDAO dao = new MemberDAO();
		
		Gson gson = new GsonBuilder().create();
		
		PrintWriter out = response.getWriter();
		
		//1.입력.
		if(cmd.equals("add")) {
			dao.insertMember(vo);
			out.print(gson.toJson(vo));
			
			
		//2.수정	
		}else if (cmd.equals("modify")){
			String mNo = request.getParameter("membNo");
			vo.setMemebNo(Integer.parseInt(mNo));
			
			JsonObject obj = new JsonObject();
			if(dao.updateMember(vo)) {
				//{"membNo": "mNo", "membName": "membName", "membAddr": "membAddr", "membPhone": "membPhone","membBirth": "meebBirth", "retConde": "Success"}
				//{"mNo"?,"mName":?, "mAddr":?, ...} => object
				//out.print("{\"retCode\": \"Success\"}");
			//}else if{
				//out.print("{\"retCode\": \"Fail\"}");
				//out.print("/{\"membNo\":\""+ mNo+"\"", \"membName"\": \"+membName+"\", \"membAddr\": membAddr, \"membPhone\": membPhone,\"membBirth\": meebBirth, \"retConde\":\"Success}");
				
				obj.addProperty("membNo",mNo);//{"membNo":20}
				obj.addProperty("membName", membName);//{"membNo":20, "membName":"홍길동"}
				obj.addProperty("membAddr", membAddr);
				obj.addProperty("membPhone", membPhone);
				obj.addProperty("membBirth", membBirth);
				obj.addProperty("retCode", "Success");
				
			}else {
				obj.addProperty("retCode", "Fail");
			}
			System.out.println(gson.toJson(obj));
			out.print(gson.toJson(obj));
			
		//3.삭제	
		}else if (cmd.equals("remove")) {
			String delNo = request.getParameter("delNo");
			if(dao.deleteMember(Integer.parseInt(delNo))) {
				out.print("{\"retCode\": \"Success\"}");
			}else {
				out.print("{\"retCode\": \"Fail\"}");
			}
		}
		
	}

}
