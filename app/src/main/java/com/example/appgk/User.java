package com.example.appgk;

public class User {
    private String ten;
    private int img;
    private String quocgia;
    private String nghedanh;
    private String sao;

    public User(String ten, int img, String quocgia, String nghedanh, String sao) {
        this.ten = ten;
        this.img = img;
        this.quocgia = quocgia;
        this.nghedanh = nghedanh;
        this.sao = sao;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getquocgia() {
        return quocgia;
    }

    public void setquocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getnghedanh() {
        return nghedanh;
    }

    public void setnghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    @Override
    public String toString() {
        return "Nhac{" +
                "ten='" + ten + '\'' +
                ", img=" + img +
                ", quocgia='" + quocgia + '\'' +
                ", nghedanh='" + nghedanh + '\'' +
                ", sao='" + sao + '\'' +
                '}';
    }
}
