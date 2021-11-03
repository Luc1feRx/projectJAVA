
package models;

public class tbBaoHiem {
   String MaNV, MaLuong, MaBH, NgayCapSo, NoiCapSo, GhiChu; 

    public tbBaoHiem() {
    }

    public tbBaoHiem(String MaNV, String MaLuong, String MaBH, String NgayCapSo, String NoiCapSo, String GhiChu) {
        this.MaNV = MaNV;
        this.MaLuong = MaLuong;
        this.MaBH = MaBH;
        this.NgayCapSo = NgayCapSo;
        this.NoiCapSo = NoiCapSo;
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        this.MaBH = MaBH;
    }

    public String getNgayCapSo() {
        return NgayCapSo;
    }

    public void setNgayCapSo(String NgayCapSo) {
        this.NgayCapSo = NgayCapSo;
    }

    public String getNoiCapSo() {
        return NoiCapSo;
    }

    public void setNoiCapSo(String NoiCapSo) {
        this.NoiCapSo = NoiCapSo;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
   
}
