package com.artyomhack.data.repository;

import com.artyomhack.data.storage.models.User;
import com.artyomhack.data.storage.UserStorage;
import com.artyomhack.domain.models.SaveUserNameParam;
import com.artyomhack.domain.models.UserName;
import com.artyomhack.domain.repository.UserRepository;


public class UserRepositoryImpl implements UserRepository {

    private UserStorage storage;

    public UserRepositoryImpl(UserStorage storage) {
        this.storage = storage;
    }

    @Override
    public Boolean saveName(SaveUserNameParam param) {

        var user = new User(param.getNameParam(), "");

        var result = storage.save(user);

        return result;
    }

    @Override
    public UserName getName() {
        var user = storage.get();

        return new UserName(user.getFirstName(), user.getLastName());
    }
}
