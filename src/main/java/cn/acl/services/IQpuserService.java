package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpuser;

/**
 * TODO　赛事管理
 * @author Administrator
 *
 */
public interface IQpuserService {
	
	/**
	 * TODO 获得列表
	 * @return
	 */
	List<Qpuser> listQP1();
	
	/**
	 * TODO 删除
	 * @param qp
	 * @return int
	 */
	int deleteQP1(Qpuser qp);

	/**
	 * TODO 添加
	 * @param qp
	 * @return int
	 */
	int insertQP1(Qpuser qp);

	/**
	 * TODO 修改
	 * @param qp
	 * @return int
	 */
	int updateQP1(Qpuser qp);
    
	/**
	 * TODO 
	 * @return Qpgame
	 */
	public Qpuser getById1(Integer id);

}
