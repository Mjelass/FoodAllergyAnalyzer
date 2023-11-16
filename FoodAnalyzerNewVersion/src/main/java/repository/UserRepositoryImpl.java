package main.java.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final String filePath = "src\\main\\resources\\data\\users.json";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<User> users;

    public UserRepositoryImpl() {
        users = loadUsers();
    }

    private List<User> loadUsers() {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<User>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        saveUsers();
    }

    private void saveUsers() {
        try {
            objectMapper.writeValue(new File(filePath), users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}