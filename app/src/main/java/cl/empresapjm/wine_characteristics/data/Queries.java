package cl.empresapjm.wine_characteristics.data;

import java.util.ArrayList;
import java.util.List;
import cl.empresapjm.wine_characteristics.models.Wine;

public class Queries {

    public List<Wine> wines(){

        List<Wine> wines =  new ArrayList<>();
        List<Wine> wineList =  Wine.listAll(Wine.class);

        if (wineList != null && wineList.size()>0){
            wines.addAll(wineList);
        }
        return wines;
    }
}
