package com.javatechin.exampleprograms.service;


import com.javatechin.exampleprograms.ApiResponse;
import com.javatechin.exampleprograms.dto.UserRequest;
import com.javatechin.exampleprograms.enitiy.UserName;

import java.util.Optional;

public interface UserNameService {


    ApiResponse saveUserName(UserRequest userRequest);

    Object getAll();
    Object put(UserRequest userRequest);

    Object userIdDelete(Long id);
}
