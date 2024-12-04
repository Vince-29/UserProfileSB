package userprofile.project.controller;

import userprofile.project.model.Client;
import userprofile.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> createUser(@RequestBody Client user) {
        return ResponseEntity.ok(clientService.createUser(user));
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllUsers() {
        return ResponseEntity.ok(clientService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getUserById(@PathVariable int id) {
        return clientService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
