package dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import model.Contacto;

public interface AgendajpaSpring extends JpaRepository<Contacto, Integer> {

	Contacto findByemail(String email);
	
	@Transactional
	@Modifying
	@Query("Delete from Contacto c where c.email=?1")
	void eliminarPorEmail(String email);
	
	
	
	
	
}// interfaz
