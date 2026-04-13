import Enum.NivelDificuldadeEnum;
import Enum.CustoEnum;
import java.time.LocalTime;

public class Receita {
    String nome;
    public Autor autor;
    int tempoPreparo;
    public NivelDificuldadeEnum dificuldade;
    public CustoEnum custo;
    int porcoes;
    String descricao;
}


