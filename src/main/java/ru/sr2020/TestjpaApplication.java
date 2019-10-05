package ru.sr2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
//import ru.sr2020.database.pojo.Body;
//import ru.sr2020.database.repositories.BodyRepository;
import ru.sr2020.database.pojo.Player;
import ru.sr2020.database.repositories.PlayerRepository;

import javax.persistence.EntityManager;
import java.util.Optional;

@SpringBootApplication
@EntityScan(basePackages = {"ru.sr2020.database.pojo" })

public class TestjpaApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(TestjpaApplication.class, args);

 		PlayerRepository rep = app.getBean(PlayerRepository.class);
		EntityManager man = app.getBean(EntityManager.class);


		//Character b = new Character();
		//b.setBodytype("matrix-jpa");

		Player p;/* = new Player();

		p.setFio("Васисуарий Пупкинз");

		rep.save(p);*/

		Optional<Player> p1 = rep.findById(1);
		if (p1.isPresent()) {
			p = p1.get();
			p.setFio("aaa");
			p.getCharacters().size();
			int a =-0;
		}

	}

}
