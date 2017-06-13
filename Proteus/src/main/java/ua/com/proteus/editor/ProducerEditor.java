package ua.com.proteus.editor;

import java.beans.PropertyEditorSupport;

import ua.com.proteus.entity.Producer;
import ua.com.proteus.service.ProducerService;

public class ProducerEditor extends PropertyEditorSupport{
	
	private final ProducerService producerService;
	
	public ProducerEditor(ProducerService producerService) {
		this.producerService=producerService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Producer producer = producerService.findOne(Integer.valueOf(text));
		setValue(producer);
	}

	
}
