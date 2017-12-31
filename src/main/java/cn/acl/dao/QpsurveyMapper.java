package cn.acl.dao;

import cn.acl.entity.Qpsurvey;
import java.util.List;

public interface QpsurveyMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpsurvey> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpsurvey p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpsurvey p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpsurvey p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qpsurvey getById(Qpsurvey p);
    
}