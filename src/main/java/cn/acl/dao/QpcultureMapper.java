package cn.acl.dao;

import java.util.List;

import cn.acl.entity.Qpculture;

public interface QpcultureMapper {
	/**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
	Qpculture getById(Qpculture p );
	
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpculture> getList();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpculture p);

	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpculture p);
	
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpculture p);
	
	
	
	
	
}