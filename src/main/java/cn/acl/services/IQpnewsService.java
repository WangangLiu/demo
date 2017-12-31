package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpnews;

public interface IQpnewsService {

 
	List<Qpnews> select();
	
	int delete(Qpnews p);

	int insert(Qpnews p);

    int update(Qpnews p);
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
