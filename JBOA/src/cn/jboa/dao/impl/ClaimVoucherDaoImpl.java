/**
 * 
 */
package cn.jboa.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.ClaimVoucherDao;
import cn.jboa.entity.ClaimVoucher;

/**
 * @author AYao
 *
 */
public class ClaimVoucherDaoImpl extends HibernateDaoSupport implements
		ClaimVoucherDao {

	/* (non-Javadoc)
	 * @see cn.jboa.dao.ClaimVoucherDao#getAllClaimVouchers()
	 */


	@Override
	public List<String> getAllStatus() {
		return super.getHibernateTemplate().find("select status from ClaimVoucher group by status");
	}

	@Override
	public void deleteClaimVoucher(ClaimVoucher claimVoucher) {
        claimVoucher = (ClaimVoucher) super.getHibernateTemplate().get(
                ClaimVoucher.class,claimVoucher.getId());
        super.getHibernateTemplate().delete(claimVoucher);
	}

	@Override
	public List<ClaimVoucher> getAllClaimVouchers(final int pageIndex, final int pageSize) {
		final String hql = "from ClaimVoucher";
		return this.getHibernateTemplate().execute(new HibernateCallback<List<ClaimVoucher>>() {

			@Override
			public List<ClaimVoucher> doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult((pageIndex - 1) * pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
			
		});
	}

	@Override
	public int getClaimVoucherTotalCount() {
		return ((Number) this.getHibernateTemplate()
				.find("select count(id) from ClaimVoucher").listIterator()
				.next()).intValue();
	}

	@Override
	public void addClaimVoucher(ClaimVoucher claimVoucher) {
        super.getHibernateTemplate().save(claimVoucher);
	}



}
