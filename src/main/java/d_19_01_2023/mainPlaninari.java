package d_19_01_2023;

public class mainPlaninari {
    public static void main(String[] args) {
//        U glavnom programu kreirati jedan planinarski dom,
//                i u njemu učlaniti nekoliko rekreativnih planinara
//        i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
        PlaninarskiDom dom = new PlaninarskiDom();
        dom.uclaniPlaninara(new Alpinista(1, "marko Markovic", 2));
        dom.uclaniPlaninara(new Alpinista(2, "Pavle Pavlovic",1));
        dom.uclaniPlaninara(new Alpinista(3,"Nikola Nikolic",4));
        dom.uclaniPlaninara(new RekreativniPlaninar(12,"IvanIvanovic",
                60,"Raski okrug",5200));
        dom.uclaniPlaninara(new RekreativniPlaninar(14,"JovanJovanovic",
                20,"Sumadijski okrug",3500));
        dom.uclaniPlaninara(new RekreativniPlaninar(15,"Petar Petrovic",
                10,"Macva",4000));
        dom.stampaj();
        dom.izbaciPlaninara(12);
        dom.stampaj();
        Planina planina = new Planina("Stolovi", "Srbija", 3500);
        System.out.println("Broj uspesnih planinara na usponu na planinu " + planina.getImePlanine()
        + " je " + dom.brUspesnih(planina) );
    }
}
