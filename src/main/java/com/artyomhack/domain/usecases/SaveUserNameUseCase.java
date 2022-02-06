package com.artyomhack.domain.usecases;

import com.artyomhack.data.repository.UserRepositoryImpl;
import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.models.UserName;
import com.artyomhack.domain.repository.UserRepository;

public class SaveUserNameUseCase {

    private UserRepository repository;

    public SaveUserNameUseCase(UserRepository repository) {
        this.repository = repository;
    }

    public Boolean execute(SaveUserNameParam param) {
        var result = repository.saveName(param);

        return result != null;
    }
}
