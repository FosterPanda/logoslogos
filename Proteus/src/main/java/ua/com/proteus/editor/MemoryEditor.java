package ua.com.proteus.editor;

import java.beans.PropertyEditorSupport;

import ua.com.proteus.entity.Memory;
import ua.com.proteus.service.MemoryService;

public class MemoryEditor extends PropertyEditorSupport{
	
	private final MemoryService memoryService;

	public MemoryEditor(MemoryService memoryService) {
		this.memoryService = memoryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Memory memory = memoryService.findOne(Integer.valueOf(text));
		setValue(memory);
	}
	
	
}
