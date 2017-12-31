package cn.acl.dao;

import cn.acl.entity.Qpinformation;

import java.util.List;

public interface QpinformationMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpinformation> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpinformation p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpinformation p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpinformation p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qpinformation getById(Qpinformation p);
}