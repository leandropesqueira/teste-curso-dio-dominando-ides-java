package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", "100");
        System.out.println(livro1);

           /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }
}

class Livro{

    private String nome;
    private String npag;

    public Livro() {
    }

    public Livro(String nome, String npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public String getNpag() {
        return npag;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNpag(String npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}
