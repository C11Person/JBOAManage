package cn.jboa.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.EmployeeDao;
import cn.jboa.entity.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public List findEmployee(Employee employee) {
		return super.getHibernateTemplate().find("from Employee e where e.sn=?and e.password =?",new Object[]{employee.getSn(),employee.getPassword()});
	}

}
