package com.example.rental_car.service;

import com.example.rental_car.dao.models.Client;
import com.example.rental_car.dao.models.Role;
import com.example.rental_car.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.clientRepository = clientRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @Override
    public Client findClientByUsername(String userName) {
        return clientRepository.findClientByUsername(userName);
    }

    @Override
    public void save(Client client) {
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        clientRepository.save(client);

    }

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {//спринг использует этот метод для поиска человека
        //в БД и в дальнейшем авторизует его , если найден
        final Client user = findClientByUsername(userName);
        Set<Role> roles= new HashSet<>();
        if(user==null) //если user  не найден, тогда выбрасываем исключение
            throw new UsernameNotFoundException("пользователь с именем "+userName+" не существует!");
        else
            System.out.println("Success");
        roles.add(user.getRole());
        return new User(userName,user.getPassword(),roles);
    }
}
