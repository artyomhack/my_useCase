package com.artyomhack.domain.usecases;

import com.artyomhack.domain.models.UserName;
import com.artyomhack.domain.repository.UserRepository;

public class GetUserNameUseCase {

    private UserRepository repository;

    public GetUserNameUseCase(UserRepository repository) {
        this.repository = repository;
    }

    public UserName execute() {

        return repository.getName();
    }
}
