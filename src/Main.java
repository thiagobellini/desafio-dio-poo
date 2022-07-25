import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thiago: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thiago: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularXp());

        System.out.println("-------------------------------------");

        Dev devClaudiane = new Dev();
        devClaudiane.setNome("Claudiane");
        devClaudiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Claudiane: " + devClaudiane.getConteudosInscritos());
        devClaudiane.progredir();
        devClaudiane.progredir();
        devClaudiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Claudiane: " + devClaudiane.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Claudiane: " + devClaudiane.getConteudosConcluidos());
        System.out.println("XP" + devClaudiane.calcularXp());
    }
}
