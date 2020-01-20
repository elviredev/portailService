package intra.poleemploi.service;

import intra.poleemploi.entities.RoleApp;
import intra.poleemploi.entities.UserApp;

import java.util.List;

public interface AuthService {
    UserApp saveUserApp(String username, String password, String confirmedPassword);
    UserApp saveUserApp(UserApp userApp);
    void saveRoleApp(RoleApp role);
    UserApp loadUserAppByUsername(String username);
    void addRoleToUser(String username, String roleName);
    void addAppliToUser(String username, String appliName);
}
