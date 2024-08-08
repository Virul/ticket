package com.gerez.Ticket;

import com.gerez.Ticket.models.Role;
import com.gerez.Ticket.models.User;
import com.gerez.Ticket.repositories.RoleRepository;
import com.gerez.Ticket.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        return args -> {
            // Crear roles si no existen
            Role adminRole = roleRepository.findByName("ROLE_ADMIN");
            if (adminRole == null) {
                adminRole = new Role();
                adminRole.setName("ROLE_ADMIN");
                roleRepository.save(adminRole);
            }

            // Crear un usuario administrador
            User admin = userRepository.findByUsername("a");
            if (admin == null) {
                admin = new User();
                admin.setUsername("a");
                admin.setPassword("1234");
                admin.setEnabled(true);
                admin.setRoles(Set.of(adminRole));
                userRepository.save(admin);
            }
        };
    }
}
