package cn.jboa.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.jboa.entity.ClaimVoucher;
import cn.jboa.service.ClaimVoucherService;
import cn.jboa.util.PageSupport;

public class ClaimVoucherAction extends ActionSupport{
	private ClaimVoucherService claimVoucherService;
	private ClaimVoucher claimVoucher;
    private int pageIndex;
    private int pageSize;
    private int totalRecordCount;
    private int pageNo;
    
    Map<Integer,String> statusMap = new HashMap<Integer, String>();

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

	public long getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public ClaimVoucherService getClaimVoucherService() {
		return claimVoucherService;
	}

	public void setClaimVoucherService(ClaimVoucherService claimVoucherService) {
		this.claimVoucherService = claimVoucherService;
	}
	public ClaimVoucher getClaimVoucher() {
		return claimVoucher;
	}

	public void setClaimVoucher(ClaimVoucher claimVoucher) {
		this.claimVoucher = claimVoucher;
	}

	
	
	
	
	public String getAllClaimVouchers(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(pageNo==0){pageNo=1;}
		if(pageSize==0){pageSize=5;}
		List<ClaimVoucher> list = claimVoucherService.getAllClaimVouchers(pageNo, pageSize);
		totalRecordCount=claimVoucherService.getClaimVoucherTotalCount();
		System.out.println("****************************"+pageNo);
		System.out.println("*************************"+pageSize);
		System.out.println("**************************"+totalRecordCount);
  	  	PageSupport page= new PageSupport();
  	  	page.setCurrPageNo(pageNo);
  	  	page.setTotalCount(totalRecordCount);
  	  	int pageconuts = totalRecordCount%5==0?totalRecordCount/5:totalRecordCount/5+1;
  	  	page.setTotalPageCount(pageconuts);
  	  	session.setAttribute("pageSupport",page);
		
		
		
  	  	List<String> status =  claimVoucherService.getAllStatus();
		for (int i = 0; i < status.size(); i++) {
			statusMap.put((i+1),status.get(i));
		}
			
			session.setAttribute("claimVoucher", list);
			session.setAttribute("statusMap", statusMap);
		return "claimvoucherlist";
			
			
	}
	
	/**
	 * 删除报销单
	 * @return
	 */
	public String deleteClaimVoucher(){
		this.claimVoucherService.deleteClaimVoucher(claimVoucher);
		return SUCCESS;
	}



}
