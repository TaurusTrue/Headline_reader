package com.example.headline_reader.Date;

/**
 * Created by 67698 on 2018/4/9.
 */



/**
 * doc型文章
 * thumnail:缩略图
 * source:来源
 * id:这里的id是以staticid做的id
 */
public class DocArticle {
    private String thumbnail="";
    private String title="";
    private String updatetime="";
    private String id="";
    private String source="";
    public String getThumbnail()
    {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail)
    {
        this.thumbnail=thumbnail;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getUpdatetime()
    {
        return updatetime;
    }
    public void setUpdatetime(String updatetime)
    {
        this.updatetime=updatetime;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String getSource()
    {
        return source;
    }
    public void setSource(String source)
    {
        this.source=source;
    }
}

