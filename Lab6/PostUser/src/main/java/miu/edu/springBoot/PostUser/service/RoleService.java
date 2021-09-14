package miu.edu.springBoot.PostUser.service;

import com.example.demo.domain.Role;

import java.util.List;

public interface RoleService  {
    List<Role> findAll();
    Role get(Long id);
}
