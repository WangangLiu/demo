package cn.acl.dao;

import cn.acl.entity.Qppolicy;
import java.util.List;

public interface QppolicyMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qppolicy> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qppolicy p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qppolicy p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qppolicy p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qppolicy getFlowerById(Qppolicy p);
	
}