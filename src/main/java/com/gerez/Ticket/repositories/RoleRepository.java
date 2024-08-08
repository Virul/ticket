package com.gerez.Ticket.repositories;

import com.gerez.Ticket.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
