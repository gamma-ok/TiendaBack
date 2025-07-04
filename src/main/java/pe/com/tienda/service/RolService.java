package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.RolEntity;

public interface RolService {

	List<RolEntity> findAll();
	List<RolEntity> findAllCustom();
	RolEntity findById(Long id);
	RolEntity findByName(String name);
	RolEntity add(RolEntity r);
	RolEntity update(RolEntity r, Long id);
	RolEntity delete(Long id);
	RolEntity enable(Long id);
	
}
