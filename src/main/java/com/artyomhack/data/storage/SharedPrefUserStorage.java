package com.artyomhack.data.storage;

import com.artyomhack.data.storage.models.User;

public class SharedPrefUserStorage implements UserStorage{

    @Override
    public Boolean save(User user) {
        return user.getFirstName() != null;
    }

    @Override
    public User get() {
        return new User("Artyom", "Hackimullin");
    }
}
