package com.javatechin.exampleprograms.controller;

import com.javatechin.exampleprograms.enitiy.UserName;
import com.javatechin.exampleprograms.dto.UserRequest;
import com.javatechin.exampleprograms.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsernameController {
    @Autowired
    UserNameService userNameService;

    @PostMapping("/save")
    public ResponseEntity<Object>saveUserName(@RequestBody UserRequest userRequest){
    return new ResponseEntity<>(userNameService.saveUserName(userRequest),HttpStatus.CREATED);
    }
@GetMapping("/get")
    public ResponseEntity<Object>getAll(){
        return ResponseEntity.ok(userNameService.getAll());
}
@PutMapping("/put")
    public Object update(@RequestBody UserRequest userRequest){
        return userNameService.put(userRequest);
}
@DeleteMapping("delete/{id}")
    public Object userDelete(@PathVariable Long id){
     return    userNameService.userIdDelete(id);

}

    }

