package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.List;
public class AdaptadorMiniatura extends RecyclerView.Adapter<AdaptadorMiniatura.ViewHolder> {

    private Context context;

    private List<Miniatura> lstminiatura;

    public AdaptadorMiniatura(Context context, List<Miniatura> lstminiatura) {
        this.context = context;
        this.lstminiatura = lstminiatura;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.modelo_miniatura_layout, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }
    public ViewHolder(@NonNull View itemView){
        super(itemView);
        cardMiniatura = itemView.findViewById(R.id.cardMiniaturas);

    }
}
