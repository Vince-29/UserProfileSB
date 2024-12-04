package userprofile.project.repository;

import userprofile.project.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
    // You can add custom query methods if needed
}
