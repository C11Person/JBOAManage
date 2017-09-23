package cn.jboa.dao;

import java.util.List;

import cn.jboa.entity.ClaimVoucher;


public interface ClaimVoucherDao{
	/**
	 * 得到所有报销单
	 * @return
	 */
	public List<ClaimVoucher> getAllClaimVouchers(final int pageIndex, final int pageSize);
	
	/**
	 * 得到总页数
	 */
	public int getClaimVoucherTotalCount();
	
	/**
	 * 得到所有状态
	 */
	public List<String> getAllStatus();
	
	
	/**
	 * 添加报销单
	 */
	public void addClaimVoucher(ClaimVoucher claimVoucher);
	
	
	/**
	 * 删除报销单
	 */
	public void  deleteClaimVoucher(ClaimVoucher claimVoucher);
}