package cn.jboa.action;

import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;

import com.opensymphony.xwork2.ActionSupport;

public class GetLeaveById extends ActionSupport{
	 private LeaveService leaveService;
	 private Leave leave;
	public Leave getLeave() {
		return leave;
	}

	public void setLeave(Leave leave) {
		this.leave = leave;
	}

	public LeaveService getLeaveService() {
		return leaveService;
	}

	public void setLeaveService(LeaveService leaveService) {
		this.leaveService = leaveService;
	}
	

	
	public String execute(){
		System.out.println(leave.getId());
		
		leave = leaveService.getLeaveById(leave.getId());
		
		return "success";
		
		
		
	}

}
