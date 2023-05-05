class Biblioteca {
    int estante;
    int livro;
    String aluno;
    String professor;
    double mochila;
   
    boolean mochila(int livro) {
      if (this.mochila < livro) {
        return false;
      } else {
        this.mochila -= livro;
        return true;
      }
    }
    
   
     void mochila(double mochila){
        this.mochila += quantidade;
     }     
     void mochila(double mochila){
        this.mochila += quantidade;
}
}