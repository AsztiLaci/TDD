package prim;

import java.util.ArrayList;
import java.util.List;

public class PrimSzamolo {
    public List<Integer> eddig(int limit) {
        ArrayList<Integer> eredmeny = new ArrayList<Integer>();
        for(int szam=2; szam<=limit; ++szam){
            boolean igenPrim = true;

            for(int oszto= 2; oszto<szam; ++oszto){
                if(szam % oszto == 0){
                    igenPrim = false;
                }
            }

            if(igenPrim){
                eredmeny.add(szam);
            }
        }
        return eredmeny;
    }
}
