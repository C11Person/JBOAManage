package cn.jboa.service;

import java.util.List;

import cn.jboa.entity.Leave;

public interface LeaveService {
	 public List<Leave> searchLeaves (Leave leave,
				final int pageIndex, final int pageSize);
	    public int getLeaveTotalCount(Leave leave);
	    public Leave getLeaveById(Long id) ;
	    public void updateLeave(Leave leave) ;
	    public List<String> getALLtype() ;
	    
	    public Leave getLeaveBySn(String id);
	    public void saveLeave(Leave leave);
	    
}
