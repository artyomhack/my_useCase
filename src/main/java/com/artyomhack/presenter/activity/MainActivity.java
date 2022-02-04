package com.artyomhack.presenter.activity;

import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.models.UserName;
import com.artyomhack.domain.usecases.GetUserNameUseCase;
import com.artyomhack.domain.usecases.SaveUserNameUseCase;

public class MainActivity {

    private GetUserNameUseCase getUserNameUseCase;
    private SaveUserNameUseCase saveUserNameUseCase;

    public MainActivity(GetUserNameUseCase getUserNameUseCase,
                        SaveUserNameUseCase saveUserNameUseCase) {
        this.getUserNameUseCase = getUserNameUseCase;
        this.saveUserNameUseCase = saveUserNameUseCase;
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
