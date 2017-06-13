package ua.com.proteus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.*;



import ua.com.proteus.entity.Memory;
import ua.com.proteus.service.MemoryService;

public class MemoryValidator implements Validator {

	private final MemoryService memoryService;

	public MemoryValidator(MemoryService memoryService) {
		this.memoryService = memoryService;
	}

	public boolean supports(Class<?> clazz) {
		return Memory.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Memory memory = (Memory) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Can't be empty");
		if(memoryService.findByType(memory.getType())!=null){
			errors.rejectValue("type", "", "Already exist");
		}
	}
}
