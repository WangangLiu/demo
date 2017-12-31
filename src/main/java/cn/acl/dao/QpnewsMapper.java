package cn.acl.dao;

import cn.acl.entity.Qpnews;
import java.util.List;

public interface QpnewsMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpnews> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpnews p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpnews p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpnews p);
    /**
	 * 
	 * @paramt 通过ID查询对象
	 * @return
	 */
    Qpnews getFlowerById(Qpnews p);
    
    /**
     * TODO 分页显示列表
     * @return Qpnews
     */
    public List<Qpnews> fenye(Qpnews p);
    
    /**
     * TODO 获得条数
     */
    public Integer countRow();
}