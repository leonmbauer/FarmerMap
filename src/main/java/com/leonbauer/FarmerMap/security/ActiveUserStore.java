package com.leonbauer.FarmerMap.security;

import java.util.ArrayList;
import java.util.List;

public class ActiveUserStore {
    public List<String> users;

    public ActiveUserStore() {
        users = new ArrayList<String>();
    }
}
