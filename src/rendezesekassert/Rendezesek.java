package rendezesekassert;
public class Rendezesek {
    public static int[] egyszeru(int[] sorozat){
        for (int i = 0; i < sorozat.length-1; i++) {
            for (int j = i+1; j < sorozat.length; j++) {
                if(sorozat[i] > sorozat[j]){//csere algoritmus
                    int seged = sorozat[i];
                    sorozat [i] = sorozat[j];
                    sorozat[j] = seged;
                }
            }
        }
        return sorozat;
    }
}
