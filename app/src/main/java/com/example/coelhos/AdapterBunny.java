package com.example.coelhos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class AdapterBunny extends RecyclerView.Adapter<AdapterBunny.ViewHolder> {

    public List<Bunny> rabbits;
    public Context c;

    public AdapterBunny(List<Bunny> rabbits, Context c) {
        this.rabbits = rabbits;
        this.c = c;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(c).inflate(R.layout.bunny_presentation, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(rabbits.get(position).getNome());
        holder.age.setText(rabbits.get(position).getAge());

    }

    @Override
    public int getItemCount() {
        return rabbits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.text_presentation_name);
            age = itemView.findViewById(R.id.text_presentation_age);
        }
    }
}
