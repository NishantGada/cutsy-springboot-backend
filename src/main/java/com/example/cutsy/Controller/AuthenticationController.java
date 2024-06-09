package com.example.cutsy.Controller;

import com.example.cutsy.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AuthenticationController {
    @PostMapping("/create-user")
    public void createNewUser(@RequestBody User user) {
        System.out.println("createNewUser user: " + user.getFirstName());
        User userObj = new User(
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getPassword(),
                user.getDob(),
                user.getGender(),
                user.getAge(),
                user.getEmail(),
                user.getPhone(),
                user.getAddressLine1(),
                user.getAddressLine2(),
                user.getCity(),
                user.getState(),
                user.getPincode(),
                user.getCountry(),
                user.getProfilePicture(),
                user.getReviewsGivenList()
        );

        System.out.println("userObj: " + userObj);
    }
}