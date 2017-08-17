package cl.empresapjm.wine_characteristics.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cl.empresapjm.wine_characteristics.R;
import cl.empresapjm.wine_characteristics.data.Queries;
import cl.empresapjm.wine_characteristics.models.Wine;

public class WineAdapter extends RecyclerView.Adapter<WineAdapter.ViewHolder>{

    private List<Wine> wines = new Queries().wines();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_wine_pending, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Wine wine = wines.get(position);
        holder.textViewModels.setText(wine.getModels_var());
        holder.textVineyard.setText(wine.getVineyard_var());
        holder.textYears.setText(wine.getYears_var());

        holder.textViewModels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        holder.textVineyard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        holder.textYears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return wines.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewModels, textVineyard, textYears;

        public ViewHolder(View itemView) {
            super(itemView);

            textYears = itemView.findViewById(R.id.yearsTv);
            textVineyard = itemView.findViewById(R.id.vineyardTv);
            textViewModels = itemView.findViewById(R.id.modelsTv);


        }
    }
}
