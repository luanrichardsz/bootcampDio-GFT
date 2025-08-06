package dioCurso;

import dioBootcamp.Bootcamp;
import dioBootcamp.Dev;
import dioCurso.dominio.Conteudo;
import dioCurso.dominio.Curso;
import dioCurso.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("DIO + GFT - Java");
        curso.setDescricao("Aprenda sobre Java");
        curso.setCargaHoraria(80);

        mentoria.setTitulo("Pratique as Soft Skills");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Evoluindo as soft skills na pratica");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuan = new Dev();
        devLuan.setNome("Luan Pankadao");
        devLuan.inscreverBootcamp(bootcamp);
        devLuan.progredir();
        System.out.println("Conteudos Inscritos - Luan: " + devLuan.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos - Luan: " + devLuan.getConteudosConcluidos());
        System.out.println("\nXP: " + devLuan.calcularXP());

        System.out.println("\n=====================================\n");

        Dev devJoaozinho = new Dev();
        devJoaozinho.setNome("Joaozinho");
        devJoaozinho.inscreverBootcamp(bootcamp);
        devJoaozinho.progredir();
        devJoaozinho.progredir();
        System.out.println("Conteudos Inscritos - Joaozinho: " + devJoaozinho.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos - Joaozinho: " + devJoaozinho.getConteudosConcluidos());
        System.out.println("\nXP: " + devJoaozinho.calcularXP());

    }
}
