package co.edu;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Scanner;

public class EmpDAO extends DAO {
	
	//일정정보
	public List<CalendarVO> getSchedule(){
		 //전체 일정정보를 가지고 오도록 메소드 완성하세요.
		List<CalendarVO> calMap = new ArrayList<>();
		getConnect();
		try {
			psmt = conn.prepareStatement("select title, start_date, end_date from full_calendar");
			rs = psmt.executeQuery();
			while (rs.next()) {
				CalendarVO cal = new CalendarVO();
				cal.setTitle(rs.getString("title"));
				cal.setStartData(rs.getString("start_date"));
				cal.setEndDate(rs.getString("end_date"));
				calMap.add(cal);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return calMap;
	}
	
	
	// 부서정보, 인원정보
	public Map<String, Integer> getDeptCnt() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		getConnect();
		String sql = "select department_name, count(1) " + "from employees e, departments d "
				+ "where e.department_id = d.department_id " + "group by department_name";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return map;
	}

	// class => 복합적인 데이터 하나의 변수.
	// 사원번호, 이름, 이메일,직무 => class작성 : 필드로 선언.
	// public void insertEmp(int eId, String name, String email, String job) {
	public void insertEmp(Employee emp) {
		getConnect();
		String sql = "insert into employees" + "(employee_id, last_name, email, job_id, hire_date) "
				+ "values(employees_seq.nextval,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<String> getNames() {
		getConnect();
		String sql = "select first_name from employees";
		List<String> list = new ArrayList<>();

//		Scanner scn = new Scanner(System.in);
//		try {
//			int menu =scn.nextInt()
//		}catch (Exception e) {
//			e.getMessage();
//		}

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public List<Employee> empList() {

		getConnect();
		String sql = "select * from employees";
		List<Employee> list = new ArrayList<>();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmpId(rs.getInt("employee_id"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));

				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}// end of getNames()
}
