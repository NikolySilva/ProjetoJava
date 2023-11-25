// declarando variáveis
public class Assinantes {
    private long cpf;
    private String nome;
    private int numero;
    protected int numChamadas;
    protected Chamada[] chamadas;

    // Construtor
    public Assinantes(long cpf, String nome, int numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
        this.chamadas = new Chamada[10];
        this.numChamadas = 0;
    }

    // Pegando o CPF
        public Long getCpf() {
        return cpf;
    }
 