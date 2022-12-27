import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT QA para Mulheres");
        bootcamp.setDescricao("Descrição Bootcamp GFT QA para Mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarla = new Dev();
        devCarla.setNome("Carla");
        devCarla.inscrevereBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
        devCarla.progredir();
        devCarla.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Ainda Inscritos Carla: " 
        + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carla: " + devCarla.getConteudosConcluidos());
        System.out.println("XP: " + devCarla.calcularTotalXp());

        System.out.println("----------------");

        Dev devRondonito = new Dev();
        devRondonito.setNome("Rondonito");
        devRondonito.inscrevereBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rondonito: " 
        + devRondonito.getConteudosInscritos());
        devRondonito.progredir();
        devRondonito.progredir();
        devRondonito.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Ainda Inscritos Rondonito: "
                + devRondonito.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rondonito: " 
        + devRondonito.getConteudosConcluidos());
        System.out.println("XP: " + devRondonito.calcularTotalXp());
       
    }
    
}
