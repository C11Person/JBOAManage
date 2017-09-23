package cn.jboa.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.jboa.entity.Employee;
import cn.jboa.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction  extends ActionSupport{
	private Employee employee;
	private EmployeeService employeeService;
	private String ran;
	private String dom;
	
	
	
	
	

	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getRan() {
		return ran;
	}
	public void setRan(String ran) {
		this.ran = ran;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(ran);
		String dom= (String) ActionContext.getContext().getSession().get("random");
		System.out.println(dom);
		Employee employee1 = employeeService.findEmployee(employee);
		
		if(employee1!=null){
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("employee", employee1);
			session.setAttribute("employee_position",employee1.getSysPosition().getNameCn());
			return "success";
		}else{
			return "error";
		}
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}
