package cn.acl.services;

import java.util.List;

import cn.acl.entity.QPpicture;

public interface IQPpictureService {

	public QPpicture getById(QPpicture p);
	List<QPpicture> getList();
	int delete(QPpicture p);

	int insert(QPpicture p);
	
    int update(QPpicture p);
}
