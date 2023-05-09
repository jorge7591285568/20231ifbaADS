public class Livro {

    private String autor;
    private String matricula;
    private String ISBN;

    Livro("jorge","20191tadssaj0015","12345"){
        this.autor = autor;
        this.matricula = matricula;
        this.ISBN = isbn;
    }

    public void adicionarlivro(livro livro){

    Estante add(livro);
   
  
    Biblioteca biblioteca = new biblioteca();
    biblioteca.adicionarlivro(new livro("java1","livro de programacao","12345"));
    biblioteca.adicionarlivro(new livro("java2","livro de programacao","12346"));
    biblioteca.adicionarlivro(new livro("java3","livro de programacao","12347"));
    biblioteca.adicionarlivro(new livro("java4","livro de programacao","12348"));
    biblioteca.adicionarlivro(new livro("java5","livro de programacao","12349"));
    biblioteca.adicionarlivro(new livro("java6","livro de programacao","12340"));
    biblioteca.adicionarlivro(new livro("java7","livro de programacao","12344"));
    }

}
