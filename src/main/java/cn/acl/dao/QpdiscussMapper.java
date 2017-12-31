package cn.acl.dao;

import cn.acl.entity.Qpdiscuss;
import java.util.List;

public interface QpdiscussMapper {
	/**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
	Qpdiscuss getById(Qpdiscuss p );
	
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpdiscuss> getList();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpdiscuss p);

	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpdiscuss p);
	
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpdiscuss p);
	
	
	
	
	 
}