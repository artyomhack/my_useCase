package com.artyomhack.presenter.activity;

import com.artyomhack.data.repository.UserRepositoryImpl;
import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.repository.UserRepository;
import com.artyomhack.domain.usecases.GetUserNameUseCase;
import com.artyomhack.domain.usecases.SaveUserNameUseCase;

public class MainActivity {

    private final UserRepository repository;
    private final GetUserNameUseCase getUserNameUseCase;
    private final SaveUserNameUseCase saveUserNameUseCase;

    public MainActivity(GetUserNameUseCase getUserNameUseCase,
                        SaveUserNameUseCase saveUserNameUseCase, UserRepositoryImpl repository) {
        this.getUserNameUseCase = getUserNameUseCase;
        this.saveUserNameUseCase = saveUserNameUseCase;
        this.repository = repository;
    }

    public Boolean saveUserNameParam(SaveUserNameParam nameParam) {
        var param = saveUserNameUseCase.execute(nameParam);

        return param != null;
    }

    public String getUserNameAndLastName() {
        var user = getUserNameUseCase.execute();

        if (user.getFirstName().isEmpty() && user.getLastName().isEmpty()) return "NotFoundUser";

        return user.getFirstName() + " " + user.getLastName();
    }
}
