package com.code.assessment.convertor;

import org.springframework.core.convert.converter.Converter;

import com.code.assessment.controller.request.UpdatePlayerRequest;
import com.code.assessment.entity.Player;

public class UpdatePlayerRequestConvertor  implements Converter<UpdatePlayerRequest, Player>{

	@Override
	public Player convert(UpdatePlayerRequest source) {
		
		return null;
	}

}
