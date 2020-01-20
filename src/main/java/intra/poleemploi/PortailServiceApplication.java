package intra.poleemploi;

import intra.poleemploi.dao.AppliRepository;
import intra.poleemploi.dao.ContentRepository;
import intra.poleemploi.dao.UserAppRepository;
import intra.poleemploi.entities.Appli;
import intra.poleemploi.entities.Content;
import intra.poleemploi.entities.RoleApp;
import intra.poleemploi.entities.UserApp;
//import intra.poleemploi.service.AuthService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;


@SpringBootApplication
public class PortailServiceApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(PortailServiceApplication.class, args);
	}



	//@Bean
	//CommandLineRunner start(AppliRepository appliRepository, ContentRepository contentRepository, AuthService authService, UserAppRepository userAppRepository){
		//return args -> {
			//repositoryRestConfiguration.exposeIdsFor(Appli.class, Content.class, UserApp.class, RoleApp.class);
			/*// A VIRER => supprime les données Appli avant chaque lancement de l'appli
			appliRepository.deleteAll();
			// save les données Appli en BDD
			appliRepository.save(new Appli(1, "APP01", "Profil de compétences", new ArrayList<>()));
			appliRepository.save(new Appli(2, "APP02", "MRS Digitale", new ArrayList<>()));
			appliRepository.save(new Appli(3, "APP03", "MAP Vue DE", new ArrayList<>()));
			appliRepository.save(new Appli(4, "APP04", "AUDE Presta", new ArrayList<>()));
			appliRepository.save(new Appli(5, "APP05", "BPM", new ArrayList<>()));
			appliRepository.save(new Appli(6, "APP06", "AUDE V4", new ArrayList<>()));
			appliRepository.save(new Appli(7, "APP07", "DUNE V4", new ArrayList<>()));
			appliRepository.save(new Appli(8, "APP08", "EverestFab", new ArrayList<>()));
			appliRepository.save(new Appli(9, "APP09", "KairosFab", new ArrayList<>()));
			appliRepository.save(new Appli(10, "APP10", "NG AGEPI", new ArrayList<>()));
			// parcourt et affiche les données
			appliRepository.findAll().forEach(System.out::println);
			// supprime les données contentAppli avant chaque lancement de l'appli
			// contentRepository.deleteAll();

			Random rnd = new Random();
			appliRepository.findAll().forEach(appli -> {
				for (int i = 0; i < 10; i++) {
					Content cnt = new Content();
					cnt.setId(rnd.nextInt());
					cnt.setIdContentKM(RandomString.make(5));
					cnt.setContentName(RandomString.make(40));
					cnt.setPublished(rnd.nextBoolean());
					cnt.setTypeService(RandomString.make(8));
					cnt.setNbAffichages(rnd.nextInt(1500));
					cnt.setNbLectures(rnd.nextInt(50));
					cnt.setAppli(appli);
					contentRepository.save(cnt);
				}
			});
			contentRepository.findAll().forEach(cnt -> {
				System.out.println(cnt.toString());
			});

			// AUTHENTICATION
			// ajout de 2 roles
			authService.saveRoleApp(new RoleApp(null, "USER"));
			authService.saveRoleApp(new RoleApp(null, "ADMIN"));

			// ajout users
			Stream.of("user1", "user2", "user3", "user4", "admin").forEach(username -> {
				authService.saveUserApp(username, "1234", "1234");
			});

			// ajout role ADMIN a l'admin
			authService.addRoleToUser("admin", "ADMIN");

            // ajout appli à user
			authService.addAppliToUser("user1", "MAP DE");
            authService.addAppliToUser("user1", "Profil de compétences");
            authService.addAppliToUser("user1", "AUDE Presta");
            authService.addAppliToUser("user1", "BPM");
			authService.addAppliToUser("user2", "MRS Digitale");
			authService.addAppliToUser("user2", "MAP Vue DE");
			authService.addAppliToUser("user2", "EverestFab");
			authService.addAppliToUser("user3", "Profil de compétences");
			authService.addAppliToUser("user4", "BPM");
			authService.addAppliToUser("user4", "AUDE V4");
			authService.addAppliToUser("user4", "MAP Vue DE");
			authService.addAppliToUser("user4", "NG AGEPI");
			authService.addAppliToUser("user4", "KairosFab");


			userAppRepository.findAll().forEach(System.out::println);*/
			
		//};
	//}

	// créer BCryptPasswordEncoder au démarrage de l'appli pour injection dans couche Service
	/*@Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}*/

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Appli.class, Content.class, UserApp.class, RoleApp.class);
	}
}

