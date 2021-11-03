/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author tu
 */
public class HSTV {
    String MaPhong, MaNVTV, HoTen, NgaySinh, GioiTinh, DiaChi, TDHocVan, ViTriThuViec, NgayTV, GhiChu;
    byte[] image;

    public HSTV() {
    }

    public HSTV(String MaPhong, String MaNVTV, String HoTen, String NgaySinh, String GioiTinh, String DiaChi, String TDHocVan, String ViTriThuViec, String NgayTV, String GhiChu, byte[] image) {
        this.MaPhong = MaPhong;
        this.MaNVTV = MaNVTV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.TDHocVan = TDHocVan;
        this.ViTriThuViec = ViTriThuViec;
        this.NgayTV = NgayTV;
        this.GhiChu = GhiChu;
        this.image = image;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaNVTV() {
        return MaNVTV;
    }

    public void setMaNVTV(String MaNVTV) {
        this.MaNVTV = MaNVTV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTDHocVan() {
        return TDHocVan;
    }

    public void setTDHocVan(String TDHocVan) {
        this.TDHocVan = TDHocVan;
    }

    public String getViTriThuViec() {
        return ViTriThuViec;
    }

    public void setViTriThuViec(String ViTriThuViec) {
        this.ViTriThuViec = ViTriThuViec;
    }

    public String getNgayTV() {
        return NgayTV;
    }

    public void setNgayTV(String NgayTV) {
        this.NgayTV = NgayTV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    
    
    
    
}
