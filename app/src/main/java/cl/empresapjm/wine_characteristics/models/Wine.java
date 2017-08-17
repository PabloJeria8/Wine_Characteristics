package cl.empresapjm.wine_characteristics.models;

import com.orm.SugarRecord;

public class Wine extends SugarRecord {

    private String models_var, years_var, vineyard_var;

    public Wine() {
    }

    public Wine(String models_var, String years_var, String vineyard_var) {
        this.models_var = models_var;
        this.years_var = years_var;
        this.vineyard_var = vineyard_var;
    }

    public String getModels_var() {
        return models_var;
    }

    public void setModels_var(String models_var) {
        this.models_var = models_var;
    }

    public String getYears_var() {
        return years_var;
    }

    public void setYears_var(String years_var) {
        this.years_var = years_var;
    }

    public String getVineyard_var() {
        return vineyard_var;
    }

    public void setVineyard_var(String vineyard_var) {
        this.vineyard_var = vineyard_var;
    }
}
