package userprofile.project.service;

import userprofile.project.model.Client;
import userprofile.project.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepo clientRepository;

    public Client createUser(Client user) {
        return clientRepository.save(user);
    }

    public List<Client> getAllUsers() {
        return clientRepository.findAll();
    }

    public Optional<Client> getUserById(int id) {
        return clientRepository.findById(id);
    }
}
