package MiniProjekatXO;

import java.util.ArrayList;
import java.util.Scanner;

public class XOTabla {

    Scanner s = new Scanner(System.in);

    private ArrayList<String> tabela;
    private String imeXigraca;
    private String imeOigraca;
    private String naPotezu;

    public String getImeXigraca() {
        return this.imeXigraca;
    }

    public String getImeOigraca() {
        return this.getImeOigraca();
    }

    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setTabela(ArrayList<String> tabela) {
        this.tabela = tabela;
    }

    public void setImeXigraca(String imeXigraca) {
        this.imeXigraca = imeXigraca;
    }

    public void setImeOigraca(String imeOigraca) {
        this.imeOigraca = imeOigraca;
    }

    public void pokreniIgru() {

        for (int i = 0; i < 9; i++) {
            tabela.add(" ");
        }
        naPotezu = "X";
    }

    public boolean praznoPolje(int polje) {
        if (tabela.get(polje - 1).equals(" ")) {
            return true;
        }
        return false;
    }

    public void zamenaIgraca() {
        if (naPotezu.equals("X")) {
            naPotezu = "O";
        } else {
            naPotezu = "X";
        }
    }

    public void stampaj() {
        System.out.println(tabela.get(0) + " | " + tabela.get(1) + " | " + tabela.get(2));
        System.out.println(tabela.get(3) + " | " + tabela.get(4) + " | " + tabela.get(5));
        System.out.println(tabela.get(6) + " | " + tabela.get(7) + " | " + tabela.get(8));


        System.out.println("Igrac X: " + this.imeXigraca);
        System.out.println("Igrac O: " + this.imeOigraca);
    }

    public void odigrajPotez(int polje) {
        if (this.naPotezu.equals("X")) {
            tabela.set(polje - 1, "X");
        } else if (this.naPotezu.equals("O")) {
            tabela.set(polje - 1, "O");
        }

    }

    public boolean popunjenaTabla() {
        if (!tabela.get(0).equals(" ") && !tabela.get(1).equals(" ") && !tabela.get(2).equals(" ")
                && !tabela.get(3).equals(" ") && !tabela.get(4).equals(" ") && !tabela.get(5).equals(" ")
                && !tabela.get(6).equals(" ") && !tabela.get(7).equals(" ") && !tabela.get(8).equals(" ")) {
            return true;
        }
        return false;
    }

    public boolean pobednikX() {
        if (tabela.get(0).equals("X") && tabela.get(1).equals("X") && tabela.get(2).equals("X")) {
            return true;
        }
        if (tabela.get(3).equals("X") && tabela.get(4).equals("X") && tabela.get(5).equals("X")) {
            return true;
        }
        if (tabela.get(6).equals("X") && tabela.get(7).equals("X") && tabela.get(8).equals("X")) {
            return true;
        }
        if (tabela.get(0).equals("X") && tabela.get(3).equals("X") && tabela.get(6).equals("X")) {
            return true;
        }
        if (tabela.get(1).equals("X") && tabela.get(4).equals("X") && tabela.get(7).equals("X")) {
            return true;
        }
        if (tabela.get(2).equals("X") && tabela.get(5).equals("X") && tabela.get(8).equals("X")) {
            return true;
        }
        if (tabela.get(0).equals("X") && tabela.get(4).equals("X") && tabela.get(8).equals("X")) {
            return true;
        }
        if (tabela.get(2).equals("X") && tabela.get(4).equals("X") && tabela.get(6).equals("X")) {
            return true;
        }
        return false;
    }

    public boolean pobednikO() {
        if (tabela.get(0).equals("O") && tabela.get(1).equals("O") && tabela.get(2).equals("O")) {
            return true;
        }
        if (tabela.get(3).equals("O") && tabela.get(4).equals("O") && tabela.get(5).equals("O")) {
            return true;
        }
        if (tabela.get(6).equals("O") && tabela.get(7).equals("O") && tabela.get(8).equals("O")) {
            return true;
        }
        if (tabela.get(0).equals("O") && tabela.get(3).equals("O") && tabela.get(6).equals("O")) {
            return true;
        }
        if (tabela.get(1).equals("O") && tabela.get(4).equals("O") && tabela.get(7).equals("O")) {
            return true;
        }
        if (tabela.get(2).equals("O") && tabela.get(5).equals("O") && tabela.get(8).equals("O")) {
            return true;
        }
        if (tabela.get(0).equals("O") && tabela.get(4).equals("O") && tabela.get(8).equals("O")) {
            return true;
        }
        if (tabela.get(2).equals("O") && tabela.get(4).equals("O") && tabela.get(6).equals("O")) {
            return true;
        }
        return false;
    }
}










