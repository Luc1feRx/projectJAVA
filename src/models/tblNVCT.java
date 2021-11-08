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
    String manv, tenphong, hoten, maluong,  ghichu; 
    int LCB, PC, ngaycong,thuong, ngaynghi, giolamthem,kyluat, luong;
    Date ngaynhan;

    public tblNVCT(String manv, String tenphong, String hoten, String maluong, 
            int LCB,int PC,int thuong,int kyluat,Date ngaynhan,
            int ngaycong,int ngaynghi, 
            int giolamthem, String ghichu, 
            int luong ) {
        this.manv = manv;
        this.tenphong = tenphong;
        this.hoten = hoten;
        this.maluong = maluong;
        this.kyluat = kyluat;
        this.ghichu = ghichu;
        this.LCB = LCB;
        this.PC = PC;
        this.ngaycong = ngaycong;
        this.thuong = thuong;
        this.ngaynghi = ngaynghi;
        this.giolamthem = giolamthem;
        this.luong = luong;
        this.ngaynhan = ngaynhan;
    }

    public tblNVCT(String manv, String tenphong, String hoten, String maluong, int LCB, int PC, int thuong, int kyluat, Date ngaynhan, int ngaycong, int ngaynghi, int giolamthem, int luong, String ghichu) {
    }

    public tblNVCT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getKyluat() {
        return kyluat;
    }

    public void setKyluat(int kyluat) {
        this.kyluat = kyluat;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
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

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
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

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

}
  
