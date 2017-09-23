/**
 * 
 */
package cn.jboa.service.impl;

import java.util.List;

import cn.jboa.dao.ClaimVoucherDao;
import cn.jboa.entity.ClaimVoucher;
import cn.jboa.service.ClaimVoucherService;

/**
 * @author AYao
 *
 */
public class ClaimVoucherServiceImpl implements ClaimVoucherService {
	private ClaimVoucherDao claimVoucherDao;

	/* (non-Javadoc)
	 * @see cn.jboa.service.ClaimVoucherService#getAllClaimVouchers()
	 */

	
	@Override
	public List<ClaimVoucher> getAllClaimVouchers(int pageIndex, int pageSize) {
		return claimVoucherDao.getAllClaimVouchers(pageIndex, pageSize);
	}


	@Override
	public int getClaimVoucherTotalCount() {
		return claimVoucherDao.getClaimVoucherTotalCount();
	}
	
	
	@Override
	public List<String> getAllStatus() {
		return claimVoucherDao.getAllStatus();
	}
	
	
	@Override
	public void deleteClaimVoucher(ClaimVoucher claimVoucher) {
		this.claimVoucherDao.deleteClaimVoucher(claimVoucher);
		
	}
	
	
	
	
	public ClaimVoucherDao getClaimVoucherDao() {
		return claimVoucherDao;
	}
	public void setClaimVoucherDao(ClaimVoucherDao claimVoucherDao) {
		this.claimVoucherDao = claimVoucherDao;
	}







}
