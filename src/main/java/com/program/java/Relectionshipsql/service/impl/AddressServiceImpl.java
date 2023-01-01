package com.program.java.Relectionshipsql.service.impl;

import com.program.java.Relectionshipsql.repository.AddressRepository;
import com.program.java.Relectionshipsql.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;
}
