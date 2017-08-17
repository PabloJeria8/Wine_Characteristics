package cl.empresapjm.wine_characteristics;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.empresapjm.wine_characteristics.adapters.WineAdapter;
import cl.empresapjm.wine_characteristics.models.Wine;

import static com.orm.util.Collection.set;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.wineRv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i < 20; i++) {
            Wine wine =  new Wine();
            wine.setModels_var("Santa Elena");
            wine.setVineyard_var("Viña del Mar");
            wine.setYears_var("2011");
            wine.save();

        }

        WineAdapter adapter =  new WineAdapter();
        recyclerView.setAdapter(adapter);

    }
}
