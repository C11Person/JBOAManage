package cn.jboa.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import cn.jboa.entity.Employee;
import cn.jboa.service.LeaveService;

import com.opensymphony.xwork2.ActionSupport;

public class LeaveEdiAction extends ActionSupport{
	       private LeaveService leaveService;
	       
	       
	      public LeaveService getLeaveService() {
			return leaveService;
		}

		public void setLeaveService(LeaveService leaveService) {
			this.leaveService = leaveService;
		}

		public String execute(){
	    	  List<String> leaveTypeMap = leaveService.getALLtype();
	    	 
	    	  Map<Integer,String> typesMap = new HashMap<Integer, String>();
	    	  for (int i = 0; i < leaveTypeMap.size(); i++) {
	    		  typesMap.put(i+1,leaveTypeMap.get(i) );
	    		  
	    	  }
	    	  ServletActionContext.getRequest().getSession().setAttribute("leaveTypeMap",typesMap);
	    	  Employee st = (Employee) ServletActionContext.getRequest().getSession().getAttribute("employee");
	    	  
	    	 ServletActionContext.getRequest().getSession().setAttribute("manager",leaveService.getLeaveBySn(st.getSn()).getNextDeal());
	    	 
	    	 return "success";
	      }

}
