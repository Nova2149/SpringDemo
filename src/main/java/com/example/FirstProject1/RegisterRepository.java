package com.example.FirstProject1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register,Long> {
    Register findByEmail(String email);

}
