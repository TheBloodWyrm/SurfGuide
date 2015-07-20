package geondan.surfguide.HomeMenu;

/**
 * Created by Paul on 20.07.2015.
 */
public class ItemHomeMenu
{
    private String name, description;
    private int thumbnail;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getThumbnail(){
        return thumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail = thumbnail;
    }
}
