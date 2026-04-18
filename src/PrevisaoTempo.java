import java.time.LocalDate;
import Enum.CondicaoClimaEnum;
import Enum.FaseLuaEnum;

public class PrevisaoTempo {
    LocalDate data;
    String local;
    String descricao;
    public CondicaoClimaEnum condicaoClima;
    public Temperatura temperatura;
    double probabilidadeChuva;
    double umidadeAr;
    public Vento velocidadeVento;
    public FaseLuaEnum lua;
}
