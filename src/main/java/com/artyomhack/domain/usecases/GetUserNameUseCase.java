package com.artyomhack.domain.usecases;

import com.artyomhack.domain.models.UserName;

public class GetUserNameUseCase {

    public UserName execute() {
        return new UserName("Artyom", "Hackimullin");
    }
}
