package com.artyomhack.domain.repository;

import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.models.UserName;

public interface UserRepository {

    Boolean saveName(SaveUserNameParam param);

    UserName getName();
}
