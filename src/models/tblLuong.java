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
public class tblLuong {
    int LCB, PC ;
    String NgayNhap, NgaySua;
    String MaLuong, GhiChu;

    public tblLuong() {
    }

    public tblLuong(int LCB, int PC, String NgayNhap, String NgaySua, String MaLuong, String GhiChu) {
        this.LCB = LCB;
        this.PC = PC;
        this.NgayNhap = NgayNhap;
        this.NgaySua = NgaySua;
        this.MaLuong = MaLuong;
        this.GhiChu = GhiChu;
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

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(String NgaySua) {
        this.NgaySua = NgaySua;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

   

    
}
