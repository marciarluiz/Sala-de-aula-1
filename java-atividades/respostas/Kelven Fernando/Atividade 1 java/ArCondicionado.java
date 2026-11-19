/**
 * Atividade 13 - Programação Orientada a Objetos (POO)
 * Classe que simula o funcionamento de um Ar Condicionado com controle térmico e de energia.
 */
public class ArCondicionado {

    // Constantes de limites de temperatura
    public static final int TEMP_MIN = 16;
    public static final int TEMP_MAX = 30;
    public static final int TEMP_PADRAO = 22;

    // Atributos
    private String marca;
    private int temperatura;
    private boolean ligado;

    /**
     * Construtor padrão com valores iniciais.
     */
    public ArCondicionado() {
        this.marca = "Genérico";
        this.temperatura = TEMP_PADRAO;
        this.ligado = false;
    }

    /**
     * Construtor com especificação da marca.
     *
     * @param marca Marca do ar-condicionado
     */
    public ArCondicionado(String marca) {
        this.marca = marca;
        this.temperatura = TEMP_PADRAO;
        this.ligado = false;
    }

    /**
     * Construtor completo.
     *
     * @param marca       Marca do aparelho
     * @param temperatura Temperatura inicial (entre 16 e 30)
     * @param ligado      Estado de inicialização (ligado ou desligado)
     */
    public ArCondicionado(String marca, int temperatura, boolean ligado) {
        this.marca = marca;
        // Validação da temperatura inicial entre 16 e 30
        if (temperatura < TEMP_MIN) {
            this.temperatura = TEMP_MIN;
        } else if (temperatura > TEMP_MAX) {
            this.temperatura = TEMP_MAX;
        } else {
            this.temperatura = temperatura;
        }
        this.ligado = ligado;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    /**
     * Liga o aparelho de ar-condicionado.
     */
    public void ligar() {
        if (this.ligado) {
            System.out.printf("[%s] O ar-condicionado já está ligado.%n", marca);
        } else {
            this.ligado = true;
            System.out.printf("[%s] Ar-condicionado ligado. Temperatura atual: %d°C.%n", marca, this.temperatura);
        }
    }

    /**
     * Desliga o aparelho de ar-condicionado.
     */
    public void desligar() {
        if (!this.ligado) {
            System.out.printf("[%s] O ar-condicionado já está desligado.%n", marca);
        } else {
            this.ligado = false;
            System.out.printf("[%s] Ar-condicionado desligado com sucesso.%n", marca);
        }
    }

    /**
     * Aumenta a temperatura em 1°C, respeitando o limite máximo de 30°C.
     * Apenas permitido com o aparelho ligado.
     */
    public void aumentarTemperatura() {
        if (!this.ligado) {
            System.out.printf("[%s] Não é possível alterar a temperatura com o aparelho desligado.%n", marca);
            return;
        }

        if (this.temperatura < TEMP_MAX) {
            this.temperatura++;
            System.out.printf("[%s] Temperatura aumentada para: %d°C%n", marca, this.temperatura);
        } else {
            System.out.printf("[%s] Temperatura máxima atingida (%d°C)!%n", marca, TEMP_MAX);
        }
    }

    /**
     * Diminui a temperatura em 1°C, respeitando o limite mínimo de 16°C.
     * Apenas permitido com o aparelho ligado.
     */
    public void diminuirTemperatura() {
        if (!this.ligado) {
            System.out.printf("[%s] Não é possível alterar a temperatura com o aparelho desligado.%n", marca);
            return;
        }

        if (this.temperatura > TEMP_MIN) {
            this.temperatura--;
            System.out.printf("[%s] Temperatura diminuída para: %d°C%n", marca, this.temperatura);
        } else {
            System.out.printf("[%s] Temperatura mínima atingida (%d°C)!%n", marca, TEMP_MIN);
        }
    }

    /**
     * Exibe o status atual do ar-condicionado.
     */
    public void mostrarStatus() {
        System.out.println("----------------------------------------");
        System.out.printf("Ar-Condicionado Marca : %s%n", marca);
        System.out.printf("Status                : %s%n", (ligado ? "LIGADO" : "DESLIGADO"));
        System.out.printf("Temperatura Definida  : %d°C (Faixa permitida: %d°C a %d°C)%n",
                temperatura, TEMP_MIN, TEMP_MAX);
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe ArCondicionado.
     */
    public static void main(String[] args) {
        System.out.println("=== Atividade 13: Demonstração da Classe ArCondicionado ===\n");

        // Criação de objeto ArCondicionado
        ArCondicionado ac = new ArCondicionado("Daikin Inverter", 28, false);

        System.out.println("--- Status Inicial ---");
        ac.mostrarStatus();

        // Tentativa de alterar temperatura com o aparelho desligado
        System.out.println("\n--- Teste com Aparelho Desligado ---");
        ac.aumentarTemperatura();

        // Ligar o aparelho
        System.out.println("\n--- Ligando o Aparelho ---");
        ac.ligar();
        ac.ligar(); // Teste de religamento

        // Testar aumento de temperatura até o limite de 30°C
        System.out.println("\n--- Teste de Aumento de Temperatura (Limite Máximo: 30°C) ---");
        ac.aumentarTemperatura(); // 29°C
        ac.aumentarTemperatura(); // 30°C
        ac.aumentarTemperatura(); // Tentativa além do limite máximo

        // Testar redução de temperatura
        System.out.println("\n--- Teste de Redução de Temperatura ---");
        ac.diminuirTemperatura(); // 29°C
        ac.diminuirTemperatura(); // 28°C

        // Teste de redução até o limite mínimo (16°C) usando outro objeto
        System.out.println("\n--- Teste de Limite Mínimo (16°C) ---");
        ArCondicionado acQuarto = new ArCondicionado("LG Dual Inverter", 17, true);
        acQuarto.diminuirTemperatura(); // 16°C
        acQuarto.diminuirTemperatura(); // Tentativa abaixo de 16°C

        // Desligar o aparelho
        System.out.println("\n--- Desligando o Aparelho Principal ---");
        ac.desligar();
        ac.desligar(); // Teste de desligar novamente

        System.out.println("\n--- Status Final ---");
        ac.mostrarStatus();
    }
}
