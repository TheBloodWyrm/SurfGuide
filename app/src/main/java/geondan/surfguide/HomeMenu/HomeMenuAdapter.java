package geondan.surfguide.HomeMenu;

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
 * Created by Paul on 20.07.2015.
 */
public class HomeMenuAdapter extends RecyclerView.Adapter<HomeMenuAdapter.ViewHolder>
{
    OnItemClickListener itemClickListener;

    List<ItemHomeMenu> items;
    public HomeMenuAdapter(){
        super();
        items = new ArrayList<>();

        ItemHomeMenu item = new ItemHomeMenu();
        item.setName("Built up");
        item.setDescription("Instructions on how to built up your equipment");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemHomeMenu();
        item.setName("Jibes");
        item.setDescription("Have a look at how the best Jibes are done");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemHomeMenu();
        item.setName("Tacks");
        item.setDescription("Go ahead and learn some awesome Tacks");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);

        item = new ItemHomeMenu();
        item.setName("Built up");
        item.setDescription("Instructions on how to built up your equipment");
        item.setThumbnail(R.drawable.surfing);
        items.add(item);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_menu_cardview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i)
    {
        ItemHomeMenu item = items.get(i);
        viewHolder.name.setText(item.getName());
        viewHolder.description.setText(item.getDescription());
        viewHolder.thumbnail.setImageResource(item.getThumbnail());
    }

    @Override
    public int getItemCount(){
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
