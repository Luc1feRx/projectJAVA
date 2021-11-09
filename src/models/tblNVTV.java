/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author taihd
 */
public class tblNVTV {
    String tenbp, tenphong, manvtv, ghichu;
    int luongtv, ngaycong, ngaynghi,giolamthem, luong;
    String ngaynhan;

    public tblNVTV(String tenbp, String tenphong, String manvtv, String ghichu, int luongtv, int ngaycong, int ngaynghi, int giolamthem, int luong, String ngaynhan) {
        this.tenbp = tenbp;
        this.tenphong = tenphong;
        this.manvtv = manvtv;
        this.ghichu = ghichu;
        this.luongtv = luongtv;
        this.ngaycong = ngaycong;
        this.ngaynghi = ngaynghi;
        this.giolamthem = giolamthem;
        this.luong = luong;
        this.ngaynhan = ngaynhan;
    }

    public tblNVTV() {
    }

    public String getTenbp() {
        return tenbp;
    }

    public void setTenbp(String tenbp) {
        this.tenbp = tenbp;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getManvtv() {
        return manvtv;
    }

    public void setManvtv(String manvtv) {
        this.manvtv = manvtv;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public int getLuongtv() {
        return luongtv;
    }

    public void setLuongtv(int luongtv) {
        this.luongtv = luongtv;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getNgaynghi() {
        return ngaynghi;
    }

    public void setNgaynghi(int ngaynghi) {
        this.ngaynghi = ngaynghi;
    }

    public int getGiolamthem() {
        return giolamthem;
    }

    public void setGiolamthem(int giolamthem) {
        this.giolamthem = giolamthem;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(String ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    
   

}
