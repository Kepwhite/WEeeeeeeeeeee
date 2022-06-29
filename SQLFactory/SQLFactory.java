public class SQLFactory{
    public static void main(String[] args){

        Alunos eu = new Alunos();

        Database.abrirID(eu, 18);
        System.out.println("Nome: " + eu.nome + ", Idade: " + eu.idade + ", Cidade: " + eu.cidade + ", UF" + eu.uf );
        
    }

}