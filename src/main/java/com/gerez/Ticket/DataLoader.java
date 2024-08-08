package com.gerez.Ticket;

import com.gerez.Ticket.models.Role;
import com.gerez.Ticket.models.User;
import com.gerez.Ticket.repositories.RoleRepository;
import com.gerez.Ticket.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Crear roles si no existen
            Role adminRole = roleRepository.findByName("ROLE_ADMIN");
            if (adminRole == null) {
                adminRole = new Role();
                adminRole.setName("ROLE_ADMIN");
                roleRepository.save(adminRole);
            }

            Role sistemaRole = roleRepository.findByName("ROLE_SISTEMA");
            if (sistemaRole == null) {
                sistemaRole = new Role();
                sistemaRole.setName("ROLE_SISTEMA");
                roleRepository.save(sistemaRole);
            }

            Role liderRole = roleRepository.findByName("ROLE_LIDER");
            if (liderRole == null) {
                liderRole = new Role();
                liderRole.setName("ROLE_LIDER");
                roleRepository.save(liderRole);
            }


            // Crear un usuario administrador
            User admin = userRepository.findByUsername("admin");
            if (admin == null) {
                admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.setEnabled(true);
                admin.setRoles(Set.of(adminRole));
                userRepository.save(admin);
            }
        };
    }
}
