package com.dailycodebuffer.client.service;

import com.dailycodebuffer.client.entity.User;
import com.dailycodebuffer.client.entity.VerificationToken;
import com.dailycodebuffer.client.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    public User registerUser(UserModel userModel);

    public void saveVerificationTokenForUser(String token, User user);

    public String validateVerificationToken(String token);

    public VerificationToken generateNewVerificationToken(String oldToken);

    public User findUserByEmail(String email);

    public void createPasswordResetTokenForUser(User user, String token);

    public String validatePasswordResetToken(String token);

    public Optional<User> getUserByPasswordResetToken(String token);

    public void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
