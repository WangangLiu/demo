package cn.acl.dao;

import cn.acl.entity.Qpsign;
import java.util.List;

public interface QpsignMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpsign> select();
	
	/*int delete(Qpsign p);

	int insert(Qpsign p);

    int update(Qpsign p);*/
}