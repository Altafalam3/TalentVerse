package project.talentVerse.Network.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.talentVerse.Network.entities.User;



public interface UserRepo  extends JpaRepository< User, Integer>{

}
