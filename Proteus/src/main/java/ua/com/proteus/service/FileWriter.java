package ua.com.proteus.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileWriter {

	enum Folder{
		GRAPHIC
	}
	
	boolean write(Folder folder, MultipartFile file, int id);
}