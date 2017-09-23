package cn.jboa.action;

import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;
import cn.jboa.util.PageSupport;

import com.opensymphony.xwork2.ActionSupport;

public class LeaveAction extends ActionSupport {
      private LeaveService leaveService;
      private List<Leave> lists;
     
      private int pageIndex;
      private int pageSize;
      private int totalRecordCount;
      private int pageNo;
      private Date startDate;
      private Date endDate;
      
      
      
      
     

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public LeaveService getLeaveService() {
		return leaveService;
	}

	public void setLeaveService(LeaveService leaveService) {
		this.leaveService = leaveService;
	}

	public List<Leave> getLists() {
		return lists;
	}

	public void setLists(List<Leave> lists) {
		this.lists = lists;
	}

	public String execute(){
		
		  if(pageNo==0){pageNo=1;}
		  Leave leave = new Leave();
		  if(pageSize==0){pageSize=5;}
		  if(startDate!=null){leave.setStartTime(startDate);}
		  if(endDate!=null){leave.setEndTime(endDate);}
		  System.out.println(startDate+"*****************");
		  
		  
    	  lists = leaveService.searchLeaves(leave, pageNo, pageSize); 
    	  System.out.println(lists.size());
    	  totalRecordCount=leaveService.getLeaveTotalCount(leave);
    	  PageSupport page= new PageSupport();
    	  page.setCurrPageNo(pageNo);
    	  page.setTotalCount(totalRecordCount);
    	  
    	 
    	  int pageconuts = totalRecordCount%5==0?totalRecordCount/5:totalRecordCount/5+1;
    	  page.setTotalPageCount(pageconuts);
    	  ServletActionContext.getRequest().getSession().setAttribute("pageSupport", page);
    	  
    	  return "success";
      }
}
