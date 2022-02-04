package com.artyomhack.domain.usecases;

import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.models.UserName;

public class SaveUserNameUseCase {

    public Boolean execute(SaveUserNameParam param) {
        return param.getNameParam().isEmpty();
    }
}
