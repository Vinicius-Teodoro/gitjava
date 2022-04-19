class Main {
    int x, y, z;
    private String nome;
    // construtor
    Main() {
        System.out.println("Construtor chamado:");
        nome = "Programa Java";
        x = 5;
        y = 6;
        z = x+y;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Qual construtor foi chamado?" + obj.nome);
        System.out.println(obj.z);
    }
    }
