package cn.acl.dao;

import java.util.List;

import cn.acl.entity.QPpicture;

public interface IQPpictureDao {

	/**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
	QPpicture getById(QPpicture p );
	
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<QPpicture> getList();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(QPpicture p);

	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(QPpicture p);
	
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(QPpicture p);
	
}
