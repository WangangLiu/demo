package cn.acl.dao;

import cn.acl.entity.Qpuser;
import java.util.List;

public interface QpuserMapper {

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