package pilhas;

import javax.swing.JOptionPane;

public class MainProgram {
    public static void main(String[] args) {
        String frase, inverterString, separarString[];
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da opção:\n"
                + "1 - Escrever uma frase própria.\n"
                + "2 - Usar exemplo (1): 'UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO [...]'\n"
                + "3 - Usar exemplo (2): 'ESARF :ATERCES ODALERAHCAB ME AICNEIC AD  [...]'\n"
                + "4 - Sair do programa.\n", "MENU", 3));

            if(op == 1) {
                frase = JOptionPane.showInputDialog(null, "Digite sua frase: ");

                inverterString = Stacks.inverterString(frase);
                separarString = Stacks.separarString(inverterString);
                Stacks.criarPilha(separarString);

                JOptionPane.showMessageDialog(null, Stacks.puxarPilha());

            } else if(op == 2) {
                frase = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";

                inverterString = Stacks.inverterString(frase);
                separarString = Stacks.separarString(inverterString);
                Stacks.criarPilha(separarString);

                JOptionPane.showMessageDialog(null, Stacks.puxarPilha());

            } else if(op == 3) {
                frase = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

                inverterString = Stacks.inverterString(frase);
                separarString = Stacks.separarString(inverterString);
                Stacks.criarPilha(separarString);

                JOptionPane.showMessageDialog(null, Stacks.puxarPilha());

            } else if(op == 4) {
                JOptionPane.showMessageDialog(null, "Saindo...");

            } else {
                JOptionPane.showMessageDialog(null, "A opção " + op + " não existe, escolha novamente!");
            }

        } while(op != 4);
    }
}
