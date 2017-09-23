package cn.jboa.dao;

import java.util.List;


import cn.jboa.entity.Leave;

public interface LeaveDao {
    public List<Leave> searchLeaves (Leave leave,
			final int pageIndex, final int pageSize);
    public int getLeaveTotalCount(Leave leave);
    
    public Leave getLeaveById(final Long id);
    
    public void updateLeave(Leave leave);
    
    public List<String> getALLtype();
    
    public Leave getLeaveBySn(final String id);
    
    public void saveLeave(Leave leave);
    
}
