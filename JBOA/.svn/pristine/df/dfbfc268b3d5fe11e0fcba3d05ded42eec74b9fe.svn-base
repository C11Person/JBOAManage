package cn.jboa.service.impl;

import java.util.List;

import cn.jboa.dao.LeaveDao;
import cn.jboa.entity.Leave;
import cn.jboa.service.LeaveService;

public class LeaveServiceImpl implements LeaveService{
	private LeaveDao leavedao;

	public LeaveDao getLeavedao() {
		return leavedao;
	}

	public void setLeavedao(LeaveDao leavedao) {
		this.leavedao = leavedao;
	}

	@Override
	public List<Leave> searchLeaves(Leave leave, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return leavedao.searchLeaves(leave, pageIndex, pageSize);
	}

	@Override
	public int getLeaveTotalCount(Leave leave) {
		// TODO Auto-generated method stub
		return leavedao.getLeaveTotalCount(leave);
	}

}
