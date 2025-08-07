import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(12);
    
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(7);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNatan = new Dev();
        devNatan.setNome("Natan");
        devNatan.inscreverBootcamp(bootcamp);
        System.out.println("Natan");
        System.out.println("Conteudos inscritos: " + devNatan.getConteudoInscritos());
        devNatan.progredir();
        System.out.println("Conteudos concluídos: " + devNatan.getConteudoConcluidos());
        System.out.println("XP: " + devNatan.calcularTotalXp());

        System.out.println("----------------------------------");

        Dev devBeatriz = new Dev();
        devBeatriz.setNome("Beatriz");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println("Beatriz");
        System.out.println("Conteudos inscritos: " + devBeatriz.getConteudoInscritos());
        devBeatriz.progredir();
        System.out.println("Conteudos concluídos: " + devBeatriz.getConteudoConcluidos());
        System.out.println("XP: " + devBeatriz.calcularTotalXp());;
    }
}
