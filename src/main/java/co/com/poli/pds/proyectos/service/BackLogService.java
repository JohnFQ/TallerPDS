package co.com.poli.pds.proyectos.service;

import org.springframework.http.ResponseEntity;

import co.com.poli.pds.proyectos.entity.BackLog;

public interface BackLogService {
	
	BackLog createBackLog(BackLog newBackLog);
	
}
