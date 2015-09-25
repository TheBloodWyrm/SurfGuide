package geondan.surfguide.BuiltUpMenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import geondan.surfguide.R;

/**
 * Created by Paul on 25.08.2015.
 */
public class BuiltUpMenuAdapter extends RecyclerView.Adapter<BuiltUpMenuAdapter.ViewHolder>
{
    OnItemClickListener itemClickListener;

    List<ItemBuiltUpMenu> items;

    public BuiltUpMenuAdapter(){
        super();
        items = new ArrayList<>();

        ItemBuiltUpMenu item = new ItemBuiltUpMenu();
        item.setName("Built up");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemBuiltUpMenu();
        item.setName("Jibes");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemBuiltUpMenu();
        item.setName("Tacks");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemBuiltUpMenu();
        item.setName("Built up");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.built_up_menu_cardview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position)
    {
        ItemBuiltUpMenu item = items.get(position);
        viewHolder.name.setText(item.getName());
        viewHolder.thumbnail.setImageResource(item.getThumbnail());
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView thumbnail;
        public TextView name;
        public TextView description;

        public ViewHolder(View itemView){
            super(itemView);
            thumbnail = (ImageView)itemView.findViewById(R.id.imageView);
            name = (TextView)itemView.findViewById(R.id.name);
            description = (TextView)itemView.findViewById(R.id.description);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v){
            if(itemClickListener != null){
                itemClickListener.onItemClick(v, getPosition());
            }
        }
    }
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
