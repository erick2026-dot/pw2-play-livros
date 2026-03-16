public class TestaReferencias {

    static void main(){
        Livro LivroA = new Livro();
        LivroA.titulo = "Meu Livro A";
        System.out.println(LivroA.titulo);

        Livro LivroB = LivroA;
        LivroB.titulo = "Meu livro B";
        System.out.println(LivroB.titulo);

        System.out.println(LivroA.titulo);




    }




}
