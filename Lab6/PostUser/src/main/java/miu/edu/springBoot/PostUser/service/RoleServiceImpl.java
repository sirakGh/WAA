package miu.edu.springBoot.PostUser.service;

import com.example.demo.domain.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role get(Long id) {
        return roleRepository.findById(id).get();
    }
}
