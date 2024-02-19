package rendezesekassert;
public class Teszt {
    public static void assertek(){
        // 1.eset
        int[] sor1 = {};
        assert rendezettE(Rendezesek.egyszeru(sor1)): "Üres sorozatra nem jól működik";
        // 2.eset
        int[] sor2 = {2,7,9};
        assert rendezettE(Rendezesek.egyszeru(sor2)): "szigorúan monoton növekvő sorozaton nem jól működik";
        // 3.eset
        int[] sor3 = {2,7,7,9};
        assert rendezettE(Rendezesek.egyszeru(sor3)): "monoton növekvő sorozaton nem jól működik";
        // 4.eset
        int[] sor4 = {22,7,77};
        assert rendezettE(Rendezesek.egyszeru(sor4)): "völgy típusu sorozaton nem jól működik";
        // 5.eset
        int[] sor5 = {22,347,77};
        assert rendezettE(Rendezesek.egyszeru(sor5)): "hegy típusu sorozaton nem jól működik";
        // 6.eset
        int[] sor6 = {2,7,7,9};
        assert rendezettE(Rendezesek.egyszeru(sor6)): "hegy-völgy típusú sorozatra nem jól működik";
        // 7.eset
        int[] sor7 = {22,7,-77,-134,-1523};
        assert rendezettE(Rendezesek.egyszeru(sor7)): "monoton növekvő sorozaton nem jól működik";
        // 8.eset
        int[] sor8 = {4722,7,-77,-134,-1523};
        assert rendezettE(Rendezesek.egyszeru(sor8)): "monoton növekvő sorozaton nem jól működik";
    }
    public static boolean rendezettE(int[] sorozat){
        int i = 0;
        while(i < sorozat.length-1  && sorozat[i]<= sorozat[i]+1  ){
            i++;
        }
        return i >= sorozat.length-1;
    }
}
