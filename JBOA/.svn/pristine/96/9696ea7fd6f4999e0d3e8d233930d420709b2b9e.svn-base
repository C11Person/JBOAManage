package cn.jboa.action;

import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;

import com.opensymphony.xwork2.ActionSupport;

public class LeaveToCheck extends ActionSupport{
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
System.out.println(leave.getId());
		
		leave = leaveService.getLeaveById(leave.getId());
		
		return "success";}
	
}
