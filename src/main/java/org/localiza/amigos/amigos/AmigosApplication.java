package org.localiza.amigos.amigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmigosApplication implements CommandLineRunner {

	@Autowired RepoHola repoHola;
	public static void main(String[] args) {

		SpringApplication.run(AmigosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        //Esta es la famosa linea de comandos en spring
        	Hola h=new Hola();
        	h.setMensaje("Mi segundo mensajito de spring");
        //De las opreaciones CRUD es es la "C" "create" o guardar o save
        repoHola.save(h);
        //Ahora veremos desde aqui cómo leer o hacer una busqueda. (En BD SQL es SELECT)
        for(Hola hh:repoHola.findAll()){
            System.out.println(hh.getMensaje());
        }
	}
}
