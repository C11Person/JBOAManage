/**
 * 
 */
package cn.jboa.service.impl;

import java.util.List;

import cn.jboa.dao.EmployeeDao;
import cn.jboa.entity.Employee;
import cn.jboa.service.EmployeeService;

/**
 * @author AYao
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	/* (non-Javadoc)
	 * @see cn.jboa.service.EmployeeService#findEmployee(cn.jboa.entity.Employee)
	 */

	@Override
	public Employee findEmployee(Employee employee) {
		List list = employeeDao.findEmployee(employee);
		if(list.size()>0){
			return (Employee) list.get(0);
		}else{
			return null;
		}
	}
	
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}
