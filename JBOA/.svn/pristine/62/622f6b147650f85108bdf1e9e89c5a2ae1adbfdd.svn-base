package cn.jboa.action;

import java.util.Date;

import cn.jboa.entity.Employee;
import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;

import com.opensymphony.xwork2.ActionSupport;

public class SaveLeave extends ActionSupport{
	private LeaveService leaveService;
	private Leave leave;
	public LeaveService getLeaveService() {
		return leaveService;
	}
	public void setLeaveService(LeaveService leaveService) {
		this.leaveService = leaveService;
	}
	public Leave getLeave() {
		return leave;
	}
	public void setLeave(Leave leave) {
		this.leave = leave;
	}
	public String execute(){
		Leave leav = new Leave();
		Employee emp = new Employee();
		emp.setSn(leave.getCreator().getSn());
		leav.setCreator(emp);
		leav.setStartTime(leave.getStartTime());
		leav.setEndTime(leave.getEndTime());
		leav.setLeaveDay(leave.getLeaveDay());
		leav.setLeaveType(leave.getLeaveType());
		leav.setReason(leave.getReason());
		Employee em = new Employee();
		em.setSn(leave.getNextDeal().getSn());
		leav.setNextDeal(em);
		leav.setStatus("待审批");
		Date dat = new Date();
		leav.setCreateTime(dat);
		leaveService.saveLeave(leav);
		
		
		
		return "success";
		
		
	}

}
