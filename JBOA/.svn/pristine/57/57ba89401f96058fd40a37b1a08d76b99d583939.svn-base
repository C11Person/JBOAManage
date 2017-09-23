package cn.jboa.action;

import java.util.Date;

import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;

import com.opensymphony.xwork2.ActionSupport;

public class CheckLeave extends ActionSupport{
	private LeaveService leaveService;
	public LeaveService getLeaveService() {
		return leaveService;
	}




	public void setLeaveService(LeaveService leaveService) {
		this.leaveService = leaveService;
	}


	private Leave leave;
	

	

	public Leave getLeave() {
		return leave;
	}




	public void setLeave(Leave leave) {
		this.leave = leave;
	}


    public String execute(){
		Leave leavee = leaveService.getLeaveById(leave.getId());
		
		leavee.setStatus(this.leave.getStatus());
		leavee.setApproveOpinion(this.leave.getApproveOpinion());
		leavee.setModifyTime(new Date());
         leaveService.updateLeave(leavee);
		
		
		
		return "success";
	}

}
