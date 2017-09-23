package cn.jboa.dao.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.LeaveDao;
import cn.jboa.entity.Leave;

public class LeaveDaoImpl extends HibernateDaoSupport implements LeaveDao {

	@Override
	public List<Leave> searchLeaves(final Leave leave, final int pageIndex, final int pageSize) {
		// TODO Auto-generated method stub
		String hb="from Leave l where 1=1 ";
		if(leave!=null){
		   if(leave.getStartTime()!=null){hb+=" and to_char(starttime,'yyyy-mm-dd') = :starttime ";}
		   if(leave.getEndTime()!=null){hb+=" and to_char(endtime,'yyyy-mm-dd') = :endtime ";}	
		}
		
	final String hql = hb;
		return this.getHibernateTemplate().execute(
				new HibernateCallback<List<Leave>>() {
					public List<Leave> doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						if(leave!=null){
							if(leave.getStartTime()!=null){query.setParameter("starttime", new SimpleDateFormat("yyyy-MM-dd").format(leave.getStartTime()));}	
							
							if(leave.getEndTime()!=null){
								query.setParameter("endtime", new SimpleDateFormat("yyyy-MM-dd").format(leave.getEndTime()));
							}
						}
						
						query.setFirstResult((pageIndex - 1) * pageSize);
						query.setMaxResults(pageSize);
						return query.list();
					}
				});

	}

	@Override
	public int getLeaveTotalCount(Leave leave) {
		String hb="select count(id )from Leave l where 1=1 ";
		if(leave!=null){
			   if(leave.getStartTime()!=null){hb+=" and to_char(starttime,'yyyy-mm-dd') = ? ";}
			   if(leave.getEndTime()!=null){hb+=" and to_char(endtime,'yyyy-mm-dd') = ? ";}	
			}
		
		if(leave!=null){
			if(leave.getEndTime()!=null&&leave.getStartTime()!=null){return ((Number) this.getHibernateTemplate()
					.find(hb,new SimpleDateFormat("yyyy-MM-dd").format(leave.getEndTime()),new SimpleDateFormat("yyyy-MM-dd").format(leave.getEndTime())).listIterator()
					.next()).intValue();
				
			}
			if(leave.getStartTime()!=null){
				return ((Number) this.getHibernateTemplate()
						.find(hb, new SimpleDateFormat("yyyy-MM-dd").format(leave.getStartTime())).listIterator()
						.next()).intValue();}
			if(leave.getEndTime()!=null){
				return ((Number) this.getHibernateTemplate()
						.find(hb,new SimpleDateFormat("yyyy-MM-dd").format(leave.getEndTime())).listIterator()
						.next()).intValue();
				}
			
			
		}
		return ((Number) this.getHibernateTemplate()
				.find(hb).listIterator()
				.next()).intValue();

	}

	@Override
	public Leave getLeaveById(Long id) {
		String hb = "from Leave l where id=?";
		
		
		return (Leave) this.getHibernateTemplate().find(hb, id).get(0);
	}

	@Override
	public void updateLeave(Leave leave) {
		// TODO Auto-generated method stub
		
		 this.getHibernateTemplate().update(leave);
	}

	@Override
	public List<String> getALLtype() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("select distinct leaveType from Leave");
	}

	@Override
	public Leave getLeaveBySn(String id) {
		// TODO Auto-generated method stub
		String hql = "from Leave l  where l.creator.sn=? ";
		
		
		
		return (Leave) this.getHibernateTemplate().find(hql, id).get(0);
	}

	@Override
	public void saveLeave(Leave leave) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(leave);
	}

	
	
}
