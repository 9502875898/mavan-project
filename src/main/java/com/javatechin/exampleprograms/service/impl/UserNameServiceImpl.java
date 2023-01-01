package com.javatechin.exampleprograms.service.impl;


import com.javatechin.exampleprograms.ApiResponse;
import com.javatechin.exampleprograms.dto.UserRequest;
import com.javatechin.exampleprograms.enitiy.UserName;
import com.javatechin.exampleprograms.repo.UserNameRepository;
import com.javatechin.exampleprograms.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserNameServiceImpl implements UserNameService {
    @Autowired
    UserNameRepository userNameRepository;


    @Override
    public ApiResponse saveUserName(@RequestBody UserRequest userRequest) {
        if (userRequest.getMobile()==null){
            return new ApiResponse(400,"data is not inserted praperlly",null);
        }
        UserName userName=UserName.build(0l,userRequest.getName(),userRequest.getEmail(),userRequest.getMobile()
        ,userRequest.getGender(),userRequest.getAge(),userRequest.getNationality());
        return new ApiResponse(200,"success",userName);

       // return userNameRepository.save(userName);
    }

    @Override
    public Object getAll() {

        return userNameRepository.findAll();
    }

    @Override
    public Object put(UserRequest userRequest) {
        Optional<UserName> optionalUserName = userNameRepository.findById(userRequest.getId());
        if (optionalUserName.isPresent()) {
            UserName userName = optionalUserName.get();
            UserName.build(userRequest.getId(), userRequest.getName(), userRequest.getEmail(), userRequest.getMobile()
                    , userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
             userNameRepository.save(userName);
        }
return userRequest;

    }

    @Override
    public Object userIdDelete(Long id) {
        Optional<UserName> optionalUserName = userNameRepository.findById(id);
        if (optionalUserName.isPresent()) {
            userNameRepository.delete(optionalUserName.get());
        }
        return id;
    }

}

 /*   @PutMapping("/put")
    public String userNameUpadare(@RequestBody UserRequest userRequest){
        UserName userName=UserName.build(0l,userRequest.getName(),userRequest.getEmail(),userRequest.getMobile()
                ,userRequest.getGender(),userRequest.getAge(),userRequest.getNationality());
        return "update successfully";

    }*/



