class Biblioteca {
  livro livros;
  estante estante;

  boolean mochila(int livro) {
    if (this.mochila < livro) {
      return false;
    } else {
      this.mochila -= livro;
      return true;
    }
  }
}