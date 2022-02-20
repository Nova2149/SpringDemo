package com.example.FirstProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public void save(Register reg){
        registerRepository.save(reg);
    }

    public List<Register> getAllUsers()
    {
        return registerRepository.findAll();
    }

    public Register getUserById(Long id)
    {
        return registerRepository.getById(id);
    }
    public Register findByEmail(String email)
    {
        Register rg= registerRepository.findByEmail(email);
        return rg;
    }

}
