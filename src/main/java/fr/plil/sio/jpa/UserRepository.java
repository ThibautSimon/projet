package fr.plil.sio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Return an owner instance with specified name.
     *
     * @param name the name of the owner to return.
     * @return the owner instance or null if not found
     */
    User findByName(String name);
}
