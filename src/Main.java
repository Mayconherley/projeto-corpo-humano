public class Main {
    public static void main(String[] args) {
        Corpo corpo = new Corpo();
        Membros membros = new Membros();
        Orgaos orgaos = new Orgaos();

        //Todo: ORGÃOS
        corpo.coracao = " o coração é responsável por bombear o sangue para todo o corpo. Ele fornece oxigênio e nutrientes aos tecidos e órgãos e remove resíduos metabólicos.";
        corpo.cerebro = "o cérebro é o centro de controle do corpo humano e é responsável por coordenar todas as funções corporais, além de controlar o pensamento, a memória e a emoção.";
        corpo.figado = " o fígado é o maior órgão interno do corpo humano e tem muitas funções, incluindo a produção de bile, a síntese de proteínas e a desintoxicação de substâncias nocivas.";
        corpo.rim = " os rins são responsáveis por filtrar o sangue, removendo resíduos e excesso de água do corpo. Eles também ajudam a manter o equilíbrio de eletrólitos e pH no corpo.";
        corpo.pancreas = " o pâncreas é um órgão endócrino e exócrino que secreta hormônios como a insulina e o glucagon, que são importantes para o controle dos níveis de açúcar no sangue, e também secreta enzimas digestivas que ajudam a quebrar os alimentos.";
        corpo.pulmoes = "os pulmões são responsáveis por realizar a troca gasosa, fornecendo oxigênio aos tecidos e removendo dióxido de carbono dos pulmões.";
        corpo.intestino = "o intestino é responsável pela digestão e absorção de nutrientes dos alimentos que ingerimos, além de eliminar os resíduos.";
        //TODO: MEMBROS
        corpo.bracos = " os braços permitem que realizemos tarefas que envolvem a manipulação de objetos, como pegar, segurar, lançar, empurrar e puxar. Eles também nos permitem realizar movimentos finos, como escrever e desenhar, e são usados para expressar emoções através de gestos.";
        corpo.pes = "os pés são importantes para a nossa locomoção, permitindo-nos caminhar, correr e pular. Eles também são importantes para manter o equilíbrio e a estabilidade enquanto estamos de pé ou em movimento.";
        corpo.maos = "as mãos são especialmente adaptadas para a manipulação de objetos, permitindo-nos realizar tarefas delicadas e precisas, como escrever, desenhar e tocar instrumentos musicais. Elas também são importantes para a comunicação não-verbal, como gestos e expressões faciais";
        corpo.perna = " as pernas são responsáveis por sustentar o peso do corpo e nos permitir caminhar, correr e pular. Elas também são importantes para a circulação sanguínea.";
        System.out.println(corpo.toString());

    }

}