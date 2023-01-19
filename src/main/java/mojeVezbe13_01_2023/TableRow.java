package mojeVezbe13_01_2023;

import java.util.ArrayList;

//niz celija u telu tabele. Niz je niz stringova
public class TableRow {
    protected ArrayList<String> celijeUTelu;

    public TableRow() {
        this.celijeUTelu = new ArrayList<>();
    }

    public ArrayList<String> getCelijeUTelu() {
        return celijeUTelu;
    }

//    metodu addRowCell, koja dodaje polje u niz
    public void addRowCell (String celijaUTelu){
        this.celijeUTelu.add(celijaUTelu);
    }
//    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    public void stampajCelijeUTelu() {
        for (int i = 0; i < this.celijeUTelu.size(); i++) {
            System.out.print("    " + this.celijeUTelu.get(i) + "       |");
        }
        System.out.println();
    }
//    metodu printHTML, koja sluzi da stampa red u HTML formatu.
//    red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
//    primer:
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
    public void printHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < this.celijeUTelu.size(); i++) {
            System.out.print("<td>" + this.celijeUTelu.get(i) + "</td>");
        }
        System.out.println("</tr>");

    }


}