package mojeVezbe13_01_2023;

import java.util.ArrayList;

public class TableHeader { 
    //    niz celija u headeru tabele. Niz je niz stringova

    protected ArrayList<String> celijeUHederu;

    public TableHeader() {
        this.celijeUHederu = new ArrayList<>();
    }

    public ArrayList<String> getCelijeUHederu() {
        return celijeUHederu;
    }
    //    metodu addHeaderCell, koja dodaje polje u niz
    public void addHeaderCell(String celijaUHederu){
        this.celijeUHederu.add(celijaUHederu);
    }
    //    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//            (Objasnjenje \t je specijalan karakter tab
//    koji ce da sluzi da lakse poravnate kolone)
    
    public void stampajCelijeUHeaderu(){
        for (int i = 0; i < this.celijeUHederu.size(); i++) {
            System.out.print("    " + this.celijeUHederu.get(i)+ "       |");
        }
        System.out.println();
    }
//    metodu printHTML, koja sluzi da stampa header u HTML formatu.
//    header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
//    primer:
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    public void printHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < this.celijeUHederu.size(); i++) {
            System.out.print("<th>" + this.celijeUHederu.get(i) + "</th>");
        }
        System.out.println("</tr>");
    }



}
