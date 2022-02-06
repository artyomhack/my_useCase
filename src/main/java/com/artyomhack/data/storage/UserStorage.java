package com.artyomhack.data.storage;

import com.artyomhack.data.storage.models.User;

public interface UserStorage {

    Boolean save(User user);

    User get();

}
