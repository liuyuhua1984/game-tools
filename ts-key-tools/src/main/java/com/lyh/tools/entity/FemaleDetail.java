package com.lyh.tools.entity;



public class FemaleDetail extends BaseBean implements SortBean {
    public String avatar; //
    public String birthday;
    public String birthplace;
    public String blood;
    public String bwh;
    public String chinese_name;//
    public String created_at;
    public String girl_id;
    public boolean hasMore;
    public String height;
    public String hobby;
    public Object horizontal_picture;
    public String id;//
    public String img_path;
    public String img_type;
    public String introduce;
    public boolean isLetter;
    public boolean isShowHasMore;
    public String is_default;
    public String is_recommend;
    public String name;
    public String nameLetter;
    public String sort;
    public String status;
    public String updated_at;
    public Object vertical_picture;
    public String weight;

    public String letter_sort;
    @Override
    public String getIndex() {
        return null;
    }
}
