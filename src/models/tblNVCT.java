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
public class tblNVCT {
    String manv, tenphong, hoten, maluong,  ghichu, ngaynhan; 
    int LCB, PC, Songaycong,thuong, Songaynghi, giolamthem,kyluat;
    float Luong;

    public tblNVCT() {
    }

    public tblNVCT(String manv, String tenphong, String hoten, String maluong, String ghichu, String ngaynhan, int LCB, int PC, int Songaycong, int thuong, int Songaynghi, int giolamthem, int kyluat, float Luong) {
        this.manv = manv;
        this.tenphong = tenphong;
        this.hoten = hoten;
        this.maluong = maluong;
        this.ghichu = ghichu;
        this.ngaynhan = ngaynhan;
        this.LCB = LCB;
        this.PC = PC;
        this.Songaycong = Songaycong;
        this.thuong = thuong;
        this.Songaynghi = Songaynghi;
        this.giolamthem = giolamthem;
        this.kyluat = kyluat;
        this.Luong = Luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaluong() {
        return maluong;
    }

    public void setMaluong(String maluong) {
        this.maluong = maluong;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(String ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public int getLCB() {
        return LCB;
    }

    public void setLCB(int LCB) {
        this.LCB = LCB;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public int getSongaycong() {
        return Songaycong;
    }

    public void setSongaycong(int Songaycong) {
        this.Songaycong = Songaycong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getSongaynghi() {
        return Songaynghi;
    }

    public void setSongaynghi(int Songaynghi) {
        this.Songaynghi = Songaynghi;
    }

    public int getGiolamthem() {
        return giolamthem;
    }

    public void setGiolamthem(int giolamthem) {
        this.giolamthem = giolamthem;
    }

    public int getKyluat() {
        return kyluat;
    }

    public void setKyluat(int kyluat) {
        this.kyluat = kyluat;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
    
    
    

}
  
