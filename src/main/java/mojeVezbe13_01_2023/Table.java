package mojeVezbe13_01_2023;
//header tabele
//        niz redova. Niz je niz TableRow elementa
//        setter za header

import java.util.ArrayList;

public class Table {
    protected TableHeader header;
    protected ArrayList<TableRow> redovi;

    public TableHeader getHeader() {
        return header;
    }

    public ArrayList<TableRow> getRedovi() {
        return redovi;
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }
    //        metodu za dodvanje novog reda u tablu

    public Table(TableHeader header) {
        this.header = header;
        this.redovi = new ArrayList<>();
    }

    public void dodajRed(TableRow red){
        this.redovi.add(red);
    }
    //        metodu za stampu koja stampa header i redove tabele

    public void stampajTabelu(){
        this.header.stampajCelijeUHeaderu();
        for (int i = 0; i < this.redovi.size(); i++) {
            this.redovi.get(i).stampajCelijeUTelu();
        }
    }
//    metodu za stampu HTML-a tabele.Primer
//            <table>
//<thead>
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
//</thead>
//<tbody>
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
//<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
//</tbody>
//</table>

    public void printHTMLtabelu(){
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.redovi.size(); i++) {
            this.redovi.get(i).printHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");




        }

    }

